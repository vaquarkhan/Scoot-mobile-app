package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class h
  implements Parcelable.Creator<PlaceUserData>
{
  static void a(PlaceUserData paramPlaceUserData, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlaceUserData.a(), false);
    c.a(paramParcel, 2, paramPlaceUserData.b(), false);
    c.c(paramParcel, 6, paramPlaceUserData.c(), false);
    c.a(paramParcel, 1000, paramPlaceUserData.a);
    c.a(paramParcel, paramInt);
  }
  
  public PlaceUserData a(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    int j = a.b(paramParcel);
    int i = 0;
    String str2 = null;
    String str1 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str1 = a.k(paramParcel, k);
        break;
      case 2: 
        str2 = a.k(paramParcel, k);
        break;
      case 6: 
        localArrayList = a.c(paramParcel, k, PlaceAlias.CREATOR);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new PlaceUserData(i, str1, str2, localArrayList);
  }
  
  public PlaceUserData[] a(int paramInt)
  {
    return new PlaceUserData[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\personalized\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */