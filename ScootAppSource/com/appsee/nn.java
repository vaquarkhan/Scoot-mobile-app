package com.appsee;

import android.os.Handler;
import android.os.HandlerThread;

class nn
  extends HandlerThread
{
  private static final int A = 1;
  private Exception B = null;
  private Handler D;
  private Object G = new Object();
  private boolean M = false;
  private Object l = new Object();
  
  public nn(xn paramxn)
  {
    super(sb.C("\002\0363\035&\013\002\035:\000 8*\n&\001\006\000 \001'\0131:+\034&\017'"), 0);
  }
  
  public void C()
  {
    synchronized (this.G)
    {
      for (;;)
      {
        boolean bool = this.M;
        if (bool) {
          break;
        }
        try
        {
          this.G.wait();
        }
        catch (InterruptedException localInterruptedException) {}
      }
      return;
    }
  }
  
  public void H()
  {
    C();
    synchronized (this.l)
    {
      this.D.sendEmptyMessage(1);
      this.l.wait();
      if (this.B != null) {
        throw this.B;
      }
    }
  }
  
  public void a()
  {
    quit();
  }
  
  protected void onLooperPrepared()
  {
    super.onLooperPrepared();
    this.D = new cf(this, getLooper());
    synchronized (this.G)
    {
      this.M = true;
      this.G.notify();
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\nn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */