package com.squareup.okhttp;

import d.i;
import d.k;

final class RequestBody$1
  extends RequestBody
{
  RequestBody$1(MediaType paramMediaType, k paramk) {}
  
  public long contentLength()
  {
    return this.val$content.f();
  }
  
  public MediaType contentType()
  {
    return this.val$contentType;
  }
  
  public void writeTo(i parami)
  {
    parami.b(this.val$content);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\RequestBody$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */