package com.parse.http;

import java.util.HashMap;
import java.util.Map;

public final class ParseHttpRequest$Builder
{
  private ParseHttpBody body;
  private Map<String, String> headers;
  private ParseHttpRequest.Method method;
  private String url;
  
  public ParseHttpRequest$Builder()
  {
    this.headers = new HashMap();
  }
  
  public ParseHttpRequest$Builder(ParseHttpRequest paramParseHttpRequest)
  {
    this.url = ParseHttpRequest.access$000(paramParseHttpRequest);
    this.method = ParseHttpRequest.access$100(paramParseHttpRequest);
    this.headers = new HashMap(ParseHttpRequest.access$200(paramParseHttpRequest));
    this.body = ParseHttpRequest.access$300(paramParseHttpRequest);
  }
  
  public Builder addHeader(String paramString1, String paramString2)
  {
    this.headers.put(paramString1, paramString2);
    return this;
  }
  
  public ParseHttpRequest build()
  {
    return new ParseHttpRequest(this, null);
  }
  
  public Builder setBody(ParseHttpBody paramParseHttpBody)
  {
    this.body = paramParseHttpBody;
    return this;
  }
  
  public Builder setMethod(ParseHttpRequest.Method paramMethod)
  {
    this.method = paramMethod;
    return this;
  }
  
  public Builder setUrl(String paramString)
  {
    this.url = paramString;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\http\ParseHttpRequest$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */