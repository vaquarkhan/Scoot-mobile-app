package com.digits.sdk.a;

import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;

public final class f
{
  public static String a(String paramString, int paramInt)
  {
    paramString = new SpannableStringBuilder(paramString);
    PhoneNumberUtils.formatNumber(paramString, paramInt);
    return paramString.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */