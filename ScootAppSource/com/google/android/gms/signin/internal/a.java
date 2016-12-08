package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator<AuthAccountResult>
{
  static void a(AuthAccountResult paramAuthAccountResult, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramAuthAccountResult.a);
    c.a(paramParcel, 2, paramAuthAccountResult.a());
    c.a(paramParcel, 3, paramAuthAccountResult.c(), paramInt, false);
    c.a(paramParcel, i);
  }
  
  public AuthAccountResult a(Parcel paramParcel)
  {
    int j = 0;
    int k = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    Intent localIntent = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(m))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1: 
        i = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
        break;
      case 2: 
        j = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, m);
        break;
      case 3: 
        localIntent = (Intent)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, m, Intent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new AuthAccountResult(i, j, localIntent);
  }
  
  public AuthAccountResult[] a(int paramInt)
  {
    return new AuthAccountResult[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\signin\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */