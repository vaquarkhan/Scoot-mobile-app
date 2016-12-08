package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class h
  implements Parcelable.Creator<AuthAccountRequest>
{
  static void a(AuthAccountRequest paramAuthAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramAuthAccountRequest.a);
    c.a(paramParcel, 2, paramAuthAccountRequest.b, false);
    c.a(paramParcel, 3, paramAuthAccountRequest.c, paramInt, false);
    c.a(paramParcel, 4, paramAuthAccountRequest.d, false);
    c.a(paramParcel, 5, paramAuthAccountRequest.e, false);
    c.a(paramParcel, i);
  }
  
  public AuthAccountRequest a(Parcel paramParcel)
  {
    Integer localInteger1 = null;
    int j = a.b(paramParcel);
    int i = 0;
    Integer localInteger2 = null;
    Scope[] arrayOfScope = null;
    IBinder localIBinder = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.f(paramParcel, k);
        break;
      case 2: 
        localIBinder = a.l(paramParcel, k);
        break;
      case 3: 
        arrayOfScope = (Scope[])a.b(paramParcel, k, Scope.CREATOR);
        break;
      case 4: 
        localInteger2 = a.g(paramParcel, k);
        break;
      case 5: 
        localInteger1 = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AuthAccountRequest(i, localIBinder, arrayOfScope, localInteger2, localInteger1);
  }
  
  public AuthAccountRequest[] a(int paramInt)
  {
    return new AuthAccountRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */