package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class ad
  implements Parcelable.Creator<PlaceLocalization>
{
  static void a(PlaceLocalization paramPlaceLocalization, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlaceLocalization.b, false);
    c.a(paramParcel, 2, paramPlaceLocalization.c, false);
    c.a(paramParcel, 3, paramPlaceLocalization.d, false);
    c.a(paramParcel, 4, paramPlaceLocalization.e, false);
    c.b(paramParcel, 5, paramPlaceLocalization.f, false);
    c.a(paramParcel, 1000, paramPlaceLocalization.a);
    c.a(paramParcel, paramInt);
  }
  
  public PlaceLocalization a(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    int j = a.b(paramParcel);
    int i = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str4 = a.k(paramParcel, k);
        break;
      case 2: 
        str3 = a.k(paramParcel, k);
        break;
      case 3: 
        str2 = a.k(paramParcel, k);
        break;
      case 4: 
        str1 = a.k(paramParcel, k);
        break;
      case 5: 
        localArrayList = a.r(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new PlaceLocalization(i, str4, str3, str2, str1, localArrayList);
  }
  
  public PlaceLocalization[] a(int paramInt)
  {
    return new PlaceLocalization[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */