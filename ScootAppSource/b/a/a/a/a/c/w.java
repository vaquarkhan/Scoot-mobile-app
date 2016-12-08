package b.a.a.a.a.c;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class w
  extends ThreadPoolExecutor
{
  private static final int a = Runtime.getRuntime().availableProcessors();
  private static final int b = a + 1;
  private static final int c = a * 2 + 1;
  
  <T extends Runnable,  extends l,  extends y,  extends u> w(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, m<T> paramm, ThreadFactory paramThreadFactory)
  {
    super(paramInt1, paramInt2, paramLong, paramTimeUnit, paramm, paramThreadFactory);
    prestartAllCoreThreads();
  }
  
  public static w a()
  {
    return a(b, c);
  }
  
  public static <T extends Runnable,  extends l,  extends y,  extends u> w a(int paramInt1, int paramInt2)
  {
    return new w(paramInt1, paramInt2, 1L, TimeUnit.SECONDS, new m(), new x(10));
  }
  
  protected void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    y localy = (y)paramRunnable;
    localy.b(true);
    localy.a(paramThrowable);
    b().d();
    super.afterExecute(paramRunnable, paramThrowable);
  }
  
  public m b()
  {
    return (m)super.getQueue();
  }
  
  @TargetApi(9)
  public void execute(Runnable paramRunnable)
  {
    if (v.a(paramRunnable))
    {
      super.execute(paramRunnable);
      return;
    }
    super.execute(newTaskFor(paramRunnable, null));
  }
  
  protected <T> RunnableFuture<T> newTaskFor(Runnable paramRunnable, T paramT)
  {
    return new t(paramRunnable, paramT);
  }
  
  protected <T> RunnableFuture<T> newTaskFor(Callable<T> paramCallable)
  {
    return new t(paramCallable);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */