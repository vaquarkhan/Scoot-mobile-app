package com.parse;

import java.io.InputStream;

public abstract interface GetDataStreamCallback
  extends ParseCallback2<InputStream, ParseException>
{
  public abstract void done(InputStream paramInputStream, ParseException paramParseException);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GetDataStreamCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */