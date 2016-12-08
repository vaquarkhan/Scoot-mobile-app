package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class c
  implements Parcelable.Creator<ProxyRequest>
{
  static void a(ProxyRequest paramProxyRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.c.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 1, paramProxyRequest.k, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 2, paramProxyRequest.l);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 3, paramProxyRequest.m);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 4, paramProxyRequest.n, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 5, paramProxyRequest.o, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 1000, paramProxyRequest.j);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, paramInt);
  }
  
  public ProxyRequest a(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int k = a.b(paramParcel);
    long l = 0L;
    byte[] arrayOfByte = null;
    String str = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        str = a.k(paramParcel, m);
        break;
      case 2: 
        i = a.f(paramParcel, m);
        break;
      case 3: 
        l = a.h(paramParcel, m);
        break;
      case 4: 
        arrayOfByte = a.n(paramParcel, m);
        break;
      case 5: 
        localBundle = a.m(paramParcel, m);
        break;
      case 1000: 
        j = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new ProxyRequest(j, str, i, l, arrayOfByte, localBundle);
  }
  
  public ProxyRequest[] a(int paramInt)
  {
    return new ProxyRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\proxy\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */