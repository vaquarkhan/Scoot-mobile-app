package com.google.android.gms.auth.api.credentials.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.b;

public final class a
{
  public static String a(String paramString)
  {
    boolean bool2 = false;
    if (!TextUtils.isEmpty(paramString)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      b.b(bool1, "account type cannot be empty");
      String str = Uri.parse(paramString).getScheme();
      if (!"http".equalsIgnoreCase(str))
      {
        bool1 = bool2;
        if (!"https".equalsIgnoreCase(str)) {}
      }
      else
      {
        bool1 = true;
      }
      b.b(bool1, "Account type must be an http or https URI");
      return paramString;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */