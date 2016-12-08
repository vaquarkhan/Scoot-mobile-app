package com.parse;

import a.ac;
import a.l;
import a.o;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class LocationNotifier
{
  private static Location fakeLocation = null;
  
  static o<Location> getCurrentLocationAsync(Context paramContext, long paramLong, Criteria paramCriteria)
  {
    ac localac = new ac();
    l locall = new l();
    paramContext = (LocationManager)paramContext.getSystemService("location");
    LocationNotifier.1 local1 = new LocationNotifier.1(locall, localac, paramContext);
    locall.a(ParseExecutors.scheduled().schedule(new LocationNotifier.2(localac, paramContext, local1), paramLong, TimeUnit.MILLISECONDS));
    paramCriteria = paramContext.getBestProvider(paramCriteria, true);
    if (paramCriteria != null) {
      paramContext.requestLocationUpdates(paramCriteria, 0L, 0.0F, local1);
    }
    if (fakeLocation != null) {
      local1.onLocationChanged(fakeLocation);
    }
    return localac.a();
  }
  
  static void setFakeLocation(Location paramLocation)
  {
    fakeLocation = paramLocation;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\LocationNotifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */