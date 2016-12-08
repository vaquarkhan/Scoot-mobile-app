package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class aa
  implements Parcelable.Creator<PlaceRequest>
{
  static void a(PlaceRequest paramPlaceRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 2, paramPlaceRequest.a(), paramInt, false);
    c.a(paramParcel, 3, paramPlaceRequest.b());
    c.a(paramParcel, 4, paramPlaceRequest.c());
    c.a(paramParcel, 5, paramPlaceRequest.d());
    c.a(paramParcel, 1000, paramPlaceRequest.f);
    c.a(paramParcel, i);
  }
  
  public PlaceRequest a(Parcel paramParcel)
  {
    int k = a.b(paramParcel);
    int j = 0;
    PlaceFilter localPlaceFilter = null;
    long l2 = PlaceRequest.e;
    int i = 102;
    long l1 = Long.MAX_VALUE;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 2: 
        localPlaceFilter = (PlaceFilter)a.a(paramParcel, m, PlaceFilter.CREATOR);
        break;
      case 3: 
        l2 = a.h(paramParcel, m);
        break;
      case 4: 
        i = a.f(paramParcel, m);
        break;
      case 5: 
        l1 = a.h(paramParcel, m);
        break;
      case 1000: 
        j = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new PlaceRequest(j, localPlaceFilter, l2, i, l1);
  }
  
  public PlaceRequest[] a(int paramInt)
  {
    return new PlaceRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */