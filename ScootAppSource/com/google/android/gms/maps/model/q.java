package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class q
  implements Parcelable.Creator<PointOfInterest>
{
  static void a(PointOfInterest paramPointOfInterest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramPointOfInterest.a());
    c.a(paramParcel, 2, paramPointOfInterest.a, paramInt, false);
    c.a(paramParcel, 3, paramPointOfInterest.b, false);
    c.a(paramParcel, 4, paramPointOfInterest.c, false);
    c.a(paramParcel, i);
  }
  
  public PointOfInterest a(Parcel paramParcel)
  {
    String str = null;
    int j = a.b(paramParcel);
    int i = 0;
    Object localObject2 = null;
    Object localObject1 = null;
    if (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      Object localObject3;
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
      }
      for (;;)
      {
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break;
        i = a.f(paramParcel, k);
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        continue;
        localObject3 = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        localObject1 = localObject2;
        localObject2 = localObject3;
        continue;
        localObject3 = a.k(paramParcel, k);
        localObject2 = localObject1;
        localObject1 = localObject3;
        continue;
        str = a.k(paramParcel, k);
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new PointOfInterest(i, (LatLng)localObject1, (String)localObject2, str);
  }
  
  public PointOfInterest[] a(int paramInt)
  {
    return new PointOfInterest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */