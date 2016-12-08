package com.scootapp.tv.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.scootapp.tv.a.z;
import com.scootapp.tv.services.OlaBookingTrackingService;

public class OlaTrackRideReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Intent localIntent = new Intent(paramContext.getApplicationContext(), OlaBookingTrackingService.class);
    localIntent.putExtra(z.s, paramIntent.getStringExtra(z.s));
    paramContext.startService(localIntent);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\receivers\OlaTrackRideReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */