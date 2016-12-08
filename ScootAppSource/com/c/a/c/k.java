package com.c.a.c;

import b.a.a.a.f;
import b.a.a.a.t;
import java.util.concurrent.Callable;

final class k
  implements Callable<Boolean>
{
  k(h paramh) {}
  
  public Boolean a()
  {
    try
    {
      boolean bool = h.a(this.a).c();
      f.h().a("CrashlyticsCore", "Initialization marker file removed: " + bool);
      return Boolean.valueOf(bool);
    }
    catch (Exception localException)
    {
      f.h().e("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", localException);
    }
    return Boolean.valueOf(false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */