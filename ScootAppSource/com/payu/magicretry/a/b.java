package com.payu.magicretry.a;

import android.content.Context;
import android.content.SharedPreferences;

public final class b
{
  public static String a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    return paramContext.getSharedPreferences(paramString1, 0).getString(paramString2, paramString3);
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    return paramContext.getSharedPreferences(paramString1, 0).getBoolean(paramString2, paramBoolean);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\magicretry\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */