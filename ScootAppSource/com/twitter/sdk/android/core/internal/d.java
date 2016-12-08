package com.twitter.sdk.android.core.internal;

import java.io.File;
import java.util.Comparator;

final class d
  implements Comparator<File>
{
  public int a(File paramFile1, File paramFile2)
  {
    return Long.valueOf(paramFile2.lastModified()).compareTo(Long.valueOf(paramFile1.lastModified()));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */