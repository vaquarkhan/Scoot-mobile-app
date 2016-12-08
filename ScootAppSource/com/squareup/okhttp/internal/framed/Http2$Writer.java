package com.squareup.okhttp.internal.framed;

import d.f;
import d.i;
import d.k;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class Http2$Writer
  implements FrameWriter
{
  private final boolean client;
  private boolean closed;
  private final f hpackBuffer;
  private final Hpack.Writer hpackWriter;
  private int maxFrameSize;
  private final i sink;
  
  Http2$Writer(i parami, boolean paramBoolean)
  {
    this.sink = parami;
    this.client = paramBoolean;
    this.hpackBuffer = new f();
    this.hpackWriter = new Hpack.Writer(this.hpackBuffer);
    this.maxFrameSize = 16384;
  }
  
  private void writeContinuationFrames(int paramInt, long paramLong)
  {
    if (paramLong > 0L)
    {
      int i = (int)Math.min(this.maxFrameSize, paramLong);
      paramLong -= i;
      if (paramLong == 0L) {}
      for (byte b = 4;; b = 0)
      {
        frameHeader(paramInt, i, (byte)9, b);
        this.sink.write(this.hpackBuffer, i);
        break;
      }
    }
  }
  
  public void ackSettings(Settings paramSettings)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    this.maxFrameSize = paramSettings.getMaxFrameSize(this.maxFrameSize);
    frameHeader(0, 0, (byte)4, (byte)1);
    this.sink.flush();
  }
  
  public void close()
  {
    try
    {
      this.closed = true;
      this.sink.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void connectionPreface()
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    boolean bool = this.client;
    if (!bool) {}
    for (;;)
    {
      return;
      if (Http2.access$100().isLoggable(Level.FINE)) {
        Http2.access$100().fine(String.format(">> CONNECTION %s", new Object[] { Http2.access$000().d() }));
      }
      this.sink.c(Http2.access$000().g());
      this.sink.flush();
    }
  }
  
  public void data(boolean paramBoolean, int paramInt1, f paramf, int paramInt2)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    byte b = 0;
    if (paramBoolean) {
      b = (byte)1;
    }
    dataFrame(paramInt1, b, paramf, paramInt2);
  }
  
  void dataFrame(int paramInt1, byte paramByte, f paramf, int paramInt2)
  {
    frameHeader(paramInt1, paramInt2, (byte)0, paramByte);
    if (paramInt2 > 0) {
      this.sink.write(paramf, paramInt2);
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
  
  void frameHeader(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    if (Http2.access$100().isLoggable(Level.FINE)) {
      Http2.access$100().fine(Http2.FrameLogger.formatHeader(false, paramInt1, paramInt2, paramByte1, paramByte2));
    }
    if (paramInt2 > this.maxFrameSize) {
      throw Http2.access$500("FRAME_SIZE_ERROR length > %d: %d", new Object[] { Integer.valueOf(this.maxFrameSize), Integer.valueOf(paramInt2) });
    }
    if ((0x80000000 & paramInt1) != 0) {
      throw Http2.access$500("reserved bit set: %s", new Object[] { Integer.valueOf(paramInt1) });
    }
    Http2.access$600(this.sink, paramInt2);
    this.sink.i(paramByte1 & 0xFF);
    this.sink.i(paramByte2 & 0xFF);
    this.sink.g(0x7FFFFFFF & paramInt1);
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
    if (paramErrorCode.httpCode == -1) {
      throw Http2.access$500("errorCode.httpCode == -1", new Object[0]);
    }
    frameHeader(0, paramArrayOfByte.length + 8, (byte)7, (byte)0);
    this.sink.g(paramInt);
    this.sink.g(paramErrorCode.httpCode);
    if (paramArrayOfByte.length > 0) {
      this.sink.c(paramArrayOfByte);
    }
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
    headers(false, paramInt, paramList);
  }
  
  void headers(boolean paramBoolean, int paramInt, List<Header> paramList)
  {
    if (this.closed) {
      throw new IOException("closed");
    }
    this.hpackWriter.writeHeaders(paramList);
    long l = this.hpackBuffer.a();
    int i = (int)Math.min(this.maxFrameSize, l);
    if (l == i) {}
    for (byte b1 = 4;; b1 = 0)
    {
      byte b2 = b1;
      if (paramBoolean) {
        b2 = (byte)(b1 | 0x1);
      }
      frameHeader(paramInt, i, (byte)1, b2);
      this.sink.write(this.hpackBuffer, i);
      if (l > i) {
        writeContinuationFrames(paramInt, l - i);
      }
      return;
    }
  }
  
  public int maxDataLength()
  {
    return this.maxFrameSize;
  }
  
  public void ping(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    byte b = 0;
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    if (paramBoolean) {
      b = 1;
    }
    frameHeader(0, 8, (byte)6, b);
    this.sink.g(paramInt1);
    this.sink.g(paramInt2);
    this.sink.flush();
  }
  
  public void pushPromise(int paramInt1, int paramInt2, List<Header> paramList)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    this.hpackWriter.writeHeaders(paramList);
    long l = this.hpackBuffer.a();
    int i = (int)Math.min(this.maxFrameSize - 4, l);
    if (l == i) {}
    for (byte b = 4;; b = 0)
    {
      frameHeader(paramInt1, i + 4, (byte)5, b);
      this.sink.g(0x7FFFFFFF & paramInt2);
      this.sink.write(this.hpackBuffer, i);
      if (l > i) {
        writeContinuationFrames(paramInt1, l - i);
      }
      return;
    }
  }
  
  public void rstStream(int paramInt, ErrorCode paramErrorCode)
  {
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    if (paramErrorCode.httpCode == -1) {
      throw new IllegalArgumentException();
    }
    frameHeader(paramInt, 4, (byte)3, (byte)0);
    this.sink.g(paramErrorCode.httpCode);
    this.sink.flush();
  }
  
  public void settings(Settings paramSettings)
  {
    int i = 0;
    try
    {
      if (this.closed) {
        throw new IOException("closed");
      }
    }
    finally {}
    frameHeader(0, paramSettings.size() * 6, (byte)4, (byte)0);
    if (i < 10) {
      if (paramSettings.isSet(i)) {
        break label110;
      }
    }
    for (;;)
    {
      label57:
      this.sink.h(j);
      this.sink.g(paramSettings.get(i));
      break label103;
      this.sink.flush();
      return;
      label103:
      label110:
      do
      {
        j = i;
        break label57;
        i += 1;
        break;
        if (i == 4)
        {
          j = 3;
          break label57;
        }
      } while (i != 7);
      int j = 4;
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
    headers(paramBoolean, paramInt, paramList);
  }
  
  public void synStream(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, List<Header> paramList)
  {
    if (paramBoolean2) {
      try
      {
        throw new UnsupportedOperationException();
      }
      finally {}
    }
    if (this.closed) {
      throw new IOException("closed");
    }
    headers(paramBoolean1, paramInt1, paramList);
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
      throw Http2.access$500("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] { Long.valueOf(paramLong) });
    }
    frameHeader(paramInt, 4, (byte)8, (byte)0);
    this.sink.g((int)paramLong);
    this.sink.flush();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\Http2$Writer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */