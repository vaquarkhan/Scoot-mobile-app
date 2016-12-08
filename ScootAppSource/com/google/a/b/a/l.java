package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.b.b;
import com.google.a.b.f;
import com.google.a.c.a;
import com.google.a.k;
import java.lang.reflect.Type;
import java.util.Map;

public final class l
  implements an
{
  private final f a;
  private final boolean b;
  
  public l(f paramf, boolean paramBoolean)
  {
    this.a = paramf;
    this.b = paramBoolean;
  }
  
  private am<?> a(k paramk, Type paramType)
  {
    if ((paramType == Boolean.TYPE) || (paramType == Boolean.class)) {
      return z.f;
    }
    return paramk.a(a.a(paramType));
  }
  
  public <T> am<T> a(k paramk, a<T> parama)
  {
    Object localObject = parama.b();
    if (!Map.class.isAssignableFrom(parama.a())) {
      return null;
    }
    localObject = b.b((Type)localObject, b.e((Type)localObject));
    am localam1 = a(paramk, localObject[0]);
    am localam2 = paramk.a(a.a(localObject[1]));
    parama = this.a.a(parama);
    return new m(this, paramk, localObject[0], localam1, localObject[1], localam2, parama);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */