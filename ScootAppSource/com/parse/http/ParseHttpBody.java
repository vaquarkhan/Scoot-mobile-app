package com.parse.http;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class ParseHttpBody
{
  private final long contentLength;
  private final String contentType;
  
  public ParseHttpBody(String paramString, long paramLong)
  {
    this.contentType = paramString;
    this.contentLength = paramLong;
  }
  
  public abstract InputStream getContent();
  
  public long getContentLength()
  {
    return this.contentLength;
  }
  
  public String getContentType()
  {
    return this.contentType;
  }
  
  public abstract void writeTo(OutputStream paramOutputStream);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\http\ParseHttpBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */