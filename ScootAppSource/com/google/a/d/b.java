package com.google.a.d;

import com.google.a.b.a.h;
import com.google.a.b.u;

final class b
  extends u
{
  public void a(a parama)
  {
    if ((parama instanceof h))
    {
      ((h)parama).o();
      return;
    }
    int j = a.a(parama);
    int i = j;
    if (j == 0) {
      i = a.b(parama);
    }
    if (i == 13)
    {
      a.a(parama, 9);
      return;
    }
    if (i == 12)
    {
      a.a(parama, 8);
      return;
    }
    if (i == 14)
    {
      a.a(parama, 10);
      return;
    }
    throw new IllegalStateException("Expected a name but was " + parama.f() + " " + " at line " + a.c(parama) + " column " + a.d(parama) + " path " + parama.q());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */