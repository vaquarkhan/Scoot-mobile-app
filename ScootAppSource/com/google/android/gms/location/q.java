package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class q
  implements Parcelable.Creator<GestureRequest>
{
  static void a(GestureRequest paramGestureRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramGestureRequest.b(), false);
    c.a(paramParcel, 1000, paramGestureRequest.a());
    c.a(paramParcel, paramInt);
  }
  
  public GestureRequest a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localArrayList = a.q(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new GestureRequest(i, localArrayList);
  }
  
  public GestureRequest[] a(int paramInt)
  {
    return new GestureRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */