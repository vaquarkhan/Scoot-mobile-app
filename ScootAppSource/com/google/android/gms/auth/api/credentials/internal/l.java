package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class l
  implements Parcelable.Creator<SaveRequest>
{
  static void a(SaveRequest paramSaveRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramSaveRequest.a(), paramInt, false);
    c.a(paramParcel, 1000, paramSaveRequest.a);
    c.a(paramParcel, i);
  }
  
  public SaveRequest a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    Credential localCredential = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        localCredential = (Credential)a.a(paramParcel, k, Credential.CREATOR);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new SaveRequest(i, localCredential);
  }
  
  public SaveRequest[] a(int paramInt)
  {
    return new SaveRequest[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\internal\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */