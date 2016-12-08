package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class i
  implements Parcelable.Creator<WakeLockEvent>
{
  static void a(WakeLockEvent paramWakeLockEvent, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramWakeLockEvent.a);
    c.a(paramParcel, 2, paramWakeLockEvent.a());
    c.a(paramParcel, 4, paramWakeLockEvent.c(), false);
    c.a(paramParcel, 5, paramWakeLockEvent.f());
    c.b(paramParcel, 6, paramWakeLockEvent.g(), false);
    c.a(paramParcel, 8, paramWakeLockEvent.j());
    c.a(paramParcel, 10, paramWakeLockEvent.d(), false);
    c.a(paramParcel, 11, paramWakeLockEvent.b());
    c.a(paramParcel, 12, paramWakeLockEvent.h(), false);
    c.a(paramParcel, 13, paramWakeLockEvent.m(), false);
    c.a(paramParcel, 14, paramWakeLockEvent.k());
    c.a(paramParcel, 15, paramWakeLockEvent.n());
    c.a(paramParcel, 16, paramWakeLockEvent.o());
    c.a(paramParcel, 17, paramWakeLockEvent.e(), false);
    c.a(paramParcel, paramInt);
  }
  
  public WakeLockEvent a(Parcel paramParcel)
  {
    int n = a.b(paramParcel);
    int m = 0;
    long l3 = 0L;
    int k = 0;
    String str5 = null;
    int j = 0;
    ArrayList localArrayList = null;
    String str4 = null;
    long l2 = 0L;
    int i = 0;
    String str3 = null;
    String str2 = null;
    float f = 0.0F;
    long l1 = 0L;
    String str1 = null;
    while (paramParcel.dataPosition() < n)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      case 3: 
      case 7: 
      case 9: 
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        m = a.f(paramParcel, i1);
        break;
      case 2: 
        l3 = a.h(paramParcel, i1);
        break;
      case 4: 
        str5 = a.k(paramParcel, i1);
        break;
      case 5: 
        j = a.f(paramParcel, i1);
        break;
      case 6: 
        localArrayList = a.r(paramParcel, i1);
        break;
      case 8: 
        l2 = a.h(paramParcel, i1);
        break;
      case 10: 
        str3 = a.k(paramParcel, i1);
        break;
      case 11: 
        k = a.f(paramParcel, i1);
        break;
      case 12: 
        str4 = a.k(paramParcel, i1);
        break;
      case 13: 
        str2 = a.k(paramParcel, i1);
        break;
      case 14: 
        i = a.f(paramParcel, i1);
        break;
      case 15: 
        f = a.i(paramParcel, i1);
        break;
      case 16: 
        l1 = a.h(paramParcel, i1);
        break;
      case 17: 
        str1 = a.k(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != n) {
      throw new b(37 + "Overread allowed size end=" + n, paramParcel);
    }
    return new WakeLockEvent(m, l3, k, str5, j, localArrayList, str4, l2, i, str3, str2, f, l1, str1);
  }
  
  public WakeLockEvent[] a(int paramInt)
  {
    return new WakeLockEvent[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\stats\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */