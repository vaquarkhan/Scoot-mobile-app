package com.c.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import b.a.a.a.a.g.w;
import b.a.a.a.f;
import b.a.a.a.t;
import java.io.File;

public class a
  extends b.a.a.a.q<Boolean>
{
  z a;
  
  public String a()
  {
    return "1.3.8.127";
  }
  
  public void a(b.a.a.a.a.b.q paramq)
  {
    if (this.a != null) {
      this.a.a(paramq.a(), paramq.b());
    }
  }
  
  public String b()
  {
    return "com.crashlytics.sdk.android:answers";
  }
  
  protected Boolean d()
  {
    try
    {
      w localw = b.a.a.a.a.g.q.a().b();
      if (localw == null)
      {
        f.h().e("Answers", "Failed to retrieve settings");
        return Boolean.valueOf(false);
      }
      if (localw.d.d)
      {
        f.h().a("Answers", "Analytics collection enabled");
        this.a.a(localw.e, f());
        return Boolean.valueOf(true);
      }
      f.h().a("Answers", "Analytics collection disabled");
      this.a.c();
      return Boolean.valueOf(false);
    }
    catch (Exception localException)
    {
      f.h().e("Answers", "Error dealing with settings", localException);
    }
    return Boolean.valueOf(false);
  }
  
  String f()
  {
    return b.a.a.a.a.b.m.b(E(), "com.crashlytics.ApiEndpoint");
  }
  
  @SuppressLint({"NewApi"})
  protected boolean h_()
  {
    try
    {
      Context localContext = E();
      PackageManager localPackageManager = localContext.getPackageManager();
      String str2 = localContext.getPackageName();
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(str2, 0);
      String str3 = Integer.toString(localPackageInfo.versionCode);
      String str1;
      if (localPackageInfo.versionName == null)
      {
        str1 = "0.0";
        if (Build.VERSION.SDK_INT < 9) {
          break label101;
        }
      }
      label101:
      for (long l = localPackageInfo.firstInstallTime;; l = new File(localPackageManager.getApplicationInfo(str2, 0).sourceDir).lastModified())
      {
        this.a = z.a(this, localContext, D(), str3, str1, l);
        this.a.b();
        return true;
        str1 = localPackageInfo.versionName;
        break;
      }
      return false;
    }
    catch (Exception localException)
    {
      f.h().e("Answers", "Error retrieving app properties", localException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */