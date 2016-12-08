package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.ba;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.common.internal.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class h
  extends u
{
  private static List<Runnable> b = new ArrayList();
  private boolean c;
  private Set<i> d = new HashSet();
  private boolean e;
  private boolean f;
  private volatile boolean g;
  
  public h(ah paramah)
  {
    super(paramah);
  }
  
  public static h a(Context paramContext)
  {
    return ah.a(paramContext).k();
  }
  
  public static void d()
  {
    try
    {
      if (b != null)
      {
        Iterator localIterator = b.iterator();
        while (localIterator.hasNext()) {
          ((Runnable)localIterator.next()).run();
        }
        b = null;
      }
    }
    finally {}
  }
  
  private y p()
  {
    return k().i();
  }
  
  private x q()
  {
    return k().l();
  }
  
  public r a(int paramInt)
  {
    try
    {
      r localr = new r(k(), null, null);
      if (paramInt > 0)
      {
        v localv = (v)new t(k()).a(paramInt);
        if (localv != null) {
          localr.a(localv);
        }
      }
      localr.E();
      return localr;
    }
    finally {}
  }
  
  public void a()
  {
    b();
    this.c = true;
  }
  
  void a(Activity paramActivity)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).a(paramActivity);
    }
  }
  
  @TargetApi(14)
  public void a(Application paramApplication)
  {
    if ((Build.VERSION.SDK_INT >= 14) && (!this.e))
    {
      paramApplication.registerActivityLifecycleCallbacks(new j(this));
      this.e = true;
    }
  }
  
  void a(i parami)
  {
    this.d.add(parami);
    parami = k().b();
    if ((parami instanceof Application)) {
      a((Application)parami);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  void b()
  {
    x localx = q();
    if (localx.d()) {
      g().a(localx.e());
    }
    if (localx.h()) {
      a(localx.i());
    }
    if (localx.d())
    {
      p localp = com.google.android.gms.analytics.internal.i.a();
      if (localp != null) {
        localp.a(localx.e());
      }
    }
  }
  
  void b(Activity paramActivity)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).b(paramActivity);
    }
  }
  
  void b(i parami)
  {
    this.d.remove(parami);
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.g;
  }
  
  @Deprecated
  public p g()
  {
    return com.google.android.gms.analytics.internal.i.a();
  }
  
  public String h()
  {
    b.c("getClientId can not be called from the main thread");
    return k().p().b();
  }
  
  public void i()
  {
    p().c();
  }
  
  void j()
  {
    p().d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */