package b.a.a.a.a.b;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class v
  implements ThreadFactory
{
  v(String paramString, AtomicLong paramAtomicLong) {}
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = Executors.defaultThreadFactory().newThread(new w(this, paramRunnable));
    paramRunnable.setName(this.a + this.b.getAndIncrement());
    return paramRunnable;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */