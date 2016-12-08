package com.parse;

import java.io.File;

public abstract interface GetFileCallback
  extends ParseCallback2<File, ParseException>
{
  public abstract void done(File paramFile, ParseException paramParseException);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GetFileCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */