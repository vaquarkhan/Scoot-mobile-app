package com.google.a.b;

import com.google.a.am;
import com.google.a.d.d;
import com.google.a.k;

final class t
  extends am<T>
{
  private am<T> f;
  
  t(s params, boolean paramBoolean1, boolean paramBoolean2, k paramk, com.google.a.c.a parama) {}
  
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
  
  public void a(d paramd, T paramT)
  {
    if (this.b)
    {
      paramd.f();
      return;
    }
    a().a(paramd, paramT);
  }
  
  public T b(com.google.a.d.a parama)
  {
    if (this.a)
    {
      parama.n();
      return null;
    }
    return (T)a().b(parama);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */