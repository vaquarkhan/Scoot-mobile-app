package com.facebook;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class x
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(0);
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, "FacebookSdk #" + this.a.incrementAndGet());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */