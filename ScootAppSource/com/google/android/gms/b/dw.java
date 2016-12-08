package com.google.android.gms.b;

import com.google.android.gms.common.api.aa;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.x;
import java.lang.ref.WeakReference;

final class dw
  implements Runnable
{
  dw(dv paramdv, x paramx) {}
  
  public void run()
  {
    try
    {
      bk.c.set(Boolean.valueOf(true));
      Object localObject1 = dv.a(this.b).a(this.a);
      dv.b(this.b).sendMessage(dv.b(this.b).obtainMessage(0, localObject1));
      bk.c.set(Boolean.valueOf(false));
      dv.a(this.b, this.a);
      localObject1 = (q)dv.c(this.b).get();
      if (localObject1 != null) {
        ((q)localObject1).b(this.b);
      }
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      dv.b(this.b).sendMessage(dv.b(this.b).obtainMessage(1, localRuntimeException));
      q localq1;
      return;
    }
    finally
    {
      bk.c.set(Boolean.valueOf(false));
      dv.a(this.b, this.a);
      q localq2 = (q)dv.c(this.b).get();
      if (localq2 != null) {
        localq2.b(this.b);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */