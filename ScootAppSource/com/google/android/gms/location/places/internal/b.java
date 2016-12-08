package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class b
  implements Parcelable.Creator<AutocompletePredictionEntity>
{
  static void a(AutocompletePredictionEntity paramAutocompletePredictionEntity, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramAutocompletePredictionEntity.b, false);
    c.a(paramParcel, 2, paramAutocompletePredictionEntity.c, false);
    c.a(paramParcel, 3, paramAutocompletePredictionEntity.d, false);
    c.c(paramParcel, 4, paramAutocompletePredictionEntity.e, false);
    c.a(paramParcel, 5, paramAutocompletePredictionEntity.f);
    c.a(paramParcel, 6, paramAutocompletePredictionEntity.g, false);
    c.c(paramParcel, 7, paramAutocompletePredictionEntity.h, false);
    c.a(paramParcel, 1000, paramAutocompletePredictionEntity.a);
    c.a(paramParcel, 8, paramAutocompletePredictionEntity.i, false);
    c.c(paramParcel, 9, paramAutocompletePredictionEntity.j, false);
    c.a(paramParcel, paramInt);
  }
  
  public AutocompletePredictionEntity a(Parcel paramParcel)
  {
    int i = 0;
    ArrayList localArrayList1 = null;
    int k = a.b(paramParcel);
    String str1 = null;
    ArrayList localArrayList2 = null;
    String str2 = null;
    ArrayList localArrayList3 = null;
    String str3 = null;
    ArrayList localArrayList4 = null;
    String str4 = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        str3 = a.k(paramParcel, m);
        break;
      case 2: 
        str4 = a.k(paramParcel, m);
        break;
      case 3: 
        localArrayList4 = a.q(paramParcel, m);
        break;
      case 4: 
        localArrayList3 = a.c(paramParcel, m, AutocompletePredictionEntity.SubstringEntity.CREATOR);
        break;
      case 5: 
        i = a.f(paramParcel, m);
        break;
      case 6: 
        str2 = a.k(paramParcel, m);
        break;
      case 7: 
        localArrayList2 = a.c(paramParcel, m, AutocompletePredictionEntity.SubstringEntity.CREATOR);
        break;
      case 1000: 
        j = a.f(paramParcel, m);
        break;
      case 8: 
        str1 = a.k(paramParcel, m);
        break;
      case 9: 
        localArrayList1 = a.c(paramParcel, m, AutocompletePredictionEntity.SubstringEntity.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new com.google.android.gms.common.internal.safeparcel.b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new AutocompletePredictionEntity(j, str4, localArrayList4, i, str3, localArrayList3, str2, localArrayList2, str1, localArrayList1);
  }
  
  public AutocompletePredictionEntity[] a(int paramInt)
  {
    return new AutocompletePredictionEntity[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */