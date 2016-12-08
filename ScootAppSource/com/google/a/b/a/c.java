package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.b.b;
import com.google.a.b.f;
import com.google.a.c.a;
import com.google.a.k;
import java.lang.reflect.Type;
import java.util.Collection;

public final class c
  implements an
{
  private final f a;
  
  public c(f paramf)
  {
    this.a = paramf;
  }
  
  public <T> am<T> a(k paramk, a<T> parama)
  {
    Type localType = parama.b();
    Class localClass = parama.a();
    if (!Collection.class.isAssignableFrom(localClass)) {
      return null;
    }
    localType = b.a(localType, localClass);
    return new d(paramk, localType, paramk.a(a.a(localType)), this.a.a(parama));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */