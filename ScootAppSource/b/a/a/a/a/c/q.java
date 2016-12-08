package b.a.a.a.a.c;

import java.util.concurrent.Executor;

final class q<Result>
  implements Executor
{
  private final Executor a;
  private final p b;
  
  public q(Executor paramExecutor, p paramp)
  {
    this.a = paramExecutor;
    this.b = paramp;
  }
  
  public void execute(Runnable paramRunnable)
  {
    this.a.execute(new r(this, paramRunnable, null));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */