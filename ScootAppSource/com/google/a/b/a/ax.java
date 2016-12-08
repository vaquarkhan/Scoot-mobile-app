package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class ax
  extends am<Boolean>
{
  public Boolean a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    if (parama.f() == c.f) {
      return Boolean.valueOf(Boolean.parseBoolean(parama.h()));
    }
    return Boolean.valueOf(parama.i());
  }
  
  public void a(d paramd, Boolean paramBoolean)
  {
    if (paramBoolean == null)
    {
      paramd.f();
      return;
    }
    paramd.a(paramBoolean.booleanValue());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */