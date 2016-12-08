package com.parse;

import a.ac;
import android.location.LocationListener;
import android.location.LocationManager;

final class LocationNotifier$2
  implements Runnable
{
  LocationNotifier$2(ac paramac, LocationManager paramLocationManager, LocationListener paramLocationListener) {}
  
  public void run()
  {
    this.val$tcs.a(new ParseException(124, "Location fetch timed out."));
    this.val$manager.removeUpdates(this.val$listener);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\LocationNotifier$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */