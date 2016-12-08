package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

public final class b
  implements Parcelable.Creator<ProxyGrpcRequest>
{
  static void a(ProxyGrpcRequest paramProxyGrpcRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramProxyGrpcRequest.b, false);
    c.a(paramParcel, 2, paramProxyGrpcRequest.c);
    c.a(paramParcel, 3, paramProxyGrpcRequest.d);
    c.a(paramParcel, 4, paramProxyGrpcRequest.e, false);
    c.a(paramParcel, 5, paramProxyGrpcRequest.f, false);
    c.a(paramParcel, 1000, paramProxyGrpcRequest.a);
    c.a(paramParcel, paramInt);
  }
  
  public ProxyGrpcRequest a(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int k = a.b(paramParcel);
    long l = 0L;
    byte[] arrayOfByte = null;
    String str2 = null;
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
        str2 = a.k(paramParcel, m);
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
        str1 = a.k(paramParcel, m);
        break;
      case 1000: 
        j = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new com.google.android.gms.common.internal.safeparcel.b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new ProxyGrpcRequest(j, str2, i, l, arrayOfByte, str1);
  }
  
  public ProxyGrpcRequest[] a(int paramInt)
  {
    return new ProxyGrpcRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\proxy\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */