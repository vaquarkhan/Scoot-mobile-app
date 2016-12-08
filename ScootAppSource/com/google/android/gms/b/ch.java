package com.google.android.gms.b;

import java.util.concurrent.locks.Lock;

abstract class ch
  implements Runnable
{
  private ch(bx parambx) {}
  
  protected abstract void a();
  
  public void run()
  {
    bx.c(this.b).lock();
    try
    {
      boolean bool = Thread.interrupted();
      if (bool) {
        return;
      }
      a();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      bx.d(this.b).a(localRuntimeException);
      return;
    }
    finally
    {
      bx.c(this.b).unlock();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */