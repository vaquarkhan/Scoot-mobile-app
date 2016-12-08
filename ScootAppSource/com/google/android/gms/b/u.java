package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.analytics.ab;
import java.util.HashMap;
import java.util.Map;

public final class u
  extends ab<u>
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(u paramu)
  {
    if (!TextUtils.isEmpty(this.a)) {
      paramu.a(this.a);
    }
    if (!TextUtils.isEmpty(this.b)) {
      paramu.b(this.b);
    }
    if (!TextUtils.isEmpty(this.c)) {
      paramu.c(this.c);
    }
    if (!TextUtils.isEmpty(this.d)) {
      paramu.d(this.d);
    }
    if (!TextUtils.isEmpty(this.e)) {
      paramu.e(this.e);
    }
    if (!TextUtils.isEmpty(this.f)) {
      paramu.f(this.f);
    }
    if (!TextUtils.isEmpty(this.g)) {
      paramu.g(this.g);
    }
    if (!TextUtils.isEmpty(this.h)) {
      paramu.h(this.h);
    }
    if (!TextUtils.isEmpty(this.i)) {
      paramu.i(this.i);
    }
    if (!TextUtils.isEmpty(this.j)) {
      paramu.j(this.j);
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
  
  public String e()
  {
    return this.e;
  }
  
  public void e(String paramString)
  {
    this.e = paramString;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public void f(String paramString)
  {
    this.f = paramString;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public void g(String paramString)
  {
    this.g = paramString;
  }
  
  public String h()
  {
    return this.h;
  }
  
  public void h(String paramString)
  {
    this.h = paramString;
  }
  
  public String i()
  {
    return this.i;
  }
  
  public void i(String paramString)
  {
    this.i = paramString;
  }
  
  public String j()
  {
    return this.j;
  }
  
  public void j(String paramString)
  {
    this.j = paramString;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("name", this.a);
    localHashMap.put("source", this.b);
    localHashMap.put("medium", this.c);
    localHashMap.put("keyword", this.d);
    localHashMap.put("content", this.e);
    localHashMap.put("id", this.f);
    localHashMap.put("adNetworkId", this.g);
    localHashMap.put("gclid", this.h);
    localHashMap.put("dclid", this.i);
    localHashMap.put("aclid", this.j);
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */