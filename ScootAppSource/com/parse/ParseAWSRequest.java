package com.parse;

import a.o;
import com.parse.http.ParseHttpRequest.Method;
import com.parse.http.ParseHttpResponse;
import java.io.File;

class ParseAWSRequest
  extends ParseRequest<Void>
{
  private final File tempFile;
  
  public ParseAWSRequest(ParseHttpRequest.Method paramMethod, String paramString, File paramFile)
  {
    super(paramMethod, paramString);
    this.tempFile = paramFile;
  }
  
  protected o<Void> onResponseAsync(ParseHttpResponse paramParseHttpResponse, ProgressCallback paramProgressCallback)
  {
    int i = paramParseHttpResponse.getStatusCode();
    if (((i >= 200) && (i < 300)) || (i == 304))
    {
      if (this.method != ParseHttpRequest.Method.GET) {
        return null;
      }
    }
    else
    {
      if (this.method == ParseHttpRequest.Method.GET) {}
      for (paramProgressCallback = "Download from";; paramProgressCallback = "Upload to") {
        return o.a(new ParseException(100, String.format("%s S3 failed. %s", new Object[] { paramProgressCallback, paramParseHttpResponse.getReasonPhrase() })));
      }
    }
    return o.a(new ParseAWSRequest.1(this, paramParseHttpResponse, paramProgressCallback), ParseExecutors.io());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAWSRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */