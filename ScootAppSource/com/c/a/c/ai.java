package com.c.a.c;

import java.io.File;
import java.util.Comparator;

final class ai
  implements Comparator<File>
{
  public int a(File paramFile1, File paramFile2)
  {
    return paramFile2.getName().compareTo(paramFile1.getName());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */