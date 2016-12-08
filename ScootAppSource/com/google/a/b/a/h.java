package com.google.a.b.a;

import com.google.a.ac;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.t;
import com.google.a.w;
import com.google.a.y;
import com.google.a.z;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class h
  extends a
{
  private static final Reader a = new i();
  private static final Object b = new Object();
  private final List<Object> c = new ArrayList();
  
  public h(w paramw)
  {
    super(a);
    this.c.add(paramw);
  }
  
  private void a(c paramc)
  {
    if (f() != paramc) {
      throw new IllegalStateException("Expected " + paramc + " but was " + f());
    }
  }
  
  private Object r()
  {
    return this.c.get(this.c.size() - 1);
  }
  
  private Object s()
  {
    return this.c.remove(this.c.size() - 1);
  }
  
  public void a()
  {
    a(c.a);
    t localt = (t)r();
    this.c.add(localt.iterator());
  }
  
  public void b()
  {
    a(c.b);
    s();
    s();
  }
  
  public void c()
  {
    a(c.c);
    z localz = (z)r();
    this.c.add(localz.o().iterator());
  }
  
  public void close()
  {
    this.c.clear();
    this.c.add(b);
  }
  
  public void d()
  {
    a(c.d);
    s();
    s();
  }
  
  public boolean e()
  {
    c localc = f();
    return (localc != c.d) && (localc != c.b);
  }
  
  public c f()
  {
    if (this.c.isEmpty()) {
      return c.j;
    }
    Object localObject = r();
    if ((localObject instanceof Iterator))
    {
      boolean bool = this.c.get(this.c.size() - 2) instanceof z;
      localObject = (Iterator)localObject;
      if (((Iterator)localObject).hasNext())
      {
        if (bool) {
          return c.e;
        }
        this.c.add(((Iterator)localObject).next());
        return f();
      }
      if (bool) {
        return c.d;
      }
      return c.b;
    }
    if ((localObject instanceof z)) {
      return c.c;
    }
    if ((localObject instanceof t)) {
      return c.a;
    }
    if ((localObject instanceof ac))
    {
      localObject = (ac)localObject;
      if (((ac)localObject).q()) {
        return c.f;
      }
      if (((ac)localObject).o()) {
        return c.h;
      }
      if (((ac)localObject).p()) {
        return c.g;
      }
      throw new AssertionError();
    }
    if ((localObject instanceof y)) {
      return c.i;
    }
    if (localObject == b) {
      throw new IllegalStateException("JsonReader is closed");
    }
    throw new AssertionError();
  }
  
  public String g()
  {
    a(c.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)r()).next();
    this.c.add(localEntry.getValue());
    return (String)localEntry.getKey();
  }
  
  public String h()
  {
    c localc = f();
    if ((localc != c.f) && (localc != c.g)) {
      throw new IllegalStateException("Expected " + c.f + " but was " + localc);
    }
    return ((ac)s()).b();
  }
  
  public boolean i()
  {
    a(c.h);
    return ((ac)s()).f();
  }
  
  public void j()
  {
    a(c.i);
    s();
  }
  
  public double k()
  {
    c localc = f();
    if ((localc != c.g) && (localc != c.f)) {
      throw new IllegalStateException("Expected " + c.g + " but was " + localc);
    }
    double d = ((ac)r()).c();
    if ((!p()) && ((Double.isNaN(d)) || (Double.isInfinite(d)))) {
      throw new NumberFormatException("JSON forbids NaN and infinities: " + d);
    }
    s();
    return d;
  }
  
  public long l()
  {
    c localc = f();
    if ((localc != c.g) && (localc != c.f)) {
      throw new IllegalStateException("Expected " + c.g + " but was " + localc);
    }
    long l = ((ac)r()).d();
    s();
    return l;
  }
  
  public int m()
  {
    c localc = f();
    if ((localc != c.g) && (localc != c.f)) {
      throw new IllegalStateException("Expected " + c.g + " but was " + localc);
    }
    int i = ((ac)r()).e();
    s();
    return i;
  }
  
  public void n()
  {
    if (f() == c.e)
    {
      g();
      return;
    }
    s();
  }
  
  public void o()
  {
    a(c.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)r()).next();
    this.c.add(localEntry.getValue());
    this.c.add(new ac((String)localEntry.getKey()));
  }
  
  public String toString()
  {
    return getClass().getSimpleName();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */