package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class f
  implements Parcelable.Creator<PlaceAlias>
{
  static void a(PlaceAlias paramPlaceAlias, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlaceAlias.a(), false);
    c.a(paramParcel, 1000, paramPlaceAlias.c);
    c.a(paramParcel, paramInt);
  }
  
  public PlaceAlias a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    String str = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str = a.k(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new PlaceAlias(i, str);
  }
  
  public PlaceAlias[] a(int paramInt)
  {
    return new PlaceAlias[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\personalized\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */