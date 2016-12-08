package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.r;
import com.google.android.gms.location.s;
import com.google.android.gms.location.u;
import com.google.android.gms.location.v;

public class LocationRequestUpdateData
  extends AbstractSafeParcelable
{
  public static final ad CREATOR = new ad();
  int a;
  LocationRequestInternal b;
  u c;
  PendingIntent d;
  r e;
  k f;
  private final int g;
  
  LocationRequestUpdateData(int paramInt1, int paramInt2, LocationRequestInternal paramLocationRequestInternal, IBinder paramIBinder1, PendingIntent paramPendingIntent, IBinder paramIBinder2, IBinder paramIBinder3)
  {
    this.g = paramInt1;
    this.a = paramInt2;
    this.b = paramLocationRequestInternal;
    if (paramIBinder1 == null)
    {
      paramLocationRequestInternal = null;
      this.c = paramLocationRequestInternal;
      this.d = paramPendingIntent;
      if (paramIBinder2 != null) {
        break label75;
      }
      paramLocationRequestInternal = null;
      label47:
      this.e = paramLocationRequestInternal;
      if (paramIBinder3 != null) {
        break label84;
      }
    }
    label75:
    label84:
    for (paramLocationRequestInternal = (LocationRequestInternal)localObject;; paramLocationRequestInternal = l.a(paramIBinder3))
    {
      this.f = paramLocationRequestInternal;
      return;
      paramLocationRequestInternal = v.a(paramIBinder1);
      break;
      paramLocationRequestInternal = s.a(paramIBinder2);
      break label47;
    }
  }
  
  public static LocationRequestUpdateData a(LocationRequestInternal paramLocationRequestInternal, u paramu, k paramk)
  {
    IBinder localIBinder = paramu.asBinder();
    if (paramk != null) {}
    for (paramu = paramk.asBinder();; paramu = null) {
      return new LocationRequestUpdateData(1, 1, paramLocationRequestInternal, localIBinder, null, null, paramu);
    }
  }
  
  public static LocationRequestUpdateData a(r paramr, k paramk)
  {
    IBinder localIBinder = paramr.asBinder();
    if (paramk != null) {}
    for (paramr = paramk.asBinder();; paramr = null) {
      return new LocationRequestUpdateData(1, 2, null, null, null, localIBinder, paramr);
    }
  }
  
  public static LocationRequestUpdateData a(u paramu, k paramk)
  {
    IBinder localIBinder = paramu.asBinder();
    if (paramk != null) {}
    for (paramu = paramk.asBinder();; paramu = null) {
      return new LocationRequestUpdateData(1, 2, null, localIBinder, null, null, paramu);
    }
  }
  
  int a()
  {
    return this.g;
  }
  
  IBinder b()
  {
    if (this.c == null) {
      return null;
    }
    return this.c.asBinder();
  }
  
  IBinder c()
  {
    if (this.e == null) {
      return null;
    }
    return this.e.asBinder();
  }
  
  IBinder d()
  {
    if (this.f == null) {
      return null;
    }
    return this.f.asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ad.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\LocationRequestUpdateData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */