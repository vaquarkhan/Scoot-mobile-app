package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class z
  implements Parcelable.Creator<LocationSettingsResult>
{
  static void a(LocationSettingsResult paramLocationSettingsResult, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramLocationSettingsResult.b(), paramInt, false);
    c.a(paramParcel, 2, paramLocationSettingsResult.c(), paramInt, false);
    c.a(paramParcel, 1000, paramLocationSettingsResult.a());
    c.a(paramParcel, i);
  }
  
  public LocationSettingsResult a(Parcel paramParcel)
  {
    LocationSettingsStates localLocationSettingsStates = null;
    int j = a.b(paramParcel);
    int i = 0;
    Status localStatus = null;
    if (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
      }
      for (;;)
      {
        break;
        localStatus = (Status)a.a(paramParcel, k, Status.CREATOR);
        continue;
        localLocationSettingsStates = (LocationSettingsStates)a.a(paramParcel, k, LocationSettingsStates.CREATOR);
        continue;
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new LocationSettingsResult(i, localStatus, localLocationSettingsStates);
  }
  
  public LocationSettingsResult[] a(int paramInt)
  {
    return new LocationSettingsResult[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */