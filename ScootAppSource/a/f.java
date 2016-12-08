package a;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class f
{
  private static final f a = new f();
  private final ExecutorService b;
  private final ScheduledExecutorService c;
  private final Executor d;
  
  private f()
  {
    if (!c()) {}
    for (ExecutorService localExecutorService = Executors.newCachedThreadPool();; localExecutorService = b.a())
    {
      this.b = localExecutorService;
      this.c = Executors.newSingleThreadScheduledExecutor();
      this.d = new h(null);
      return;
    }
  }
  
  public static ExecutorService a()
  {
    return a.b;
  }
  
  static Executor b()
  {
    return a.d;
  }
  
  private static boolean c()
  {
    String str = System.getProperty("java.runtime.name");
    if (str == null) {
      return false;
    }
    return str.toLowerCase(Locale.US).contains("android");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */