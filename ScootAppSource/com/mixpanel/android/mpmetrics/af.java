package com.mixpanel.android.mpmetrics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import com.mixpanel.android.c.ac;
import com.mixpanel.android.c.ae;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class af
{
  private static final Map<String, Map<Context, af>> m = new HashMap();
  private static final ba n = new ba();
  private static final bl o = new bl();
  private static Future<SharedPreferences> p;
  private final Context a;
  private final a b;
  private final ab c;
  private final String d;
  private final al e;
  private final ae f;
  private final av g;
  private final as h;
  private final ac i;
  private final o j;
  private final Map<String, String> k;
  private final Map<String, Long> l;
  
  af(Context paramContext, Future<SharedPreferences> paramFuture, String paramString)
  {
    this.a = paramContext;
    this.d = paramString;
    this.l = new HashMap();
    this.e = new al(this, null);
    this.c = g();
    HashMap localHashMap = new HashMap();
    localHashMap.put("$android_lib_version", "4.6.4");
    localHashMap.put("$android_os", "Android");
    Object localObject;
    if (Build.VERSION.RELEASE == null) {
      localObject = "UNKNOWN";
    }
    for (;;)
    {
      localHashMap.put("$android_os_version", localObject);
      if (Build.MANUFACTURER == null)
      {
        localObject = "UNKNOWN";
        label111:
        localHashMap.put("$android_manufacturer", localObject);
        if (Build.BRAND != null) {
          break label376;
        }
        localObject = "UNKNOWN";
        label133:
        localHashMap.put("$android_brand", localObject);
        if (Build.MODEL != null) {
          break label384;
        }
        localObject = "UNKNOWN";
        localHashMap.put("$android_model", localObject);
      }
      try
      {
        localObject = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
        localHashMap.put("$android_app_version", ((PackageInfo)localObject).versionName);
        localHashMap.put("$android_app_version_code", Integer.toString(((PackageInfo)localObject).versionCode));
        this.k = Collections.unmodifiableMap(localHashMap);
        this.f = b(paramContext, paramString);
        this.i = i();
        this.g = a(paramContext, paramFuture, paramString);
        this.h = h();
        this.j = a(paramString, this.h, this.f);
        paramFuture = this.g.c();
        paramContext = paramFuture;
        if (paramFuture == null) {
          paramContext = this.g.b();
        }
        this.j.a(paramContext);
        this.b = f();
        this.b.a(this.j);
        e();
        if (j()) {
          a("$app_open", null);
        }
        this.f.a();
        return;
        localObject = Build.VERSION.RELEASE;
        continue;
        localObject = Build.MANUFACTURER;
        break label111;
        label376:
        localObject = Build.BRAND;
        break label133;
        label384:
        localObject = Build.MODEL;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          Log.e("MixpanelAPI.API", "Exception getting app version name", localNameNotFoundException);
        }
      }
    }
  }
  
  public static af a(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramContext == null)) {
      return null;
    }
    for (;;)
    {
      synchronized (m)
      {
        Context localContext = paramContext.getApplicationContext();
        if (p == null) {
          p = n.a(paramContext, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
        }
        Object localObject = (Map)m.get(paramString);
        if (localObject == null)
        {
          localObject = new HashMap();
          m.put(paramString, localObject);
          af localaf2 = (af)((Map)localObject).get(localContext);
          af localaf1 = localaf2;
          if (localaf2 == null)
          {
            localaf1 = localaf2;
            if (k.a(localContext))
            {
              localaf1 = new af(localContext, p, paramString);
              a(paramContext, localaf1);
              ((Map)localObject).put(localContext, localaf1);
            }
          }
          a(paramContext);
          return localaf1;
        }
      }
    }
  }
  
  private static void a(Context paramContext)
  {
    if ((paramContext instanceof Activity)) {
      try
      {
        Class localClass = Class.forName("a.e");
        Intent localIntent = ((Activity)paramContext).getIntent();
        localClass.getMethod("getTargetUrlFromInboundIntent", new Class[] { Context.class, Intent.class }).invoke(null, new Object[] { paramContext, localIntent });
        return;
      }
      catch (InvocationTargetException paramContext)
      {
        Log.d("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", paramContext);
        return;
      }
      catch (ClassNotFoundException paramContext)
      {
        Log.d("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + paramContext.getMessage());
        return;
      }
      catch (NoSuchMethodException paramContext)
      {
        Log.d("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + paramContext.getMessage());
        return;
      }
      catch (IllegalAccessException paramContext)
      {
        Log.d("MixpanelAPI.AL", "Unable to detect inbound App Links: " + paramContext.getMessage());
        return;
      }
    }
    Log.d("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
  }
  
  private static void a(Context paramContext, af paramaf)
  {
    try
    {
      Class localClass = Class.forName("android.support.v4.b.q");
      Method localMethod = localClass.getMethod("getInstance", new Class[] { Context.class });
      localClass.getMethod("registerReceiver", new Class[] { BroadcastReceiver.class, IntentFilter.class }).invoke(localMethod.invoke(null, new Object[] { paramContext }), new Object[] { new ah(paramaf), new IntentFilter("com.parse.bolts.measurement_event") });
      return;
    }
    catch (InvocationTargetException paramContext)
    {
      Log.d("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", paramContext);
      return;
    }
    catch (ClassNotFoundException paramContext)
    {
      Log.d("MixpanelAPI.AL", "To enable App Links tracking android.support.v4 must be installed: " + paramContext.getMessage());
      return;
    }
    catch (NoSuchMethodException paramContext)
    {
      Log.d("MixpanelAPI.AL", "To enable App Links tracking android.support.v4 must be installed: " + paramContext.getMessage());
      return;
    }
    catch (IllegalAccessException paramContext)
    {
      Log.d("MixpanelAPI.AL", "App Links tracking will not be enabled due to this exception: " + paramContext.getMessage());
    }
  }
  
  static void a(aj paramaj)
  {
    synchronized (m)
    {
      Iterator localIterator1 = m.values().iterator();
      while (localIterator1.hasNext())
      {
        Iterator localIterator2 = ((Map)localIterator1.next()).values().iterator();
        if (localIterator2.hasNext()) {
          paramaj.a((af)localIterator2.next());
        }
      }
    }
  }
  
  private void a(JSONArray paramJSONArray)
  {
    int i1 = 0;
    for (;;)
    {
      if (i1 < paramJSONArray.length()) {
        try
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i1);
          this.b.a(localJSONObject);
          i1 += 1;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            Log.e("MixpanelAPI.API", "Malformed people record stored pending identity, will not send it.", localJSONException);
          }
        }
      }
    }
  }
  
  private void a(JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("$distinct_id"))
    {
      this.b.a(paramJSONObject);
      return;
    }
    this.g.b(paramJSONObject);
  }
  
  av a(Context paramContext, Future<SharedPreferences> paramFuture, String paramString)
  {
    ag localag = new ag(this);
    paramString = "com.mixpanel.android.mpmetrics.MixpanelAPI_" + paramString;
    return new av(paramFuture, n.a(paramContext, paramString, localag));
  }
  
  o a(String paramString, p paramp, ae paramae)
  {
    return new o(paramString, paramp, paramae);
  }
  
  public void a()
  {
    this.b.b();
  }
  
  public void a(bd parambd)
  {
    this.g.a(parambd);
  }
  
  public void a(String paramString, JSONObject paramJSONObject)
  {
    do
    {
      Object localObject2;
      Object localObject3;
      synchronized (this.l)
      {
        localObject2 = (Long)this.l.get(paramString);
        this.l.remove(paramString);
        try
        {
          ??? = new JSONObject();
          localObject3 = this.g.a().entrySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            Map.Entry localEntry = (Map.Entry)((Iterator)localObject3).next();
            ((JSONObject)???).put((String)localEntry.getKey(), (String)localEntry.getValue());
            continue;
            paramString = finally;
          }
        }
        catch (JSONException paramJSONObject)
        {
          Log.e("MixpanelAPI.API", "Exception tracking event " + paramString, paramJSONObject);
          return;
        }
      }
      this.g.a((JSONObject)???);
      double d1 = System.currentTimeMillis() / 1000.0D;
      ((JSONObject)???).put("time", d1);
      ((JSONObject)???).put("distinct_id", b());
      if (localObject2 != null) {
        ((JSONObject)???).put("$duration", d1 - ((Long)localObject2).longValue() / 1000.0D);
      }
      if (paramJSONObject != null)
      {
        localObject2 = paramJSONObject.keys();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          ((JSONObject)???).put((String)localObject3, paramJSONObject.get((String)localObject3));
        }
      }
      paramJSONObject = new b(paramString, (JSONObject)???, this.d);
      this.b.a(paramJSONObject);
    } while (this.i == null);
    this.i.a(paramString);
  }
  
  ae b(Context paramContext, String paramString)
  {
    if (Build.VERSION.SDK_INT < 16)
    {
      Log.i("MixpanelAPI.API", "Web Configuration, A/B Testing, and Dynamic Tweaks are not supported on this Android OS Version");
      return new aq(this, o);
    }
    return new com.mixpanel.android.c.af(this.a, this.d, this, o);
  }
  
  public String b()
  {
    return this.g.b();
  }
  
  public ak c()
  {
    return this.e;
  }
  
  public Map<String, String> d()
  {
    return this.k;
  }
  
  @TargetApi(16)
  void e()
  {
    if ((Build.VERSION.SDK_INT >= 16) && (this.c.o()))
    {
      if ((this.a.getApplicationContext() instanceof Application)) {
        ((Application)this.a.getApplicationContext()).registerActivityLifecycleCallbacks(new at(this));
      }
    }
    else {
      return;
    }
    Log.i("MixpanelAPI.API", "Context is not an Application, Mixpanel will not automatically show surveys, in-app notifications, or A/B test experiments.");
  }
  
  a f()
  {
    return a.a(this.a);
  }
  
  ab g()
  {
    return ab.a(this.a);
  }
  
  as h()
  {
    if (Build.VERSION.SDK_INT < 16)
    {
      Log.i("MixpanelAPI.API", "Surveys and Notifications are not supported on this Android OS Version");
      return new ar(this, null);
    }
    return new ap(this, null);
  }
  
  ac i()
  {
    if ((this.f instanceof com.mixpanel.android.c.af)) {
      return (ac)this.f;
    }
    return null;
  }
  
  boolean j()
  {
    return !this.c.g();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */