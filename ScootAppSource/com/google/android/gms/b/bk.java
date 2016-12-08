package com.google.android.gms.b;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.api.y;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.be;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class bk<R extends x>
  extends u<R>
{
  static final ThreadLocal<Boolean> c = new bl();
  private final Object a = new Object();
  private final CountDownLatch b = new CountDownLatch(1);
  protected final bm<R> d;
  protected final WeakReference<q> e;
  private final ArrayList<v> f = new ArrayList();
  private y<? super R> g;
  private R h;
  private bn i;
  private volatile boolean j;
  private boolean k;
  private boolean l;
  private be m;
  private volatile dv<R> n;
  private boolean o = false;
  
  @Deprecated
  bk()
  {
    this.d = new bm(Looper.getMainLooper());
    this.e = new WeakReference(null);
  }
  
  protected bk(q paramq)
  {
    if (paramq != null) {}
    for (Looper localLooper = paramq.c();; localLooper = Looper.getMainLooper())
    {
      this.d = new bm(localLooper);
      this.e = new WeakReference(paramq);
      return;
    }
  }
  
  private void a(R paramR)
  {
    this.h = paramR;
    this.m = null;
    this.b.countDown();
    paramR = this.h.b();
    if (this.k) {
      this.g = null;
    }
    for (;;)
    {
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext()) {
        ((v)localIterator.next()).a(paramR);
      }
      if (this.g == null)
      {
        if ((this.h instanceof w)) {
          this.i = new bn(this, null);
        }
      }
      else
      {
        this.d.a();
        this.d.a(this.g, b());
      }
    }
    this.f.clear();
  }
  
  private R b()
  {
    boolean bool = true;
    synchronized (this.a)
    {
      if (!this.j)
      {
        b.a(bool, "Result has already been consumed.");
        b.a(f(), "Result is not ready.");
        x localx = this.h;
        this.h = null;
        this.g = null;
        this.j = true;
        e();
        return localx;
      }
      bool = false;
    }
  }
  
  public static void c(x paramx)
  {
    if ((paramx instanceof w)) {}
    try
    {
      ((w)paramx).a();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      paramx = String.valueOf(paramx);
      Log.w("BasePendingResult", String.valueOf(paramx).length() + 18 + "Unable to release " + paramx, localRuntimeException);
    }
  }
  
  public final R a(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramLong <= 0L) || (Looper.myLooper() != Looper.getMainLooper())) {
      bool1 = true;
    }
    for (;;)
    {
      b.a(bool1, "await must not be called on the UI thread when time is greater than zero.");
      if (!this.j)
      {
        bool1 = true;
        label38:
        b.a(bool1, "Result has already been consumed.");
        if (this.n != null) {
          break label108;
        }
        bool1 = bool2;
        b.a(bool1, "Cannot await if then() has been called.");
      }
      try
      {
        if (!this.b.await(paramLong, paramTimeUnit)) {
          d(Status.d);
        }
        b.a(f(), "Result is not ready.");
        return b();
        bool1 = false;
        continue;
        bool1 = false;
        break label38;
        label108:
        bool1 = false;
      }
      catch (InterruptedException paramTimeUnit)
      {
        for (;;)
        {
          d(Status.b);
        }
      }
    }
  }
  
  public Integer a()
  {
    return null;
  }
  
  public final void a(y<? super R> paramy)
  {
    boolean bool2 = true;
    Object localObject = this.a;
    if (paramy == null) {}
    try
    {
      this.g = null;
      return;
    }
    finally {}
    if (!this.j)
    {
      bool1 = true;
      b.a(bool1, "Result has already been consumed.");
      if (this.n != null) {
        break label76;
      }
    }
    label76:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      b.a(bool1, "Cannot set callbacks if then() has been called.");
      if (!i()) {
        break label81;
      }
      return;
      bool1 = false;
      break;
    }
    label81:
    if (f()) {
      this.d.a(paramy, b());
    }
    for (;;)
    {
      return;
      this.g = paramy;
    }
  }
  
  protected abstract R b(Status paramStatus);
  
  public final void b(R paramR)
  {
    boolean bool2 = true;
    for (;;)
    {
      synchronized (this.a)
      {
        if ((this.l) || (this.k) || ((f()) && (k())))
        {
          c(paramR);
          return;
        }
        if (!f())
        {
          bool1 = true;
          b.a(bool1, "Results have already been set");
          if (this.j) {
            break label97;
          }
          bool1 = bool2;
          b.a(bool1, "Result has already been consumed");
          a(paramR);
          return;
        }
      }
      boolean bool1 = false;
      continue;
      label97:
      bool1 = false;
    }
  }
  
  public final void d(Status paramStatus)
  {
    synchronized (this.a)
    {
      if (!f())
      {
        b(b(paramStatus));
        this.l = true;
      }
      return;
    }
  }
  
  protected void e() {}
  
  public final boolean f()
  {
    return this.b.getCount() == 0L;
  }
  
  public void g()
  {
    synchronized (this.a)
    {
      if ((this.k) || (this.j)) {
        return;
      }
      be localbe = this.m;
      if (localbe == null) {}
    }
    try
    {
      this.m.a();
      c(this.h);
      this.k = true;
      a(b(Status.e));
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public boolean h()
  {
    synchronized (this.a)
    {
      if (((q)this.e.get() == null) || (!this.o)) {
        g();
      }
      boolean bool = i();
      return bool;
    }
  }
  
  public boolean i()
  {
    synchronized (this.a)
    {
      boolean bool = this.k;
      return bool;
    }
  }
  
  public void j()
  {
    if ((this.o) || (((Boolean)c.get()).booleanValue())) {}
    for (boolean bool = true;; bool = false)
    {
      this.o = bool;
      return;
    }
  }
  
  boolean k()
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */