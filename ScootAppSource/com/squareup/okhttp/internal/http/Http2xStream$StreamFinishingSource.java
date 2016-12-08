package com.squareup.okhttp.internal.http;

import d.ad;
import d.n;

class Http2xStream$StreamFinishingSource
  extends n
{
  public Http2xStream$StreamFinishingSource(Http2xStream paramHttp2xStream, ad paramad)
  {
    super(paramad);
  }
  
  public void close()
  {
    Http2xStream.access$000(this.this$0).streamFinished(this.this$0);
    super.close();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\Http2xStream$StreamFinishingSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */