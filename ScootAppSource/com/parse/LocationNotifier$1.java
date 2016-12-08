package com.parse;

import a.ac;
import a.l;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import java.util.concurrent.ScheduledFuture;

final class LocationNotifier$1
  implements LocationListener
{
  LocationNotifier$1(l paraml, ac paramac, LocationManager paramLocationManager) {}
  
  public void onLocationChanged(Location paramLocation)
  {
    if (paramLocation == null) {
      return;
    }
    ((ScheduledFuture)this.val$timeoutFuture.a()).cancel(true);
    this.val$tcs.a(paramLocation);
    this.val$manager.removeUpdates(this);
  }
  
  public void onProviderDisabled(String paramString) {}
  
  public void onProviderEnabled(String paramString) {}
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\LocationNotifier$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */