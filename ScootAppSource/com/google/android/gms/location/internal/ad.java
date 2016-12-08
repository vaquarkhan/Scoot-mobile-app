package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ad
  implements Parcelable.Creator<LocationRequestUpdateData>
{
  static void a(LocationRequestUpdateData paramLocationRequestUpdateData, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramLocationRequestUpdateData.a);
    c.a(paramParcel, 2, paramLocationRequestUpdateData.b, paramInt, false);
    c.a(paramParcel, 3, paramLocationRequestUpdateData.b(), false);
    c.a(paramParcel, 4, paramLocationRequestUpdateData.d, paramInt, false);
    c.a(paramParcel, 5, paramLocationRequestUpdateData.c(), false);
    c.a(paramParcel, 6, paramLocationRequestUpdateData.d(), false);
    c.a(paramParcel, 1000, paramLocationRequestUpdateData.a());
    c.a(paramParcel, i);
  }
  
  public LocationRequestUpdateData a(Parcel paramParcel)
  {
    IBinder localIBinder1 = null;
    int k = a.b(paramParcel);
    int j = 0;
    int i = 1;
    IBinder localIBinder2 = null;
    PendingIntent localPendingIntent = null;
    IBinder localIBinder3 = null;
    LocationRequestInternal localLocationRequestInternal = null;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        i = a.f(paramParcel, m);
        break;
      case 2: 
        localLocationRequestInternal = (LocationRequestInternal)a.a(paramParcel, m, LocationRequestInternal.CREATOR);
        break;
      case 3: 
        localIBinder3 = a.l(paramParcel, m);
        break;
      case 4: 
        localPendingIntent = (PendingIntent)a.a(paramParcel, m, PendingIntent.CREATOR);
        break;
      case 5: 
        localIBinder2 = a.l(paramParcel, m);
        break;
      case 6: 
        localIBinder1 = a.l(paramParcel, m);
        break;
      case 1000: 
        j = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new LocationRequestUpdateData(j, i, localLocationRequestInternal, localIBinder3, localPendingIntent, localIBinder2, localIBinder1);
  }
  
  public LocationRequestUpdateData[] a(int paramInt)
  {
    return new LocationRequestUpdateData[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */