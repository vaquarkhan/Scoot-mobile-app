package com.google.android.gms.analytics.internal;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

public final class v
  implements be
{
  public String a;
  public double b = -1.0D;
  public int c = -1;
  public int d = -1;
  public int e = -1;
  public int f = -1;
  public Map<String, String> g = new HashMap();
  
  public String a(Activity paramActivity)
  {
    return a(paramActivity.getClass().getCanonicalName());
  }
  
  public String a(String paramString)
  {
    String str = (String)this.g.get(paramString);
    if (str != null) {
      return str;
    }
    return paramString;
  }
  
  public boolean a()
  {
    return this.a != null;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public boolean c()
  {
    return this.b >= 0.0D;
  }
  
  public double d()
  {
    return this.b;
  }
  
  public boolean e()
  {
    return this.c >= 0;
  }
  
  public int f()
  {
    return this.c;
  }
  
  public boolean g()
  {
    return this.d != -1;
  }
  
  public boolean h()
  {
    return this.d == 1;
  }
  
  public boolean i()
  {
    return this.e != -1;
  }
  
  public boolean j()
  {
    return this.e == 1;
  }
  
  public boolean k()
  {
    return this.f == 1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */