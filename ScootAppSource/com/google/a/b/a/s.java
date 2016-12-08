package com.google.a.b.a;

import com.google.a.af;
import com.google.a.am;
import com.google.a.b.ae;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class s<T>
  extends am<T>
{
  private final ae<T> a;
  private final Map<String, t> b;
  
  private s(ae<T> paramae, Map<String, t> paramMap)
  {
    this.a = paramae;
    this.b = paramMap;
  }
  
  public void a(d paramd, T paramT)
  {
    if (paramT == null)
    {
      paramd.f();
      return;
    }
    paramd.d();
    try
    {
      Iterator localIterator = this.b.values().iterator();
      while (localIterator.hasNext())
      {
        t localt = (t)localIterator.next();
        if (localt.h)
        {
          paramd.a(localt.g);
          localt.a(paramd, paramT);
        }
      }
      paramd.e();
    }
    catch (IllegalAccessException paramd)
    {
      throw new AssertionError();
    }
  }
  
  public T b(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    Object localObject1 = this.a.a();
    try
    {
      parama.c();
      for (;;)
      {
        if (!parama.e()) {
          break label103;
        }
        localObject2 = parama.g();
        localObject2 = (t)this.b.get(localObject2);
        if ((localObject2 != null) && (((t)localObject2).i)) {
          break;
        }
        parama.n();
      }
    }
    catch (IllegalStateException parama)
    {
      for (;;)
      {
        Object localObject2;
        throw new af(parama);
        ((t)localObject2).a(parama, localObject1);
      }
    }
    catch (IllegalAccessException parama)
    {
      throw new AssertionError(parama);
    }
    label103:
    parama.d();
    return (T)localObject1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */