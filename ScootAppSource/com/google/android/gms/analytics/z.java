package com.google.android.gms.analytics;

import com.google.android.gms.common.a.c;
import com.google.android.gms.common.internal.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class z
{
  private final ac a;
  private final c b;
  private boolean c;
  private long d;
  private long e;
  private long f;
  private long g;
  private long h;
  private boolean i;
  private final Map<Class<? extends ab>, ab> j;
  private final List<ak> k;
  
  z(ac paramac, c paramc)
  {
    b.a(paramac);
    b.a(paramc);
    this.a = paramac;
    this.b = paramc;
    this.g = 1800000L;
    this.h = 3024000000L;
    this.j = new HashMap();
    this.k = new ArrayList();
  }
  
  z(z paramz)
  {
    this.a = paramz.a;
    this.b = paramz.b;
    this.d = paramz.d;
    this.e = paramz.e;
    this.f = paramz.f;
    this.g = paramz.g;
    this.h = paramz.h;
    this.k = new ArrayList(paramz.k);
    this.j = new HashMap(paramz.j.size());
    paramz = paramz.j.entrySet().iterator();
    while (paramz.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramz.next();
      ab localab = c((Class)localEntry.getKey());
      ((ab)localEntry.getValue()).a(localab);
      this.j.put((Class)localEntry.getKey(), localab);
    }
  }
  
  private static <T extends ab> T c(Class<T> paramClass)
  {
    try
    {
      paramClass = (ab)paramClass.newInstance();
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalArgumentException("dataType doesn't have default constructor", paramClass);
    }
    catch (IllegalAccessException paramClass)
    {
      throw new IllegalArgumentException("dataType default constructor is not accessible", paramClass);
    }
  }
  
  public <T extends ab> T a(Class<T> paramClass)
  {
    return (ab)this.j.get(paramClass);
  }
  
  public z a()
  {
    return new z(this);
  }
  
  public void a(long paramLong)
  {
    this.e = paramLong;
  }
  
  public void a(ab paramab)
  {
    b.a(paramab);
    Class localClass = paramab.getClass();
    if (localClass.getSuperclass() != ab.class) {
      throw new IllegalArgumentException();
    }
    paramab.a(b(localClass));
  }
  
  public <T extends ab> T b(Class<T> paramClass)
  {
    ab localab2 = (ab)this.j.get(paramClass);
    ab localab1 = localab2;
    if (localab2 == null)
    {
      localab1 = c(paramClass);
      this.j.put(paramClass, localab1);
    }
    return localab1;
  }
  
  public Collection<ab> b()
  {
    return this.j.values();
  }
  
  public List<ak> c()
  {
    return this.k;
  }
  
  public long d()
  {
    return this.d;
  }
  
  public void e()
  {
    i().a(this);
  }
  
  public boolean f()
  {
    return this.c;
  }
  
  void g()
  {
    this.f = this.b.b();
    if (this.e != 0L) {}
    for (this.d = this.e;; this.d = this.b.a())
    {
      this.c = true;
      return;
    }
  }
  
  ac h()
  {
    return this.a;
  }
  
  ad i()
  {
    return this.a.o();
  }
  
  boolean j()
  {
    return this.i;
  }
  
  void k()
  {
    this.i = true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */