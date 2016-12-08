package com.google.a.b.a;

import com.google.a.af;
import com.google.a.am;
import com.google.a.b.v;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class ac
  extends am<Number>
{
  public Number a(a parama)
  {
    c localc = parama.f();
    switch (ba.a[localc.ordinal()])
    {
    case 2: 
    case 3: 
    default: 
      throw new af("Expecting number, got: " + localc);
    case 4: 
      parama.j();
      return null;
    }
    return new v(parama.h());
  }
  
  public void a(d paramd, Number paramNumber)
  {
    paramd.a(paramNumber);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */