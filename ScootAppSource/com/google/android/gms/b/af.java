package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.analytics.ab;
import java.util.HashMap;
import java.util.Map;

public final class af
  extends ab<af>
{
  public String a;
  public long b;
  public String c;
  public String d;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(af paramaf)
  {
    if (!TextUtils.isEmpty(this.a)) {
      paramaf.a(this.a);
    }
    if (this.b != 0L) {
      paramaf.a(this.b);
    }
    if (!TextUtils.isEmpty(this.c)) {
      paramaf.b(this.c);
    }
    if (!TextUtils.isEmpty(this.d)) {
      paramaf.c(this.d);
    }
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public long b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("variableName", this.a);
    localHashMap.put("timeInMillis", Long.valueOf(this.b));
    localHashMap.put("category", this.c);
    localHashMap.put("label", this.d);
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */