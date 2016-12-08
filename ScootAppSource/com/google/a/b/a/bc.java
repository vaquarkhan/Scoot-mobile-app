package com.google.a.b.a;

import com.google.a.af;
import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class bc
  extends am<Number>
{
  public Number a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    try
    {
      byte b = (byte)parama.m();
      return Byte.valueOf(b);
    }
    catch (NumberFormatException parama)
    {
      throw new af(parama);
    }
  }
  
  public void a(d paramd, Number paramNumber)
  {
    paramd.a(paramNumber);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */