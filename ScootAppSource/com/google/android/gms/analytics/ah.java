package com.google.android.gms.analytics;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ah
  implements ThreadFactory
{
  private static final AtomicInteger a = new AtomicInteger();
  
  public Thread newThread(Runnable paramRunnable)
  {
    int i = a.incrementAndGet();
    return new ai(paramRunnable, 23 + "measurement-" + i);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */