package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class g
  implements Parcelable.Creator<CredentialPickerConfig>
{
  static void a(CredentialPickerConfig paramCredentialPickerConfig, Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, paramCredentialPickerConfig.a());
    c.a(paramParcel, 2, paramCredentialPickerConfig.b());
    c.a(paramParcel, 3, paramCredentialPickerConfig.c());
    c.a(paramParcel, 1000, paramCredentialPickerConfig.a);
    c.a(paramParcel, paramInt);
  }
  
  public CredentialPickerConfig a(Parcel paramParcel)
  {
    boolean bool3 = false;
    int j = a.b(paramParcel);
    boolean bool2 = false;
    boolean bool1 = false;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        bool1 = a.c(paramParcel, k);
        break;
      case 2: 
        bool2 = a.c(paramParcel, k);
        break;
      case 3: 
        bool3 = a.c(paramParcel, k);
        break;
      case 1000: 
        i = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new CredentialPickerConfig(i, bool1, bool2, bool3);
  }
  
  public CredentialPickerConfig[] a(int paramInt)
  {
    return new CredentialPickerConfig[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */