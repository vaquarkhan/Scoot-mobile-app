package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.b;

public final class q
{
  static Object a = new Object();
  static Boolean b;
  
  public static boolean a(Context paramContext)
  {
    b.a(paramContext);
    if (b != null) {
      return b.booleanValue();
    }
    boolean bool = w.a(paramContext, "com.google.android.gms.analytics.AnalyticsReceiver", false);
    b = Boolean.valueOf(bool);
    return bool;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */