package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class e
  implements Parcelable.Creator<GeneratePasswordRequest>
{
  static void a(GeneratePasswordRequest paramGeneratePasswordRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramGeneratePasswordRequest.a(), paramInt, false);
    c.a(paramParcel, 1000, paramGeneratePasswordRequest.a);
    c.a(paramParcel, i);
  }
  
  public GeneratePasswordRequest a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    PasswordSpecification localPasswordSpecification = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localPasswordSpecification = (PasswordSpecification)a.a(paramParcel, k, PasswordSpecification.CREATOR);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new GeneratePasswordRequest(i, localPasswordSpecification);
  }
  
  public GeneratePasswordRequest[] a(int paramInt)
  {
    return new GeneratePasswordRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\internal\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */