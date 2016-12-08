package com.appsee;

import android.util.Log;
import java.util.EnumSet;

class vd
{
  public static final int A = 3;
  public static final int B = 2;
  public static final int D = 1000;
  private static boolean G = false;
  public static final int M = 1;
  private static long f = 0L;
  public static final String l = "appsee";
  
  public static int C()
  {
    return Appsee.M;
  }
  
  public static void C()
  {
    if (!ye.C().C().contains(xo.B)) {
      return;
    }
    try
    {
      H();
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, lb.C("X_uPtJ;Y~J;RtYx_o\036}LtS;Z~Hr]~"));
    }
  }
  
  public static void C(int paramInt)
  {
    Appsee.M = paramInt;
  }
  
  public static void C(int paramInt, String paramString)
  {
    C(paramString, null, paramInt, true);
  }
  
  public static void C(int paramInt, String paramString, Object... paramVarArgs)
  {
    if (!C(paramInt)) {
      return;
    }
    C(String.format(paramString, paramVarArgs), null, paramInt, false);
  }
  
  public static void C(String paramString)
  {
    Log.i("appsee", paramString);
  }
  
  public static void C(boolean paramBoolean)
  {
    G = paramBoolean;
  }
  
  public static void H(int paramInt, String paramString)
  {
    C(paramString, null, paramInt, false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */