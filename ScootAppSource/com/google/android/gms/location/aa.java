package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class aa
  implements Parcelable.Creator<LocationSettingsStates>
{
  static void a(LocationSettingsStates paramLocationSettingsStates, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramLocationSettingsStates.b());
    c.a(paramParcel, 2, paramLocationSettingsStates.d());
    c.a(paramParcel, 3, paramLocationSettingsStates.f());
    c.a(paramParcel, 4, paramLocationSettingsStates.c());
    c.a(paramParcel, 5, paramLocationSettingsStates.e());
    c.a(paramParcel, 6, paramLocationSettingsStates.g());
    c.a(paramParcel, 1000, paramLocationSettingsStates.a());
    c.a(paramParcel, paramInt);
  }
  
  public LocationSettingsStates a(Parcel paramParcel)
  {
    boolean bool1 = false;
    int j = a.b(paramParcel);
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
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
        bool6 = a.c(paramParcel, k);
        break;
      case 2: 
        bool5 = a.c(paramParcel, k);
        break;
      case 3: 
        bool4 = a.c(paramParcel, k);
        break;
      case 4: 
        bool3 = a.c(paramParcel, k);
        break;
      case 5: 
        bool2 = a.c(paramParcel, k);
        break;
      case 6: 
        bool1 = a.c(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new LocationSettingsStates(i, bool6, bool5, bool4, bool3, bool2, bool1);
  }
  
  public LocationSettingsStates[] a(int paramInt)
  {
    return new LocationSettingsStates[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */