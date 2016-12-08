package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.appsflyer.a.a;
import com.appsflyer.a.b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;

final class i
  implements Runnable
{
  Map<String, String> a;
  boolean b;
  private String c;
  private WeakReference<Context> d = null;
  
  private i(String paramString, Map<String, String> paramMap, Context paramContext, boolean paramBoolean)
  {
    this.c = paramString;
    this.a = paramMap;
    this.d = new WeakReference(paramContext);
    this.b = paramBoolean;
  }
  
  public void run()
  {
    boolean bool2 = true;
    String str = c.b(this.a);
    try
    {
      localObject1 = (Context)this.d.get();
      if (localObject1 == null) {
        break label463;
      }
      localObject2 = j.a().a((Context)localObject1);
      if ((localObject2 != null) && (((String)localObject2).length() > 0) && (this.a.get("referrer") == null)) {
        this.a.put("referrer", localObject2);
      }
      boolean bool3 = "true".equals(((Context)localObject1).getSharedPreferences("appsflyer-data", 0).getString("sentSuccessfully", ""));
      localObject2 = (String)this.a.get("eventName");
      localObject3 = this.a;
      if (localObject2 != null) {
        break label469;
      }
      bool1 = true;
      ((Map)localObject3).put("counter", Integer.toString(c.a((Context)localObject1, "appsFlyerCount", bool1)));
      localObject3 = this.a;
      if (localObject2 == null) {
        break label474;
      }
      bool1 = true;
      label165:
      ((Map)localObject3).put("iaecounter", Integer.toString(c.a((Context)localObject1, "appsFlyerInAppEventCount", bool1)));
      this.a.put("timepassedsincelastlaunch", Long.toString(c.a((Context)localObject1, true)));
      bool1 = bool3;
    }
    catch (Throwable localThrowable)
    {
      Object localObject1;
      Object localObject3;
      Log.e(str, localThrowable.getMessage(), localThrowable);
      return;
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        label434:
        Object localObject2 = null;
        continue;
        label463:
        bool1 = false;
      }
    }
    localObject1 = this.a;
    if (!bool1) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      ((Map)localObject1).put("isFirstCall", Boolean.toString(bool1));
      localObject2 = (String)this.a.get("appsflyerKey");
      if ((localObject2 == null) || (((String)localObject2).length() == 0))
      {
        Log.d(str, "Not sending data yet, waiting for dev key");
        return;
      }
      localObject1 = new p().a(this.a);
      this.a.put("af_v", localObject1);
      localObject1 = c.a(this.a);
      for (;;)
      {
        try
        {
          localObject3 = this.c;
          WeakReference localWeakReference = this.d;
          if ((!this.b) || (c.b() == null)) {
            break label434;
          }
          bool1 = bool2;
          c.a((String)localObject3, (String)localObject1, (String)localObject2, localWeakReference, null, str, bool1);
          return;
        }
        catch (IOException localIOException2)
        {
          localObject2 = localObject1;
          localObject1 = localIOException2;
        }
        if ((localObject2 == null) || (this.d == null) || (this.c.contains("&isCachedRequest=true&timeincache="))) {
          break;
        }
        Log.e(str, ((IOException)localObject1).getMessage(), (Throwable)localObject1);
        a.a().a(new b(this.c, (String)localObject2, "3.0"), (Context)this.d.get());
        return;
        bool1 = false;
      }
      return;
      label469:
      bool1 = false;
      break;
      label474:
      bool1 = false;
      break label165;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsflyer\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */