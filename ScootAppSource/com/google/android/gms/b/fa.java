package com.google.android.gms.b;

import android.os.Process;

final class fa
  implements Runnable
{
  private final Runnable a;
  private final int b;
  
  public fa(Runnable paramRunnable, int paramInt)
  {
    this.a = paramRunnable;
    this.b = paramInt;
  }
  
  public void run()
  {
    Process.setThreadPriority(this.b);
    this.a.run();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */