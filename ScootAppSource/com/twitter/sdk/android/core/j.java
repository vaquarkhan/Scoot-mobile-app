package com.twitter.sdk.android.core;

import android.content.SharedPreferences;
import b.a.a.a.a.f.c;
import b.a.a.a.a.f.e;
import b.a.a.a.a.f.f;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class j<T extends l>
  implements m<T>
{
  private final c a;
  private final f<T> b;
  private final ConcurrentHashMap<Long, T> c;
  private final ConcurrentHashMap<Long, e<T>> d;
  private final e<T> e;
  private final AtomicReference<T> f;
  private final String g;
  private volatile boolean h = true;
  
  public j(c paramc, f<T> paramf, String paramString1, String paramString2)
  {
    this(paramc, paramf, new ConcurrentHashMap(1), new ConcurrentHashMap(1), new e(paramc, paramf, paramString1), paramString2);
  }
  
  j(c paramc, f<T> paramf, ConcurrentHashMap<Long, T> paramConcurrentHashMap, ConcurrentHashMap<Long, e<T>> paramConcurrentHashMap1, e<T> parame, String paramString)
  {
    this.a = paramc;
    this.b = paramf;
    this.c = paramConcurrentHashMap;
    this.d = paramConcurrentHashMap1;
    this.e = parame;
    this.f = new AtomicReference();
    this.g = paramString;
  }
  
  private void a(long paramLong, T paramT, boolean paramBoolean)
  {
    this.c.put(Long.valueOf(paramLong), paramT);
    e locale = (e)this.d.get(Long.valueOf(paramLong));
    Object localObject = locale;
    if (locale == null)
    {
      localObject = new e(this.a, this.b, b(paramLong));
      this.d.putIfAbsent(Long.valueOf(paramLong), localObject);
    }
    ((e)localObject).a(paramT);
    localObject = (l)this.f.get();
    if ((localObject == null) || (((l)localObject).e() == paramLong) || (paramBoolean)) {
      try
      {
        this.f.compareAndSet(localObject, paramT);
        this.e.a(paramT);
        return;
      }
      finally {}
    }
  }
  
  private void e()
  {
    try
    {
      if (this.h)
      {
        g();
        f();
        this.h = false;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void f()
  {
    Iterator localIterator = this.a.a().getAll().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      if (a((String)((Map.Entry)localObject).getKey()))
      {
        localObject = (l)this.b.b((String)((Map.Entry)localObject).getValue());
        if (localObject != null) {
          a(((l)localObject).e(), (l)localObject, false);
        }
      }
    }
  }
  
  private void g()
  {
    l locall = (l)this.e.a();
    if (locall != null) {
      a(locall.e(), locall, false);
    }
  }
  
  public T a(long paramLong)
  {
    a();
    return (l)this.c.get(Long.valueOf(paramLong));
  }
  
  void a()
  {
    if (this.h) {
      e();
    }
  }
  
  public void a(long paramLong, T paramT)
  {
    if (paramT == null) {
      throw new IllegalArgumentException("Session must not be null!");
    }
    a();
    a(paramLong, paramT, false);
  }
  
  public void a(T paramT)
  {
    if (paramT == null) {
      throw new IllegalArgumentException("Session must not be null!");
    }
    a();
    a(paramT.e(), paramT, true);
  }
  
  boolean a(String paramString)
  {
    return paramString.startsWith(this.g);
  }
  
  public T b()
  {
    a();
    return (l)this.f.get();
  }
  
  String b(long paramLong)
  {
    return this.g + "_" + paramLong;
  }
  
  public void c()
  {
    a();
    if (this.f.get() != null) {
      c(((l)this.f.get()).e());
    }
  }
  
  public void c(long paramLong)
  {
    a();
    if ((this.f.get() != null) && (((l)this.f.get()).e() == paramLong)) {}
    try
    {
      this.f.set(null);
      this.e.b();
      this.c.remove(Long.valueOf(paramLong));
      e locale = (e)this.d.remove(Long.valueOf(paramLong));
      if (locale != null) {
        locale.b();
      }
      return;
    }
    finally {}
  }
  
  public Map<Long, T> d()
  {
    a();
    return Collections.unmodifiableMap(this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */