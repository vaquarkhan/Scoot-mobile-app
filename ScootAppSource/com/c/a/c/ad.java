package com.c.a.c;

import java.io.File;
import java.io.FilenameFilter;

final class ad
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return (paramString.length() == ".cls".length() + 35) && (paramString.endsWith(".cls"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */