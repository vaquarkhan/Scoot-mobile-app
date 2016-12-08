package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class b
  implements Parcelable.Creator<AliasedPlacesResult>
{
  static void a(AliasedPlacesResult paramAliasedPlacesResult, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramAliasedPlacesResult.b(), paramInt, false);
    c.c(paramParcel, 2, paramAliasedPlacesResult.a(), false);
    c.a(paramParcel, 1000, paramAliasedPlacesResult.a);
    c.a(paramParcel, i);
  }
  
  public AliasedPlacesResult a(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
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
        localArrayList = a.c(paramParcel, k, AliasedPlace.CREATOR);
        continue;
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new com.google.android.gms.common.internal.safeparcel.b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AliasedPlacesResult(i, localStatus, localArrayList);
  }
  
  public AliasedPlacesResult[] a(int paramInt)
  {
    return new AliasedPlacesResult[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\personalized\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */