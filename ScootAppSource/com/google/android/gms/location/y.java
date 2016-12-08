package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class y
  implements Parcelable.Creator<LocationSettingsRequest>
{
  static void a(LocationSettingsRequest paramLocationSettingsRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.c(paramParcel, 1, paramLocationSettingsRequest.b(), false);
    c.a(paramParcel, 2, paramLocationSettingsRequest.c());
    c.a(paramParcel, 3, paramLocationSettingsRequest.d());
    c.a(paramParcel, 1000, paramLocationSettingsRequest.a());
    c.a(paramParcel, paramInt);
  }
  
  public LocationSettingsRequest a(Parcel paramParcel)
  {
    boolean bool2 = false;
    int j = a.b(paramParcel);
    ArrayList localArrayList = null;
    boolean bool1 = false;
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
        localArrayList = a.c(paramParcel, k, LocationRequest.CREATOR);
        break;
      case 2: 
        bool1 = a.c(paramParcel, k);
        break;
      case 3: 
        bool2 = a.c(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new LocationSettingsRequest(i, localArrayList, bool1, bool2);
  }
  
  public LocationSettingsRequest[] a(int paramInt)
  {
    return new LocationSettingsRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */