package com.google.android.gms.b;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.j;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ca
  extends ch
{
  private final Map<k, bz> c;
  
  public ca(Map<k, bz> paramMap)
  {
    super(paramMap, null);
    Map localMap;
    this.c = localMap;
  }
  
  public void a()
  {
    int n = 1;
    int m = 0;
    Object localObject = this.c.keySet().iterator();
    int j = 1;
    int i = 0;
    k localk;
    int k;
    if (((Iterator)localObject).hasNext())
    {
      localk = (k)((Iterator)localObject).next();
      if (localk.k())
      {
        if (bz.a((bz)this.c.get(localk)) != 0) {
          break label301;
        }
        i = 1;
        k = n;
      }
    }
    for (;;)
    {
      if (k != 0) {
        m = bx.b(this.a).a(bx.a(this.a));
      }
      if ((m != 0) && ((i != 0) || (j != 0)))
      {
        localObject = new ConnectionResult(m, null);
        bx.d(this.a).a(new cb(this, this.a, (ConnectionResult)localObject));
        label155:
        return;
        k = 0;
        j = i;
        i = k;
      }
      for (;;)
      {
        k = j;
        j = i;
        i = k;
        break;
        if (bx.e(this.a)) {
          bx.f(this.a).m();
        }
        localObject = this.c.keySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          localk = (k)((Iterator)localObject).next();
          o localo = (o)this.c.get(localk);
          if ((localk.k()) && (m != 0)) {
            bx.d(this.a).a(new cc(this, this.a, localo));
          } else {
            localk.a(localo);
          }
        }
        break label155;
        label301:
        i = j;
        j = 1;
      }
      k = i;
      i = 0;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */