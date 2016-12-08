package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;
import d.j;

public final class RealResponseBody
  extends ResponseBody
{
  private final Headers headers;
  private final j source;
  
  public RealResponseBody(Headers paramHeaders, j paramj)
  {
    this.headers = paramHeaders;
    this.source = paramj;
  }
  
  public long contentLength()
  {
    return OkHeaders.contentLength(this.headers);
  }
  
  public MediaType contentType()
  {
    String str = this.headers.get("Content-Type");
    if (str != null) {
      return MediaType.parse(str);
    }
    return null;
  }
  
  public j source()
  {
    return this.source;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\RealResponseBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */