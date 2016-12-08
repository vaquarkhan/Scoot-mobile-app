package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.a.j;

public final class fb
{
  protected final Context a;
  
  public fb(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public ApplicationInfo a(String paramString, int paramInt)
  {
    return this.a.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  @TargetApi(19)
  public boolean a(int paramInt, String paramString)
  {
    boolean bool2 = false;
    if (j.f()) {}
    for (;;)
    {
      try
      {
        ((AppOpsManager)this.a.getSystemService("appops")).checkPackage(paramInt, paramString);
        bool1 = true;
        return bool1;
      }
      catch (SecurityException paramString) {}
      String[] arrayOfString = this.a.getPackageManager().getPackagesForUid(paramInt);
      boolean bool1 = bool2;
      if (paramString != null)
      {
        bool1 = bool2;
        if (arrayOfString != null)
        {
          paramInt = 0;
          for (;;)
          {
            bool1 = bool2;
            if (paramInt >= arrayOfString.length) {
              break;
            }
            if (paramString.equals(arrayOfString[paramInt])) {
              return true;
            }
            paramInt += 1;
          }
        }
      }
    }
    return false;
  }
  
  public PackageInfo b(String paramString, int paramInt)
  {
    return this.a.getPackageManager().getPackageInfo(paramString, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */