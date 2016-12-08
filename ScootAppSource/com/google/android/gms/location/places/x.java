package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class x
  implements Parcelable.Creator<PlacePhotoMetadataResult>
{
  static void a(PlacePhotoMetadataResult paramPlacePhotoMetadataResult, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlacePhotoMetadataResult.b(), paramInt, false);
    c.a(paramParcel, 2, paramPlacePhotoMetadataResult.b, paramInt, false);
    c.a(paramParcel, 1000, paramPlacePhotoMetadataResult.a);
    c.a(paramParcel, i);
  }
  
  public PlacePhotoMetadataResult a(Parcel paramParcel)
  {
    DataHolder localDataHolder = null;
    int j = a.b(paramParcel);
    int i = 0;
    Status localStatus = null;
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
        localStatus = (Status)a.a(paramParcel, k, Status.CREATOR);
        continue;
        localDataHolder = (DataHolder)a.a(paramParcel, k, DataHolder.CREATOR);
        continue;
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new PlacePhotoMetadataResult(i, localStatus, localDataHolder);
  }
  
  public PlacePhotoMetadataResult[] a(int paramInt)
  {
    return new PlacePhotoMetadataResult[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */