package com.google.a;

import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class o
  extends am<Number>
{
  o(k paramk) {}
  
  public Float a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    return Float.valueOf((float)parama.k());
  }
  
  public void a(d paramd, Number paramNumber)
  {
    if (paramNumber == null)
    {
      paramd.f();
      return;
    }
    float f = paramNumber.floatValue();
    k.a(this.a, f);
    paramd.a(paramNumber);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */