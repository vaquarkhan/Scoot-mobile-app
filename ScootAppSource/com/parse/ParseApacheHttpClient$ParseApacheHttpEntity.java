package com.parse;

import com.parse.http.ParseHttpBody;
import java.io.OutputStream;
import org.apache.http.entity.InputStreamEntity;

class ParseApacheHttpClient$ParseApacheHttpEntity
  extends InputStreamEntity
{
  private ParseHttpBody parseBody;
  
  public ParseApacheHttpClient$ParseApacheHttpEntity(ParseHttpBody paramParseHttpBody)
  {
    super(paramParseHttpBody.getContent(), paramParseHttpBody.getContentLength());
    super.setContentType(paramParseHttpBody.getContentType());
    this.parseBody = paramParseHttpBody;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.parseBody.writeTo(paramOutputStream);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseApacheHttpClient$ParseApacheHttpEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */