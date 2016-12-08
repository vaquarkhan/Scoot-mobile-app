package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ae;
import com.google.android.gms.common.b;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cv
  implements Handler.Callback
{
  private static final Object d = new Object();
  private static cv e;
  private long a;
  private long b;
  private long c;
  private final Context f;
  private final b g;
  private int h;
  private final SparseArray<cy<?>> i;
  private final Map<az<?>, cy<?>> j;
  private bt k;
  private final Set<az<?>> l;
  private final Handler m;
  private final ReferenceQueue<ae<?>> n;
  private final SparseArray<cw> o;
  private cx p;
  
  public static cv a()
  {
    synchronized (d)
    {
      cv localcv = e;
      return localcv;
    }
  }
  
  private void a(ax paramax)
  {
    ((cy)this.i.get(paramax.a)).a(paramax);
  }
  
  private void a(ae<?> paramae, int paramInt)
  {
    Object localObject = paramae.d();
    if (!this.j.containsKey(localObject)) {
      this.j.put(localObject, new cy(this, paramae));
    }
    localObject = (cy)this.j.get(localObject);
    ((cy)localObject).b(paramInt);
    this.i.put(paramInt, localObject);
    cy.a((cy)localObject);
    this.o.put(paramInt, new cw(this, paramae, paramInt, this.n));
    if ((this.p == null) || (!cx.a(this.p).get()))
    {
      this.p = new cx(this.n, this.o);
      this.p.start();
    }
  }
  
  private void b(int paramInt, boolean paramBoolean)
  {
    cy localcy = (cy)this.i.get(paramInt);
    if (localcy != null)
    {
      if (!paramBoolean) {
        this.i.delete(paramInt);
      }
      localcy.a(paramInt, paramBoolean);
      return;
    }
    Log.wtf("GoogleApiManager", 52 + "onRelease received for unknown instance: " + paramInt, new Exception());
  }
  
  private void d()
  {
    Iterator localIterator = this.j.values().iterator();
    while (localIterator.hasNext())
    {
      cy localcy = (cy)localIterator.next();
      localcy.b();
      cy.a(localcy);
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    Handler localHandler1 = this.m;
    Handler localHandler2 = this.m;
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 2)
    {
      localHandler1.sendMessage(localHandler2.obtainMessage(7, paramInt, i1));
      return;
    }
  }
  
  public void a(bc parambc)
  {
    Iterator localIterator = parambc.b().iterator();
    for (;;)
    {
      az localaz;
      cy localcy;
      if (localIterator.hasNext())
      {
        localaz = (az)localIterator.next();
        localcy = (cy)this.j.get(localaz);
        if (localcy == null) {
          parambc.g();
        }
      }
      else
      {
        return;
      }
      if (localcy.d()) {
        parambc.a(localaz, ConnectionResult.a);
      } else if (localcy.c() != null) {
        parambc.a(localaz, localcy.c());
      } else {
        localcy.a(parambc);
      }
    }
  }
  
  public void a(bt parambt)
  {
    Object localObject = d;
    if (parambt == null) {}
    try
    {
      this.k = null;
      this.l.clear();
      return;
    }
    finally {}
  }
  
  boolean a(ConnectionResult paramConnectionResult, int paramInt)
  {
    if ((paramConnectionResult.a()) || (this.g.a(paramConnectionResult.c())))
    {
      this.g.a(this.f, paramConnectionResult, paramInt);
      return true;
    }
    return false;
  }
  
  public void b()
  {
    this.m.sendMessage(this.m.obtainMessage(3));
  }
  
  public void b(ConnectionResult paramConnectionResult, int paramInt)
  {
    if (!a(paramConnectionResult, paramInt)) {
      this.m.sendMessage(this.m.obtainMessage(5, paramInt, 0));
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    boolean bool = false;
    int i1;
    switch (paramMessage.what)
    {
    default: 
      i1 = paramMessage.what;
      Log.w("GoogleApiManager", 31 + "Unknown message id: " + i1);
      return false;
    case 1: 
      a((bc)paramMessage.obj);
    }
    for (;;)
    {
      return true;
      a((ae)paramMessage.obj, paramMessage.arg1);
      continue;
      d();
      continue;
      i1 = paramMessage.arg1;
      if (paramMessage.arg2 == 1) {
        bool = true;
      }
      b(i1, bool);
      continue;
      a((ax)paramMessage.obj);
      continue;
      if (this.i.get(paramMessage.arg1) != null)
      {
        cy.a((cy)this.i.get(paramMessage.arg1), new Status(17, "Error resolution was canceled by the user."));
        continue;
        if (this.j.containsKey(paramMessage.obj))
        {
          cy.b((cy)this.j.get(paramMessage.obj));
          continue;
          if (this.j.containsKey(paramMessage.obj))
          {
            cy.c((cy)this.j.get(paramMessage.obj));
            continue;
            if (this.j.containsKey(paramMessage.obj)) {
              cy.d((cy)this.j.get(paramMessage.obj));
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */