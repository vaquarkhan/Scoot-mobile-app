package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;

public abstract interface k
  extends IInterface
{
  public abstract void a(NearbyAlertRequest paramNearbyAlertRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, t paramt);
  
  public abstract void a(PlaceFilter paramPlaceFilter, PlacesParams paramPlacesParams, t paramt);
  
  public abstract void a(PlaceReport paramPlaceReport, PlacesParams paramPlacesParams, t paramt);
  
  public abstract void a(PlaceRequest paramPlaceRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, t paramt);
  
  public abstract void a(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, t paramt);
  
  public abstract void b(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, t paramt);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */