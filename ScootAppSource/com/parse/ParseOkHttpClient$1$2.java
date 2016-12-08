package com.parse;

import com.parse.http.ParseHttpResponse;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;
import d.j;
import d.r;

class ParseOkHttpClient$1$2
  extends ResponseBody
{
  ParseOkHttpClient$1$2(ParseOkHttpClient.1 param1, ParseHttpResponse paramParseHttpResponse) {}
  
  public long contentLength()
  {
    return this.val$parseResponse.getTotalSize();
  }
  
  public MediaType contentType()
  {
    if (this.val$parseResponse.getContentType() == null) {
      return null;
    }
    return MediaType.parse(this.val$parseResponse.getContentType());
  }
  
  public j source()
  {
    if (this.val$parseResponse.getContent() == null) {
      return null;
    }
    return r.a(r.a(this.val$parseResponse.getContent()));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseOkHttpClient$1$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */