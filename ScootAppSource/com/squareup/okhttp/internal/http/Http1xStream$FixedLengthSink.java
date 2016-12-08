package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import d.ac;
import d.ae;
import d.f;
import d.i;
import d.o;
import java.net.ProtocolException;

final class Http1xStream$FixedLengthSink
  implements ac
{
  private long bytesRemaining;
  private boolean closed;
  private final o timeout = new o(Http1xStream.access$300(this.this$0).timeout());
  
  private Http1xStream$FixedLengthSink(Http1xStream paramHttp1xStream, long paramLong)
  {
    this.bytesRemaining = paramLong;
  }
  
  public void close()
  {
    if (this.closed) {
      return;
    }
    this.closed = true;
    if (this.bytesRemaining > 0L) {
      throw new ProtocolException("unexpected end of stream");
    }
    Http1xStream.access$400(this.this$0, this.timeout);
    Http1xStream.access$502(this.this$0, 3);
  }
  
  public void flush()
  {
    if (this.closed) {
      return;
    }
    Http1xStream.access$300(this.this$0).flush();
  }
  
  public ae timeout()
  {
    return this.timeout;
  }
  
  public void write(f paramf, long paramLong)
  {
    if (this.closed) {
      throw new IllegalStateException("closed");
    }
    Util.checkOffsetAndCount(paramf.a(), 0L, paramLong);
    if (paramLong > this.bytesRemaining) {
      throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + paramLong);
    }
    Http1xStream.access$300(this.this$0).write(paramf, paramLong);
    this.bytesRemaining -= paramLong;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\Http1xStream$FixedLengthSink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */