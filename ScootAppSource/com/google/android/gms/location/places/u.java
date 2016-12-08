package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class u
  implements Parcelable.Creator<NearbyAlertFilter>
{
  static void a(NearbyAlertFilter paramNearbyAlertFilter, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.b(paramParcel, 1, paramNearbyAlertFilter.b, false);
    c.a(paramParcel, 2, paramNearbyAlertFilter.c, false);
    c.c(paramParcel, 3, paramNearbyAlertFilter.d, false);
    c.a(paramParcel, 4, paramNearbyAlertFilter.e, false);
    c.a(paramParcel, 5, paramNearbyAlertFilter.f);
    c.a(paramParcel, 1000, paramNearbyAlertFilter.a);
    c.a(paramParcel, paramInt);
  }
  
  public NearbyAlertFilter a(Parcel paramParcel)
  {
    boolean bool = false;
    String str = null;
    int j = a.b(paramParcel);
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    ArrayList localArrayList3 = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localArrayList3 = a.r(paramParcel, k);
        break;
      case 2: 
        localArrayList2 = a.q(paramParcel, k);
        break;
      case 3: 
        localArrayList1 = a.c(paramParcel, k, UserDataType.CREATOR);
        break;
      case 4: 
        str = a.k(paramParcel, k);
        break;
      case 5: 
        bool = a.c(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new NearbyAlertFilter(i, localArrayList3, localArrayList2, localArrayList1, str, bool);
  }
  
  public NearbyAlertFilter[] a(int paramInt)
  {
    return new NearbyAlertFilter[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */