package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.b.a;
import android.util.Log;
import com.google.android.gms.b.dr;
import com.google.android.gms.common.api.q;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class d
  extends a<Void>
  implements dr
{
  private Semaphore o = new Semaphore(0);
  private Set<q> p;
  
  public d(Context paramContext, Set<q> paramSet)
  {
    super(paramContext);
    this.p = paramSet;
  }
  
  protected void j()
  {
    this.o.drainPermits();
    l();
  }
  
  public Void u()
  {
    Iterator localIterator = this.p.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      if (!((q)localIterator.next()).a(this)) {
        break label80;
      }
      i += 1;
    }
    label80:
    for (;;)
    {
      break;
      try
      {
        this.o.tryAcquire(i, 5L, TimeUnit.SECONDS);
        return null;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          Log.i("GACSignInLoader", "Unexpected InterruptedException", localInterruptedException);
          Thread.currentThread().interrupt();
        }
      }
    }
  }
  
  public void v()
  {
    this.o.release();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */