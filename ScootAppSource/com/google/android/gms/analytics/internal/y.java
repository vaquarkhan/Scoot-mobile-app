package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class y
  extends af
{
  private final at a;
  
  public y(ah paramah, aj paramaj)
  {
    super(paramah);
    b.a(paramaj);
    this.a = paramaj.j(paramah);
  }
  
  public long a(ak paramak)
  {
    D();
    b.a(paramak);
    m();
    long l = this.a.a(paramak, true);
    if (l == 0L) {
      this.a.a(paramak);
    }
    return l;
  }
  
  protected void a()
  {
    this.a.E();
  }
  
  public void a(bn parambn)
  {
    D();
    r().a(new ac(this, parambn));
  }
  
  public void a(d paramd)
  {
    b.a(paramd);
    D();
    b("Hit delivery requested", paramd);
    r().a(new ab(this, paramd));
  }
  
  public void a(String paramString, Runnable paramRunnable)
  {
    b.a(paramString, "campaign param can't be empty");
    r().a(new aa(this, paramString, paramRunnable));
  }
  
  public void a(boolean paramBoolean)
  {
    a("Network connectivity status changed", Boolean.valueOf(paramBoolean));
    r().a(new z(this, paramBoolean));
  }
  
  public void b()
  {
    this.a.b();
  }
  
  public void c()
  {
    D();
    Context localContext = o();
    if ((q.a(localContext)) && (r.a(localContext)))
    {
      Intent localIntent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      localIntent.setComponent(new ComponentName(localContext, "com.google.android.gms.analytics.AnalyticsService"));
      localContext.startService(localIntent);
      return;
    }
    a(null);
  }
  
  public boolean d()
  {
    D();
    Future localFuture = r().a(new ad(this));
    try
    {
      localFuture.get(4L, TimeUnit.SECONDS);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      d("syncDispatchLocalHits interrupted", localInterruptedException);
      return false;
    }
    catch (ExecutionException localExecutionException)
    {
      e("syncDispatchLocalHits failed", localExecutionException);
      return false;
    }
    catch (TimeoutException localTimeoutException)
    {
      d("syncDispatchLocalHits timed out", localTimeoutException);
    }
    return false;
  }
  
  public void e()
  {
    D();
    com.google.android.gms.analytics.ad.d();
    this.a.f();
  }
  
  public void f()
  {
    b("Radio powered up");
    c();
  }
  
  void g()
  {
    m();
    this.a.e();
  }
  
  void h()
  {
    m();
    this.a.d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */