package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

public final class x
  implements Parcelable.Creator<LocationResult>
{
  static void a(LocationResult paramLocationResult, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.c(paramParcel, 1, paramLocationResult.a(), false);
    c.a(paramParcel, 1000, paramLocationResult.b());
    c.a(paramParcel, paramInt);
  }
  
  public LocationResult a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    Object localObject = LocationResult.a;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localObject = a.c(paramParcel, k, Location.CREATOR);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new LocationResult(i, (List)localObject);
  }
  
  public LocationResult[] a(int paramInt)
  {
    return new LocationResult[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */