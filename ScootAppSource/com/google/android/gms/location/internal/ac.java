package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public final class ac
  implements Parcelable.Creator<LocationRequestInternal>
{
  static void a(LocationRequestInternal paramLocationRequestInternal, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramLocationRequestInternal.b, paramInt, false);
    c.a(paramParcel, 4, paramLocationRequestInternal.c);
    c.c(paramParcel, 5, paramLocationRequestInternal.d, false);
    c.a(paramParcel, 6, paramLocationRequestInternal.e, false);
    c.a(paramParcel, 7, paramLocationRequestInternal.f);
    c.a(paramParcel, 1000, paramLocationRequestInternal.a());
    c.a(paramParcel, i);
  }
  
  public LocationRequestInternal a(Parcel paramParcel)
  {
    String str = null;
    boolean bool1 = false;
    int j = a.b(paramParcel);
    boolean bool2 = true;
    Object localObject = LocationRequestInternal.a;
    LocationRequest localLocationRequest = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localLocationRequest = (LocationRequest)a.a(paramParcel, k, LocationRequest.CREATOR);
        break;
      case 4: 
        bool2 = a.c(paramParcel, k);
        break;
      case 5: 
        localObject = a.c(paramParcel, k, ClientIdentity.CREATOR);
        break;
      case 6: 
        str = a.k(paramParcel, k);
        break;
      case 7: 
        bool1 = a.c(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new LocationRequestInternal(i, localLocationRequest, bool2, (List)localObject, str, bool1);
  }
  
  public LocationRequestInternal[] a(int paramInt)
  {
    return new LocationRequestInternal[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */