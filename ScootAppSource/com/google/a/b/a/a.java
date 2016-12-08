package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.d.c;
import com.google.a.d.d;
import com.google.a.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class a<E>
  extends am<Object>
{
  public static final an a = new b();
  private final Class<E> b;
  private final am<E> c;
  
  public a(k paramk, am<E> paramam, Class<E> paramClass)
  {
    this.c = new y(paramk, paramam, paramClass);
    this.b = paramClass;
  }
  
  public void a(d paramd, Object paramObject)
  {
    if (paramObject == null)
    {
      paramd.f();
      return;
    }
    paramd.b();
    int i = 0;
    int j = Array.getLength(paramObject);
    while (i < j)
    {
      Object localObject = Array.get(paramObject, i);
      this.c.a(paramd, localObject);
      i += 1;
    }
    paramd.c();
  }
  
  public Object b(com.google.a.d.a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    parama.a();
    while (parama.e()) {
      localArrayList.add(this.c.b(parama));
    }
    parama.b();
    parama = Array.newInstance(this.b, localArrayList.size());
    int i = 0;
    while (i < localArrayList.size())
    {
      Array.set(parama, i, localArrayList.get(i));
      i += 1;
    }
    return parama;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */