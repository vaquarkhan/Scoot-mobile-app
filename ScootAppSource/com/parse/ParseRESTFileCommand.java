package com.parse;

import com.parse.http.ParseHttpBody;
import java.io.File;

class ParseRESTFileCommand
  extends ParseRESTCommand
{
  private final String contentType;
  private final byte[] data;
  private final File file;
  
  public ParseRESTFileCommand(ParseRESTFileCommand.Builder paramBuilder)
  {
    super(paramBuilder);
    if ((ParseRESTFileCommand.Builder.access$000(paramBuilder) != null) && (ParseRESTFileCommand.Builder.access$100(paramBuilder) != null)) {
      throw new IllegalArgumentException("File and data can not be set at the same time");
    }
    this.data = ParseRESTFileCommand.Builder.access$100(paramBuilder);
    this.contentType = ParseRESTFileCommand.Builder.access$200(paramBuilder);
    this.file = ParseRESTFileCommand.Builder.access$000(paramBuilder);
  }
  
  protected ParseHttpBody newBody(ProgressCallback paramProgressCallback)
  {
    if (paramProgressCallback == null)
    {
      if (this.data != null) {
        return new ParseByteArrayHttpBody(this.data, this.contentType);
      }
      return new ParseFileHttpBody(this.file, this.contentType);
    }
    if (this.data != null) {
      return new ParseCountingByteArrayHttpBody(this.data, this.contentType, paramProgressCallback);
    }
    return new ParseCountingFileHttpBody(this.file, this.contentType, paramProgressCallback);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRESTFileCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */