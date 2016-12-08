package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class g
  implements Parcelable.Creator<GoogleSignInOptions>
{
  static void a(GoogleSignInOptions paramGoogleSignInOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramGoogleSignInOptions.e);
    c.c(paramParcel, 2, paramGoogleSignInOptions.a(), false);
    c.a(paramParcel, 3, paramGoogleSignInOptions.b(), paramInt, false);
    c.a(paramParcel, 4, paramGoogleSignInOptions.c());
    c.a(paramParcel, 5, paramGoogleSignInOptions.d());
    c.a(paramParcel, 6, paramGoogleSignInOptions.e());
    c.a(paramParcel, 7, paramGoogleSignInOptions.f(), false);
    c.a(paramParcel, 8, paramGoogleSignInOptions.g(), false);
    c.a(paramParcel, i);
  }
  
  public GoogleSignInOptions a(Parcel paramParcel)
  {
    String str1 = null;
    boolean bool1 = false;
    int j = a.b(paramParcel);
    String str2 = null;
    boolean bool2 = false;
    boolean bool3 = false;
    Account localAccount = null;
    ArrayList localArrayList = null;
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
        i = a.f(paramParcel, k);
        break;
      case 2: 
        localArrayList = a.c(paramParcel, k, Scope.CREATOR);
        break;
      case 3: 
        localAccount = (Account)a.a(paramParcel, k, Account.CREATOR);
        break;
      case 4: 
        bool3 = a.c(paramParcel, k);
        break;
      case 5: 
        bool2 = a.c(paramParcel, k);
        break;
      case 6: 
        bool1 = a.c(paramParcel, k);
        break;
      case 7: 
        str2 = a.k(paramParcel, k);
        break;
      case 8: 
        str1 = a.k(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new GoogleSignInOptions(i, localArrayList, localAccount, bool3, bool2, bool1, str2, str1);
  }
  
  public GoogleSignInOptions[] a(int paramInt)
  {
    return new GoogleSignInOptions[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */