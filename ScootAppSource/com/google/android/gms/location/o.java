package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class o
  implements Parcelable.Creator<ActivityRecognitionRequest>
{
  static void a(ActivityRecognitionRequest paramActivityRecognitionRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramActivityRecognitionRequest.a());
    c.a(paramParcel, 2, paramActivityRecognitionRequest.b());
    c.a(paramParcel, 3, paramActivityRecognitionRequest.c(), paramInt, false);
    c.a(paramParcel, 4, paramActivityRecognitionRequest.d(), false);
    c.a(paramParcel, 5, paramActivityRecognitionRequest.e(), false);
    c.a(paramParcel, 6, paramActivityRecognitionRequest.f());
    c.a(paramParcel, 7, paramActivityRecognitionRequest.g(), false);
    c.a(paramParcel, 1000, paramActivityRecognitionRequest.h());
    c.a(paramParcel, i);
  }
  
  public ActivityRecognitionRequest a(Parcel paramParcel)
  {
    boolean bool1 = false;
    String str1 = null;
    int j = a.b(paramParcel);
    long l = 0L;
    int[] arrayOfInt = null;
    String str2 = null;
    WorkSource localWorkSource = null;
    boolean bool2 = false;
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
        l = a.h(paramParcel, k);
        break;
      case 2: 
        bool2 = a.c(paramParcel, k);
        break;
      case 3: 
        localWorkSource = (WorkSource)a.a(paramParcel, k, WorkSource.CREATOR);
        break;
      case 4: 
        str2 = a.k(paramParcel, k);
        break;
      case 5: 
        arrayOfInt = a.o(paramParcel, k);
        break;
      case 6: 
        bool1 = a.c(paramParcel, k);
        break;
      case 7: 
        str1 = a.k(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new ActivityRecognitionRequest(i, l, bool2, localWorkSource, str2, arrayOfInt, bool1, str1);
  }
  
  public ActivityRecognitionRequest[] a(int paramInt)
  {
    return new ActivityRecognitionRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */