package com.b.a;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class d
  extends Thread
{
  private static final boolean a = ae.b;
  private final BlockingQueue<r<?>> b;
  private final BlockingQueue<r<?>> c;
  private final b d;
  private final z e;
  private volatile boolean f = false;
  
  public d(BlockingQueue<r<?>> paramBlockingQueue1, BlockingQueue<r<?>> paramBlockingQueue2, b paramb, z paramz)
  {
    this.b = paramBlockingQueue1;
    this.c = paramBlockingQueue2;
    this.d = paramb;
    this.e = paramz;
  }
  
  public void a()
  {
    this.f = true;
    interrupt();
  }
  
  public void run()
  {
    if (a) {
      ae.a("start new dispatcher", new Object[0]);
    }
    Process.setThreadPriority(10);
    this.d.a();
    for (;;)
    {
      try
      {
        r localr = (r)this.b.take();
        try
        {
          localr.a("cache-queue-take");
          if (!localr.h()) {
            break label94;
          }
          localr.b("cache-discard-canceled");
        }
        catch (Exception localException)
        {
          ae.a(localException, "Unhandled exception %s", new Object[] { localException.toString() });
        }
        continue;
        if (!this.f) {
          continue;
        }
      }
      catch (InterruptedException localInterruptedException) {}
      return;
      label94:
      c localc = this.d.a(localInterruptedException.f());
      if (localc == null)
      {
        localInterruptedException.a("cache-miss");
        this.c.put(localInterruptedException);
      }
      else if (localc.a())
      {
        localInterruptedException.a("cache-hit-expired");
        localInterruptedException.a(localc);
        this.c.put(localInterruptedException);
      }
      else
      {
        localInterruptedException.a("cache-hit");
        w localw = localInterruptedException.a(new n(localc.a, localc.g));
        localInterruptedException.a("cache-hit-parsed");
        if (!localc.b())
        {
          this.e.a(localInterruptedException, localw);
        }
        else
        {
          localInterruptedException.a("cache-hit-refresh-needed");
          localInterruptedException.a(localc);
          localw.d = true;
          this.e.a(localInterruptedException, localw, new e(this, localInterruptedException));
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */