package com.digits.sdk.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;

final class ch
{
  private final String a;
  private final String b;
  private final String c;
  
  ch()
  {
    this(ao.d().a(), Build.VERSION.RELEASE, ao.d().E().getApplicationContext().getApplicationInfo().loadLabel(ao.d().E().getApplicationContext().getPackageManager()).toString());
  }
  
  ch(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.c = paramString3;
    this.b = paramString2;
  }
  
  public String toString()
  {
    return "Digits/" + this.a + " ( " + this.c + "; Android " + this.b + ")";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */