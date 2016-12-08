package com.facebook.b;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

final class af
  implements Callable<Void>
{
  af(ae paramae, Callable paramCallable) {}
  
  public Void a()
  {
    try
    {
      ae.a(this.b, this.a.call());
      return null;
    }
    finally
    {
      ae.a(this.b).countDown();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */