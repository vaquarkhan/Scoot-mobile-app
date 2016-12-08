package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.b;

public class s
{
  private static s a;
  private final Context b;
  
  private s(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  public static s a(Context paramContext)
  {
    b.a(paramContext);
    try
    {
      if (a == null)
      {
        k.a(paramContext);
        a = new s(paramContext);
      }
      return a;
    }
    finally {}
  }
  
  l a(PackageInfo paramPackageInfo, l... paramVarArgs)
  {
    if (paramPackageInfo.signatures == null) {
      return null;
    }
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    }
    m localm = new m(paramPackageInfo.signatures[0].toByteArray());
    int i = 0;
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals(localm)) {
        return paramVarArgs[i];
      }
      i += 1;
    }
    paramPackageInfo = String.valueOf(paramPackageInfo.packageName);
    paramVarArgs = String.valueOf(Base64.encodeToString(localm.c(), 0));
    Log.v("GoogleSignatureVerifier", String.valueOf(paramPackageInfo).length() + 31 + String.valueOf(paramVarArgs).length() + paramPackageInfo + " signature not valid.  Found: \n" + paramVarArgs);
    return null;
  }
  
  public boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if ((paramPackageInfo != null) && (paramPackageInfo.signatures != null))
    {
      if (paramBoolean) {}
      for (paramPackageInfo = a(paramPackageInfo, o.a); paramPackageInfo != null; paramPackageInfo = a(paramPackageInfo, new l[] { o.a[0] })) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    boolean bool1 = false;
    if (paramPackageInfo == null) {}
    boolean bool2;
    do
    {
      do
      {
        return bool1;
        if (r.zzal(this.b)) {
          return a(paramPackageInfo, true);
        }
        bool2 = a(paramPackageInfo, false);
        bool1 = bool2;
      } while (bool2);
      bool1 = bool2;
    } while (!a(paramPackageInfo, true));
    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    return bool2;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */