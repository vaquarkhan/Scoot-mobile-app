package com.c.a.c;

import java.io.File;
import java.io.FilenameFilter;

final class an
  implements FilenameFilter
{
  private final String a;
  
  public an(String paramString)
  {
    this.a = paramString;
  }
  
  public boolean accept(File paramFile, String paramString)
  {
    return (paramString.contains(this.a)) && (!paramString.endsWith(".cls_temp"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */