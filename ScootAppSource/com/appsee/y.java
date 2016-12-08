package com.appsee;

import java.util.EnumSet;
import java.util.concurrent.CountDownLatch;

class y
  implements Runnable
{
  y(k paramk, CountDownLatch paramCountDownLatch) {}
  
  public void run()
  {
    try
    {
      k.C(this.A, new xb());
      k.C(this.A).C(k.C(this.A).getWidth(), k.C(this.A).getHeight(), k.C(this.A), k.H(this.A), k.C(this.A), ye.C().C().contains(xo.M));
      this.l.countDown();
      k.a(this.A);
      return;
    }
    catch (Exception localException)
    {
      k.C(this.A);
      k.C(this.A, localException);
      return;
    }
    finally
    {
      this.l.countDown();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */