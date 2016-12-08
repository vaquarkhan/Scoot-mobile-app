package com.c.a.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b.a.a.a.a.f.c;
import b.a.a.a.a.g.e;
import b.a.a.a.a.g.w;
import b.a.a.a.f;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@b.a.a.a.a.c.n(a={com.c.a.c.a.a.class})
public class h
  extends b.a.a.a.q<Void>
{
  private b.a.a.a.a.e.n A;
  private v B;
  private com.c.a.c.a.a C;
  private final long a;
  private final ConcurrentHashMap<String, String> b;
  private File c;
  private b.a.a.a.a.f.a d;
  private y k;
  private y l;
  private z m;
  private ac n;
  private String o = null;
  private String p = null;
  private String q = null;
  private String r;
  private String s;
  private String t;
  private String u;
  private String v;
  private String w;
  private float x;
  private boolean y;
  private final br z;
  
  public h()
  {
    this(1.0F, null, null, false);
  }
  
  h(float paramFloat, z paramz, br parambr, boolean paramBoolean)
  {
    this(paramFloat, paramz, parambr, paramBoolean, b.a.a.a.a.b.u.a("Crashlytics Exception Handler"));
  }
  
  h(float paramFloat, z paramz, br parambr, boolean paramBoolean, ExecutorService paramExecutorService)
  {
    this.x = paramFloat;
    if (paramz != null) {}
    for (;;)
    {
      this.m = paramz;
      this.z = parambr;
      this.y = paramBoolean;
      this.B = new v(paramExecutorService);
      this.b = new ConcurrentHashMap();
      this.a = System.currentTimeMillis();
      return;
      paramz = new t(null);
    }
  }
  
  static b.a.a.a.a.g.p B()
  {
    w localw = b.a.a.a.a.g.q.a().b();
    if (localw == null) {
      return null;
    }
    return localw.b;
  }
  
  private void J()
  {
    Object localObject = new i(this);
    Iterator localIterator = I().iterator();
    while (localIterator.hasNext()) {
      ((b.a.a.a.a.c.s)localObject).a((b.a.a.a.a.c.y)localIterator.next());
    }
    localObject = F().f().submit((Callable)localObject);
    f.h().a("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
    try
    {
      ((Future)localObject).get(4L, TimeUnit.SECONDS);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      f.h().e("CrashlyticsCore", "Crashlytics was interrupted during initialization.", localInterruptedException);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      f.h().e("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", localExecutionException);
      return;
    }
    catch (TimeoutException localTimeoutException)
    {
      f.h().e("CrashlyticsCore", "Crashlytics timed out during initialization.", localTimeoutException);
    }
  }
  
  private void K()
  {
    Boolean localBoolean = (Boolean)this.B.a(new s(this.l));
    if (!Boolean.TRUE.equals(localBoolean)) {
      return;
    }
    try
    {
      this.m.a();
      return;
    }
    catch (Exception localException)
    {
      f.h().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", localException);
    }
  }
  
  private void a(Context paramContext, String paramString)
  {
    if (this.z != null)
    {
      localObject = new ab(this.z);
      this.A = new b.a.a.a.a.e.b(f.h());
      this.A.a((b.a.a.a.a.e.p)localObject);
      this.s = paramContext.getPackageName();
      this.u = D().j();
      f.h().a("CrashlyticsCore", "Installer package name is: " + this.u);
      localObject = paramContext.getPackageManager().getPackageInfo(this.s, 0);
      this.v = Integer.toString(((PackageInfo)localObject).versionCode);
      if (((PackageInfo)localObject).versionName != null) {
        break label169;
      }
    }
    label169:
    for (Object localObject = "0.0";; localObject = ((PackageInfo)localObject).versionName)
    {
      this.w = ((String)localObject);
      this.r = b.a.a.a.a.b.m.m(paramContext);
      a(this.r, b(paramContext)).a(paramString, this.s);
      return;
      localObject = null;
      break;
    }
  }
  
  private void a(ca paramca)
  {
    try
    {
      f.h().a("CrashlyticsCore", "Installing exception handler...");
      this.n = new ac(Thread.getDefaultUncaughtExceptionHandler(), this.B, D(), paramca, this.d, this);
      this.n.b();
      Thread.setDefaultUncaughtExceptionHandler(this.n);
      f.h().a("CrashlyticsCore", "Successfully installed exception handler.");
      return;
    }
    catch (Exception paramca)
    {
      f.h().e("CrashlyticsCore", "There was a problem installing the exception handler.", paramca);
    }
  }
  
  static void a(String paramString1, String paramString2)
  {
    com.c.a.a.a locala = (com.c.a.a.a)f.a(com.c.a.a.a.class);
    if (locala != null) {
      locala.a(new b.a.a.a.a.b.q(paramString1, paramString2));
    }
  }
  
  private boolean a(Activity paramActivity, b.a.a.a.a.g.o paramo)
  {
    aw localaw = new aw(paramActivity, paramo);
    u localu = new u(null);
    paramActivity.runOnUiThread(new o(this, paramActivity, localu, localaw, paramo));
    f.h().a("CrashlyticsCore", "Waiting for user opt-in.");
    localu.b();
    return localu.a();
  }
  
  private static int b(float paramFloat, int paramInt)
  {
    return (int)(paramInt * paramFloat);
  }
  
  private static boolean b(Context paramContext)
  {
    return b.a.a.a.a.b.m.a(paramContext, "com.crashlytics.RequireBuildId", true);
  }
  
  public static h f()
  {
    return (h)f.a(h.class);
  }
  
  void A()
  {
    this.l.a();
  }
  
  a a(String paramString, boolean paramBoolean)
  {
    return new a(paramString, paramBoolean);
  }
  
  ar a(w paramw)
  {
    if (paramw != null) {
      return new as(this, m(), paramw.a.d, this.A);
    }
    return null;
  }
  
  public String a()
  {
    return "2.3.10.127";
  }
  
  @SuppressLint({"CommitPrefEdits"})
  void a(boolean paramBoolean)
  {
    b.a.a.a.a.f.d locald = new b.a.a.a.a.f.d(this);
    locald.a(locald.b().putBoolean("always_send_reports_opt_in", paramBoolean));
  }
  
  boolean a(Context paramContext)
  {
    if (this.y) {}
    do
    {
      return false;
      this.t = new b.a.a.a.a.b.k().a(paramContext);
    } while (this.t == null);
    f.h().c("CrashlyticsCore", "Initializing Crashlytics " + a());
    this.d = new b.a.a.a.a.f.b(this);
    this.l = new y("crash_marker", this.d);
    this.k = new y("initialization_marker", this.d);
    try
    {
      a(paramContext, this.t);
      bb localbb = new bb(paramContext, h());
      boolean bool = u();
      K();
      a(localbb);
      if ((bool) && (b.a.a.a.a.b.m.n(paramContext)))
      {
        J();
        return false;
      }
    }
    catch (aa paramContext)
    {
      throw new b.a.a.a.a.c.z(paramContext);
      return true;
    }
    catch (Exception paramContext)
    {
      f.h().e("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", paramContext);
    }
    return false;
  }
  
  public String b()
  {
    return "com.crashlytics.sdk.android.crashlytics-core";
  }
  
  protected Void d()
  {
    s();
    this.n.g();
    try
    {
      Object localObject1 = b.a.a.a.a.g.q.a().b();
      if (localObject1 == null)
      {
        f.h().d("CrashlyticsCore", "Received null settings, skipping initialization!");
        return null;
      }
      if (!((w)localObject1).d.c)
      {
        f.h().a("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
        return null;
      }
      this.n.c();
      localObject1 = a((w)localObject1);
      if (localObject1 == null)
      {
        f.h().d("CrashlyticsCore", "Unable to create a call to upload reports.");
        return null;
      }
      new bv((ar)localObject1).a(this.x);
      return null;
    }
    catch (Exception localException)
    {
      f.h().e("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", localException);
      return null;
    }
    finally
    {
      t();
    }
  }
  
  Map<String, String> g()
  {
    return Collections.unmodifiableMap(this.b);
  }
  
  String h()
  {
    return this.s;
  }
  
  protected boolean h_()
  {
    return a(super.E());
  }
  
  String i()
  {
    return this.t;
  }
  
  String j()
  {
    return this.u;
  }
  
  String k()
  {
    return this.w;
  }
  
  String l()
  {
    return this.v;
  }
  
  String m()
  {
    return b.a.a.a.a.b.m.b(E(), "com.crashlytics.ApiEndpoint");
  }
  
  String n()
  {
    return this.r;
  }
  
  ac o()
  {
    return this.n;
  }
  
  String p()
  {
    if (D().a()) {
      return this.o;
    }
    return null;
  }
  
  String q()
  {
    if (D().a()) {
      return this.p;
    }
    return null;
  }
  
  String r()
  {
    if (D().a()) {
      return this.q;
    }
    return null;
  }
  
  void s()
  {
    this.B.a(new j(this));
  }
  
  void t()
  {
    this.B.b(new k(this));
  }
  
  boolean u()
  {
    return ((Boolean)this.B.a(new l(this))).booleanValue();
  }
  
  com.c.a.c.a.a.d v()
  {
    com.c.a.c.a.a.d locald = null;
    if (this.C != null) {
      locald = this.C.a();
    }
    return locald;
  }
  
  File w()
  {
    if (this.c == null) {
      this.c = new b.a.a.a.a.f.b(this).a();
    }
    return this.c;
  }
  
  boolean x()
  {
    return ((Boolean)b.a.a.a.a.g.q.a().a(new m(this), Boolean.valueOf(false))).booleanValue();
  }
  
  boolean y()
  {
    return new b.a.a.a.a.f.d(this).a().getBoolean("always_send_reports_opt_in", false);
  }
  
  boolean z()
  {
    return ((Boolean)b.a.a.a.a.g.q.a().a(new n(this), Boolean.valueOf(true))).booleanValue();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */