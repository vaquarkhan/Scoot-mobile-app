package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public final class s
  implements Parcelable.Creator<AddPlaceRequest>
{
  static void a(AddPlaceRequest paramAddPlaceRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramAddPlaceRequest.a(), false);
    c.a(paramParcel, 2, paramAddPlaceRequest.b(), paramInt, false);
    c.a(paramParcel, 3, paramAddPlaceRequest.c(), false);
    c.a(paramParcel, 4, paramAddPlaceRequest.d(), false);
    c.a(paramParcel, 5, paramAddPlaceRequest.e(), false);
    c.a(paramParcel, 6, paramAddPlaceRequest.f(), paramInt, false);
    c.a(paramParcel, 1000, paramAddPlaceRequest.a);
    c.a(paramParcel, i);
  }
  
  public AddPlaceRequest a(Parcel paramParcel)
  {
    Uri localUri = null;
    int j = a.b(paramParcel);
    int i = 0;
    String str1 = null;
    ArrayList localArrayList = null;
    String str2 = null;
    LatLng localLatLng = null;
    String str3 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str3 = a.k(paramParcel, k);
        break;
      case 2: 
        localLatLng = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3: 
        str2 = a.k(paramParcel, k);
        break;
      case 4: 
        localArrayList = a.q(paramParcel, k);
        break;
      case 5: 
        str1 = a.k(paramParcel, k);
        break;
      case 6: 
        localUri = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AddPlaceRequest(i, str3, localLatLng, str2, localArrayList, str1, localUri);
  }
  
  public AddPlaceRequest[] a(int paramInt)
  {
    return new AddPlaceRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */