package com.c.a.c;

import b.a.a.a.f;
import b.a.a.a.t;

final class w
  implements Runnable
{
  w(v paramv, Runnable paramRunnable) {}
  
  public void run()
  {
    try
    {
      this.a.run();
      return;
    }
    catch (Exception localException)
    {
      f.h().e("CrashlyticsCore", "Failed to execute task.", localException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */