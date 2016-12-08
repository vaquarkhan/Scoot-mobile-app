package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator<ConnectionEvent>
{
  static void a(ConnectionEvent paramConnectionEvent, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramConnectionEvent.a);
    c.a(paramParcel, 2, paramConnectionEvent.a());
    c.a(paramParcel, 4, paramConnectionEvent.c(), false);
    c.a(paramParcel, 5, paramConnectionEvent.d(), false);
    c.a(paramParcel, 6, paramConnectionEvent.e(), false);
    c.a(paramParcel, 7, paramConnectionEvent.f(), false);
    c.a(paramParcel, 8, paramConnectionEvent.g(), false);
    c.a(paramParcel, 10, paramConnectionEvent.k());
    c.a(paramParcel, 11, paramConnectionEvent.j());
    c.a(paramParcel, 12, paramConnectionEvent.b());
    c.a(paramParcel, 13, paramConnectionEvent.h(), false);
    c.a(paramParcel, paramInt);
  }
  
  public ConnectionEvent a(Parcel paramParcel)
  {
    int k = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    int j = 0;
    long l3 = 0L;
    int i = 0;
    String str6 = null;
    String str5 = null;
    String str4 = null;
    String str3 = null;
    String str2 = null;
    String str1 = null;
    long l2 = 0L;
    long l1 = 0L;
    while (paramParcel.dataPosition() < k)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(m))
      {
      case 3: 
      case 9: 
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
        break;
      case 2: 
        l3 = com.google.android.gms.common.internal.safeparcel.a.h(paramParcel, m);
        break;
      case 4: 
        str6 = com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, m);
        break;
      case 5: 
        str5 = com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, m);
        break;
      case 6: 
        str4 = com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, m);
        break;
      case 7: 
        str3 = com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, m);
        break;
      case 8: 
        str2 = com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, m);
        break;
      case 10: 
        l2 = com.google.android.gms.common.internal.safeparcel.a.h(paramParcel, m);
        break;
      case 11: 
        l1 = com.google.android.gms.common.internal.safeparcel.a.h(paramParcel, m);
        break;
      case 12: 
        i = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
        break;
      case 13: 
        str1 = com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new ConnectionEvent(j, l3, i, str6, str5, str4, str3, str2, str1, l2, l1);
  }
  
  public ConnectionEvent[] a(int paramInt)
  {
    return new ConnectionEvent[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\stats\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */