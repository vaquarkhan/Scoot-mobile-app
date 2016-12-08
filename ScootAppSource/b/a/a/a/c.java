package b.a.a.a;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class c
  implements Application.ActivityLifecycleCallbacks
{
  c(b paramb, d paramd) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    this.a.a(paramActivity, paramBundle);
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    this.a.e(paramActivity);
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    this.a.c(paramActivity);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    this.a.b(paramActivity);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    this.a.b(paramActivity, paramBundle);
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    this.a.a(paramActivity);
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    this.a.d(paramActivity);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */