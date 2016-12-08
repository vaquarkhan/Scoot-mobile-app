package com.mixpanel.android.c;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import com.mixpanel.android.mpmetrics.ab;
import java.util.Locale;

final class aj
  implements Application.ActivityLifecycleCallbacks, w
{
  private final v b = new v(this);
  private final ai c;
  
  public aj(af paramaf)
  {
    this.c = new ai(paramaf);
  }
  
  private void a(Activity paramActivity)
  {
    if ((b()) && (!af.c(this.a).f())) {
      this.c.a();
    }
    while (af.c(this.a).e()) {
      return;
    }
    paramActivity = (SensorManager)paramActivity.getSystemService("sensor");
    Sensor localSensor = paramActivity.getDefaultSensor(1);
    paramActivity.registerListener(this.b, localSensor, 3);
  }
  
  private void b(Activity paramActivity)
  {
    if ((b()) && (!af.c(this.a).f())) {
      this.c.b();
    }
    while (af.c(this.a).e()) {
      return;
    }
    ((SensorManager)paramActivity.getSystemService("sensor")).unregisterListener(this.b);
  }
  
  private boolean b()
  {
    if (!Build.HARDWARE.equals("goldfish")) {}
    while ((!Build.BRAND.startsWith("generic")) || (!Build.DEVICE.startsWith("generic")) || (!Build.PRODUCT.contains("sdk")) || (!Build.MODEL.toLowerCase(Locale.US).contains("sdk"))) {
      return false;
    }
    return true;
  }
  
  public void a()
  {
    Message localMessage = af.a(this.a).obtainMessage(1);
    af.a(this.a).sendMessage(localMessage);
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity)
  {
    af.b(this.a).b(paramActivity);
    if (af.b(this.a).b()) {
      b(paramActivity);
    }
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    a(paramActivity);
    af.b(this.a).a(paramActivity);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */