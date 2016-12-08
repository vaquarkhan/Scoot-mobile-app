package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.w;
import com.google.android.gms.b.t;
import com.google.android.gms.b.y;
import com.google.android.gms.common.internal.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class ad
{
  private static volatile ad a;
  private final Context b;
  private final List<aj> c;
  private final x d;
  private final af e;
  private volatile t f;
  private Thread.UncaughtExceptionHandler g;
  
  ad(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    b.a(paramContext);
    this.b = paramContext;
    this.e = new af(this);
    this.c = new CopyOnWriteArrayList();
    this.d = new x();
  }
  
  public static ad a(Context paramContext)
  {
    b.a(paramContext);
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new ad(paramContext);
      }
      return a;
    }
    finally {}
  }
  
  private void b(z paramz)
  {
    b.c("deliver should be called from worker thread");
    b.b(paramz.f(), "Measurement must be submitted");
    Object localObject = paramz.c();
    if (((List)localObject).isEmpty()) {}
    for (;;)
    {
      return;
      HashSet localHashSet = new HashSet();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        ak localak = (ak)((Iterator)localObject).next();
        Uri localUri = localak.a();
        if (!localHashSet.contains(localUri))
        {
          localHashSet.add(localUri);
          localak.a(paramz);
        }
      }
    }
  }
  
  public static void d()
  {
    if (!(Thread.currentThread() instanceof ai)) {
      throw new IllegalStateException("Call expected from worker thread");
    }
  }
  
  public t a()
  {
    if (this.f == null) {}
    label202:
    for (;;)
    {
      try
      {
        t localt;
        PackageManager localPackageManager;
        String str3;
        Object localObject5;
        Object localObject3;
        if (this.f == null)
        {
          localt = new t();
          localPackageManager = this.b.getPackageManager();
          str3 = this.b.getPackageName();
          localt.c(str3);
          localt.d(localPackageManager.getInstallerPackageName(str3));
          localObject5 = null;
          localObject3 = str3;
        }
        try
        {
          PackageInfo localPackageInfo = localPackageManager.getPackageInfo(this.b.getPackageName(), 0);
          localObject4 = localObject5;
          String str1 = str3;
          if (localPackageInfo != null)
          {
            localObject3 = str3;
            localObject4 = localPackageManager.getApplicationLabel(localPackageInfo.applicationInfo);
            str1 = str3;
            localObject3 = str3;
            if (!TextUtils.isEmpty((CharSequence)localObject4))
            {
              localObject3 = str3;
              str1 = ((CharSequence)localObject4).toString();
            }
            localObject3 = str1;
            localObject4 = localPackageInfo.versionName;
          }
          localt.a(str1);
          localt.b((String)localObject4);
          this.f = localt;
          return this.f;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          localObject1 = String.valueOf(localObject3);
          if (((String)localObject1).length() == 0) {
            break label202;
          }
        }
        Object localObject1 = "Error retrieving package info: appName set to ".concat((String)localObject1);
        Log.e("GAv4", (String)localObject1);
        Object localObject4 = localObject5;
        localObject1 = localObject3;
        continue;
        String str2 = new String("Error retrieving package info: appName set to ");
      }
      finally {}
    }
  }
  
  public <V> Future<V> a(Callable<V> paramCallable)
  {
    b.a(paramCallable);
    if ((Thread.currentThread() instanceof ai))
    {
      paramCallable = new FutureTask(paramCallable);
      paramCallable.run();
      return paramCallable;
    }
    return this.e.submit(paramCallable);
  }
  
  void a(z paramz)
  {
    if (paramz.j()) {
      throw new IllegalStateException("Measurement prototype can't be submitted");
    }
    if (paramz.f()) {
      throw new IllegalStateException("Measurement can only be submitted once");
    }
    paramz = paramz.a();
    paramz.g();
    this.e.execute(new ae(this, paramz));
  }
  
  public void a(Runnable paramRunnable)
  {
    b.a(paramRunnable);
    this.e.submit(paramRunnable);
  }
  
  public void a(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.g = paramUncaughtExceptionHandler;
  }
  
  public y b()
  {
    DisplayMetrics localDisplayMetrics = this.b.getResources().getDisplayMetrics();
    y localy = new y();
    localy.a(w.a(Locale.getDefault()));
    localy.b(localDisplayMetrics.widthPixels);
    localy.c(localDisplayMetrics.heightPixels);
    return localy;
  }
  
  public Context c()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */