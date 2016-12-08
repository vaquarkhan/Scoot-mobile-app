package com.google.android.gms.b;

import java.util.concurrent.locks.Lock;

final class bq
  implements Runnable
{
  bq(bp parambp) {}
  
  public void run()
  {
    bp.a(this.a).lock();
    try
    {
      bp.b(this.a);
      return;
    }
    finally
    {
      bp.a(this.a).unlock();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */