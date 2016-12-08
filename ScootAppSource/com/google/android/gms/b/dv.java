package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.aa;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.api.y;
import com.google.android.gms.common.api.z;
import com.google.android.gms.common.internal.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public final class dv<R extends x>
  extends ab<R>
  implements y<R>
{
  private aa<? super R, ? extends x> a;
  private dv<? extends x> b;
  private volatile z<? super R> c;
  private u<R> d;
  private final Object e;
  private Status f;
  private final WeakReference<q> g;
  private final dx h;
  private boolean i;
  
  private void a(Status paramStatus)
  {
    synchronized (this.e)
    {
      this.f = paramStatus;
      b(this.f);
      return;
    }
  }
  
  private void b()
  {
    if ((this.a == null) && (this.c == null)) {}
    do
    {
      return;
      q localq = (q)this.g.get();
      if ((!this.i) && (this.a != null) && (localq != null))
      {
        localq.a(this);
        this.i = true;
      }
      if (this.f != null)
      {
        b(this.f);
        return;
      }
    } while (this.d == null);
    this.d.a(this);
  }
  
  private void b(Status paramStatus)
  {
    synchronized (this.e)
    {
      if (this.a != null)
      {
        paramStatus = this.a.a(paramStatus);
        b.a(paramStatus, "onFailure must not return null");
        this.b.a(paramStatus);
      }
      while (!c()) {
        return;
      }
      this.c.a(paramStatus);
    }
  }
  
  private void b(x paramx)
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
      Log.w("TransformedResultImpl", String.valueOf(paramx).length() + 18 + "Unable to release " + paramx, localRuntimeException);
    }
  }
  
  private boolean c()
  {
    q localq = (q)this.g.get();
    return (this.c != null) && (localq != null);
  }
  
  void a()
  {
    this.c = null;
  }
  
  public void a(u<?> paramu)
  {
    synchronized (this.e)
    {
      this.d = paramu;
      b();
      return;
    }
  }
  
  public void a(R paramR)
  {
    for (;;)
    {
      synchronized (this.e)
      {
        if (paramR.b().f())
        {
          if (this.a != null)
          {
            dp.a().submit(new dw(this, paramR));
            return;
          }
          if (!c()) {
            continue;
          }
          this.c.b(paramR);
        }
      }
      a(paramR.b());
      b(paramR);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */