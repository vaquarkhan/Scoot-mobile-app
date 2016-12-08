package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.firebase.a;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(14)
public final class b
  implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2
{
  private static final b a = new b();
  private final AtomicBoolean b = new AtomicBoolean();
  private boolean c;
  
  public static void a(Application paramApplication)
  {
    paramApplication.registerActivityLifecycleCallbacks(a);
    paramApplication.registerComponentCallbacks(a);
    a.c = true;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    if (this.b.compareAndSet(true, false)) {
      a.a(false);
    }
  }
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    if (this.b.compareAndSet(true, false)) {
      a.a(false);
    }
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onLowMemory() {}
  
  public void onTrimMemory(int paramInt)
  {
    if ((paramInt == 20) && (this.b.compareAndSet(false, true))) {
      a.a(true);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */