package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class v
  implements Parcelable.Creator<NearbyAlertRequest>
{
  static void a(NearbyAlertRequest paramNearbyAlertRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramNearbyAlertRequest.b());
    c.a(paramParcel, 2, paramNearbyAlertRequest.c());
    c.a(paramParcel, 3, paramNearbyAlertRequest.d(), paramInt, false);
    c.a(paramParcel, 4, paramNearbyAlertRequest.e(), paramInt, false);
    c.a(paramParcel, 5, paramNearbyAlertRequest.f());
    c.a(paramParcel, 6, paramNearbyAlertRequest.g());
    c.a(paramParcel, 7, paramNearbyAlertRequest.h());
    c.a(paramParcel, 1000, paramNearbyAlertRequest.a());
    c.a(paramParcel, i);
  }
  
  public NearbyAlertRequest a(Parcel paramParcel)
  {
    NearbyAlertFilter localNearbyAlertFilter = null;
    int j = 0;
    int i1 = a.b(paramParcel);
    int k = -1;
    int i = 110;
    boolean bool = false;
    PlaceFilter localPlaceFilter = null;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < i1)
    {
      int i2 = a.a(paramParcel);
      switch (a.a(i2))
      {
      default: 
        a.b(paramParcel, i2);
        break;
      case 1: 
        m = a.f(paramParcel, i2);
        break;
      case 2: 
        k = a.f(paramParcel, i2);
        break;
      case 3: 
        localPlaceFilter = (PlaceFilter)a.a(paramParcel, i2, PlaceFilter.CREATOR);
        break;
      case 4: 
        localNearbyAlertFilter = (NearbyAlertFilter)a.a(paramParcel, i2, NearbyAlertFilter.CREATOR);
        break;
      case 5: 
        bool = a.c(paramParcel, i2);
        break;
      case 6: 
        j = a.f(paramParcel, i2);
        break;
      case 7: 
        i = a.f(paramParcel, i2);
        break;
      case 1000: 
        n = a.f(paramParcel, i2);
      }
    }
    if (paramParcel.dataPosition() != i1) {
      throw new b(37 + "Overread allowed size end=" + i1, paramParcel);
    }
    return new NearbyAlertRequest(n, m, k, localPlaceFilter, localNearbyAlertFilter, bool, j, i);
  }
  
  public NearbyAlertRequest[] a(int paramInt)
  {
    return new NearbyAlertRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */