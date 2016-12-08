package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.b.w;
import com.google.a.d.a;
import com.google.a.d.d;
import com.google.a.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class n
  extends am<Object>
{
  public static final an a = new o();
  private final k b;
  
  private n(k paramk)
  {
    this.b = paramk;
  }
  
  public void a(d paramd, Object paramObject)
  {
    if (paramObject == null)
    {
      paramd.f();
      return;
    }
    am localam = this.b.a(paramObject.getClass());
    if ((localam instanceof n))
    {
      paramd.d();
      paramd.e();
      return;
    }
    localam.a(paramd, paramObject);
  }
  
  public Object b(a parama)
  {
    Object localObject = parama.f();
    switch (p.a[localObject.ordinal()])
    {
    default: 
      throw new IllegalStateException();
    case 1: 
      localObject = new ArrayList();
      parama.a();
      while (parama.e()) {
        ((List)localObject).add(b(parama));
      }
      parama.b();
      return localObject;
    case 2: 
      localObject = new w();
      parama.c();
      while (parama.e()) {
        ((Map)localObject).put(parama.g(), b(parama));
      }
      parama.d();
      return localObject;
    case 3: 
      return parama.h();
    case 4: 
      return Double.valueOf(parama.k());
    case 5: 
      return Boolean.valueOf(parama.i());
    }
    parama.j();
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */