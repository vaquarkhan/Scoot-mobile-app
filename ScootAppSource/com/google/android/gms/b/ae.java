package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.analytics.ab;
import java.util.HashMap;
import java.util.Map;

public final class ae
  extends ab<ae>
{
  public String a;
  public String b;
  public String c;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(ae paramae)
  {
    if (!TextUtils.isEmpty(this.a)) {
      paramae.a(this.a);
    }
    if (!TextUtils.isEmpty(this.b)) {
      paramae.b(this.b);
    }
    if (!TextUtils.isEmpty(this.c)) {
      paramae.c(this.c);
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
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("network", this.a);
    localHashMap.put("action", this.b);
    localHashMap.put("target", this.c);
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */