package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.Util;
import d.f;
import d.i;
import d.k;
import d.l;
import d.r;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;

final class Spdy3$Writer
  implements FrameWriter
{
  private final boolean client;
  private boolean closed;
  private final f headerBlockBuffer;
  private final i headerBlockOut;
  private final i sink;
  
  Spdy3$Writer(i parami, boolean paramBoolean)
  {
    this.sink = parami;
    this.client = paramBoolean;
    parami = new Deflater();
    parami.setDictionary(Spdy3.DICTIONARY);
    this.headerBlockBuffer = new f();
    this.headerBlockOut = r.a(new l(this.headerBlockBuffer, parami));
  }
  
  private void writeNameValueBlockToBuffer(List<Header> paramList)
  {
    this.headerBlockOut.g(paramList.size());
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      k localk = ((Header)paramList.get(i)).name;
      this.headerBlockOut.g(localk.f());
      this.headerBlockOut.b(localk);
      localk = ((Header)paramList.get(i)).value;
      this.headerBlockOut.g(localk.f());
      this.headerBlockOut.b(localk);
      i += 1;
    }
    this.headerBlockOut.flush();
  }
  
  public void ackSettings(Settings paramSettings) {}
  
  public void close()
  {
    try
    {
      this.closed = true;
      Util.closeAll(this.sink, this.headerBlockOut);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void connectionPreface() {}
  
  public void data(boolean paramBoolean, int paramInt1, f paramf, int paramInt2)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      try
      {
        sendDataFrame(paramInt1, i, paramf, paramInt2);
        return;
      }
      finally {}
    }
  }
  
  public void flush()
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    this.sink.flush();
  }
  
  public void goAway(int paramInt, ErrorCode paramErrorCode, byte[] paramArrayOfByte)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    if (paramErrorCode.spdyGoAwayCode == -1) {
      throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
    }
    this.sink.g(-2147287033);
    this.sink.g(8);
    this.sink.g(paramInt);
    this.sink.g(paramErrorCode.spdyGoAwayCode);
    this.sink.flush();
  }
  
  public void headers(int paramInt, List<Header> paramList)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    writeNameValueBlockToBuffer(paramList);
    int i = (int)(this.headerBlockBuffer.a() + 4L);
    this.sink.g(-2147287032);
    this.sink.g(i & 0xFFFFFF | 0x0);
    this.sink.g(0x7FFFFFFF & paramInt);
    this.sink.a(this.headerBlockBuffer);
  }
  
  public int maxDataLength()
  {
    return 16383;
  }
  
  public void ping(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    boolean bool3 = this.client;
    boolean bool1;
    if ((paramInt1 & 0x1) == 1) {
      bool1 = true;
    }
    for (;;)
    {
      if (paramBoolean != bool1) {
        throw new IllegalArgumentException("payload != reply");
      }
      this.sink.g(-2147287034);
      this.sink.g(4);
      this.sink.g(paramInt1);
      this.sink.flush();
      return;
      for (;;)
      {
        if (bool3 == bool1) {
          break label130;
        }
        bool1 = bool2;
        break;
        bool1 = false;
      }
      label130:
      bool1 = false;
    }
  }
  
  public void pushPromise(int paramInt1, int paramInt2, List<Header> paramList) {}
  
  public void rstStream(int paramInt, ErrorCode paramErrorCode)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    if (paramErrorCode.spdyRstCode == -1) {
      throw new IllegalArgumentException();
    }
    this.sink.g(-2147287037);
    this.sink.g(8);
    this.sink.g(0x7FFFFFFF & paramInt);
    this.sink.g(paramErrorCode.spdyRstCode);
    this.sink.flush();
  }
  
  void sendDataFrame(int paramInt1, int paramInt2, f paramf, int paramInt3)
  {
    if (this.closed) {
      throw new IOException("closed");
    }
    if (paramInt3 > 16777215L) {
      throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + paramInt3);
    }
    this.sink.g(0x7FFFFFFF & paramInt1);
    this.sink.g((paramInt2 & 0xFF) << 24 | 0xFFFFFF & paramInt3);
    if (paramInt3 > 0) {
      this.sink.write(paramf, paramInt3);
    }
  }
  
  public void settings(Settings paramSettings)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    int i = paramSettings.size();
    this.sink.g(-2147287036);
    this.sink.g(i * 8 + 4 & 0xFFFFFF | 0x0);
    this.sink.g(i);
    i = 0;
    for (;;)
    {
      if (i <= 10)
      {
        if (paramSettings.isSet(i))
        {
          int j = paramSettings.flags(i);
          this.sink.g((j & 0xFF) << 24 | i & 0xFFFFFF);
          this.sink.g(paramSettings.get(i));
        }
      }
      else
      {
        this.sink.flush();
        return;
      }
      i += 1;
    }
  }
  
  public void synReply(boolean paramBoolean, int paramInt, List<Header> paramList)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    writeNameValueBlockToBuffer(paramList);
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      int j = (int)(this.headerBlockBuffer.a() + 4L);
      this.sink.g(-2147287038);
      this.sink.g((i & 0xFF) << 24 | j & 0xFFFFFF);
      this.sink.g(0x7FFFFFFF & paramInt);
      this.sink.a(this.headerBlockBuffer);
      this.sink.flush();
      return;
    }
  }
  
  public void synStream(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, List<Header> paramList)
  {
    int j = 0;
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    writeNameValueBlockToBuffer(paramList);
    int k = (int)(10L + this.headerBlockBuffer.a());
    int i;
    if (paramBoolean1) {
      i = 1;
    }
    for (;;)
    {
      this.sink.g(-2147287039);
      this.sink.g(((j | i) & 0xFF) << 24 | k & 0xFFFFFF);
      this.sink.g(paramInt1 & 0x7FFFFFFF);
      this.sink.g(paramInt2 & 0x7FFFFFFF);
      this.sink.h(0);
      this.sink.a(this.headerBlockBuffer);
      this.sink.flush();
      return;
      i = 0;
      if (paramBoolean2) {
        j = 2;
      }
    }
  }
  
  public void windowUpdate(int paramInt, long paramLong)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    if ((paramLong == 0L) || (paramLong > 2147483647L)) {
      throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + paramLong);
    }
    this.sink.g(-2147287031);
    this.sink.g(8);
    this.sink.g(paramInt);
    this.sink.g((int)paramLong);
    this.sink.flush();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\Spdy3$Writer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */