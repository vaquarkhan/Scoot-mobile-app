package a;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

final class h
  implements Executor
{
  private ThreadLocal<Integer> a = new ThreadLocal();
  
  private int a()
  {
    Integer localInteger2 = (Integer)this.a.get();
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    int i = localInteger1.intValue() + 1;
    this.a.set(Integer.valueOf(i));
    return i;
  }
  
  private int b()
  {
    Integer localInteger2 = (Integer)this.a.get();
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    int i = localInteger1.intValue() - 1;
    if (i == 0)
    {
      this.a.remove();
      return i;
    }
    this.a.set(Integer.valueOf(i));
    return i;
  }
  
  public void execute(Runnable paramRunnable)
  {
    if (a() <= 15) {}
    for (;;)
    {
      try
      {
        paramRunnable.run();
        return;
      }
      finally
      {
        b();
      }
      f.a().execute(paramRunnable);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */