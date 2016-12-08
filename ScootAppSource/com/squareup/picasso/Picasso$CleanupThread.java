package com.squareup.picasso;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

class Picasso$CleanupThread
  extends Thread
{
  private final Handler handler;
  private final ReferenceQueue<Object> referenceQueue;
  
  Picasso$CleanupThread(ReferenceQueue<Object> paramReferenceQueue, Handler paramHandler)
  {
    this.referenceQueue = paramReferenceQueue;
    this.handler = paramHandler;
    setDaemon(true);
    setName("Picasso-refQueue");
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    try
    {
      for (;;)
      {
        Action.RequestWeakReference localRequestWeakReference = (Action.RequestWeakReference)this.referenceQueue.remove(1000L);
        Message localMessage = this.handler.obtainMessage();
        if (localRequestWeakReference != null)
        {
          localMessage.what = 3;
          localMessage.obj = localRequestWeakReference.action;
          this.handler.sendMessage(localMessage);
        }
        else
        {
          localMessage.recycle();
        }
      }
      return;
    }
    catch (Exception localException)
    {
      this.handler.post(new Picasso.CleanupThread.1(this, localException));
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  void shutdown()
  {
    interrupt();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Picasso$CleanupThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */