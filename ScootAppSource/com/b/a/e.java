package com.b.a;

import java.util.concurrent.BlockingQueue;

final class e
  implements Runnable
{
  e(d paramd, r paramr) {}
  
  public void run()
  {
    try
    {
      d.a(this.b).put(this.a);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */