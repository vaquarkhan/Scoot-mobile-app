package com.c.a.c;

import b.a.a.a.f;
import b.a.a.a.t;
import java.util.concurrent.Callable;

final class x
  implements Callable<T>
{
  x(v paramv, Callable paramCallable) {}
  
  public T call()
  {
    try
    {
      Object localObject = this.a.call();
      return (T)localObject;
    }
    catch (Exception localException)
    {
      f.h().e("CrashlyticsCore", "Failed to execute task.", localException);
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */