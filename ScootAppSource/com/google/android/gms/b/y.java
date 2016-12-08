package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.analytics.ab;
import java.util.HashMap;
import java.util.Map;

public final class y
  extends ab<y>
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  private String f;
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(y paramy)
  {
    if (this.a != 0) {
      paramy.a(this.a);
    }
    if (this.b != 0) {
      paramy.b(this.b);
    }
    if (this.c != 0) {
      paramy.c(this.c);
    }
    if (this.d != 0) {
      paramy.d(this.d);
    }
    if (this.e != 0) {
      paramy.e(this.e);
    }
    if (!TextUtils.isEmpty(this.f)) {
      paramy.a(this.f);
    }
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public void c(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public void d(int paramInt)
  {
    this.d = paramInt;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public void e(int paramInt)
  {
    this.e = paramInt;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("language", this.f);
    localHashMap.put("screenColors", Integer.valueOf(this.a));
    localHashMap.put("screenWidth", Integer.valueOf(this.b));
    localHashMap.put("screenHeight", Integer.valueOf(this.c));
    localHashMap.put("viewportWidth", Integer.valueOf(this.d));
    localHashMap.put("viewportHeight", Integer.valueOf(this.e));
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */