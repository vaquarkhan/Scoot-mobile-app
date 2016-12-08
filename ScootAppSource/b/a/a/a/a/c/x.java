package b.a.a.a.a.c;

import java.util.concurrent.ThreadFactory;

public final class x
  implements ThreadFactory
{
  private final int a;
  
  public x(int paramInt)
  {
    this.a = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable);
    paramRunnable.setPriority(this.a);
    paramRunnable.setName("Queue");
    return paramRunnable;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */