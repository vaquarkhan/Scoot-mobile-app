package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class w
  implements Parcelable.Creator<PlaceFilter>
{
  static void a(PlaceFilter paramPlaceFilter, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlaceFilter.b, false);
    c.a(paramParcel, 3, paramPlaceFilter.c);
    c.c(paramParcel, 4, paramPlaceFilter.d, false);
    c.b(paramParcel, 6, paramPlaceFilter.e, false);
    c.a(paramParcel, 1000, paramPlaceFilter.a);
    c.a(paramParcel, paramInt);
  }
  
  public PlaceFilter a(Parcel paramParcel)
  {
    boolean bool = false;
    ArrayList localArrayList1 = null;
    int j = a.b(paramParcel);
    ArrayList localArrayList2 = null;
    ArrayList localArrayList3 = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localArrayList3 = a.q(paramParcel, k);
        break;
      case 3: 
        bool = a.c(paramParcel, k);
        break;
      case 4: 
        localArrayList1 = a.c(paramParcel, k, UserDataType.CREATOR);
        break;
      case 6: 
        localArrayList2 = a.r(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new PlaceFilter(i, localArrayList3, bool, localArrayList2, localArrayList1);
  }
  
  public PlaceFilter[] a(int paramInt)
  {
    return new PlaceFilter[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */