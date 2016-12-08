package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.ad;
import com.google.android.gms.analytics.h;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.a.e;

public class ah
{
  private static ah a;
  private final Context b;
  private final Context c;
  private final c d;
  private final bh e;
  private final j f;
  private final ad g;
  private final y h;
  private final bm i;
  private final x j;
  private final n k;
  private final h l;
  private final ba m;
  private final b n;
  private final as o;
  private final bl p;
  
  protected ah(aj paramaj)
  {
    Object localObject1 = paramaj.a();
    com.google.android.gms.common.internal.b.a(localObject1, "Application context can't be null");
    Object localObject2 = paramaj.b();
    com.google.android.gms.common.internal.b.a(localObject2);
    this.b = ((Context)localObject1);
    this.c = ((Context)localObject2);
    this.d = paramaj.h(this);
    this.e = paramaj.g(this);
    localObject2 = paramaj.f(this);
    ((j)localObject2).E();
    this.f = ((j)localObject2);
    Object localObject3;
    if (e().a())
    {
      localObject2 = f();
      localObject3 = ag.a;
      ((j)localObject2).d(String.valueOf(localObject3).length() + 33 + "Google Analytics " + (String)localObject3 + " is starting up.");
    }
    for (;;)
    {
      localObject2 = paramaj.q(this);
      ((n)localObject2).E();
      this.k = ((n)localObject2);
      localObject2 = paramaj.e(this);
      ((x)localObject2).E();
      this.j = ((x)localObject2);
      localObject2 = paramaj.l(this);
      localObject3 = paramaj.d(this);
      b localb = paramaj.c(this);
      as localas = paramaj.b(this);
      bl localbl = paramaj.a(this);
      localObject1 = paramaj.a((Context)localObject1);
      ((ad)localObject1).a(a());
      this.g = ((ad)localObject1);
      localObject1 = paramaj.i(this);
      ((ba)localObject3).E();
      this.m = ((ba)localObject3);
      localb.E();
      this.n = localb;
      localas.E();
      this.o = localas;
      localbl.E();
      this.p = localbl;
      paramaj = paramaj.p(this);
      paramaj.E();
      this.i = paramaj;
      ((y)localObject2).E();
      this.h = ((y)localObject2);
      if (e().a()) {
        f().b("Device AnalyticsService version", ag.a);
      }
      ((h)localObject1).a();
      this.l = ((h)localObject1);
      ((y)localObject2).b();
      return;
      localObject2 = f();
      localObject3 = ag.a;
      ((j)localObject2).d(String.valueOf(localObject3).length() + 134 + "Google Analytics " + (String)localObject3 + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
    }
  }
  
  public static ah a(Context paramContext)
  {
    com.google.android.gms.common.internal.b.a(paramContext);
    if (a == null) {}
    try
    {
      if (a == null)
      {
        c localc = e.c();
        long l1 = localc.b();
        paramContext = new ah(new aj(paramContext));
        a = paramContext;
        h.d();
        l1 = localc.b() - l1;
        long l2 = ((Long)bp.Q.a()).longValue();
        if (l1 > l2) {
          paramContext.f().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        }
      }
      return a;
    }
    finally {}
  }
  
  private void a(af paramaf)
  {
    com.google.android.gms.common.internal.b.a(paramaf, "Analytics service not created/initialized");
    com.google.android.gms.common.internal.b.b(paramaf.C(), "Analytics service not initialized");
  }
  
  protected Thread.UncaughtExceptionHandler a()
  {
    return new ai(this);
  }
  
  public Context b()
  {
    return this.b;
  }
  
  public Context c()
  {
    return this.c;
  }
  
  public c d()
  {
    return this.d;
  }
  
  public bh e()
  {
    return this.e;
  }
  
  public j f()
  {
    a(this.f);
    return this.f;
  }
  
  public j g()
  {
    return this.f;
  }
  
  public ad h()
  {
    com.google.android.gms.common.internal.b.a(this.g);
    return this.g;
  }
  
  public y i()
  {
    a(this.h);
    return this.h;
  }
  
  public bm j()
  {
    a(this.i);
    return this.i;
  }
  
  public h k()
  {
    com.google.android.gms.common.internal.b.a(this.l);
    com.google.android.gms.common.internal.b.b(this.l.c(), "Analytics instance not initialized");
    return this.l;
  }
  
  public x l()
  {
    a(this.j);
    return this.j;
  }
  
  public n m()
  {
    a(this.k);
    return this.k;
  }
  
  public n n()
  {
    if ((this.k == null) || (!this.k.C())) {
      return null;
    }
    return this.k;
  }
  
  public b o()
  {
    a(this.n);
    return this.n;
  }
  
  public ba p()
  {
    a(this.m);
    return this.m;
  }
  
  public as q()
  {
    a(this.o);
    return this.o;
  }
  
  public bl r()
  {
    return this.p;
  }
  
  public void s() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */