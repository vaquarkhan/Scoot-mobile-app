package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.util.Arrays;

public final class c
{
  File a(Context paramContext)
  {
    return new File(paramContext.getApplicationInfo().dataDir, "shared_prefs");
  }
  
  File a(File paramFile, String paramString)
  {
    paramFile = paramFile.listFiles(new e(paramString));
    Arrays.sort(paramFile, new d());
    if (paramFile.length > 0) {
      return paramFile[0];
    }
    return null;
  }
  
  public void a(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = a(paramContext);
    if ((!paramContext.exists()) || (!paramContext.isDirectory())) {}
    do
    {
      do
      {
        return;
        paramString2 = new File(paramContext, paramString2);
      } while (paramString2.exists());
      paramContext = a(paramContext, paramString1);
    } while (paramContext == null);
    paramContext.renameTo(paramString2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */