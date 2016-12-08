package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.af;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.w;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.internal.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public final class r
  extends af
{
  private boolean a;
  private final Map<String, String> b = new HashMap();
  private final Map<String, String> c = new HashMap();
  private final com.google.android.gms.analytics.internal.h d;
  private final t e;
  private g f;
  private v g;
  
  r(ah paramah, String paramString, com.google.android.gms.analytics.internal.h paramh)
  {
    super(paramah);
    if (paramString != null) {
      this.b.put("&tid", paramString);
    }
    this.b.put("useSecure", "1");
    this.b.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
    if (paramh == null) {}
    for (this.d = new com.google.android.gms.analytics.internal.h("tracking", n());; this.d = paramh)
    {
      this.e = new t(this, paramah);
      return;
    }
  }
  
  static String a(Activity paramActivity)
  {
    b.a(paramActivity);
    paramActivity = paramActivity.getIntent();
    if (paramActivity == null) {}
    do
    {
      return null;
      paramActivity = paramActivity.getStringExtra("android.intent.extra.REFERRER_NAME");
    } while (TextUtils.isEmpty(paramActivity));
    return paramActivity;
  }
  
  private static void a(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    b.a(paramMap2);
    if (paramMap1 == null) {}
    for (;;)
    {
      return;
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap1.next();
        String str = b(localEntry);
        if (str != null) {
          paramMap2.put(str, (String)localEntry.getValue());
        }
      }
    }
  }
  
  private static boolean a(Map.Entry<String, String> paramEntry)
  {
    String str = (String)paramEntry.getKey();
    paramEntry = (String)paramEntry.getValue();
    return (str.startsWith("&")) && (str.length() >= 2);
  }
  
  private static String b(Map.Entry<String, String> paramEntry)
  {
    if (!a(paramEntry)) {
      return null;
    }
    return ((String)paramEntry.getKey()).substring(1);
  }
  
  private static void b(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    b.a(paramMap2);
    if (paramMap1 == null) {}
    for (;;)
    {
      return;
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap1.next();
        String str = b(localEntry);
        if ((str != null) && (!paramMap2.containsKey(str))) {
          paramMap2.put(str, (String)localEntry.getValue());
        }
      }
    }
  }
  
  private boolean c()
  {
    return this.f != null;
  }
  
  protected void a()
  {
    this.e.E();
    String str = v().c();
    if (str != null) {
      a("&an", str);
    }
    str = v().b();
    if (str != null) {
      a("&av", str);
    }
  }
  
  public void a(long paramLong)
  {
    this.e.a(1000L * paramLong);
  }
  
  public void a(Uri paramUri)
  {
    if ((paramUri == null) || (paramUri.isOpaque())) {}
    do
    {
      return;
      paramUri = paramUri.getQueryParameter("referrer");
    } while (TextUtils.isEmpty(paramUri));
    paramUri = String.valueOf(paramUri);
    if (paramUri.length() != 0) {}
    for (paramUri = "http://hostname/?".concat(paramUri);; paramUri = new String("http://hostname/?"))
    {
      paramUri = Uri.parse(paramUri);
      String str = paramUri.getQueryParameter("utm_id");
      if (str != null) {
        this.c.put("&ci", str);
      }
      str = paramUri.getQueryParameter("anid");
      if (str != null) {
        this.c.put("&anid", str);
      }
      str = paramUri.getQueryParameter("utm_campaign");
      if (str != null) {
        this.c.put("&cn", str);
      }
      str = paramUri.getQueryParameter("utm_content");
      if (str != null) {
        this.c.put("&cc", str);
      }
      str = paramUri.getQueryParameter("utm_medium");
      if (str != null) {
        this.c.put("&cm", str);
      }
      str = paramUri.getQueryParameter("utm_source");
      if (str != null) {
        this.c.put("&cs", str);
      }
      str = paramUri.getQueryParameter("utm_term");
      if (str != null) {
        this.c.put("&ck", str);
      }
      str = paramUri.getQueryParameter("dclid");
      if (str != null) {
        this.c.put("&dclid", str);
      }
      str = paramUri.getQueryParameter("gclid");
      if (str != null) {
        this.c.put("&gclid", str);
      }
      paramUri = paramUri.getQueryParameter("aclid");
      if (paramUri == null) {
        break;
      }
      this.c.put("&aclid", paramUri);
      return;
    }
  }
  
  void a(v paramv)
  {
    b("Loading Tracker config values");
    this.g = paramv;
    if (this.g.a())
    {
      paramv = this.g.b();
      a("&tid", paramv);
      a("trackingId loaded", paramv);
    }
    if (this.g.c())
    {
      paramv = Double.toString(this.g.d());
      a("&sf", paramv);
      a("Sample frequency loaded", paramv);
    }
    if (this.g.e())
    {
      int i = this.g.f();
      a(i);
      a("Session timeout loaded", Integer.valueOf(i));
    }
    boolean bool;
    if (this.g.g())
    {
      bool = this.g.h();
      b(bool);
      a("Auto activity tracking loaded", Boolean.valueOf(bool));
    }
    if (this.g.i())
    {
      bool = this.g.j();
      if (bool) {
        a("&aip", "1");
      }
      a("Anonymize ip loaded", Boolean.valueOf(bool));
    }
    a(this.g.k());
  }
  
  public void a(String paramString)
  {
    a("&cd", paramString);
  }
  
  public void a(String paramString1, String paramString2)
  {
    b.a(paramString1, "Key should be non-null");
    if (TextUtils.isEmpty(paramString1)) {
      return;
    }
    this.b.put(paramString1, paramString2);
  }
  
  public void a(Map<String, String> paramMap)
  {
    long l = n().a();
    if (s().f())
    {
      c("AppOptOut is set to true. Not sending Google Analytics hit");
      return;
    }
    boolean bool1 = s().e();
    HashMap localHashMap = new HashMap();
    a(this.b, localHashMap);
    a(paramMap, localHashMap);
    boolean bool2 = w.a((String)this.b.get("useSecure"), true);
    b(this.c, localHashMap);
    this.c.clear();
    paramMap = (String)localHashMap.get("t");
    if (TextUtils.isEmpty(paramMap))
    {
      p().a(localHashMap, "Missing hit type parameter");
      return;
    }
    String str = (String)localHashMap.get("tid");
    if (TextUtils.isEmpty(str))
    {
      p().a(localHashMap, "Missing tracking id parameter");
      return;
    }
    boolean bool3 = b();
    try
    {
      if (("screenview".equalsIgnoreCase(paramMap)) || ("pageview".equalsIgnoreCase(paramMap)) || ("appview".equalsIgnoreCase(paramMap)) || (TextUtils.isEmpty(paramMap)))
      {
        int j = Integer.parseInt((String)this.b.get("&a")) + 1;
        int i = j;
        if (j >= Integer.MAX_VALUE) {
          i = 1;
        }
        this.b.put("&a", Integer.toString(i));
      }
      r().a(new s(this, localHashMap, bool3, paramMap, l, bool1, bool2, str));
      return;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (c() == paramBoolean) {
          return;
        }
        if (paramBoolean)
        {
          Context localContext = o();
          this.f = new g(this, Thread.getDefaultUncaughtExceptionHandler(), localContext);
          Thread.setDefaultUncaughtExceptionHandler(this.f);
          b("Uncaught exceptions will be reported to Google Analytics");
          return;
        }
      }
      finally {}
      Thread.setDefaultUncaughtExceptionHandler(this.f.b());
      b("Uncaught exceptions will not be reported to Google Analytics");
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.e.a(paramBoolean);
  }
  
  boolean b()
  {
    return this.a;
  }
  
  public void c(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */