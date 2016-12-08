package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public final class j
{
  static boolean a = false;
  static boolean b = false;
  private static j c = new j();
  private Map<String, Object> d = new HashMap();
  private boolean e;
  private boolean f;
  private String g;
  private boolean h;
  
  public static j a()
  {
    return c;
  }
  
  public int a(String paramString, int paramInt)
  {
    paramString = b(paramString);
    if (paramString == null) {
      return paramInt;
    }
    return Integer.valueOf(paramString).intValue();
  }
  
  public String a(Context paramContext)
  {
    if (this.g != null) {
      return this.g;
    }
    return paramContext.getSharedPreferences("appsflyer-data", 0).getString("referrer", null);
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.d.put(paramString1, paramString2);
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    this.d.put(paramString, Boolean.toString(paramBoolean));
  }
  
  public String[] a(String paramString)
  {
    return (String[])this.d.get(paramString);
  }
  
  public String b(String paramString)
  {
    return (String)this.d.get(paramString);
  }
  
  protected void b()
  {
    this.e = true;
  }
  
  public boolean b(String paramString, boolean paramBoolean)
  {
    paramString = b(paramString);
    if (paramString == null) {
      return paramBoolean;
    }
    return Boolean.valueOf(paramString).booleanValue();
  }
  
  protected void c(String paramString)
  {
    this.g = paramString;
  }
  
  protected boolean c()
  {
    return this.f;
  }
  
  protected void d()
  {
    this.f = true;
  }
  
  public boolean e()
  {
    return this.h;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsflyer\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */