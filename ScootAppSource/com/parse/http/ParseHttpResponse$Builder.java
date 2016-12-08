package com.parse.http;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class ParseHttpResponse$Builder
{
  private InputStream content;
  private String contentType;
  private Map<String, String> headers;
  private String reasonPhrase;
  private int statusCode;
  private long totalSize;
  
  public ParseHttpResponse$Builder()
  {
    this.totalSize = -1L;
    this.headers = new HashMap();
  }
  
  public ParseHttpResponse$Builder(ParseHttpResponse paramParseHttpResponse)
  {
    setStatusCode(paramParseHttpResponse.getStatusCode());
    setContent(paramParseHttpResponse.getContent());
    setTotalSize(paramParseHttpResponse.getTotalSize());
    setContentType(paramParseHttpResponse.getContentType());
    setHeaders(paramParseHttpResponse.getAllHeaders());
    setReasonPhrase(paramParseHttpResponse.getReasonPhrase());
  }
  
  public ParseHttpResponse build()
  {
    return new ParseHttpResponse(this, null);
  }
  
  public Builder setContent(InputStream paramInputStream)
  {
    this.content = paramInputStream;
    return this;
  }
  
  public Builder setContentType(String paramString)
  {
    this.contentType = paramString;
    return this;
  }
  
  public Builder setHeaders(Map<String, String> paramMap)
  {
    this.headers = new HashMap(paramMap);
    return this;
  }
  
  public Builder setReasonPhrase(String paramString)
  {
    this.reasonPhrase = paramString;
    return this;
  }
  
  public Builder setStatusCode(int paramInt)
  {
    this.statusCode = paramInt;
    return this;
  }
  
  public Builder setTotalSize(long paramLong)
  {
    this.totalSize = paramLong;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\http\ParseHttpResponse$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */