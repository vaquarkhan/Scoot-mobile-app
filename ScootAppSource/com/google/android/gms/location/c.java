package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class c
  implements Parcelable.Creator<DetectedActivity>
{
  static void a(DetectedActivity paramDetectedActivity, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.c.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 1, paramDetectedActivity.d);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 2, paramDetectedActivity.e);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 1000, paramDetectedActivity.c());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, paramInt);
  }
  
  public DetectedActivity a(Parcel paramParcel)
  {
    int k = 0;
    int m = a.b(paramParcel);
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        j = a.f(paramParcel, n);
        break;
      case 2: 
        k = a.f(paramParcel, n);
        break;
      case 1000: 
        i = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new b(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new DetectedActivity(i, j, k);
  }
  
  public DetectedActivity[] a(int paramInt)
  {
    return new DetectedActivity[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */