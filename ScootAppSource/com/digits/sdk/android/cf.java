package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.m;
import com.twitter.sdk.android.core.u;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

final class cf
  extends f<eg>
{
  private final ConcurrentHashMap<dw, Boolean> a;
  private final m<cb> b;
  
  cf(ConcurrentHashMap<dw, Boolean> paramConcurrentHashMap, m<cb> paramm)
  {
    this.a = paramConcurrentHashMap;
    this.b = paramm;
  }
  
  public void a(k<eg> paramk)
  {
    if (paramk.a != null)
    {
      paramk = cb.a((eg)paramk.a);
      if ((paramk.b()) && (!paramk.equals(this.b.a(paramk.e()))))
      {
        this.b.a(paramk.e(), paramk);
        Iterator localIterator = this.a.keySet().iterator();
        while (localIterator.hasNext())
        {
          dw localdw = (dw)localIterator.next();
          if (localdw != null) {
            localdw.a(paramk);
          }
        }
      }
    }
  }
  
  public void a(u paramu) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */