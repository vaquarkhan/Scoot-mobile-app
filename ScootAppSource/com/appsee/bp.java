package com.appsee;

import android.app.Application;
import android.app.Instrumentation;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

class bp
{
  private static Application A = null;
  public static final String l = "APPSEE_NO_CONTEXT";
  
  public static Application C()
  {
    if (A == null) {
      throw new NullPointerException("APPSEE_NO_CONTEXT");
    }
    return A;
  }
  
  public static boolean C()
  {
    for (;;)
    {
      Object localObject1;
      try
      {
        localObject1 = A;
        if (localObject1 == null) {}
        try
        {
          localObject1 = Class.forName(zb.C("NrKn@uK2Nl_2n[uYu[e{t]yNx"));
          if (Build.VERSION.SDK_INT < 9) {
            continue;
          }
          A = (Application)((Class)localObject1).getMethod(zb.C("Li]nJr[]_lCuL}[u@r"), new Class[0]).invoke(null, (Object[])null);
          localObject1 = A;
          if (localObject1 == null) {
            continue;
          }
          bool = true;
        }
        catch (Exception localException)
        {
          Object localObject3;
          boolean bool = false;
          continue;
          bool = false;
          continue;
        }
        return bool;
      }
      finally {}
      localObject3 = ((Class)localObject1).getMethod(zb.C("Zn]yAhn[uYu[e{t]yNx"), new Class[0]).invoke(null, (Object[])null);
      A = (Application)((Class)localObject1).getMethod(zb.C("Hy[]_lCuL}[u@r"), new Class[0]).invoke(localObject3, new Object[0]);
    }
  }
  
  public static boolean H()
  {
    try
    {
      Object localObject = lc.C(Class.forName(zb.C("NrKn@uK2Nl_2n[uYu[e{t]yNx")).getMethod(zb.C("Zn]yAhn[uYu[e{t]yNx"), new Class[0]).invoke(null, (Object[])null), zb.C("BUAo[nZqJr[}[u@r"));
      if ((localObject != null) && (!localObject.getClass().equals(Instrumentation.class)))
      {
        boolean bool = localObject.getClass().equals(ad.class);
        if (!bool) {
          return true;
        }
      }
      return false;
    }
    catch (Exception localException) {}
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */