package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class aj
  implements Parcelable.Creator<AutocompletePredictionEntity.SubstringEntity>
{
  static void a(AutocompletePredictionEntity.SubstringEntity paramSubstringEntity, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramSubstringEntity.b);
    c.a(paramParcel, 2, paramSubstringEntity.c);
    c.a(paramParcel, 1000, paramSubstringEntity.a);
    c.a(paramParcel, paramInt);
  }
  
  public AutocompletePredictionEntity.SubstringEntity a(Parcel paramParcel)
  {
    int k = 0;
    int m = a.b(paramParcel);
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
        j = a.f(paramParcel, n);
        break;
      case 2: 
        k = a.f(paramParcel, n);
        break;
      case 1000: 
        i = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new b(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new AutocompletePredictionEntity.SubstringEntity(i, j, k);
  }
  
  public AutocompletePredictionEntity.SubstringEntity[] a(int paramInt)
  {
    return new AutocompletePredictionEntity.SubstringEntity[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */