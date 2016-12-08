package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.analytics.ad;

final class bk
  implements Runnable
{
  bk(bj parambj) {}
  
  public void run()
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      bj.a(this.a).h().a(this);
    }
    boolean bool;
    do
    {
      return;
      bool = this.a.c();
      bj.a(this.a, 0L);
    } while ((!bool) || (bj.b(this.a)));
    this.a.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */