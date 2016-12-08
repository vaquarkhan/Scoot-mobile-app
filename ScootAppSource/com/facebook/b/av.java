package com.facebook.b;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

final class av
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return Pattern.matches("cpu[0-9]+", paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */