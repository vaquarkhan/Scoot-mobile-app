package com.parse;

import com.parse.http.ParseHttpRequest.Method;
import java.io.File;

public class ParseRESTFileCommand$Builder
  extends ParseRESTCommand.Init<Builder>
{
  private String contentType = null;
  private byte[] data = null;
  private File file;
  
  public ParseRESTFileCommand$Builder()
  {
    method(ParseHttpRequest.Method.POST);
  }
  
  public ParseRESTFileCommand build()
  {
    return new ParseRESTFileCommand(this);
  }
  
  public Builder contentType(String paramString)
  {
    this.contentType = paramString;
    return this;
  }
  
  public Builder data(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
    return this;
  }
  
  public Builder file(File paramFile)
  {
    this.file = paramFile;
    return this;
  }
  
  public Builder fileName(String paramString)
  {
    return (Builder)httpPath(String.format("files/%s", new Object[] { paramString }));
  }
  
  Builder self()
  {
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRESTFileCommand$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */