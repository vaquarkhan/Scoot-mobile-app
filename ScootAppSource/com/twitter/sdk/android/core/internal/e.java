package com.twitter.sdk.android.core.internal;

import java.io.File;
import java.io.FilenameFilter;

final class e
  implements FilenameFilter
{
  final String a;
  
  public e(String paramString)
  {
    this.a = paramString;
  }
  
  public boolean accept(File paramFile, String paramString)
  {
    return paramString.startsWith(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */