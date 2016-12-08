package com.appsflyer;

import android.util.Log;

public final class r
{
  private static String a;
  private static String b;
  
  public static void a(String paramString)
  {
    a = paramString;
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    if (i < paramString.length())
    {
      if ((i == 0) || (i == 1) || (i > paramString.length() - 5)) {
        localStringBuilder.append(paramString.charAt(i));
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("*");
      }
    }
    b = localStringBuilder.toString();
  }
  
  public static void b(String paramString)
  {
    if (paramString.contains(a)) {
      Log.i("AppsFlyer_", paramString.replace(a, b));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsflyer\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */