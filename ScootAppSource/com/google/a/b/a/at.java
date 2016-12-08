package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.c.a;
import com.google.a.k;

final class at
  implements an
{
  public <T> am<T> a(k paramk, a<T> parama)
  {
    parama = parama.a();
    if ((!Enum.class.isAssignableFrom(parama)) || (parama == Enum.class)) {
      return null;
    }
    paramk = parama;
    if (!parama.isEnum()) {
      paramk = parama.getSuperclass();
    }
    return new bh(paramk);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */