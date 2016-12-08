package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class z
  implements Parcelable.Creator<PlaceReport>
{
  static void a(PlaceReport paramPlaceReport, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlaceReport.a);
    c.a(paramParcel, 2, paramPlaceReport.a(), false);
    c.a(paramParcel, 3, paramPlaceReport.b(), false);
    c.a(paramParcel, 4, paramPlaceReport.c(), false);
    c.a(paramParcel, paramInt);
  }
  
  public PlaceReport a(Parcel paramParcel)
  {
    String str3 = null;
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
        i = a.f(paramParcel, k);
        break;
      case 2: 
        str1 = a.k(paramParcel, k);
        break;
      case 3: 
        str2 = a.k(paramParcel, k);
        break;
      case 4: 
        str3 = a.k(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new PlaceReport(i, str1, str2, str3);
  }
  
  public PlaceReport[] a(int paramInt)
  {
    return new PlaceReport[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */