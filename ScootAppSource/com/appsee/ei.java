package com.appsee;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ei
{
  static final String A = "com.appsee.Action.Mode";
  private static final Object B = new Object();
  static final String G = "com.appsee.Action.UploadMode";
  private static List<AppseeListener> M;
  private static HashMap<String, ExecutorService> l = new HashMap();
  
  public static void C(AppseeListener paramAppseeListener)
  {
    synchronized (B)
    {
      if (M == null) {
        M = new ArrayList();
      }
      if (!M.contains(paramAppseeListener)) {
        M.add(paramAppseeListener);
      }
      return;
    }
  }
  
  public static void C(e parame)
  {
    try
    {
      parame.C();
      return;
    }
    catch (Exception parame)
    {
      ue.C(parame, bc.C("2=\000=\030|1$\0279\004(\0353\032|\0004\0063\0032T5\032|\000=\0077N|"));
    }
  }
  
  public static void C(kj paramkj)
  {
    C(paramkj, null);
  }
  
  public static void C(kj paramkj, Bundle paramBundle)
  {
    Application localApplication = bp.C();
    Intent localIntent = new Intent(localApplication, AppseeBackgroundUploader.class);
    localIntent.putExtra("com.appsee.Action.Mode", paramkj.ordinal());
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    localApplication.startService(localIntent);
    vd.C(1, bc.C("=2\0009\032(T\017\021.\0025\0279T\r\0019\0019\020pT1\0338\021|I|Q/"), new Object[] { paramkj.toString() });
  }
  
  public static void C(o paramo, boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (B)
      {
        if ((M != null) && (!M.isEmpty()))
        {
          if (paramBoolean)
          {
            C(bc.C("\035\004,\0079\021q'9\007/\0353\032q85\007(\0212\021."), new re(paramo));
            return;
          }
          H(paramo);
        }
      }
    }
  }
  
  public static void C(String paramString, e parame)
  {
    try
    {
      if (!l.containsKey(paramString)) {
        l.put(paramString, Executors.newSingleThreadExecutor());
      }
      ((ExecutorService)l.get(paramString)).submit(new sk(parame, paramString));
      return;
    }
    finally {}
  }
  
  public static boolean C()
  {
    return Thread.currentThread().equals(Looper.getMainLooper().getThread());
  }
  
  public static void H(AppseeListener paramAppseeListener)
  {
    synchronized (B)
    {
      if ((M != null) && (M.contains(paramAppseeListener))) {
        M.remove(paramAppseeListener);
      }
      return;
    }
  }
  
  public static void H(e parame)
  {
    if (C())
    {
      C(parame);
      return;
    }
    try
    {
      Handler localHandler = new Handler(Looper.getMainLooper());
      synchronized (new Object())
      {
        localHandler.post(new vn(parame, ???));
        ???.wait();
        return;
      }
      return;
    }
    catch (Exception parame)
    {
      ue.C(parame, bc.C("\031\006.\033.T.\0012\0325\032;T/\r2\0274\0063\0325\0169\020|\0332T1\0255\032|\0004\0069\0258"));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */