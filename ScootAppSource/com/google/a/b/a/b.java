package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.k;
import java.lang.reflect.GenericArrayType;

final class b
  implements an
{
  public <T> am<T> a(k paramk, com.google.a.c.a<T> parama)
  {
    parama = parama.b();
    if ((!(parama instanceof GenericArrayType)) && ((!(parama instanceof Class)) || (!((Class)parama).isArray()))) {
      return null;
    }
    parama = com.google.a.b.b.g(parama);
    return new a(paramk, paramk.a(com.google.a.c.a.a(parama)), com.google.a.b.b.e(parama));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */