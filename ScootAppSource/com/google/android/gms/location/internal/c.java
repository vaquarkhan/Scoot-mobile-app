package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class c
  implements Parcelable.Creator<ClientIdentity>
{
  static void a(ClientIdentity paramClientIdentity, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.c.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 1, paramClientIdentity.a);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 2, paramClientIdentity.b, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 1000, paramClientIdentity.a());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, paramInt);
  }
  
  public ClientIdentity a(Parcel paramParcel)
  {
    int j = 0;
    int k = a.b(paramParcel);
    String str = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        j = a.f(paramParcel, m);
        break;
      case 2: 
        str = a.k(paramParcel, m);
        break;
      case 1000: 
        i = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new ClientIdentity(i, j, str);
  }
  
  public ClientIdentity[] a(int paramInt)
  {
    return new ClientIdentity[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */