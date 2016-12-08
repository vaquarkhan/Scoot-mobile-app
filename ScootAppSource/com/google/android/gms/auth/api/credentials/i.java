package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class i
  implements Parcelable.Creator<IdToken>
{
  static void a(IdToken paramIdToken, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramIdToken.a(), false);
    c.a(paramParcel, 2, paramIdToken.b(), false);
    c.a(paramParcel, 1000, paramIdToken.a);
    c.a(paramParcel, paramInt);
  }
  
  public IdToken a(Parcel paramParcel)
  {
    String str2 = null;
    int j = a.b(paramParcel);
    int i = 0;
    String str1 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str1 = a.k(paramParcel, k);
        break;
      case 2: 
        str2 = a.k(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new IdToken(i, str1, str2);
  }
  
  public IdToken[] a(int paramInt)
  {
    return new IdToken[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */