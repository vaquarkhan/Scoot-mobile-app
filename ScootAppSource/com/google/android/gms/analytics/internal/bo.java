package com.google.android.gms.analytics.internal;

import android.os.Build.VERSION;
import java.io.File;

public final class bo
{
  public static int a()
  {
    try
    {
      int i = Integer.parseInt(Build.VERSION.SDK);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      i.a("Invalid version number", Build.VERSION.SDK);
    }
    return 0;
  }
  
  public static boolean a(String paramString)
  {
    if (a() < 9) {
      return false;
    }
    paramString = new File(paramString);
    paramString.setReadable(false, false);
    paramString.setWritable(false, false);
    paramString.setReadable(true, true);
    paramString.setWritable(true, true);
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */