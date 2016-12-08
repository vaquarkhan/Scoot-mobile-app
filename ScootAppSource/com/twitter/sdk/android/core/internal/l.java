package com.twitter.sdk.android.core.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;

public class l
{
  private final String a;
  
  public l()
  {
    this("https://api.twitter.com");
  }
  
  public l(String paramString)
  {
    this.a = paramString;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    return paramString1 + '/' + paramString2 + ' ' + Build.MODEL + '/' + Build.VERSION.RELEASE + " (" + Build.MANUFACTURER + ';' + Build.MODEL + ';' + Build.BRAND + ';' + Build.PRODUCT + ')';
  }
  
  public Uri.Builder a(String... paramVarArgs)
  {
    Uri.Builder localBuilder = Uri.parse(a()).buildUpon();
    if (paramVarArgs != null)
    {
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        localBuilder.appendPath(paramVarArgs[i]);
        i += 1;
      }
    }
    return localBuilder;
  }
  
  public String a()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */