package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class a
  implements Parcelable.Creator<ActivityRecognitionResult>
{
  static void a(ActivityRecognitionResult paramActivityRecognitionResult, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.c(paramParcel, 1, paramActivityRecognitionResult.a, false);
    c.a(paramParcel, 2, paramActivityRecognitionResult.b);
    c.a(paramParcel, 3, paramActivityRecognitionResult.c);
    c.a(paramParcel, 4, paramActivityRecognitionResult.d);
    c.a(paramParcel, 5, paramActivityRecognitionResult.e, false);
    c.a(paramParcel, 1000, paramActivityRecognitionResult.a());
    c.a(paramParcel, paramInt);
  }
  
  public ActivityRecognitionResult a(Parcel paramParcel)
  {
    long l1 = 0L;
    Bundle localBundle = null;
    int i = 0;
    int k = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    long l2 = 0L;
    ArrayList localArrayList = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(m))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1: 
        localArrayList = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, m, DetectedActivity.CREATOR);
        break;
      case 2: 
        l2 = com.google.android.gms.common.internal.safeparcel.a.h(paramParcel, m);
        break;
      case 3: 
        l1 = com.google.android.gms.common.internal.safeparcel.a.h(paramParcel, m);
        break;
      case 4: 
        i = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
        break;
      case 5: 
        localBundle = com.google.android.gms.common.internal.safeparcel.a.m(paramParcel, m);
        break;
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new ActivityRecognitionResult(j, localArrayList, l2, l1, i, localBundle);
  }
  
  public ActivityRecognitionResult[] a(int paramInt)
  {
    return new ActivityRecognitionResult[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */