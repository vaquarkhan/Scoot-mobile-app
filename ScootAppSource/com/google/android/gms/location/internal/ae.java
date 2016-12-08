package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ae
  implements Parcelable.Creator<ParcelableGeofence>
{
  static void a(ParcelableGeofence paramParcelableGeofence, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramParcelableGeofence.f(), false);
    c.a(paramParcel, 2, paramParcelableGeofence.g());
    c.a(paramParcel, 3, paramParcelableGeofence.b());
    c.a(paramParcel, 4, paramParcelableGeofence.c());
    c.a(paramParcel, 5, paramParcelableGeofence.d());
    c.a(paramParcel, 6, paramParcelableGeofence.e());
    c.a(paramParcel, 7, paramParcelableGeofence.h());
    c.a(paramParcel, 1000, paramParcelableGeofence.a());
    c.a(paramParcel, 8, paramParcelableGeofence.i());
    c.a(paramParcel, 9, paramParcelableGeofence.j());
    c.a(paramParcel, paramInt);
  }
  
  public ParcelableGeofence a(Parcel paramParcel)
  {
    int n = a.b(paramParcel);
    int m = 0;
    String str = null;
    int k = 0;
    short s = 0;
    double d2 = 0.0D;
    double d1 = 0.0D;
    float f = 0.0F;
    long l = 0L;
    int j = 0;
    int i = -1;
    while (paramParcel.dataPosition() < n)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        str = a.k(paramParcel, i1);
        break;
      case 2: 
        l = a.h(paramParcel, i1);
        break;
      case 3: 
        s = a.e(paramParcel, i1);
        break;
      case 4: 
        d2 = a.j(paramParcel, i1);
        break;
      case 5: 
        d1 = a.j(paramParcel, i1);
        break;
      case 6: 
        f = a.i(paramParcel, i1);
        break;
      case 7: 
        k = a.f(paramParcel, i1);
        break;
      case 1000: 
        m = a.f(paramParcel, i1);
        break;
      case 8: 
        j = a.f(paramParcel, i1);
        break;
      case 9: 
        i = a.f(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != n) {
      throw new b(37 + "Overread allowed size end=" + n, paramParcel);
    }
    return new ParcelableGeofence(m, str, k, s, d2, d1, f, l, j, i);
  }
  
  public ParcelableGeofence[] a(int paramInt)
  {
    return new ParcelableGeofence[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */