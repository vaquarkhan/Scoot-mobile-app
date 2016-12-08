package com.google.android.gms.common.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class f
{
  private static Boolean a;
  private static Boolean b;
  private static Boolean c;
  
  @TargetApi(20)
  public static boolean a(Context paramContext)
  {
    if (c == null) {
      if ((!j.g()) || (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch"))) {
        break label40;
      }
    }
    label40:
    for (boolean bool = true;; bool = false)
    {
      c = Boolean.valueOf(bool);
      return c.booleanValue();
    }
  }
  
  public static boolean a(Resources paramResources)
  {
    boolean bool = false;
    if (paramResources == null) {
      return false;
    }
    if (a == null) {
      if ((paramResources.getConfiguration().screenLayout & 0xF) <= 3) {
        break label63;
      }
    }
    label63:
    for (int i = 1;; i = 0)
    {
      if (((j.a()) && (i != 0)) || (b(paramResources))) {
        bool = true;
      }
      a = Boolean.valueOf(bool);
      return a.booleanValue();
    }
  }
  
  @TargetApi(13)
  private static boolean b(Resources paramResources)
  {
    if (b == null)
    {
      paramResources = paramResources.getConfiguration();
      if ((!j.b()) || ((paramResources.screenLayout & 0xF) > 3) || (paramResources.smallestScreenWidthDp < 600)) {
        break label54;
      }
    }
    label54:
    for (boolean bool = true;; bool = false)
    {
      b = Boolean.valueOf(bool);
      return b.booleanValue();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */