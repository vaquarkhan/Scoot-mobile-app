package com.digits.sdk.android;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import b.a.a.a.a.b.m;
import java.util.Locale;

final class dx
{
  private final TelephonyManager a;
  private final boolean b;
  
  protected dx(TelephonyManager paramTelephonyManager, boolean paramBoolean)
  {
    this.a = paramTelephonyManager;
    this.b = paramBoolean;
  }
  
  public static dx a(Context paramContext)
  {
    return new dx((TelephonyManager)paramContext.getSystemService("phone"), m.c(paramContext, "android.permission.READ_PHONE_STATE"));
  }
  
  private String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramString.length();
    int i = 0;
    if (i < j)
    {
      char c = paramString.charAt(i);
      int k = Character.digit(c, 10);
      if (k != -1) {
        localStringBuilder.append(k);
      }
      label88:
      do
      {
        for (;;)
        {
          i += 1;
          break;
          if ((i != 0) || (c != '+')) {
            break label88;
          }
          localStringBuilder.append(c);
        }
      } while (((c < 'a') || (c > 'z')) && ((c < 'A') || (c > 'Z')));
      return a(PhoneNumberUtils.convertKeypadLettersToDigits(paramString));
    }
    return localStringBuilder.toString();
  }
  
  private boolean b(String paramString)
  {
    return (paramString != null) && (paramString.length() == 2);
  }
  
  private boolean c()
  {
    return this.a.getPhoneType() == 2;
  }
  
  protected String a()
  {
    if ((this.a == null) || (!this.b)) {
      return "";
    }
    return a(this.a.getLine1Number());
  }
  
  protected String b()
  {
    if (this.a != null)
    {
      String str = this.a.getSimCountryIso();
      if (b(str)) {
        return str.toUpperCase(Locale.getDefault());
      }
      if (!c())
      {
        str = this.a.getNetworkCountryIso();
        if (b(str)) {
          return str.toUpperCase(Locale.getDefault());
        }
      }
    }
    return "";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */