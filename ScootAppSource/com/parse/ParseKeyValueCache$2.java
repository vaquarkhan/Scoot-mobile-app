package com.parse;

import java.io.File;
import java.util.Comparator;

final class ParseKeyValueCache$2
  implements Comparator<File>
{
  public int compare(File paramFile1, File paramFile2)
  {
    int i = Long.valueOf(paramFile1.lastModified()).compareTo(Long.valueOf(paramFile2.lastModified()));
    if (i != 0) {
      return i;
    }
    return paramFile1.getName().compareTo(paramFile2.getName());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseKeyValueCache$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */