package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import java.math.BigDecimal;

final class af
  extends am<BigDecimal>
{
  public BigDecimal a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    try
    {
      parama = new BigDecimal(parama.h());
      return parama;
    }
    catch (NumberFormatException parama)
    {
      throw new com.google.a.af(parama);
    }
  }
  
  public void a(d paramd, BigDecimal paramBigDecimal)
  {
    paramd.a(paramBigDecimal);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */