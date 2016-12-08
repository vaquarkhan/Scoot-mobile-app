package com.digits.sdk.android;

import android.text.TextUtils;

public final class dg
{
  private static final dg a = new dg("", "", "");
  private final String b;
  private final String c;
  private final String d;
  
  public dg(String paramString1, String paramString2, String paramString3)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public static dg a()
  {
    return a;
  }
  
  protected static boolean a(dg paramdg)
  {
    return (paramdg != null) && (!a.equals(paramdg)) && (!TextUtils.isEmpty(paramdg.c())) && (!TextUtils.isEmpty(paramdg.b())) && (!TextUtils.isEmpty(paramdg.d()));
  }
  
  protected static boolean b(dg paramdg)
  {
    return (paramdg != null) && (!a.equals(paramdg)) && (!TextUtils.isEmpty(paramdg.b())) && (!TextUtils.isEmpty(paramdg.d()));
  }
  
  public String b()
  {
    return this.d;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public String d()
  {
    return this.c;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */