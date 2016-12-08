package com.b.a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class r<T>
  implements Comparable<r<T>>
{
  private static long p;
  private final af a;
  private final int b;
  private final String c;
  private String d;
  private String e;
  private final int f;
  private x g;
  private Integer h;
  private u i;
  private boolean j;
  private boolean k;
  private boolean l;
  private aa m;
  private c n;
  private Object o;
  
  public r(int paramInt, String paramString, x paramx)
  {
    if (af.a) {}
    for (af localaf = new af();; localaf = null)
    {
      this.a = localaf;
      this.j = true;
      this.k = false;
      this.l = false;
      this.n = null;
      this.b = paramInt;
      this.c = paramString;
      this.e = a(paramInt, paramString);
      this.g = paramx;
      a(new f());
      this.f = d(paramString);
      return;
    }
  }
  
  private static String a(int paramInt, String paramString)
  {
    paramString = new StringBuilder().append("Request:").append(paramInt).append(":").append(paramString).append(":").append(System.currentTimeMillis()).append(":");
    long l1 = p;
    p = 1L + l1;
    return j.a(l1);
  }
  
  private byte[] a(Map<String, String> paramMap, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getKey(), paramString));
        localStringBuilder.append('=');
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getValue(), paramString));
        localStringBuilder.append('&');
      }
      paramMap = localStringBuilder.toString().getBytes(paramString);
    }
    catch (UnsupportedEncodingException paramMap)
    {
      throw new RuntimeException("Encoding not supported: " + paramString, paramMap);
    }
    return paramMap;
  }
  
  private static int d(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = Uri.parse(paramString);
      if (paramString != null)
      {
        paramString = paramString.getHost();
        if (paramString != null) {
          return paramString.hashCode();
        }
      }
    }
    return 0;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int a(r<T> paramr)
  {
    t localt1 = s();
    t localt2 = paramr.s();
    if (localt1 == localt2) {
      return this.h.intValue() - paramr.h.intValue();
    }
    return localt2.ordinal() - localt1.ordinal();
  }
  
  protected ad a(ad paramad)
  {
    return paramad;
  }
  
  public final r<?> a(int paramInt)
  {
    this.h = Integer.valueOf(paramInt);
    return this;
  }
  
  public r<?> a(aa paramaa)
  {
    this.m = paramaa;
    return this;
  }
  
  public r<?> a(c paramc)
  {
    this.n = paramc;
    return this;
  }
  
  public r<?> a(u paramu)
  {
    this.i = paramu;
    return this;
  }
  
  public r<?> a(Object paramObject)
  {
    this.o = paramObject;
    return this;
  }
  
  protected abstract w<T> a(n paramn);
  
  public void a(String paramString)
  {
    if (af.a) {
      this.a.a(paramString, Thread.currentThread().getId());
    }
  }
  
  public int b()
  {
    return this.f;
  }
  
  public void b(ad paramad)
  {
    if (this.g != null) {
      this.g.a(paramad);
    }
  }
  
  protected abstract void b(T paramT);
  
  void b(String paramString)
  {
    if (this.i != null)
    {
      this.i.b(this);
      c();
    }
    long l1;
    if (af.a)
    {
      l1 = Thread.currentThread().getId();
      if (Looper.myLooper() != Looper.getMainLooper()) {
        new Handler(Looper.getMainLooper()).post(new s(this, paramString, l1));
      }
    }
    else
    {
      return;
    }
    this.a.a(paramString, l1);
    this.a.a(toString());
  }
  
  protected void c()
  {
    this.g = null;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public String d()
  {
    if (this.d != null) {
      return this.d;
    }
    return this.c;
  }
  
  public String e()
  {
    return this.c;
  }
  
  public String f()
  {
    return this.b + ":" + this.c;
  }
  
  public c g()
  {
    return this.n;
  }
  
  public boolean h()
  {
    return this.k;
  }
  
  public Map<String, String> i()
  {
    return Collections.emptyMap();
  }
  
  @Deprecated
  protected Map<String, String> j()
  {
    return n();
  }
  
  @Deprecated
  protected String k()
  {
    return o();
  }
  
  @Deprecated
  public String l()
  {
    return p();
  }
  
  @Deprecated
  public byte[] m()
  {
    Map localMap = j();
    if ((localMap != null) && (localMap.size() > 0)) {
      return a(localMap, k());
    }
    return null;
  }
  
  protected Map<String, String> n()
  {
    return null;
  }
  
  protected String o()
  {
    return "UTF-8";
  }
  
  public String p()
  {
    return "application/x-www-form-urlencoded; charset=" + o();
  }
  
  public byte[] q()
  {
    Map localMap = n();
    if ((localMap != null) && (localMap.size() > 0)) {
      return a(localMap, o());
    }
    return null;
  }
  
  public final boolean r()
  {
    return this.j;
  }
  
  public t s()
  {
    return t.b;
  }
  
  public final int t()
  {
    return this.m.a();
  }
  
  public String toString()
  {
    String str2 = "0x" + Integer.toHexString(b());
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.k) {}
    for (String str1 = "[X] ";; str1 = "[ ] ") {
      return str1 + d() + " " + str2 + " " + s() + " " + this.h;
    }
  }
  
  public aa u()
  {
    return this.m;
  }
  
  public void v()
  {
    this.l = true;
  }
  
  public boolean w()
  {
    return this.l;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */