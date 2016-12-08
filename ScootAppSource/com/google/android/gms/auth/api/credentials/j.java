package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class j
  implements Parcelable.Creator<PasswordSpecification>
{
  static void a(PasswordSpecification paramPasswordSpecification, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramPasswordSpecification.d, false);
    c.b(paramParcel, 2, paramPasswordSpecification.e, false);
    c.a(paramParcel, 3, paramPasswordSpecification.f, false);
    c.a(paramParcel, 4, paramPasswordSpecification.g);
    c.a(paramParcel, 5, paramPasswordSpecification.h);
    c.a(paramParcel, 1000, paramPasswordSpecification.c);
    c.a(paramParcel, paramInt);
  }
  
  public PasswordSpecification a(Parcel paramParcel)
  {
    ArrayList localArrayList1 = null;
    int i = 0;
    int m = a.b(paramParcel);
    int j = 0;
    ArrayList localArrayList2 = null;
    String str = null;
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
        str = a.k(paramParcel, n);
        break;
      case 2: 
        localArrayList2 = a.r(paramParcel, n);
        break;
      case 3: 
        localArrayList1 = a.q(paramParcel, n);
        break;
      case 4: 
        j = a.f(paramParcel, n);
        break;
      case 5: 
        i = a.f(paramParcel, n);
        break;
      case 1000: 
        k = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new b(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new PasswordSpecification(k, str, localArrayList2, localArrayList1, j, i);
  }
  
  public PasswordSpecification[] a(int paramInt)
  {
    return new PasswordSpecification[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */