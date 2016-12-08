package com.appsee;

import android.os.DeadObjectException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class wd
  implements InvocationHandler
{
  wd(rd paramrd, Object paramObject) {}
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    ei.C(new kd(this, paramMethod, paramArrayOfObject));
    try
    {
      paramObject = lc.C(this.l, paramMethod.getName(), paramMethod.getParameterTypes(), paramArrayOfObject);
      rd.C(this.A, 0);
      return paramObject;
    }
    catch (DeadObjectException paramObject)
    {
      rd.C(this.A);
      if ((ye.C().b()) || (rd.H(this.A) > 3)) {
        throw ((Throwable)paramObject);
      }
      if (paramMethod.getReturnType() != Void.TYPE) {
        return paramMethod.getReturnType().newInstance();
      }
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\wd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */