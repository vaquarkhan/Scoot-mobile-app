package com.squareup.okhttp.internal;

import java.util.concurrent.ThreadFactory;

final class Util$1
  implements ThreadFactory
{
  Util$1(String paramString, boolean paramBoolean) {}
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable, this.val$name);
    paramRunnable.setDaemon(this.val$daemon);
    return paramRunnable;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\Util$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */