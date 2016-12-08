package com.appsee;

import android.app.Activity;
import android.app.Instrumentation;

class ad
  extends Instrumentation
{
  ad(id paramid) {}
  
  public void callActivityOnDestroy(Activity paramActivity)
  {
    C(paramActivity);
    super.callActivityOnDestroy(paramActivity);
  }
  
  public void callActivityOnPause(Activity paramActivity)
  {
    ei.C(new ld(this));
    super.callActivityOnPause(paramActivity);
  }
  
  public void callActivityOnResume(Activity paramActivity)
  {
    ei.C(new qd(this, paramActivity));
    super.callActivityOnResume(paramActivity);
  }
  
  public void callActivityOnStop(Activity paramActivity)
  {
    C(paramActivity);
    super.callActivityOnStop(paramActivity);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */