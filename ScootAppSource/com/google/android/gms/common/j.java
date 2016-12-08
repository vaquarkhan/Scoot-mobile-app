package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.a.f;
import com.google.android.gms.common.internal.ba;

public class j
{
  private static final j a = new j();
  public static final int b = r.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  
  public static j b()
  {
    return a;
  }
  
  private String b(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("gcore_");
    localStringBuilder.append(b);
    localStringBuilder.append("-");
    if (!TextUtils.isEmpty(paramString)) {
      localStringBuilder.append(paramString);
    }
    localStringBuilder.append("-");
    if (paramContext != null) {
      localStringBuilder.append(paramContext.getPackageName());
    }
    localStringBuilder.append("-");
    if (paramContext != null) {}
    try
    {
      localStringBuilder.append(paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode);
      return localStringBuilder.toString();
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public int a(Context paramContext)
  {
    int j = r.isGooglePlayServicesAvailable(paramContext);
    int i = j;
    if (r.zzc(paramContext, j)) {
      i = 18;
    }
    return i;
  }
  
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return a(paramContext, paramInt1, paramInt2, null);
  }
  
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    int i = paramInt1;
    if (f.a(paramContext))
    {
      i = paramInt1;
      if (paramInt1 == 2) {
        i = 42;
      }
    }
    paramString = a(paramContext, i, paramString);
    if (paramString == null) {
      return null;
    }
    return PendingIntent.getActivity(paramContext, paramInt2, paramString, 268435456);
  }
  
  public Intent a(Context paramContext, int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
    case 2: 
      return ba.a("com.google.android.gms", b(paramContext, paramString));
    case 42: 
      return ba.a();
    }
    return ba.a("com.google.android.gms");
  }
  
  public boolean a(int paramInt)
  {
    return r.isUserRecoverableError(paramInt);
  }
  
  public boolean a(Context paramContext, int paramInt)
  {
    return r.zzc(paramContext, paramInt);
  }
  
  public boolean a(Context paramContext, String paramString)
  {
    return r.zzk(paramContext, paramString);
  }
  
  @Deprecated
  public Intent b(int paramInt)
  {
    return a(null, paramInt, null);
  }
  
  public void b(Context paramContext)
  {
    r.zzaa(paramContext);
  }
  
  public void c(Context paramContext)
  {
    r.zzag(paramContext);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */