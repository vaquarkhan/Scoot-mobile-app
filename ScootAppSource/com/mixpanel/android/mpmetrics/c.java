package com.mixpanel.android.mpmetrics;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

final class c
{
  private final Object b = new Object();
  private Handler c = a();
  private long d = 0L;
  private long e = 0L;
  private long f = -1L;
  private bk g;
  
  public c(a parama) {}
  
  private void b()
  {
    long l1 = System.currentTimeMillis();
    long l2 = this.d + 1L;
    if (this.f > 0L)
    {
      this.e = ((l1 - this.f + this.e * this.d) / l2);
      long l3 = this.e / 1000L;
      a.a(this.a, "Average send frequency approximately " + l3 + " seconds.");
    }
    this.f = l1;
    this.d = l2;
  }
  
  protected Handler a()
  {
    HandlerThread localHandlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 1);
    localHandlerThread.start();
    return new d(this, localHandlerThread.getLooper());
  }
  
  public void a(Message paramMessage)
  {
    synchronized (this.b)
    {
      if (this.c == null)
      {
        a.a(this.a, "Dead mixpanel worker dropping a message: " + paramMessage.what);
        return;
      }
      this.c.sendMessage(paramMessage);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */