package b.a.a.a.a.d;

import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b<T>
  implements m<T>
{
  protected final Context a;
  protected final d<T> b;
  final ScheduledExecutorService c;
  final AtomicReference<ScheduledFuture<?>> d;
  volatile int e = -1;
  
  public b(Context paramContext, ScheduledExecutorService paramScheduledExecutorService, d<T> paramd)
  {
    this.a = paramContext;
    this.c = paramScheduledExecutorService;
    this.b = paramd;
    this.d = new AtomicReference();
  }
  
  protected void a(int paramInt)
  {
    this.e = paramInt;
    a(0L, this.e);
  }
  
  void a(long paramLong1, long paramLong2)
  {
    if (this.d.get() == null) {}
    for (int i = 1;; i = 0)
    {
      r localr;
      if (i != 0)
      {
        localr = new r(this.a, this);
        b.a.a.a.a.b.m.a(this.a, "Scheduling time based file roll over every " + paramLong2 + " seconds");
      }
      try
      {
        this.d.set(this.c.scheduleAtFixedRate(localr, paramLong1, paramLong2, TimeUnit.SECONDS));
        return;
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        b.a.a.a.a.b.m.a(this.a, "Failed to schedule time based file roll over", localRejectedExecutionException);
      }
    }
  }
  
  public void a(T paramT)
  {
    b.a.a.a.a.b.m.a(this.a, paramT.toString());
    try
    {
      this.b.a(paramT);
      e();
      return;
    }
    catch (IOException paramT)
    {
      for (;;)
      {
        b.a.a.a.a.b.m.a(this.a, "Failed to write event.", paramT);
      }
    }
  }
  
  public void b()
  {
    f();
  }
  
  public boolean c()
  {
    try
    {
      boolean bool = this.b.d();
      return bool;
    }
    catch (IOException localIOException)
    {
      b.a.a.a.a.b.m.a(this.a, "Failed to roll file over.", localIOException);
    }
    return false;
  }
  
  public void d()
  {
    if (this.d.get() != null)
    {
      b.a.a.a.a.b.m.a(this.a, "Cancelling time-based rollover because no events are currently being generated.");
      ((ScheduledFuture)this.d.get()).cancel(false);
      this.d.set(null);
    }
  }
  
  public void e()
  {
    if (this.e != -1) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        a(this.e, this.e);
      }
      return;
    }
  }
  
  void f()
  {
    o localo = a();
    if (localo == null)
    {
      b.a.a.a.a.b.m.a(this.a, "skipping files send because we don't yet know the target endpoint");
      return;
    }
    b.a.a.a.a.b.m.a(this.a, "Sending all files");
    List localList = this.b.e();
    int i = 0;
    int j = i;
    int k = i;
    for (;;)
    {
      try
      {
        if (localList.size() > 0)
        {
          k = i;
          b.a.a.a.a.b.m.a(this.a, String.format(Locale.US, "attempt to send batch of %d files", new Object[] { Integer.valueOf(localList.size()) }));
          k = i;
          bool = localo.a(localList);
          j = i;
          if (bool)
          {
            k = i;
            j = localList.size();
            i = j + i;
          }
        }
      }
      catch (Exception localException1)
      {
        try
        {
          boolean bool;
          this.b.a(localList);
          j = i;
          if (!bool)
          {
            if (j != 0) {
              break;
            }
            this.b.g();
            return;
          }
          k = j;
          localList = this.b.e();
          i = j;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        i = k;
      }
      b.a.a.a.a.b.m.a(this.a, "Failed to send batch of analytics files to server: " + localException1.getMessage(), localException1);
      j = i;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */