package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class i
  implements Parcelable.Creator<FusedLocationProviderResult>
{
  static void a(FusedLocationProviderResult paramFusedLocationProviderResult, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramFusedLocationProviderResult.b(), paramInt, false);
    c.a(paramParcel, 1000, paramFusedLocationProviderResult.a());
    c.a(paramParcel, i);
  }
  
  public FusedLocationProviderResult a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    Status localStatus = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localStatus = (Status)a.a(paramParcel, k, Status.CREATOR);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new FusedLocationProviderResult(i, localStatus);
  }
  
  public FusedLocationProviderResult[] a(int paramInt)
  {
    return new FusedLocationProviderResult[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */