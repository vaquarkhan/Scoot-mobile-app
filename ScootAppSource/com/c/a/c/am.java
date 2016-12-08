package com.c.a.c;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class am
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return (!ac.a.accept(paramFile, paramString)) && (ac.h().matcher(paramString).matches());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */