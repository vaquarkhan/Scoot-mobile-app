package b.a.a.a.a.c.a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public final class i
  extends ScheduledThreadPoolExecutor
{
  private final g a;
  private final c b;
  
  public i(int paramInt, g paramg, c paramc)
  {
    this(paramInt, Executors.defaultThreadFactory(), paramg, paramc);
  }
  
  public i(int paramInt, ThreadFactory paramThreadFactory, g paramg, c paramc)
  {
    super(paramInt, paramThreadFactory);
    if (paramg == null) {
      throw new NullPointerException("retry policy must not be null");
    }
    if (paramc == null) {
      throw new NullPointerException("backoff must not be null");
    }
    this.a = paramg;
    this.b = paramc;
  }
  
  private <T> Future<T> a(Callable<T> paramCallable)
  {
    if (paramCallable == null) {
      throw new NullPointerException();
    }
    paramCallable = new f(paramCallable, new h(this.b, this.a), this);
    execute(paramCallable);
    return paramCallable;
  }
  
  public Future<?> a(Runnable paramRunnable)
  {
    return a(Executors.callable(paramRunnable));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */