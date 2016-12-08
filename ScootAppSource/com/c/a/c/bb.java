package com.c.a.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

final class bb
  implements ca
{
  private final Context a;
  private final String b;
  
  public bb(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
  }
  
  public String a()
  {
    String str = null;
    Object localObject = this.a.getPackageManager();
    try
    {
      localObject = ((PackageManager)localObject).getApplicationInfo(this.b, 128).metaData;
      if (localObject != null) {
        str = ((Bundle)localObject).getString("io.fabric.unity.crashlytics.version");
      }
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */