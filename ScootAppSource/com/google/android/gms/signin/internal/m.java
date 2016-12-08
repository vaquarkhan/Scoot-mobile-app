package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class m
  implements Parcelable.Creator<SignInResponse>
{
  static void a(SignInResponse paramSignInResponse, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramSignInResponse.a);
    c.a(paramParcel, 2, paramSignInResponse.a(), paramInt, false);
    c.a(paramParcel, 3, paramSignInResponse.b(), paramInt, false);
    c.a(paramParcel, i);
  }
  
  public SignInResponse a(Parcel paramParcel)
  {
    ResolveAccountResponse localResolveAccountResponse = null;
    int j = a.b(paramParcel);
    int i = 0;
    ConnectionResult localConnectionResult = null;
    if (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
      }
      for (;;)
      {
        break;
        i = a.f(paramParcel, k);
        continue;
        localConnectionResult = (ConnectionResult)a.a(paramParcel, k, ConnectionResult.CREATOR);
        continue;
        localResolveAccountResponse = (ResolveAccountResponse)a.a(paramParcel, k, ResolveAccountResponse.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new SignInResponse(i, localConnectionResult, localResolveAccountResponse);
  }
  
  public SignInResponse[] a(int paramInt)
  {
    return new SignInResponse[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\signin\internal\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */