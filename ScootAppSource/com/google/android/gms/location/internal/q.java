package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.b.dc;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.u;
import java.util.List;

public abstract interface q
  extends IInterface
{
  public abstract Location a();
  
  public abstract ActivityRecognitionResult a(String paramString);
  
  public abstract void a(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent);
  
  public abstract void a(PendingIntent paramPendingIntent);
  
  public abstract void a(PendingIntent paramPendingIntent, dc paramdc);
  
  public abstract void a(PendingIntent paramPendingIntent, n paramn, String paramString);
  
  public abstract void a(Location paramLocation);
  
  public abstract void a(Location paramLocation, int paramInt);
  
  public abstract void a(ActivityRecognitionRequest paramActivityRecognitionRequest, PendingIntent paramPendingIntent, dc paramdc);
  
  public abstract void a(GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent, n paramn);
  
  public abstract void a(GestureRequest paramGestureRequest, PendingIntent paramPendingIntent, dc paramdc);
  
  public abstract void a(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent);
  
  public abstract void a(LocationRequest paramLocationRequest, u paramu);
  
  public abstract void a(LocationRequest paramLocationRequest, u paramu, String paramString);
  
  public abstract void a(LocationSettingsRequest paramLocationSettingsRequest, t paramt, String paramString);
  
  public abstract void a(LocationRequestInternal paramLocationRequestInternal, PendingIntent paramPendingIntent);
  
  public abstract void a(LocationRequestInternal paramLocationRequestInternal, u paramu);
  
  public abstract void a(LocationRequestUpdateData paramLocationRequestUpdateData);
  
  public abstract void a(k paramk);
  
  public abstract void a(n paramn, String paramString);
  
  public abstract void a(u paramu);
  
  public abstract void a(List<ParcelableGeofence> paramList, PendingIntent paramPendingIntent, n paramn, String paramString);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract void a(String[] paramArrayOfString, n paramn, String paramString);
  
  public abstract Location b(String paramString);
  
  public abstract void b(PendingIntent paramPendingIntent);
  
  public abstract void b(PendingIntent paramPendingIntent, dc paramdc);
  
  public abstract LocationAvailability c(String paramString);
  
  public abstract void c(PendingIntent paramPendingIntent, dc paramdc);
  
  public abstract void d(PendingIntent paramPendingIntent, dc paramdc);
  
  public abstract void e(PendingIntent paramPendingIntent, dc paramdc);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */