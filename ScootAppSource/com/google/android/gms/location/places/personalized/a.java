package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class a
  implements Parcelable.Creator<AliasedPlace>
{
  static void a(AliasedPlace paramAliasedPlace, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramAliasedPlace.a(), false);
    c.b(paramParcel, 2, paramAliasedPlace.b(), false);
    c.a(paramParcel, 1000, paramAliasedPlace.a);
    c.a(paramParcel, paramInt);
  }
  
  public AliasedPlace a(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    int j = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    int i = 0;
    String str = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, k);
        break;
      case 1: 
        str = com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, k);
        break;
      case 2: 
        localArrayList = com.google.android.gms.common.internal.safeparcel.a.r(paramParcel, k);
        break;
      case 1000: 
        i = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AliasedPlace(i, str, localArrayList);
  }
  
  public AliasedPlace[] a(int paramInt)
  {
    return new AliasedPlace[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\personalized\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */