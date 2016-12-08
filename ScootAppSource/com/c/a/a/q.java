package com.c.a.a;

import android.content.Context;
import b.a.a.a.a.b.k;
import b.a.a.a.a.b.m;
import b.a.a.a.a.d.o;
import b.a.a.a.a.e.n;
import b.a.a.a.a.g.b;
import b.a.a.a.f;
import b.a.a.a.t;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

final class q
  implements aa
{
  final af a;
  o b;
  k c = new k();
  r d = new s();
  boolean e = true;
  boolean f = true;
  volatile int g = -1;
  private final b.a.a.a.q h;
  private final n i;
  private final Context j;
  private final x k;
  private final ScheduledExecutorService l;
  private final AtomicReference<ScheduledFuture<?>> m = new AtomicReference();
  
  public q(b.a.a.a.q paramq, Context paramContext, ScheduledExecutorService paramScheduledExecutorService, x paramx, n paramn, af paramaf)
  {
    this.h = paramq;
    this.j = paramContext;
    this.l = paramScheduledExecutorService;
    this.k = paramx;
    this.i = paramn;
    this.a = paramaf;
  }
  
  public void a()
  {
    if (this.b == null)
    {
      m.a(this.j, "skipping files send because we don't yet know the target endpoint");
      return;
    }
    m.a(this.j, "Sending all files");
    List localList = this.k.e();
    int n = 0;
    int i1 = n;
    int i2 = n;
    for (;;)
    {
      try
      {
        if (localList.size() > 0)
        {
          i2 = n;
          m.a(this.j, String.format(Locale.US, "attempt to send batch of %d files", new Object[] { Integer.valueOf(localList.size()) }));
          i2 = n;
          bool = this.b.a(localList);
          i1 = n;
          if (bool)
          {
            i2 = n;
            i1 = localList.size();
            n = i1 + n;
          }
        }
      }
      catch (Exception localException1)
      {
        try
        {
          boolean bool;
          this.k.a(localList);
          i1 = n;
          if (!bool)
          {
            if (i1 != 0) {
              break;
            }
            this.k.g();
            return;
          }
          i2 = i1;
          localList = this.k.e();
          n = i1;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        n = i2;
      }
      m.a(this.j, "Failed to send batch of analytics files to server: " + localException1.getMessage(), localException1);
      i1 = n;
    }
  }
  
  void a(long paramLong1, long paramLong2)
  {
    if (this.m.get() == null) {}
    for (int n = 1;; n = 0)
    {
      b.a.a.a.a.d.r localr;
      if (n != 0)
      {
        localr = new b.a.a.a.a.d.r(this.j, this);
        m.a(this.j, "Scheduling time based file roll over every " + paramLong2 + " seconds");
      }
      try
      {
        this.m.set(this.l.scheduleAtFixedRate(localr, paramLong1, paramLong2, TimeUnit.SECONDS));
        return;
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        m.a(this.j, "Failed to schedule time based file roll over", localRejectedExecutionException);
      }
    }
  }
  
  public void a(b paramb, String paramString)
  {
    this.b = l.a(new y(this.h, paramString, paramb.a, this.i, this.c.a(this.j)));
    this.k.a(paramb);
    this.e = paramb.f;
    t localt = f.h();
    StringBuilder localStringBuilder = new StringBuilder().append("Custom event tracking ");
    if (this.e)
    {
      paramString = "enabled";
      localt.a("Answers", paramString);
      this.f = paramb.g;
      localt = f.h();
      localStringBuilder = new StringBuilder().append("Predefined event tracking ");
      if (!this.f) {
        break label212;
      }
    }
    label212:
    for (paramString = "enabled";; paramString = "disabled")
    {
      localt.a("Answers", paramString);
      if (paramb.i > 1)
      {
        f.h().a("Answers", "Event sampling enabled");
        this.d = new v(paramb.i);
      }
      this.g = paramb.b;
      a(0L, this.g);
      return;
      paramString = "disabled";
      break;
    }
  }
  
  public void a(ad paramad)
  {
    paramad = paramad.a(this.a);
    if ((!this.e) && (ae.g.equals(paramad.c)))
    {
      f.h().a("Answers", "Custom events tracking disabled - skipping event: " + paramad);
      return;
    }
    if ((!this.f) && (ae.h.equals(paramad.c)))
    {
      f.h().a("Answers", "Predefined events tracking disabled - skipping event: " + paramad);
      return;
    }
    if (this.d.a(paramad))
    {
      f.h().a("Answers", "Skipping filtered event: " + paramad);
      return;
    }
    try
    {
      this.k.a(paramad);
      e();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        f.h().e("Answers", "Failed to write event: " + paramad, localIOException);
      }
    }
  }
  
  public void b()
  {
    this.k.f();
  }
  
  public boolean c()
  {
    try
    {
      boolean bool = this.k.d();
      return bool;
    }
    catch (IOException localIOException)
    {
      m.a(this.j, "Failed to roll file over.", localIOException);
    }
    return false;
  }
  
  public void d()
  {
    if (this.m.get() != null)
    {
      m.a(this.j, "Cancelling time-based rollover because no events are currently being generated.");
      ((ScheduledFuture)this.m.get()).cancel(false);
      this.m.set(null);
    }
  }
  
  public void e()
  {
    if (this.g != -1) {}
    for (int n = 1;; n = 0)
    {
      if (n != 0) {
        a(this.g, this.g);
      }
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */