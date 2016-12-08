package com.mixpanel.android.mpmetrics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.util.Log;
import com.mixpanel.android.R.anim;
import com.mixpanel.android.b.a;
import java.util.concurrent.locks.ReentrantLock;

final class ao
  implements Runnable
{
  ao(al paramal, InAppNotification paramInAppNotification, Activity paramActivity) {}
  
  @TargetApi(16)
  public void run()
  {
    ReentrantLock localReentrantLock = UpdateDisplayState.a();
    localReentrantLock.lock();
    label461:
    for (;;)
    {
      int i;
      try
      {
        if (UpdateDisplayState.b())
        {
          if (ab.a) {
            Log.v("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
          }
          return;
        }
        InAppNotification localInAppNotification = this.a;
        if (localInAppNotification != null) {
          break label461;
        }
        localInAppNotification = this.c.b();
        if (localInAppNotification == null)
        {
          if (ab.a) {
            Log.v("MixpanelAPI.API", "No notification available, will not show.");
          }
          return;
        }
        localObject2 = localInAppNotification.d();
        if ((localObject2 == x.c) && (!k.b(this.b.getApplicationContext())))
        {
          if (ab.a) {
            Log.v("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
          }
          return;
        }
        i = UpdateDisplayState.a(new UpdateDisplayState.DisplayState.InAppNotificationState(localInAppNotification, a.a(this.b)), this.c.d(), af.e(this.c.a));
        if (i <= 0)
        {
          Log.e("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
          return;
        }
        switch (ai.a[localObject2.ordinal()])
        {
        case 1: 
          Log.e("MixpanelAPI.API", "Unrecognized notification type " + localObject2 + " can't be shown");
          if (!af.c(this.c.a).h()) {
            this.c.a(localInAppNotification);
          }
          return;
        }
      }
      finally
      {
        Object localObject3;
        localReentrantLock.unlock();
      }
      localObject3 = UpdateDisplayState.b(i);
      if (localObject3 == null)
      {
        if (ab.a) {
          Log.v("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
        }
        localReentrantLock.unlock();
        return;
      }
      Object localObject2 = new q();
      ((q)localObject2).a(this.c.a, i, (UpdateDisplayState.DisplayState.InAppNotificationState)((UpdateDisplayState)localObject3).c());
      ((q)localObject2).setRetainInstance(true);
      if (ab.a) {
        Log.v("MixpanelAPI.API", "Attempting to show mini notification.");
      }
      localObject3 = this.b.getFragmentManager().beginTransaction();
      ((FragmentTransaction)localObject3).setCustomAnimations(0, R.anim.com_mixpanel_android_slide_down);
      ((FragmentTransaction)localObject3).add(16908290, (Fragment)localObject2);
      ((FragmentTransaction)localObject3).commit();
      continue;
      if (ab.a) {
        Log.v("MixpanelAPI.API", "Sending intent for takeover notification.");
      }
      localObject2 = new Intent(this.b.getApplicationContext(), com.mixpanel.android.surveys.k.class);
      ((Intent)localObject2).addFlags(268435456);
      ((Intent)localObject2).addFlags(131072);
      ((Intent)localObject2).putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", i);
      this.b.startActivity((Intent)localObject2);
      continue;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */