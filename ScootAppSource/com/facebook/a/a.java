package com.facebook.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.av;
import com.facebook.b.ag;
import com.facebook.b.ax;
import com.facebook.b.az;
import com.facebook.s;
import com.facebook.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{
  private static final String a = a.class.getCanonicalName();
  private static Map<h, q> d = new ConcurrentHashMap();
  private static ScheduledThreadPoolExecutor e;
  private static int f = j.a;
  private static boolean g;
  private static Context h;
  private static Object i = new Object();
  private static String j;
  private static boolean k;
  private final String b;
  private final h c;
  
  private a(Context paramContext, String arg2, AccessToken paramAccessToken)
  {
    az.a(paramContext, "context");
    this.b = com.facebook.b.as.c(paramContext);
    AccessToken localAccessToken = paramAccessToken;
    if (paramAccessToken == null) {
      localAccessToken = AccessToken.a();
    }
    if ((localAccessToken != null) && ((??? == null) || (???.equals(localAccessToken.h())))) {
      this.c = new h(localAccessToken);
    }
    synchronized (i)
    {
      if (h == null) {
        h = paramContext.getApplicationContext();
      }
      h();
      return;
      paramAccessToken = ???;
      if (??? == null) {
        paramAccessToken = com.facebook.b.as.a(paramContext);
      }
      this.c = new h(null, paramAccessToken);
    }
  }
  
  public static int a()
  {
    synchronized (i)
    {
      int m = f;
      return m;
    }
  }
  
  private static GraphRequest a(h paramh, q paramq, boolean paramBoolean, m paramm)
  {
    Object localObject = paramh.b();
    ax localax = com.facebook.b.as.a((String)localObject, false);
    GraphRequest localGraphRequest = GraphRequest.a(null, String.format("%s/activities", new Object[] { localObject }), null, null);
    Bundle localBundle = localGraphRequest.e();
    localObject = localBundle;
    if (localBundle == null) {
      localObject = new Bundle();
    }
    ((Bundle)localObject).putString("access_token", paramh.a());
    localGraphRequest.a((Bundle)localObject);
    if (localax == null) {
      return null;
    }
    int m = paramq.a(localGraphRequest, localax.a(), paramBoolean);
    if (m == 0) {
      return null;
    }
    paramm.a = (m + paramm.a);
    localGraphRequest.a(new g(paramh, localGraphRequest, paramq, paramm));
    return localGraphRequest;
  }
  
  public static a a(Context paramContext)
  {
    return new a(paramContext, null, null);
  }
  
  public static a a(Context paramContext, String paramString)
  {
    return new a(paramContext, paramString, null);
  }
  
  private static m a(k paramk, Set<h> paramSet)
  {
    m localm = new m(null);
    boolean bool = w.b(h);
    ArrayList localArrayList = new ArrayList();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      Object localObject = (h)paramSet.next();
      q localq = a((h)localObject);
      if (localq != null)
      {
        localObject = a((h)localObject, localq, bool, localm);
        if (localObject != null) {
          localArrayList.add(localObject);
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      ag.a(av.e, a, "Flushing %d events due to %s.", new Object[] { Integer.valueOf(localm.a), paramk.toString() });
      paramk = localArrayList.iterator();
      while (paramk.hasNext()) {
        ((GraphRequest)paramk.next()).i();
      }
      return localm;
    }
    return null;
  }
  
  private static q a(h paramh)
  {
    synchronized (i)
    {
      paramh = (q)d.get(paramh);
      return paramh;
    }
  }
  
  private void a(long paramLong, String paramString)
  {
    n.a(h, this.c, this, paramLong, paramString);
  }
  
  private static void a(Context paramContext, i parami, h paramh)
  {
    w.d().execute(new e(paramContext, paramh, parami));
    if ((!i.a(parami)) && (!k))
    {
      if (parami.a() == "fb_mobile_activate_app") {
        k = true;
      }
    }
    else {
      return;
    }
    ag.a(av.e, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
  }
  
  private void a(String paramString, Double paramDouble, Bundle paramBundle, boolean paramBoolean)
  {
    paramString = new i(this.b, paramString, paramDouble, paramBundle, paramBoolean);
    a(h, paramString, this.c);
  }
  
  private static q b(Context paramContext, h paramh)
  {
    Object localObject1 = (q)d.get(paramh);
    com.facebook.b.d locald = null;
    if (localObject1 == null) {
      locald = com.facebook.b.d.a(paramContext);
    }
    synchronized (i)
    {
      q localq = (q)d.get(paramh);
      localObject1 = localq;
      if (localq == null)
      {
        localObject1 = new q(locald, paramContext.getPackageName(), b(paramContext));
        d.put(paramh, localObject1);
      }
      return (q)localObject1;
    }
  }
  
  public static String b(Context paramContext)
  {
    if (j == null) {}
    synchronized (i)
    {
      if (j == null)
      {
        j = paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
        if (j == null)
        {
          j = "XZ" + UUID.randomUUID().toString();
          paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", j).apply();
        }
      }
      return j;
    }
  }
  
  private static void b(h paramh, GraphRequest paramGraphRequest, com.facebook.as paramas, q paramq, m paramm)
  {
    s locals = paramas.a();
    Object localObject = l.a;
    String str1;
    if (locals != null) {
      if (locals.b() == -1)
      {
        paramas = l.c;
        str1 = "Failed: No Connectivity";
      }
    }
    for (;;)
    {
      if (w.a(av.e)) {
        localObject = (String)paramGraphRequest.h();
      }
      String str2;
      try
      {
        localObject = new JSONArray((String)localObject).toString(2);
        ag.a(av.e, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] { paramGraphRequest.a().toString(), str1, localObject });
        if (locals != null)
        {
          bool = true;
          paramq.a(bool);
          if (paramas == l.c) {
            p.a(h, paramh, paramq);
          }
          if ((paramas != l.a) && (paramm.b != l.c)) {
            paramm.b = paramas;
          }
          return;
          str1 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] { paramas.toString(), locals.toString() });
          paramas = l.b;
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          str2 = "<Can't encode events for debug logging>";
          continue;
          boolean bool = false;
        }
      }
      str1 = "Success";
      paramas = str2;
    }
  }
  
  private static void b(k paramk)
  {
    w.d().execute(new f(paramk));
  }
  
  private static void c(k paramk)
  {
    HashSet localHashSet;
    synchronized (i)
    {
      if (g) {
        return;
      }
      g = true;
      localHashSet = new HashSet(d.keySet());
      k();
      ??? = null;
    }
    try
    {
      paramk = a(paramk, localHashSet);
      return;
    }
    catch (Exception paramk)
    {
      synchronized (i)
      {
        g = false;
        if (paramk != null)
        {
          ??? = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
          ((Intent)???).putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", paramk.a);
          ((Intent)???).putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", paramk.b);
          android.support.v4.b.q.a(h).a((Intent)???);
          return;
          paramk = finally;
          throw paramk;
          paramk = paramk;
          com.facebook.b.as.a(a, "Caught unexpected exception while flushing: ", paramk);
          paramk = (k)???;
        }
      }
    }
  }
  
  private static void h()
  {
    synchronized (i)
    {
      if (e != null) {
        return;
      }
      e = new ScheduledThreadPoolExecutor(1);
      ??? = new c();
      e.scheduleAtFixedRate((Runnable)???, 0L, 15L, TimeUnit.SECONDS);
      ??? = new d();
      e.scheduleAtFixedRate((Runnable)???, 0L, 86400L, TimeUnit.SECONDS);
      return;
    }
  }
  
  private static void i()
  {
    synchronized (i)
    {
      if ((a() != j.b) && (j() > 100)) {
        b(k.e);
      }
      return;
    }
  }
  
  private static int j()
  {
    synchronized (i)
    {
      Iterator localIterator = d.values().iterator();
      for (int m = 0; localIterator.hasNext(); m = ((q)localIterator.next()).a() + m) {}
      return m;
    }
  }
  
  private static int k()
  {
    p localp = p.a(h);
    Iterator localIterator = localp.a().iterator();
    Object localObject;
    for (int m = 0; localIterator.hasNext(); m = ((List)localObject).size() + m)
    {
      localObject = (h)localIterator.next();
      q localq = b(h, (h)localObject);
      localObject = localp.a((h)localObject);
      localq.a((List)localObject);
    }
    return m;
  }
  
  public void a(String paramString, double paramDouble, Bundle paramBundle)
  {
    a(paramString, Double.valueOf(paramDouble), paramBundle, false);
  }
  
  public void a(String paramString, Bundle paramBundle)
  {
    a(paramString, null, paramBundle, false);
  }
  
  public void a(String paramString, Double paramDouble, Bundle paramBundle)
  {
    a(paramString, paramDouble, paramBundle, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */