package com.appsee;

import android.util.Log;

class ue
{
  public static void C(String paramString)
  {
    vd.H(2, paramString);
    if (ye.C().C() != ro.B) {
      hp.C(String.format(fc.C("PEUJNJ@>'!t"), new Object[] { paramString }));
    }
  }
  
  public static void C(Throwable paramThrowable, String paramString)
  {
    C(paramThrowable, paramString, true);
  }
  
  public static void C(Throwable paramThrowable, String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      paramString = "";
    }
    for (;;)
    {
      String str = paramString;
      if (paramThrowable != null) {
        str = String.format(zb.C("\no\0171\017YWJl[u@r\025<\no\001\026"), new Object[] { paramString, Log.getStackTraceString(paramThrowable) });
      }
      vd.C(2, str);
      if ((paramBoolean) && (ye.C().C() != ro.B)) {
        hp.C(String.format(fc.C("BVUKU>'!t"), new Object[] { str }));
      }
      return;
    }
  }
  
  public static void C(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    C(paramThrowable, String.format(paramString, paramVarArgs), true);
  }
  
  public static void H(Throwable paramThrowable, String paramString)
  {
    C(paramThrowable, paramString);
    throw new Exception(String.format(zb.C("nl_oJy\017yWJl[u@r\025<\no"), new Object[] { paramThrowable.toString() }));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */