package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class f
  implements Parcelable.Creator<LocationAvailability>
{
  static void a(LocationAvailability paramLocationAvailability, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramLocationAvailability.a);
    c.a(paramParcel, 2, paramLocationAvailability.b);
    c.a(paramParcel, 3, paramLocationAvailability.c);
    c.a(paramParcel, 4, paramLocationAvailability.d);
    c.a(paramParcel, 1000, paramLocationAvailability.b());
    c.a(paramParcel, paramInt);
  }
  
  public LocationAvailability a(Parcel paramParcel)
  {
    int i = 1;
    int n = a.b(paramParcel);
    int m = 0;
    int k = 1000;
    long l = 0L;
    int j = 1;
    while (paramParcel.dataPosition() < n)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        j = a.f(paramParcel, i1);
        break;
      case 2: 
        i = a.f(paramParcel, i1);
        break;
      case 3: 
        l = a.h(paramParcel, i1);
        break;
      case 4: 
        k = a.f(paramParcel, i1);
        break;
      case 1000: 
        m = a.f(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != n) {
      throw new b(37 + "Overread allowed size end=" + n, paramParcel);
    }
    return new LocationAvailability(m, k, j, i, l);
  }
  
  public LocationAvailability[] a(int paramInt)
  {
    return new LocationAvailability[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */