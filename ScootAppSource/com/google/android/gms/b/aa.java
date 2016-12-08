package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.analytics.ab;
import java.util.HashMap;
import java.util.Map;

public final class aa
  extends ab<aa>
{
  private String a;
  private String b;
  private String c;
  private long d;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void a(aa paramaa)
  {
    if (!TextUtils.isEmpty(this.a)) {
      paramaa.a(this.a);
    }
    if (!TextUtils.isEmpty(this.b)) {
      paramaa.b(this.b);
    }
    if (!TextUtils.isEmpty(this.c)) {
      paramaa.c(this.c);
    }
    if (this.d != 0L) {
      paramaa.a(this.d);
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
  
  public long d()
  {
    return this.d;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("category", this.a);
    localHashMap.put("action", this.b);
    localHashMap.put("label", this.c);
    localHashMap.put("value", Long.valueOf(this.d));
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */