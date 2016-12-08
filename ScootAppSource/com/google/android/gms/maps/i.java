package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.CameraPosition;

public final class i
  implements Parcelable.Creator<GoogleMapOptions>
{
  static void a(GoogleMapOptions paramGoogleMapOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramGoogleMapOptions.a());
    c.a(paramParcel, 2, paramGoogleMapOptions.b());
    c.a(paramParcel, 3, paramGoogleMapOptions.c());
    c.a(paramParcel, 4, paramGoogleMapOptions.m());
    c.a(paramParcel, 5, paramGoogleMapOptions.n(), paramInt, false);
    c.a(paramParcel, 6, paramGoogleMapOptions.d());
    c.a(paramParcel, 7, paramGoogleMapOptions.e());
    c.a(paramParcel, 8, paramGoogleMapOptions.f());
    c.a(paramParcel, 9, paramGoogleMapOptions.g());
    c.a(paramParcel, 10, paramGoogleMapOptions.h());
    c.a(paramParcel, 11, paramGoogleMapOptions.i());
    c.a(paramParcel, 12, paramGoogleMapOptions.j());
    c.a(paramParcel, 14, paramGoogleMapOptions.k());
    c.a(paramParcel, 15, paramGoogleMapOptions.l());
    c.a(paramParcel, i);
  }
  
  public GoogleMapOptions a(Parcel paramParcel)
  {
    int k = a.b(paramParcel);
    int j = 0;
    byte b11 = -1;
    byte b10 = -1;
    int i = 0;
    CameraPosition localCameraPosition = null;
    byte b9 = -1;
    byte b8 = -1;
    byte b7 = -1;
    byte b6 = -1;
    byte b5 = -1;
    byte b4 = -1;
    byte b3 = -1;
    byte b2 = -1;
    byte b1 = -1;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      case 13: 
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        j = a.f(paramParcel, m);
        break;
      case 2: 
        b11 = a.d(paramParcel, m);
        break;
      case 3: 
        b10 = a.d(paramParcel, m);
        break;
      case 4: 
        i = a.f(paramParcel, m);
        break;
      case 5: 
        localCameraPosition = (CameraPosition)a.a(paramParcel, m, CameraPosition.CREATOR);
        break;
      case 6: 
        b9 = a.d(paramParcel, m);
        break;
      case 7: 
        b8 = a.d(paramParcel, m);
        break;
      case 8: 
        b7 = a.d(paramParcel, m);
        break;
      case 9: 
        b6 = a.d(paramParcel, m);
        break;
      case 10: 
        b5 = a.d(paramParcel, m);
        break;
      case 11: 
        b4 = a.d(paramParcel, m);
        break;
      case 12: 
        b3 = a.d(paramParcel, m);
        break;
      case 14: 
        b2 = a.d(paramParcel, m);
        break;
      case 15: 
        b1 = a.d(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new GoogleMapOptions(j, b11, b10, i, localCameraPosition, b9, b8, b7, b6, b5, b4, b3, b2, b1);
  }
  
  public GoogleMapOptions[] a(int paramInt)
  {
    return new GoogleMapOptions[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */