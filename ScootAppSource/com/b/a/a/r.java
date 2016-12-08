package com.b.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import com.b.a.u;
import java.io.File;

public final class r
{
  public static u a(Context paramContext)
  {
    return a(paramContext, null);
  }
  
  public static u a(Context paramContext, k paramk)
  {
    return a(paramContext, paramk, -1);
  }
  
  public static u a(Context paramContext, k paramk, int paramInt)
  {
    File localFile = new File(paramContext.getCacheDir(), "volley");
    Object localObject = "volley/0";
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0);
      paramContext = str + "/" + paramContext.versionCode;
      localObject = paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      label140:
      for (;;) {}
    }
    paramContext = paramk;
    if (paramk == null)
    {
      if (Build.VERSION.SDK_INT >= 9) {
        paramContext = new l();
      }
    }
    else
    {
      paramContext = new a(paramContext);
      if (paramInt > -1) {
        break label140;
      }
    }
    for (paramContext = new u(new d(localFile), paramContext);; paramContext = new u(new d(localFile, paramInt), paramContext))
    {
      paramContext.a();
      return paramContext;
      paramContext = new h(AndroidHttpClient.newInstance((String)localObject));
      break;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */