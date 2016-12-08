package com.digits.sdk.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;

public final class ea
{
  private final Context a;
  
  ea(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private String a(Context paramContext)
  {
    return paramContext.getApplicationInfo().loadLabel(paramContext.getPackageManager()).toString();
  }
  
  private String b(int paramInt)
  {
    return String.format("<a href=%1$s>", new Object[] { this.a.getResources().getString(paramInt) });
  }
  
  protected Spanned a(int paramInt)
  {
    String str = a(this.a);
    return Html.fromHtml(this.a.getString(paramInt, new Object[] { "\"", "<u>", "</u>", str, "</a>", b(R.string.dgts__digits_com_url), b(R.string.dgts__digits_com_settings_url), b(R.string.dgts__twitter_tos_url), b(R.string.dgts__twitter_privacy_url), b(R.string.dgts__twitter_cookies_policy_url) }));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */