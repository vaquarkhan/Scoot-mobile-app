package com.appsee;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;

class ud
{
  public static Drawable C()
  {
    Application localApplication = bp.C();
    return localApplication.getApplicationInfo().loadIcon(localApplication.getPackageManager());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\ud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */