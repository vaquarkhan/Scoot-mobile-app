package com.google.android.gms.b;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.o;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

final class bz
  implements o
{
  private final WeakReference<bx> a;
  private final a<?> b;
  private final int c;
  
  public bz(bx parambx, a<?> parama, int paramInt)
  {
    this.a = new WeakReference(parambx);
    this.b = parama;
    this.c = paramInt;
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    boolean bool = false;
    bx localbx = (bx)this.a.get();
    if (localbx == null) {
      return;
    }
    if (Looper.myLooper() == bx.d(localbx).g.c()) {
      bool = true;
    }
    b.a(bool, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
    bx.c(localbx).lock();
    try
    {
      bool = bx.a(localbx, 0);
      if (!bool) {
        return;
      }
      if (!paramConnectionResult.b()) {
        bx.a(localbx, paramConnectionResult, this.b, this.c);
      }
      if (bx.k(localbx)) {
        bx.j(localbx);
      }
      return;
    }
    finally
    {
      bx.c(localbx).unlock();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */