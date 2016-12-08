package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.analytics.ab;
import java.util.HashMap;
import java.util.Map;

public final class t
  extends ab<t>
{
  private String a;
  private String b;
  private String c;
  private String d;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(t paramt)
  {
    if (!TextUtils.isEmpty(this.a)) {
      paramt.a(this.a);
    }
    if (!TextUtils.isEmpty(this.b)) {
      paramt.b(this.b);
    }
    if (!TextUtils.isEmpty(this.c)) {
      paramt.c(this.c);
    }
    if (!TextUtils.isEmpty(this.d)) {
      paramt.d(this.d);
    }
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("appName", this.a);
    localHashMap.put("appVersion", this.b);
    localHashMap.put("appId", this.c);
    localHashMap.put("appInstallerId", this.d);
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */