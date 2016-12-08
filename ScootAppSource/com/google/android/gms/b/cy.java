package com.google.android.gms.b;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ae;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.e;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

final class cy<O extends com.google.android.gms.common.api.b>
  implements s, t
{
  private final Queue<ax> b = new LinkedList();
  private final k c;
  private final h d;
  private final az<O> e;
  private final SparseArray<dy> f = new SparseArray();
  private final Set<bc> g = new HashSet();
  private final SparseArray<Map<Object, be>> h = new SparseArray();
  private boolean i;
  private ConnectionResult j = null;
  
  public cy(ae<O> paramae)
  {
    ae localae;
    this.c = a(localae);
    if ((this.c instanceof e)) {}
    for (this.d = ((e)this.c).f();; this.d = this.c)
    {
      this.e = localae.d();
      return;
    }
  }
  
  private k a(ae paramae)
  {
    Object localObject = paramae.b();
    if (((com.google.android.gms.common.api.a)localObject).e())
    {
      localObject = ((com.google.android.gms.common.api.a)localObject).c();
      return new e(paramae.e(), cv.a(this.a).getLooper(), ((n)localObject).b(), this, this, ai.a(paramae.e()), ((n)localObject).b(paramae.c()));
    }
    return paramae.b().b().a(paramae.e(), cv.a(this.a).getLooper(), ai.a(paramae.e()), paramae.c(), this, this);
  }
  
  private void a(Status paramStatus)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      ((ax)localIterator.next()).a(paramStatus);
    }
    this.b.clear();
  }
  
  private void b(ax paramax)
  {
    paramax.a(this.f);
    if (paramax.b == 3) {}
    label193:
    for (;;)
    {
      try
      {
        localObject1 = (Map)this.h.get(paramax.a);
        if (localObject1 != null) {
          break label193;
        }
        localObject1 = new android.support.v4.g.a(1);
        this.h.put(paramax.a, localObject1);
        localObject2 = ((ay)paramax).c;
        ((Map)localObject1).put(((dm)localObject2).a(), localObject2);
        if (paramax.b != 4) {
          continue;
        }
      }
      catch (ClassCastException paramax)
      {
        try
        {
          paramax.a(this.d);
          return;
        }
        catch (DeadObjectException paramax)
        {
          Object localObject1;
          Object localObject2;
          this.c.g();
          c_(1);
          return;
        }
        paramax = paramax;
        throw new IllegalStateException("Listener registration methods must implement ListenerApiMethod");
      }
      try
      {
        localObject1 = (Map)this.h.get(paramax.a);
        localObject2 = (dm)((ay)paramax).c;
        if (localObject1 != null) {
          ((Map)localObject1).remove(((dm)localObject2).a());
        }
      }
      catch (ClassCastException paramax)
      {
        throw new IllegalStateException("Listener unregistration methods must implement ListenerApiMethod");
      }
      Log.w("GoogleApiManager", "Received call to unregister a listener without a matching registration call.");
    }
  }
  
  private void b(ConnectionResult paramConnectionResult)
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext()) {
      ((bc)localIterator.next()).a(this.e, paramConnectionResult);
    }
    this.g.clear();
  }
  
  private void e()
  {
    if (this.i) {
      j();
    }
  }
  
  private void f()
  {
    if (this.i)
    {
      cv.a(this.a).removeMessages(9, this.e);
      cv.a(this.a).removeMessages(8, this.e);
      this.i = false;
    }
  }
  
  private void g()
  {
    if (this.i)
    {
      f();
      if (cv.i(this.a).a(cv.h(this.a)) != 18) {
        break label61;
      }
    }
    label61:
    for (Status localStatus = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");; localStatus = new Status(8, "API failed to connect while resuming due to an unknown error."))
    {
      a(localStatus);
      this.c.g();
      return;
    }
  }
  
  private void h()
  {
    cv.a(this.a).removeMessages(10, this.e);
    cv.a(this.a).sendMessageDelayed(cv.a(this.a).obtainMessage(10, this.e), cv.j(this.a));
  }
  
  private void i()
  {
    int k;
    if ((this.c.h()) && (this.h.size() == 0)) {
      k = 0;
    }
    while (k < this.f.size())
    {
      if (((dy)this.f.get(this.f.keyAt(k))).c())
      {
        h();
        return;
      }
      k += 1;
    }
    this.c.g();
  }
  
  private void j()
  {
    if ((this.c.h()) || (this.c.i())) {
      return;
    }
    if ((this.c.k()) && (cv.k(this.a) != 0))
    {
      cv.a(this.a, cv.i(this.a).a(cv.h(this.a)));
      if (cv.k(this.a) != 0)
      {
        a(new ConnectionResult(cv.k(this.a), null));
        return;
      }
    }
    this.c.a(new cz(this.a, this.c, this.e));
  }
  
  public void a()
  {
    while ((this.c.h()) && (!this.b.isEmpty())) {
      b((ax)this.b.remove());
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    ??? = this.b.iterator();
    while (((Iterator)???).hasNext())
    {
      ax localax = (ax)((Iterator)???).next();
      if ((localax.a == paramInt) && (localax.b != 1) && (localax.a())) {
        ((Iterator)???).remove();
      }
    }
    ((dy)this.f.get(paramInt)).a();
    this.h.delete(paramInt);
    if (!paramBoolean)
    {
      this.f.remove(paramInt);
      cv.f(this.a).remove(paramInt);
      if ((this.f.size() == 0) && (this.b.isEmpty()))
      {
        f();
        this.c.g();
        cv.g(this.a).remove(this.e);
        synchronized (cv.c())
        {
          cv.e(this.a).remove(this.e);
          return;
        }
      }
    }
  }
  
  public void a(Bundle paramBundle)
  {
    b();
    b(ConnectionResult.a);
    f();
    int k = 0;
    while (k < this.h.size())
    {
      paramBundle = ((Map)this.h.get(this.h.keyAt(k))).values().iterator();
      while (paramBundle.hasNext())
      {
        be localbe = (be)paramBundle.next();
        try
        {
          localbe.b(this.d);
        }
        catch (DeadObjectException localDeadObjectException)
        {
          this.c.g();
          c_(1);
        }
      }
      k += 1;
    }
    a();
    h();
  }
  
  public void a(ax paramax)
  {
    if (this.c.h())
    {
      b(paramax);
      h();
      return;
    }
    this.b.add(paramax);
    if ((this.j != null) && (this.j.a()))
    {
      a(this.j);
      return;
    }
    j();
  }
  
  public void a(bc parambc)
  {
    this.g.add(parambc);
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    b();
    cv.a(this.a, -1);
    b(paramConnectionResult);
    int k = this.f.keyAt(0);
    if (this.b.isEmpty()) {
      this.j = paramConnectionResult;
    }
    do
    {
      return;
      synchronized (cv.c())
      {
        if ((cv.d(this.a) != null) && (cv.e(this.a).contains(this.e)))
        {
          cv.d(this.a).b(paramConnectionResult, k);
          return;
        }
      }
    } while (this.a.a(paramConnectionResult, k));
    if (paramConnectionResult.c() == 18) {
      this.i = true;
    }
    if (this.i)
    {
      cv.a(this.a).sendMessageDelayed(Message.obtain(cv.a(this.a), 8, this.e), cv.b(this.a));
      return;
    }
    paramConnectionResult = String.valueOf(this.e.b());
    a(new Status(17, String.valueOf(paramConnectionResult).length() + 38 + "API: " + paramConnectionResult + " is not available on this device."));
  }
  
  public void b()
  {
    this.j = null;
  }
  
  public void b(int paramInt)
  {
    this.f.put(paramInt, new dy(this.e.a(), this.c));
  }
  
  ConnectionResult c()
  {
    return this.j;
  }
  
  public void c_(int paramInt)
  {
    b();
    this.i = true;
    cv.a(this.a).sendMessageDelayed(Message.obtain(cv.a(this.a), 8, this.e), cv.b(this.a));
    cv.a(this.a).sendMessageDelayed(Message.obtain(cv.a(this.a), 9, this.e), cv.c(this.a));
    cv.a(this.a, -1);
  }
  
  boolean d()
  {
    return this.c.h();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */