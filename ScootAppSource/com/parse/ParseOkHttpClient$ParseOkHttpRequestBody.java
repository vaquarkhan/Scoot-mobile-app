package com.parse;

import com.parse.http.ParseHttpBody;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import d.i;

class ParseOkHttpClient$ParseOkHttpRequestBody
  extends RequestBody
{
  private ParseHttpBody parseBody;
  
  public ParseOkHttpClient$ParseOkHttpRequestBody(ParseHttpBody paramParseHttpBody)
  {
    this.parseBody = paramParseHttpBody;
  }
  
  public long contentLength()
  {
    return this.parseBody.getContentLength();
  }
  
  public MediaType contentType()
  {
    if (this.parseBody.getContentType() == null) {
      return null;
    }
    return MediaType.parse(this.parseBody.getContentType());
  }
  
  public ParseHttpBody getParseHttpBody()
  {
    return this.parseBody;
  }
  
  public void writeTo(i parami)
  {
    this.parseBody.writeTo(parami.c());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseOkHttpClient$ParseOkHttpRequestBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */