package com.c.a.a;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

final class ab
{
  public final af a;
  public final long b;
  public final ae c;
  public final Map<String, String> d;
  public final String e;
  public final Map<String, Object> f;
  public final String g;
  public final Map<String, Object> h;
  private String i;
  
  private ab(af paramaf, long paramLong, ae paramae, Map<String, String> paramMap, String paramString1, Map<String, Object> paramMap1, String paramString2, Map<String, Object> paramMap2)
  {
    this.a = paramaf;
    this.b = paramLong;
    this.c = paramae;
    this.d = paramMap;
    this.e = paramString1;
    this.f = paramMap1;
    this.g = paramString2;
    this.h = paramMap2;
  }
  
  public static ad a()
  {
    return new ad(ae.f);
  }
  
  public static ad a(ae paramae, Activity paramActivity)
  {
    paramActivity = Collections.singletonMap("activity", paramActivity.getClass().getName());
    return new ad(paramae).a(paramActivity);
  }
  
  public static ad a(String paramString)
  {
    paramString = Collections.singletonMap("sessionId", paramString);
    return new ad(ae.e).a(paramString);
  }
  
  public static ad a(String paramString1, String paramString2)
  {
    return a(paramString1).b(Collections.singletonMap("exceptionName", paramString2));
  }
  
  public String toString()
  {
    if (this.i == null) {
      this.i = ("[" + getClass().getSimpleName() + ": " + "timestamp=" + this.b + ", type=" + this.c + ", details=" + this.d + ", customType=" + this.e + ", customAttributes=" + this.f + ", predefinedType=" + this.g + ", predefinedAttributes=" + this.h + ", metadata=[" + this.a + "]]");
    }
    return this.i;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */