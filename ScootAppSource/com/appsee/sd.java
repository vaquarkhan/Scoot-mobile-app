package com.appsee;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

@TargetApi(14)
class sd
  implements Application.ActivityLifecycleCallbacks
{
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    ei.C(new ed(this, paramActivity));
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    ei.C(new cd(this));
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    ei.C(new td(this, paramActivity));
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity)
  {
    ei.C(new gd(this, paramActivity));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\sd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */