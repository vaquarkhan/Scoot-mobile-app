package com.google.a.b.a;

import com.google.a.ac;
import com.google.a.am;
import com.google.a.b.v;
import com.google.a.d.a;
import com.google.a.d.d;
import com.google.a.t;
import com.google.a.w;
import com.google.a.y;
import com.google.a.z;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class as
  extends am<w>
{
  public w a(a parama)
  {
    switch (ba.a[parama.f().ordinal()])
    {
    default: 
      throw new IllegalArgumentException();
    case 3: 
      return new ac(parama.h());
    case 1: 
      return new ac(new v(parama.h()));
    case 2: 
      return new ac(Boolean.valueOf(parama.i()));
    case 4: 
      parama.j();
      return y.a;
    case 5: 
      localObject = new t();
      parama.a();
      while (parama.e()) {
        ((t)localObject).a(a(parama));
      }
      parama.b();
      return (w)localObject;
    }
    Object localObject = new z();
    parama.c();
    while (parama.e()) {
      ((z)localObject).a(parama.g(), a(parama));
    }
    parama.d();
    return (w)localObject;
  }
  
  public void a(d paramd, w paramw)
  {
    if ((paramw == null) || (paramw.j()))
    {
      paramd.f();
      return;
    }
    if (paramw.i())
    {
      paramw = paramw.m();
      if (paramw.p())
      {
        paramd.a(paramw.a());
        return;
      }
      if (paramw.o())
      {
        paramd.a(paramw.f());
        return;
      }
      paramd.b(paramw.b());
      return;
    }
    if (paramw.g())
    {
      paramd.b();
      paramw = paramw.l().iterator();
      while (paramw.hasNext()) {
        a(paramd, (w)paramw.next());
      }
      paramd.c();
      return;
    }
    if (paramw.h())
    {
      paramd.d();
      paramw = paramw.k().o().iterator();
      while (paramw.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramw.next();
        paramd.a((String)localEntry.getKey());
        a(paramd, (w)localEntry.getValue());
      }
      paramd.e();
      return;
    }
    throw new IllegalArgumentException("Couldn't write " + paramw.getClass());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */