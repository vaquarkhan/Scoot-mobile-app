package com.mixpanel.android.mpmetrics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

@TargetApi(16)
final class at
  implements Application.ActivityLifecycleCallbacks
{
  private final af a;
  
  public at(af paramaf)
  {
    this.a = paramaf;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    this.a.c().a();
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    if (!paramActivity.isTaskRoot()) {
      return;
    }
    this.a.c().b(paramActivity);
    this.a.c().a(paramActivity);
  }
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */