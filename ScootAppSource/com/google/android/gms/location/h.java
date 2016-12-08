package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class h
  implements Parcelable.Creator<LocationRequest>
{
  static void a(LocationRequest paramLocationRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramLocationRequest.a);
    c.a(paramParcel, 2, paramLocationRequest.b);
    c.a(paramParcel, 3, paramLocationRequest.c);
    c.a(paramParcel, 4, paramLocationRequest.d);
    c.a(paramParcel, 5, paramLocationRequest.e);
    c.a(paramParcel, 6, paramLocationRequest.f);
    c.a(paramParcel, 7, paramLocationRequest.g);
    c.a(paramParcel, 1000, paramLocationRequest.a());
    c.a(paramParcel, 8, paramLocationRequest.h);
    c.a(paramParcel, paramInt);
  }
  
  public LocationRequest a(Parcel paramParcel)
  {
    int m = a.b(paramParcel);
    int k = 0;
    int j = 102;
    long l4 = 3600000L;
    long l3 = 600000L;
    boolean bool = false;
    long l2 = Long.MAX_VALUE;
    int i = Integer.MAX_VALUE;
    float f = 0.0F;
    long l1 = 0L;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        j = a.f(paramParcel, n);
        break;
      case 2: 
        l4 = a.h(paramParcel, n);
        break;
      case 3: 
        l3 = a.h(paramParcel, n);
        break;
      case 4: 
        bool = a.c(paramParcel, n);
        break;
      case 5: 
        l2 = a.h(paramParcel, n);
        break;
      case 6: 
        i = a.f(paramParcel, n);
        break;
      case 7: 
        f = a.i(paramParcel, n);
        break;
      case 1000: 
        k = a.f(paramParcel, n);
        break;
      case 8: 
        l1 = a.h(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new b(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new LocationRequest(k, j, l4, l3, bool, l2, i, f, l1);
  }
  
  public LocationRequest[] a(int paramInt)
  {
    return new LocationRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */