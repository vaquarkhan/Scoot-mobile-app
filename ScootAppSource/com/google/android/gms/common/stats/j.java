package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.b.ec;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.g;
import java.util.List;

public final class j
{
  private static String a = "WakeLockTracker";
  private static j b = new j();
  private static Boolean c;
  
  public static j a()
  {
    return b;
  }
  
  private static boolean a(Context paramContext)
  {
    if (c == null) {
      c = Boolean.valueOf(b(paramContext));
    }
    return c.booleanValue();
  }
  
  private static boolean b(Context paramContext)
  {
    boolean bool = false;
    try
    {
      if (b.a())
      {
        int i = ((Integer)e.a.a()).intValue();
        int j = f.b;
        if (i == j) {
          break label34;
        }
      }
      label34:
      for (bool = true;; bool = false) {
        return bool;
      }
      return false;
    }
    catch (SecurityException paramContext) {}
  }
  
  public void a(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, int paramInt2, List<String> paramList)
  {
    a(paramContext, paramString1, paramInt1, paramString2, paramString3, paramString4, paramInt2, paramList, 0L);
  }
  
  public void a(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, int paramInt2, List<String> paramList, long paramLong)
  {
    if (!a(paramContext)) {}
    long l;
    do
    {
      return;
      if (TextUtils.isEmpty(paramString1))
      {
        paramString2 = a;
        paramContext = String.valueOf(paramString1);
        if (paramContext.length() != 0) {}
        for (paramContext = "missing wakeLock key. ".concat(paramContext);; paramContext = new String("missing wakeLock key. "))
        {
          Log.e(paramString2, paramContext);
          return;
        }
      }
      l = System.currentTimeMillis();
    } while ((7 != paramInt1) && (8 != paramInt1) && (10 != paramInt1) && (11 != paramInt1));
    paramString1 = new WakeLockEvent(l, paramInt1, paramString2, paramInt2, h.a(paramList), paramString1, SystemClock.elapsedRealtime(), g.a(paramContext), paramString3, h.a(paramContext.getPackageName()), g.b(paramContext), paramLong, paramString4);
    try
    {
      paramContext.startService(new Intent().setComponent(f.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", paramString1));
      return;
    }
    catch (Exception paramContext)
    {
      Log.wtf(a, paramContext);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\stats\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */