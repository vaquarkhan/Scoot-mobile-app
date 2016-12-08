package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

public final class al
  extends af
{
  private final an a;
  private e b;
  private final bj c;
  private s d;
  
  protected al(ah paramah)
  {
    super(paramah);
    this.d = new s(paramah.d());
    this.a = new an(this);
    this.c = new am(this, paramah);
  }
  
  private void a(ComponentName paramComponentName)
  {
    m();
    if (this.b != null)
    {
      this.b = null;
      a("Disconnected from device AnalyticsService", paramComponentName);
      g();
    }
  }
  
  private void a(e parame)
  {
    m();
    this.b = parame;
    e();
    t().g();
  }
  
  private void e()
  {
    this.d.a();
    this.c.a(q().v());
  }
  
  private void f()
  {
    m();
    if (!b()) {
      return;
    }
    b("Inactivity, disconnecting from device AnalyticsService");
    d();
  }
  
  private void g()
  {
    t().e();
  }
  
  protected void a() {}
  
  public boolean a(d paramd)
  {
    com.google.android.gms.common.internal.b.a(paramd);
    m();
    D();
    e locale = this.b;
    if (locale == null) {
      return false;
    }
    if (paramd.f()) {}
    for (String str = q().o();; str = q().p())
    {
      List localList = Collections.emptyList();
      try
      {
        locale.a(paramd.b(), paramd.d(), str, localList);
        e();
        return true;
      }
      catch (RemoteException paramd)
      {
        b("Failed to send hits to AnalyticsService");
      }
    }
    return false;
  }
  
  public boolean b()
  {
    m();
    D();
    return this.b != null;
  }
  
  public boolean c()
  {
    m();
    D();
    if (this.b != null) {
      return true;
    }
    e locale = this.a.a();
    if (locale != null)
    {
      this.b = locale;
      e();
      return true;
    }
    return false;
  }
  
  public void d()
  {
    m();
    D();
    try
    {
      com.google.android.gms.common.stats.b.a().a(o(), this.a);
      if (this.b != null)
      {
        this.b = null;
        g();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */