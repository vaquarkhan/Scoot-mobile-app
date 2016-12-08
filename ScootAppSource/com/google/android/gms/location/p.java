package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;

public final class p
  implements Parcelable.Creator<GeofencingRequest>
{
  static void a(GeofencingRequest paramGeofencingRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.c(paramParcel, 1, paramGeofencingRequest.b(), false);
    c.a(paramParcel, 2, paramGeofencingRequest.c());
    c.a(paramParcel, 1000, paramGeofencingRequest.a());
    c.a(paramParcel, paramInt);
  }
  
  public GeofencingRequest a(Parcel paramParcel)
  {
    int j = 0;
    int k = a.b(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        localArrayList = a.c(paramParcel, m, ParcelableGeofence.CREATOR);
        break;
      case 2: 
        j = a.f(paramParcel, m);
        break;
      case 1000: 
        i = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new GeofencingRequest(i, localArrayList, j);
  }
  
  public GeofencingRequest[] a(int paramInt)
  {
    return new GeofencingRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */