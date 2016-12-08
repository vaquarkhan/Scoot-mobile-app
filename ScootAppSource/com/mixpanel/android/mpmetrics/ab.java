package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class ab
{
  public static boolean a = false;
  private static ab v;
  private static final Object w = new Object();
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private final int f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final boolean j;
  private final boolean k;
  private final String l;
  private final String m;
  private final String n;
  private final String o;
  private final String p;
  private final String q;
  private final boolean r;
  private final String s;
  private final String t;
  private SSLSocketFactory u;
  
  ab(Bundle paramBundle, Context paramContext)
  {
    try
    {
      localObject2 = SSLContext.getInstance("TLS");
      ((SSLContext)localObject2).init(null, null, null);
      localObject2 = ((SSLContext)localObject2).getSocketFactory();
      localObject1 = localObject2;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      for (;;)
      {
        Object localObject2;
        boolean bool2;
        Log.i("MixpanelAPI.Conf", "System has no SSL support. Built-in events editor will not be available", localGeneralSecurityException);
        continue;
        boolean bool1 = false;
      }
    }
    this.u = ((SSLSocketFactory)localObject1);
    a = paramBundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
    if (paramBundle.containsKey("com.mixpanel.android.MPConfig.AutoCheckForSurveys")) {
      Log.w("MixpanelAPI.Conf", "com.mixpanel.android.MPConfig.AutoCheckForSurveys has been deprecated in favor of com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates. Please update this key as soon as possible.");
    }
    this.b = paramBundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
    this.c = paramBundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
    this.d = paramBundle.getInt("com.mixpanel.android.MPConfig.DebugFlushInterval", 1000);
    this.e = paramBundle.getInt("com.mixpanel.android.MPConfig.DataExpiration", 432000000);
    this.f = paramBundle.getInt("com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 20971520);
    this.g = paramBundle.getBoolean("com.mixpanel.android.MPConfig.DisableFallback", true);
    this.t = paramBundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
    this.i = paramBundle.getBoolean("com.mixpanel.android.MPConfig.DisableGestureBindingUI", false);
    this.j = paramBundle.getBoolean("com.mixpanel.android.MPConfig.DisableEmulatorBindingUI", false);
    this.k = paramBundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
    bool1 = paramBundle.getBoolean("com.mixpanel.android.MPConfig.AutoCheckForSurveys", true);
    bool2 = paramBundle.getBoolean("com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates", true);
    if ((bool1) && (bool2))
    {
      bool1 = true;
      this.r = bool1;
      this.h = paramBundle.getBoolean("com.mixpanel.android.MPConfig.TestMode", false);
      localObject2 = paramBundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "https://api.mixpanel.com/track?ip=1";
      }
      this.l = ((String)localObject1);
      localObject2 = paramBundle.getString("com.mixpanel.android.MPConfig.EventsFallbackEndpoint");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "http://api.mixpanel.com/track?ip=1";
      }
      this.m = ((String)localObject1);
      localObject2 = paramBundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "https://api.mixpanel.com/engage";
      }
      this.n = ((String)localObject1);
      localObject2 = paramBundle.getString("com.mixpanel.android.MPConfig.PeopleFallbackEndpoint");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "http://api.mixpanel.com/engage";
      }
      this.o = ((String)localObject1);
      localObject2 = paramBundle.getString("com.mixpanel.android.MPConfig.DecideEndpoint");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "https://decide.mixpanel.com/decide";
      }
      this.p = ((String)localObject1);
      localObject2 = paramBundle.getString("com.mixpanel.android.MPConfig.DecideFallbackEndpoint");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "http://decide.mixpanel.com/decide";
      }
      this.q = ((String)localObject1);
      localObject1 = paramBundle.getString("com.mixpanel.android.MPConfig.EditorUrl");
      paramBundle = (Bundle)localObject1;
      if (localObject1 == null) {
        paramBundle = "wss://switchboard.mixpanel.com/connect/";
      }
      this.s = paramBundle;
      if (a) {
        Log.v("MixpanelAPI.Conf", "Mixpanel configured with:\n    AutoShowMixpanelUpdates " + o() + "\n" + "    BulkUploadLimit " + a() + "\n" + "    FlushInterval " + b(paramContext) + "\n" + "    DataExpiration " + b() + "\n" + "    MinimumDatabaseLimit " + c() + "\n" + "    DisableFallback " + d() + "\n" + "    DisableAppOpenEvent " + g() + "\n" + "    DisableDeviceUIBinding " + e() + "\n" + "    DisableEmulatorUIBinding " + f() + "\n" + "    EnableDebugLogging " + a + "\n" + "    TestMode " + h() + "\n" + "    EventsEndpoint " + i() + "\n" + "    PeopleEndpoint " + j() + "\n" + "    DecideEndpoint " + k() + "\n" + "    EventsFallbackEndpoint " + l() + "\n" + "    PeopleFallbackEndpoint " + m() + "\n" + "    DecideFallbackEndpoint " + n() + "\n" + "    EditorUrl " + p() + "\n");
      }
      return;
    }
  }
  
  public static ab a(Context paramContext)
  {
    synchronized (w)
    {
      if (v == null) {
        v = c(paramContext.getApplicationContext());
      }
      return v;
    }
  }
  
  static ab c(Context paramContext)
  {
    String str = paramContext.getPackageName();
    try
    {
      Bundle localBundle2 = paramContext.getPackageManager().getApplicationInfo(str, 128).metaData;
      Bundle localBundle1 = localBundle2;
      if (localBundle2 == null) {
        localBundle1 = new Bundle();
      }
      paramContext = new ab(localBundle1, paramContext);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      throw new RuntimeException("Can't configure Mixpanel with package name " + str, paramContext);
    }
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public int b(Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = paramContext.getApplicationInfo();
      i1 = paramContext.flags & 0x2;
      paramContext.flags = i1;
      if (i1 == 0) {}
    }
    for (int i1 = 1; i1 != 0; i1 = 0) {
      return this.d;
    }
    return this.c;
  }
  
  public int c()
  {
    return this.f;
  }
  
  public boolean d()
  {
    return this.g;
  }
  
  public boolean e()
  {
    return this.i;
  }
  
  public boolean f()
  {
    return this.j;
  }
  
  public boolean g()
  {
    return this.k;
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public String i()
  {
    return this.l;
  }
  
  public String j()
  {
    return this.n;
  }
  
  public String k()
  {
    return this.p;
  }
  
  public String l()
  {
    return this.m;
  }
  
  public String m()
  {
    return this.o;
  }
  
  public String n()
  {
    return this.q;
  }
  
  public boolean o()
  {
    return this.r;
  }
  
  public String p()
  {
    return this.s;
  }
  
  public String q()
  {
    return this.t;
  }
  
  public SSLSocketFactory r()
  {
    try
    {
      SSLSocketFactory localSSLSocketFactory = this.u;
      return localSSLSocketFactory;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */