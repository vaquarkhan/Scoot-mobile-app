package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.internal.b;

abstract class bj
{
  private static volatile Handler b;
  private final ah a;
  private final Runnable c;
  private volatile long d;
  
  bj(ah paramah)
  {
    b.a(paramah);
    this.a = paramah;
    this.c = new bk(this);
  }
  
  private Handler e()
  {
    if (b != null) {
      return b;
    }
    try
    {
      if (b == null) {
        b = new Handler(this.a.b().getMainLooper());
      }
      Handler localHandler = b;
      return localHandler;
    }
    finally {}
  }
  
  public abstract void a();
  
  public void a(long paramLong)
  {
    d();
    if (paramLong >= 0L)
    {
      this.d = this.a.d().a();
      if (!e().postDelayed(this.c, paramLong)) {
        this.a.f().e("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public long b()
  {
    if (this.d == 0L) {
      return 0L;
    }
    return Math.abs(this.a.d().a() - this.d);
  }
  
  public void b(long paramLong)
  {
    long l = 0L;
    if (!c()) {
      return;
    }
    if (paramLong < 0L)
    {
      d();
      return;
    }
    paramLong -= Math.abs(this.a.d().a() - this.d);
    if (paramLong < 0L) {
      paramLong = l;
    }
    for (;;)
    {
      e().removeCallbacks(this.c);
      if (e().postDelayed(this.c, paramLong)) {
        break;
      }
      this.a.f().e("Failed to adjust delayed post. time", Long.valueOf(paramLong));
      return;
    }
  }
  
  public boolean c()
  {
    return this.d != 0L;
  }
  
  public void d()
  {
    this.d = 0L;
    e().removeCallbacks(this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */