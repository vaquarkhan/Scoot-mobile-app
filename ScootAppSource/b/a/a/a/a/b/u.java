package b.a.a.a.a.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class u
{
  public static ExecutorService a(String paramString)
  {
    ExecutorService localExecutorService = Executors.newSingleThreadExecutor(c(paramString));
    a(paramString, localExecutorService);
    return localExecutorService;
  }
  
  private static final void a(String paramString, ExecutorService paramExecutorService)
  {
    a(paramString, paramExecutorService, 2L, TimeUnit.SECONDS);
  }
  
  public static final void a(String paramString, ExecutorService paramExecutorService, long paramLong, TimeUnit paramTimeUnit)
  {
    Runtime.getRuntime().addShutdownHook(new Thread(new x(paramString, paramExecutorService, paramLong, paramTimeUnit), "Crashlytics Shutdown Hook for " + paramString));
  }
  
  public static ScheduledExecutorService b(String paramString)
  {
    ScheduledExecutorService localScheduledExecutorService = Executors.newSingleThreadScheduledExecutor(c(paramString));
    a(paramString, localScheduledExecutorService);
    return localScheduledExecutorService;
  }
  
  public static final ThreadFactory c(String paramString)
  {
    return new v(paramString, new AtomicLong(1L));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */