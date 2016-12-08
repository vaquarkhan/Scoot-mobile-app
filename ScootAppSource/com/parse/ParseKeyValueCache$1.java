package com.parse;

import java.io.File;
import java.io.FilenameFilter;

final class ParseKeyValueCache$1
  implements FilenameFilter
{
  ParseKeyValueCache$1(String paramString) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    return paramString.endsWith(this.val$suffix);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseKeyValueCache$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */