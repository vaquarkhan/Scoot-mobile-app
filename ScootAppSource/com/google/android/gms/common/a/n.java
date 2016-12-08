package com.google.android.gms.common.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.b.fb;
import com.google.android.gms.b.fc;
import com.google.android.gms.common.s;

public final class n
{
  public static boolean a(Context paramContext, int paramInt)
  {
    if (!a(paramContext, paramInt, "com.google.android.gms")) {}
    do
    {
      return false;
      Object localObject = paramContext.getPackageManager();
      try
      {
        localObject = ((PackageManager)localObject).getPackageInfo("com.google.android.gms", 64);
        return s.a(paramContext).a(paramContext.getPackageManager(), (PackageInfo)localObject);
      }
      catch (PackageManager.NameNotFoundException paramContext) {}
    } while (!Log.isLoggable("UidVerifier", 3));
    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
    return false;
  }
  
  @TargetApi(19)
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    return fc.b(paramContext).a(paramInt, paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */