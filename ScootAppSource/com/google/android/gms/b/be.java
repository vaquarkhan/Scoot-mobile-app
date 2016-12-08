package com.google.android.gms.b;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.b;
import java.util.concurrent.atomic.AtomicReference;

public abstract class be<R extends x, A extends h>
  extends bk<R>
  implements bf<R>
{
  private final i<A> a;
  private final a<?> b;
  private AtomicReference<eb> f = new AtomicReference();
  
  protected be(a<?> parama, q paramq)
  {
    super((q)b.a(paramq, "GoogleApiClient must not be null"));
    this.a = parama.d();
    this.b = parama;
  }
  
  @Deprecated
  protected be(i<A> parami, q paramq)
  {
    super((q)b.a(paramq, "GoogleApiClient must not be null"));
    this.a = ((i)b.a(parami));
    this.b = null;
  }
  
  private void a(RemoteException paramRemoteException)
  {
    c(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }
  
  public void a(eb parameb)
  {
    this.f.set(parameb);
  }
  
  protected abstract void a(A paramA);
  
  protected void a(R paramR) {}
  
  public final i<A> b()
  {
    return this.a;
  }
  
  public final void b(A paramA)
  {
    try
    {
      a(paramA);
      return;
    }
    catch (DeadObjectException paramA)
    {
      a(paramA);
      throw paramA;
    }
    catch (RemoteException paramA)
    {
      a(paramA);
    }
  }
  
  public final a<?> c()
  {
    return this.b;
  }
  
  public final void c(Status paramStatus)
  {
    if (!paramStatus.f()) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool, "Failed result must not be success");
      paramStatus = b(paramStatus);
      b(paramStatus);
      a(paramStatus);
      return;
    }
  }
  
  public void d()
  {
    a(null);
  }
  
  protected void e()
  {
    eb localeb = (eb)this.f.getAndSet(null);
    if (localeb != null) {
      localeb.a(this);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */