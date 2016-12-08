package com.facebook.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import java.util.TreeSet;

abstract class al
{
  private static final HashSet<String> a = ;
  private TreeSet<Integer> b;
  
  private void a(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    try
    {
      if (this.b == null) {
        this.b = ah.a(this);
      }
      return;
    }
    finally {}
  }
  
  private static HashSet<String> c()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
    localHashSet.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
    localHashSet.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
    return localHashSet;
  }
  
  protected abstract String a();
  
  public boolean a(Context paramContext, String paramString)
  {
    String str = Build.BRAND;
    int i = paramContext.getApplicationInfo().flags;
    if ((str.startsWith("generic")) && ((i & 0x2) != 0)) {}
    for (;;)
    {
      return true;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
        paramContext = paramContext.signatures;
        int j = paramContext.length;
        i = 0;
        for (;;)
        {
          if (i >= j) {
            break label89;
          }
          paramString = as.a(paramContext[i].toByteArray());
          if (a.contains(paramString)) {
            break;
          }
          i += 1;
        }
        return false;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        return false;
      }
    }
  }
  
  public TreeSet<Integer> b()
  {
    if (this.b == null) {
      a(false);
    }
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */