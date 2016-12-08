package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.analytics.ab;
import com.google.android.gms.common.internal.b;
import java.util.HashMap;
import java.util.Map;

public final class ac
  extends ab<ac>
{
  private String a;
  private String b;
  private String c;
  private String d;
  private boolean e;
  private String f;
  private boolean g;
  private double h;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    if ((paramDouble >= 0.0D) && (paramDouble <= 100.0D)) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool, "Sample rate must be between 0% and 100%");
      this.h = paramDouble;
      return;
    }
  }
  
  public void a(ac paramac)
  {
    if (!TextUtils.isEmpty(this.a)) {
      paramac.a(this.a);
    }
    if (!TextUtils.isEmpty(this.b)) {
      paramac.b(this.b);
    }
    if (!TextUtils.isEmpty(this.c)) {
      paramac.c(this.c);
    }
    if (!TextUtils.isEmpty(this.d)) {
      paramac.d(this.d);
    }
    if (this.e) {
      paramac.a(true);
    }
    if (!TextUtils.isEmpty(this.f)) {
      paramac.e(this.f);
    }
    if (this.g) {
      paramac.b(this.g);
    }
    if (this.h != 0.0D) {
      paramac.a(this.h);
    }
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
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
  
  public void e(String paramString)
  {
    this.f = paramString;
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public boolean g()
  {
    return this.g;
  }
  
  public double h()
  {
    return this.h;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hitType", this.a);
    localHashMap.put("clientId", this.b);
    localHashMap.put("userId", this.c);
    localHashMap.put("androidAdId", this.d);
    localHashMap.put("AdTargetingEnabled", Boolean.valueOf(this.e));
    localHashMap.put("sessionControl", this.f);
    localHashMap.put("nonInteraction", Boolean.valueOf(this.g));
    localHashMap.put("sampleRate", Double.valueOf(this.h));
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */