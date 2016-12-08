package b.a.a.a.a.c.a;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

final class f<T>
  extends a<T>
  implements Runnable
{
  h a;
  private final i b;
  private final Callable<T> c;
  private final AtomicReference<Thread> d;
  
  f(Callable<T> paramCallable, h paramh, i parami)
  {
    this.c = paramCallable;
    this.a = paramh;
    this.b = parami;
    this.d = new AtomicReference();
  }
  
  private g b()
  {
    return this.a.d();
  }
  
  private c c()
  {
    return this.a.c();
  }
  
  private int d()
  {
    return this.a.a();
  }
  
  protected void a()
  {
    Thread localThread = (Thread)this.d.getAndSet(null);
    if (localThread != null) {
      localThread.interrupt();
    }
  }
  
  public void run()
  {
    if ((isDone()) || (!this.d.compareAndSet(null, Thread.currentThread()))) {
      return;
    }
    try
    {
      a(this.c.call());
      return;
    }
    catch (Throwable localThrowable)
    {
      if (b().a(d(), localThrowable))
      {
        long l = c().a(d());
        this.a = this.a.e();
        this.b.schedule(this, l, TimeUnit.MILLISECONDS);
      }
      for (;;)
      {
        return;
        a(localThrowable);
      }
    }
    finally
    {
      this.d.getAndSet(null);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */