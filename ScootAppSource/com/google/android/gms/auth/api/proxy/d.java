package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class d
  implements Parcelable.Creator<ProxyResponse>
{
  static void a(ProxyResponse paramProxyResponse, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramProxyResponse.b);
    c.a(paramParcel, 2, paramProxyResponse.c, paramInt, false);
    c.a(paramParcel, 3, paramProxyResponse.d);
    c.a(paramParcel, 4, paramProxyResponse.e, false);
    c.a(paramParcel, 5, paramProxyResponse.f, false);
    c.a(paramParcel, 1000, paramProxyResponse.a);
    c.a(paramParcel, i);
  }
  
  public ProxyResponse a(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int i = 0;
    int m = a.b(paramParcel);
    Bundle localBundle = null;
    PendingIntent localPendingIntent = null;
    int j = 0;
    int k = 0;
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
        localPendingIntent = (PendingIntent)a.a(paramParcel, n, PendingIntent.CREATOR);
        break;
      case 3: 
        i = a.f(paramParcel, n);
        break;
      case 4: 
        localBundle = a.m(paramParcel, n);
        break;
      case 5: 
        arrayOfByte = a.n(paramParcel, n);
        break;
      case 1000: 
        k = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new b(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new ProxyResponse(k, j, localPendingIntent, i, localBundle, arrayOfByte);
  }
  
  public ProxyResponse[] a(int paramInt)
  {
    return new ProxyResponse[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\proxy\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */