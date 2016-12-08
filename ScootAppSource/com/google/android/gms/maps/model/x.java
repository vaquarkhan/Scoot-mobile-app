package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class x
  implements Parcelable.Creator<Tile>
{
  static void a(Tile paramTile, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramTile.a());
    c.a(paramParcel, 2, paramTile.a);
    c.a(paramParcel, 3, paramTile.b);
    c.a(paramParcel, 4, paramTile.c, false);
    c.a(paramParcel, paramInt);
  }
  
  public Tile a(Parcel paramParcel)
  {
    int k = 0;
    int m = a.b(paramParcel);
    byte[] arrayOfByte = null;
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        i = a.f(paramParcel, n);
        break;
      case 2: 
        j = a.f(paramParcel, n);
        break;
      case 3: 
        k = a.f(paramParcel, n);
        break;
      case 4: 
        arrayOfByte = a.n(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new b(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new Tile(i, j, k, arrayOfByte);
  }
  
  public Tile[] a(int paramInt)
  {
    return new Tile[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */