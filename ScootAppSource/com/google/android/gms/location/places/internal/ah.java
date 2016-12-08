package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ah
  implements Parcelable.Creator<PlacesParams>
{
  static void a(PlacesParams paramPlacesParams, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlacesParams.c, false);
    c.a(paramParcel, 2, paramPlacesParams.d, false);
    c.a(paramParcel, 3, paramPlacesParams.e, false);
    c.a(paramParcel, 4, paramPlacesParams.f, false);
    c.a(paramParcel, 6, paramPlacesParams.g);
    c.a(paramParcel, 7, paramPlacesParams.h);
    c.a(paramParcel, 1000, paramPlacesParams.b);
    c.a(paramParcel, paramInt);
  }
  
  public PlacesParams a(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int m = a.b(paramParcel);
    int j = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    int k = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        str4 = a.k(paramParcel, n);
        break;
      case 2: 
        str3 = a.k(paramParcel, n);
        break;
      case 3: 
        str2 = a.k(paramParcel, n);
        break;
      case 4: 
        str1 = a.k(paramParcel, n);
        break;
      case 6: 
        j = a.f(paramParcel, n);
        break;
      case 7: 
        i = a.f(paramParcel, n);
        break;
      case 1000: 
        k = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new b(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new PlacesParams(k, str4, str3, str2, str1, j, i);
  }
  
  public PlacesParams[] a(int paramInt)
  {
    return new PlacesParams[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */