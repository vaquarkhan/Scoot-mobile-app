package com.parse.http;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ParseHttpResponse
{
  private final InputStream content;
  private final String contentType;
  private final Map<String, String> headers;
  private final String reasonPhrase;
  private final int statusCode;
  private final long totalSize;
  
  private ParseHttpResponse(ParseHttpResponse.Builder paramBuilder)
  {
    this.statusCode = ParseHttpResponse.Builder.access$100(paramBuilder);
    this.content = ParseHttpResponse.Builder.access$200(paramBuilder);
    this.totalSize = ParseHttpResponse.Builder.access$300(paramBuilder);
    this.reasonPhrase = ParseHttpResponse.Builder.access$400(paramBuilder);
    this.headers = Collections.unmodifiableMap(new HashMap(ParseHttpResponse.Builder.access$500(paramBuilder)));
    this.contentType = ParseHttpResponse.Builder.access$600(paramBuilder);
  }
  
  public Map<String, String> getAllHeaders()
  {
    return this.headers;
  }
  
  public InputStream getContent()
  {
    return this.content;
  }
  
  public String getContentType()
  {
    return this.contentType;
  }
  
  public String getHeader(String paramString)
  {
    return (String)this.headers.get(paramString);
  }
  
  public String getReasonPhrase()
  {
    return this.reasonPhrase;
  }
  
  public int getStatusCode()
  {
    return this.statusCode;
  }
  
  public long getTotalSize()
  {
    return this.totalSize;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\http\ParseHttpResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */