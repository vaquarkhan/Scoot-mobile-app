package com.b.a;

import android.os.Handler;
import java.util.concurrent.Executor;

final class h
  implements Executor
{
  h(g paramg, Handler paramHandler) {}
  
  public void execute(Runnable paramRunnable)
  {
    this.a.post(paramRunnable);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */