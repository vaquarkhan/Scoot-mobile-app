package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ab
  implements Parcelable.Creator<PlaceLikelihoodEntity>
{
  static void a(PlaceLikelihoodEntity paramPlaceLikelihoodEntity, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlaceLikelihoodEntity.b, paramInt, false);
    c.a(paramParcel, 2, paramPlaceLikelihoodEntity.c);
    c.a(paramParcel, 1000, paramPlaceLikelihoodEntity.a);
    c.a(paramParcel, i);
  }
  
  public PlaceLikelihoodEntity a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    PlaceEntity localPlaceEntity = null;
    float f = 0.0F;
    if (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
      }
      for (;;)
      {
        break;
        localPlaceEntity = (PlaceEntity)a.a(paramParcel, k, PlaceEntity.CREATOR);
        continue;
        f = a.i(paramParcel, k);
        continue;
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new PlaceLikelihoodEntity(i, localPlaceEntity, f);
  }
  
  public PlaceLikelihoodEntity[] a(int paramInt)
  {
    return new PlaceLikelihoodEntity[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */