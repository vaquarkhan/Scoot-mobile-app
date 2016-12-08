package com.squareup.okhttp.internal.http;

import d.f;
import d.j;

class Http1xStream$UnknownLengthSource
  extends Http1xStream.AbstractSource
{
  private boolean inputExhausted;
  
  private Http1xStream$UnknownLengthSource(Http1xStream paramHttp1xStream)
  {
    super(paramHttp1xStream, null);
  }
  
  public void close()
  {
    if (this.closed) {
      return;
    }
    if (!this.inputExhausted) {
      unexpectedEndOfInput();
    }
    this.closed = true;
  }
  
  public long read(f paramf, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.closed) {
      throw new IllegalStateException("closed");
    }
    if (this.inputExhausted) {
      return -1L;
    }
    paramLong = Http1xStream.access$600(this.this$0).read(paramf, paramLong);
    if (paramLong == -1L)
    {
      this.inputExhausted = true;
      endOfInput();
      return -1L;
    }
    return paramLong;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\Http1xStream$UnknownLengthSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */