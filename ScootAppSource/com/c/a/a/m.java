package com.c.a.a;

import b.a.a.a.f;
import b.a.a.a.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

final class m
{
  final AtomicReference<ScheduledFuture<?>> a = new AtomicReference();
  boolean b = true;
  private final ScheduledExecutorService c;
  private final List<o> d = new ArrayList();
  private volatile boolean e = true;
  
  public m(ScheduledExecutorService paramScheduledExecutorService)
  {
    this.c = paramScheduledExecutorService;
  }
  
  private void c()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((o)localIterator.next()).a();
    }
  }
  
  public void a()
  {
    this.b = false;
    ScheduledFuture localScheduledFuture = (ScheduledFuture)this.a.getAndSet(null);
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(false);
    }
  }
  
  public void a(o paramo)
  {
    this.d.add(paramo);
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public void b()
  {
    if ((this.e) && (!this.b)) {
      this.b = true;
    }
    try
    {
      this.a.compareAndSet(null, this.c.schedule(new n(this), 5000L, TimeUnit.MILLISECONDS));
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      f.h().a("Answers", "Failed to schedule background detector", localRejectedExecutionException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */