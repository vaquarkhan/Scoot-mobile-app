package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class g
  implements Parcelable.Creator<ValidateAccountRequest>
{
  static void a(ValidateAccountRequest paramValidateAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramValidateAccountRequest.a);
    c.a(paramParcel, 2, paramValidateAccountRequest.a());
    c.a(paramParcel, 3, paramValidateAccountRequest.b, false);
    c.a(paramParcel, 4, paramValidateAccountRequest.b(), paramInt, false);
    c.a(paramParcel, 5, paramValidateAccountRequest.d(), false);
    c.a(paramParcel, 6, paramValidateAccountRequest.c(), false);
    c.a(paramParcel, i);
  }
  
  public ValidateAccountRequest a(Parcel paramParcel)
  {
    int i = 0;
    String str = null;
    int k = a.b(paramParcel);
    Bundle localBundle = null;
    Scope[] arrayOfScope = null;
    IBinder localIBinder = null;
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
        j = a.f(paramParcel, m);
        break;
      case 2: 
        i = a.f(paramParcel, m);
        break;
      case 3: 
        localIBinder = a.l(paramParcel, m);
        break;
      case 4: 
        arrayOfScope = (Scope[])a.b(paramParcel, m, Scope.CREATOR);
        break;
      case 5: 
        localBundle = a.m(paramParcel, m);
        break;
      case 6: 
        str = a.k(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new ValidateAccountRequest(j, i, localIBinder, arrayOfScope, localBundle, str);
  }
  
  public ValidateAccountRequest[] a(int paramInt)
  {
    return new ValidateAccountRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */