package com.google.a.b.a;

import com.google.a.am;
import com.google.a.b.ae;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.k;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

final class d<E>
  extends am<Collection<E>>
{
  private final am<E> a;
  private final ae<? extends Collection<E>> b;
  
  public d(k paramk, Type paramType, am<E> paramam, ae<? extends Collection<E>> paramae)
  {
    this.a = new y(paramk, paramam, paramType);
    this.b = paramae;
  }
  
  public Collection<E> a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    Collection localCollection = (Collection)this.b.a();
    parama.a();
    while (parama.e()) {
      localCollection.add(this.a.b(parama));
    }
    parama.b();
    return localCollection;
  }
  
  public void a(com.google.a.d.d paramd, Collection<E> paramCollection)
  {
    if (paramCollection == null)
    {
      paramd.f();
      return;
    }
    paramd.b();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Object localObject = paramCollection.next();
      this.a.a(paramd, localObject);
    }
    paramd.c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */