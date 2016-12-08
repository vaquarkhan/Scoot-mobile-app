package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ai
  implements Parcelable.Creator<UserDataType>
{
  static void a(UserDataType paramUserDataType, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramUserDataType.f, false);
    c.a(paramParcel, 2, paramUserDataType.g);
    c.a(paramParcel, 1000, paramUserDataType.e);
    c.a(paramParcel, paramInt);
  }
  
  public UserDataType a(Parcel paramParcel)
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
        str = a.k(paramParcel, m);
        break;
      case 2: 
        j = a.f(paramParcel, m);
        break;
      case 1000: 
        i = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new UserDataType(i, str, j);
  }
  
  public UserDataType[] a(int paramInt)
  {
    return new UserDataType[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */