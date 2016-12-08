package com.parse.http;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ParseHttpRequest
{
  private final ParseHttpBody body;
  private final Map<String, String> headers;
  private final ParseHttpRequest.Method method;
  private final String url;
  
  private ParseHttpRequest(ParseHttpRequest.Builder paramBuilder)
  {
    this.url = ParseHttpRequest.Builder.access$500(paramBuilder);
    this.method = ParseHttpRequest.Builder.access$600(paramBuilder);
    this.headers = Collections.unmodifiableMap(new HashMap(ParseHttpRequest.Builder.access$700(paramBuilder)));
    this.body = ParseHttpRequest.Builder.access$800(paramBuilder);
  }
  
  public Map<String, String> getAllHeaders()
  {
    return this.headers;
  }
  
  public ParseHttpBody getBody()
  {
    return this.body;
  }
  
  public String getHeader(String paramString)
  {
    return (String)this.headers.get(paramString);
  }
  
  public ParseHttpRequest.Method getMethod()
  {
    return this.method;
  }
  
  public String getUrl()
  {
    return this.url;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\http\ParseHttpRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */