package com.google.android.gms.analytics;

import android.os.Process;

final class ai
  extends Thread
{
  ai(Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, paramString);
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */