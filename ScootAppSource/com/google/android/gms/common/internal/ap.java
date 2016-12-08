package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ap
  implements Parcelable.Creator<GetServiceRequest>
{
  static void a(GetServiceRequest paramGetServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramGetServiceRequest.a);
    c.a(paramParcel, 2, paramGetServiceRequest.b);
    c.a(paramParcel, 3, paramGetServiceRequest.c);
    c.a(paramParcel, 4, paramGetServiceRequest.d, false);
    c.a(paramParcel, 5, paramGetServiceRequest.e, false);
    c.a(paramParcel, 6, paramGetServiceRequest.f, paramInt, false);
    c.a(paramParcel, 7, paramGetServiceRequest.g, false);
    c.a(paramParcel, 8, paramGetServiceRequest.h, paramInt, false);
    c.a(paramParcel, 9, paramGetServiceRequest.i);
    c.a(paramParcel, i);
  }
  
  public GetServiceRequest a(Parcel paramParcel)
  {
    int i = 0;
    Account localAccount = null;
    int m = a.b(paramParcel);
    long l = 0L;
    Bundle localBundle = null;
    Scope[] arrayOfScope = null;
    IBinder localIBinder = null;
    String str = null;
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
        k = a.f(paramParcel, n);
        break;
      case 2: 
        j = a.f(paramParcel, n);
        break;
      case 3: 
        i = a.f(paramParcel, n);
        break;
      case 4: 
        str = a.k(paramParcel, n);
        break;
      case 5: 
        localIBinder = a.l(paramParcel, n);
        break;
      case 6: 
        arrayOfScope = (Scope[])a.b(paramParcel, n, Scope.CREATOR);
        break;
      case 7: 
        localBundle = a.m(paramParcel, n);
        break;
      case 8: 
        localAccount = (Account)a.a(paramParcel, n, Account.CREATOR);
        break;
      case 9: 
        l = a.h(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new b(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new GetServiceRequest(k, j, i, str, localIBinder, arrayOfScope, localBundle, localAccount, l);
  }
  
  public GetServiceRequest[] a(int paramInt)
  {
    return new GetServiceRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */