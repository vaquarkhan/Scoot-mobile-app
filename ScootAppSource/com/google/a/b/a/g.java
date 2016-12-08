package com.google.a.b.a;

import com.google.a.a.b;
import com.google.a.am;
import com.google.a.an;
import com.google.a.b.ae;
import com.google.a.b.f;
import com.google.a.c.a;
import com.google.a.k;

public final class g
  implements an
{
  private final f a;
  
  public g(f paramf)
  {
    this.a = paramf;
  }
  
  static am<?> a(f paramf, k paramk, a<?> parama, b paramb)
  {
    paramb = paramb.a();
    if (am.class.isAssignableFrom(paramb)) {
      return (am)paramf.a(a.b(paramb)).a();
    }
    if (an.class.isAssignableFrom(paramb)) {
      return ((an)paramf.a(a.b(paramb)).a()).a(paramk, parama);
    }
    throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
  }
  
  public <T> am<T> a(k paramk, a<T> parama)
  {
    b localb = (b)parama.a().getAnnotation(b.class);
    if (localb == null) {
      return null;
    }
    return a(this.a, paramk, parama, localb);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */