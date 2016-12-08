package retrofit;

import java.util.concurrent.Executor;

class Utils$SynchronousExecutor
  implements Executor
{
  public void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\Utils$SynchronousExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */