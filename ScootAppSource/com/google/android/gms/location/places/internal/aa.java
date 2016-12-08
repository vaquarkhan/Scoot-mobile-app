package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

public final class aa
  implements Parcelable.Creator<PlaceEntity>
{
  static void a(PlaceEntity paramPlaceEntity, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlaceEntity.b(), false);
    c.a(paramParcel, 2, paramPlaceEntity.t(), false);
    c.a(paramParcel, 3, paramPlaceEntity.v(), paramInt, false);
    c.a(paramParcel, 4, paramPlaceEntity.i(), paramInt, false);
    c.a(paramParcel, 5, paramPlaceEntity.j());
    c.a(paramParcel, 6, paramPlaceEntity.k(), paramInt, false);
    c.a(paramParcel, 7, paramPlaceEntity.u(), false);
    c.a(paramParcel, 1000, paramPlaceEntity.a);
    c.a(paramParcel, 8, paramPlaceEntity.l(), paramInt, false);
    c.a(paramParcel, 9, paramPlaceEntity.p());
    c.a(paramParcel, 10, paramPlaceEntity.q());
    c.a(paramParcel, 11, paramPlaceEntity.r());
    c.a(paramParcel, 12, paramPlaceEntity.s());
    c.a(paramParcel, 13, paramPlaceEntity.f(), false);
    c.a(paramParcel, 14, (String)paramPlaceEntity.c(), false);
    c.a(paramParcel, 15, (String)paramPlaceEntity.x(), false);
    c.a(paramParcel, 16, paramPlaceEntity.n(), false);
    c.b(paramParcel, 17, paramPlaceEntity.o(), false);
    c.a(paramParcel, 19, (String)paramPlaceEntity.d(), false);
    c.a(paramParcel, 20, paramPlaceEntity.e(), false);
    c.a(paramParcel, i);
  }
  
  public PlaceEntity a(Parcel paramParcel)
  {
    int k = a.b(paramParcel);
    int j = 0;
    String str6 = null;
    ArrayList localArrayList3 = null;
    ArrayList localArrayList2 = null;
    Bundle localBundle = null;
    String str5 = null;
    String str4 = null;
    String str3 = null;
    String str2 = null;
    ArrayList localArrayList1 = null;
    LatLng localLatLng = null;
    float f2 = 0.0F;
    LatLngBounds localLatLngBounds = null;
    String str1 = null;
    Uri localUri = null;
    boolean bool = false;
    float f1 = 0.0F;
    int i = 0;
    long l = 0L;
    PlaceLocalization localPlaceLocalization = null;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        str6 = a.k(paramParcel, m);
        break;
      case 2: 
        localBundle = a.m(paramParcel, m);
        break;
      case 3: 
        localPlaceLocalization = (PlaceLocalization)a.a(paramParcel, m, PlaceLocalization.CREATOR);
        break;
      case 4: 
        localLatLng = (LatLng)a.a(paramParcel, m, LatLng.CREATOR);
        break;
      case 5: 
        f2 = a.i(paramParcel, m);
        break;
      case 6: 
        localLatLngBounds = (LatLngBounds)a.a(paramParcel, m, LatLngBounds.CREATOR);
        break;
      case 7: 
        str1 = a.k(paramParcel, m);
        break;
      case 1000: 
        j = a.f(paramParcel, m);
        break;
      case 8: 
        localUri = (Uri)a.a(paramParcel, m, Uri.CREATOR);
        break;
      case 9: 
        bool = a.c(paramParcel, m);
        break;
      case 10: 
        f1 = a.i(paramParcel, m);
        break;
      case 11: 
        i = a.f(paramParcel, m);
        break;
      case 12: 
        l = a.h(paramParcel, m);
        break;
      case 13: 
        localArrayList2 = a.q(paramParcel, m);
        break;
      case 14: 
        str4 = a.k(paramParcel, m);
        break;
      case 15: 
        str3 = a.k(paramParcel, m);
        break;
      case 16: 
        str2 = a.k(paramParcel, m);
        break;
      case 17: 
        localArrayList1 = a.r(paramParcel, m);
        break;
      case 19: 
        str5 = a.k(paramParcel, m);
        break;
      case 20: 
        localArrayList3 = a.q(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new PlaceEntity(j, str6, localArrayList3, localArrayList2, localBundle, str5, str4, str3, str2, localArrayList1, localLatLng, f2, localLatLngBounds, str1, localUri, bool, f1, i, l, localPlaceLocalization);
  }
  
  public PlaceEntity[] a(int paramInt)
  {
    return new PlaceEntity[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */