package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import d.ac;
import d.ae;
import d.f;
import java.net.ProtocolException;

public final class RetryableSink
  implements ac
{
  private boolean closed;
  private final f content = new f();
  private final int limit;
  
  public RetryableSink()
  {
    this(-1);
  }
  
  public RetryableSink(int paramInt)
  {
    this.limit = paramInt;
  }
  
  public void close()
  {
    if (this.closed) {}
    do
    {
      return;
      this.closed = true;
    } while (this.content.a() >= this.limit);
    throw new ProtocolException("content-length promised " + this.limit + " bytes, but received " + this.content.a());
  }
  
  public long contentLength()
  {
    return this.content.a();
  }
  
  public void flush() {}
  
  public ae timeout()
  {
    return ae.NONE;
  }
  
  public void write(f paramf, long paramLong)
  {
    if (this.closed) {
      throw new IllegalStateException("closed");
    }
    Util.checkOffsetAndCount(paramf.a(), 0L, paramLong);
    if ((this.limit != -1) && (this.content.a() > this.limit - paramLong)) {
      throw new ProtocolException("exceeded content-length limit of " + this.limit + " bytes");
    }
    this.content.write(paramf, paramLong);
  }
  
  public void writeToSocket(ac paramac)
  {
    f localf = new f();
    this.content.a(localf, 0L, this.content.a());
    paramac.write(localf, localf.a());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\RetryableSink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */