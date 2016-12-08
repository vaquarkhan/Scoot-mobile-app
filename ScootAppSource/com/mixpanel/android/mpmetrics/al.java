package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.os.Build.VERSION;
import android.util.Log;
import com.mixpanel.android.c.ae;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class al
  implements ak
{
  private al(af paramaf) {}
  
  private void a(InAppNotification paramInAppNotification, Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT < 16)
    {
      if (ab.a) {
        Log.v("MixpanelAPI.API", "Will not show notifications, os version is too low.");
      }
      return;
    }
    paramActivity.runOnUiThread(new ao(this, paramInAppNotification, paramActivity));
  }
  
  private void a(Survey paramSurvey, Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT < 16) {
      if (ab.a) {
        Log.v("MixpanelAPI.API", "Will not show survey, os version is too low.");
      }
    }
    do
    {
      return;
      if (k.b(paramActivity.getApplicationContext())) {
        break;
      }
    } while (!ab.a);
    Log.v("MixpanelAPI.API", "Will not show survey, application isn't configured appropriately.");
    return;
    ReentrantLock localReentrantLock = UpdateDisplayState.a();
    localReentrantLock.lock();
    try
    {
      boolean bool = UpdateDisplayState.b();
      if (bool) {
        return;
      }
      Survey localSurvey = paramSurvey;
      if (paramSurvey == null) {
        localSurvey = c();
      }
      if (localSurvey == null) {
        return;
      }
      paramSurvey = new UpdateDisplayState.DisplayState.SurveyState(localSurvey);
      int i = UpdateDisplayState.a(paramSurvey, d(), af.e(this.a));
      if (i <= 0)
      {
        Log.e("MixpanelAPI.API", "DisplayState Lock is in an inconsistent state! Please report this issue to Mixpanel");
        return;
      }
      paramSurvey = new an(this, paramSurvey, paramActivity, i);
      localReentrantLock.unlock();
      f.a(paramActivity, paramSurvey);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  private JSONObject b(String paramString, Object paramObject)
  {
    JSONObject localJSONObject = new JSONObject();
    String str = d();
    localJSONObject.put(paramString, paramObject);
    localJSONObject.put("$token", af.e(this.a));
    localJSONObject.put("$time", System.currentTimeMillis());
    if (str != null) {
      localJSONObject.put("$distinct_id", str);
    }
    return localJSONObject;
  }
  
  public void a()
  {
    JSONArray localJSONArray = af.b(this.a).c();
    if (localJSONArray != null) {
      af.d(this.a).b(localJSONArray);
    }
  }
  
  public void a(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT < 16) {
      return;
    }
    a(null, paramActivity);
  }
  
  public void a(InAppNotification paramInAppNotification)
  {
    if (paramInAppNotification == null) {
      return;
    }
    a("$campaign_delivery", paramInAppNotification);
    ak localak = this.a.c().b(d());
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    JSONObject localJSONObject = paramInAppNotification.a();
    try
    {
      localJSONObject.put("$time", localSimpleDateFormat.format(new Date()));
      localak.a("$campaigns", Integer.valueOf(paramInAppNotification.b()));
      localak.a("$notifications", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.API", "Exception trying to track an in-app notification seen", localJSONException);
      }
    }
  }
  
  public void a(String paramString)
  {
    synchronized (af.a(this.a))
    {
      if (af.a(this.a).c() == null) {
        return;
      }
      af.a(this.a).a(paramString);
      JSONArray localJSONArray = new JSONArray();
      localJSONArray.put(paramString);
      a("$android_devices", localJSONArray);
      return;
    }
  }
  
  public void a(String paramString, InAppNotification paramInAppNotification)
  {
    this.a.a(paramString, paramInAppNotification.a());
  }
  
  public void a(String paramString, Object paramObject)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put(paramString, paramObject);
      paramString = b("$append", localJSONObject);
      af.a(this.a, paramString);
      return;
    }
    catch (JSONException paramString)
    {
      Log.e("MixpanelAPI.API", "Exception appending a property", paramString);
    }
  }
  
  public void a(String paramString, JSONArray paramJSONArray)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put(paramString, paramJSONArray);
      paramString = b("$union", localJSONObject);
      af.a(this.a, paramString);
      return;
    }
    catch (JSONException paramString)
    {
      Log.e("MixpanelAPI.API", "Exception unioning a property");
    }
  }
  
  public void a(String paramString, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(paramString, paramJSONObject);
      paramString = b("$merge", localJSONObject);
      af.a(this.a, paramString);
      return;
    }
    catch (JSONException paramString)
    {
      Log.e("MixpanelAPI.API", "Exception merging a property", paramString);
    }
  }
  
  public InAppNotification b()
  {
    return af.b(this.a).b(af.c(this.a).h());
  }
  
  public ak b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return new am(this, paramString);
  }
  
  public void b(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT < 16) {
      return;
    }
    a(null, paramActivity);
  }
  
  public Survey c()
  {
    return af.b(this.a).a(af.c(this.a).h());
  }
  
  public String d()
  {
    return af.a(this.a).c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */