package com.squareup.picasso;

import android.os.Process;

class Utils$PicassoThread
  extends Thread
{
  public Utils$PicassoThread(Runnable paramRunnable)
  {
    super(paramRunnable);
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Utils$PicassoThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */