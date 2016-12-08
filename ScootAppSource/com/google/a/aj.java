package com.google.a;

import com.google.a.b.ag;
import com.google.a.d.d;

final class aj<T>
  extends am<T>
{
  private final ae<T> a;
  private final v<T> b;
  private final k c;
  private final com.google.a.c.a<T> d;
  private final an e;
  private am<T> f;
  
  private aj(ae<T> paramae, v<T> paramv, k paramk, com.google.a.c.a<T> parama, an paraman)
  {
    this.a = paramae;
    this.b = paramv;
    this.c = paramk;
    this.d = parama;
    this.e = paraman;
  }
  
  private am<T> a()
  {
    am localam = this.f;
    if (localam != null) {
      return localam;
    }
    localam = this.c.a(this.e, this.d);
    this.f = localam;
    return localam;
  }
  
  public static an a(com.google.a.c.a<?> parama, Object paramObject)
  {
    return new al(paramObject, parama, false, null, null);
  }
  
  public static an b(com.google.a.c.a<?> parama, Object paramObject)
  {
    if (parama.b() == parama.a()) {}
    for (boolean bool = true;; bool = false) {
      return new al(paramObject, parama, bool, null, null);
    }
  }
  
  public void a(d paramd, T paramT)
  {
    if (this.a == null)
    {
      a().a(paramd, paramT);
      return;
    }
    if (paramT == null)
    {
      paramd.f();
      return;
    }
    ag.a(this.a.a(paramT, this.d.b(), this.c.b), paramd);
  }
  
  public T b(com.google.a.d.a parama)
  {
    if (this.b == null) {
      return (T)a().b(parama);
    }
    parama = ag.a(parama);
    if (parama.j()) {
      return null;
    }
    return (T)this.b.b(parama, this.d.b(), this.c.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */