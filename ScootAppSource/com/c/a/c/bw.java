package com.c.a.c;

import java.io.File;
import java.io.FilenameFilter;

final class bw
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return (paramString.endsWith(".cls")) && (!paramString.contains("Session"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */