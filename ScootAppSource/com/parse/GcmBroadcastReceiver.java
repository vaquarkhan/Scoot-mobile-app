package com.parse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class GcmBroadcastReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    ServiceUtils.runWakefulIntentInService(paramContext, paramIntent, PushService.class);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GcmBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */