package com.squareup.okhttp.internal.http;

import d.ad;
import d.ae;
import d.j;
import d.o;

abstract class Http1xStream$AbstractSource
  implements ad
{
  protected boolean closed;
  protected final o timeout = new o(Http1xStream.access$600(this.this$0).timeout());
  
  private Http1xStream$AbstractSource(Http1xStream paramHttp1xStream) {}
  
  protected final void endOfInput()
  {
    if (Http1xStream.access$500(this.this$0) != 5) {
      throw new IllegalStateException("state: " + Http1xStream.access$500(this.this$0));
    }
    Http1xStream.access$400(this.this$0, this.timeout);
    Http1xStream.access$502(this.this$0, 6);
    if (Http1xStream.access$700(this.this$0) != null) {
      Http1xStream.access$700(this.this$0).streamFinished(this.this$0);
    }
  }
  
  public ae timeout()
  {
    return this.timeout;
  }
  
  protected final void unexpectedEndOfInput()
  {
    if (Http1xStream.access$500(this.this$0) == 6) {}
    do
    {
      return;
      Http1xStream.access$502(this.this$0, 6);
    } while (Http1xStream.access$700(this.this$0) == null);
    Http1xStream.access$700(this.this$0).noNewStreams();
    Http1xStream.access$700(this.this$0).streamFinished(this.this$0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\Http1xStream$AbstractSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */