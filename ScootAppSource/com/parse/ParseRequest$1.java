package com.parse;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ParseRequest$1
  implements ThreadFactory
{
  private final AtomicInteger mCount = new AtomicInteger(1);
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, "ParseRequest.NETWORK_EXECUTOR-thread-" + this.mCount.getAndIncrement());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRequest$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */