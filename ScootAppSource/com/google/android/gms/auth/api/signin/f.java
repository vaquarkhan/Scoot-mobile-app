package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public final class f
  implements Parcelable.Creator<GoogleSignInAccount>
{
  static void a(GoogleSignInAccount paramGoogleSignInAccount, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramGoogleSignInAccount.b);
    c.a(paramParcel, 2, paramGoogleSignInAccount.a(), false);
    c.a(paramParcel, 3, paramGoogleSignInAccount.b(), false);
    c.a(paramParcel, 4, paramGoogleSignInAccount.c(), false);
    c.a(paramParcel, 5, paramGoogleSignInAccount.d(), false);
    c.a(paramParcel, 6, paramGoogleSignInAccount.g(), paramInt, false);
    c.a(paramParcel, 7, paramGoogleSignInAccount.h(), false);
    c.a(paramParcel, 8, paramGoogleSignInAccount.i());
    c.a(paramParcel, 9, paramGoogleSignInAccount.j(), false);
    c.c(paramParcel, 10, paramGoogleSignInAccount.c, false);
    c.a(paramParcel, 11, paramGoogleSignInAccount.e(), false);
    c.a(paramParcel, 12, paramGoogleSignInAccount.f(), false);
    c.a(paramParcel, i);
  }
  
  public GoogleSignInAccount a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    String str8 = null;
    String str7 = null;
    String str6 = null;
    String str5 = null;
    Uri localUri = null;
    String str4 = null;
    long l = 0L;
    String str3 = null;
    ArrayList localArrayList = null;
    String str2 = null;
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
        i = a.f(paramParcel, k);
        break;
      case 2: 
        str8 = a.k(paramParcel, k);
        break;
      case 3: 
        str7 = a.k(paramParcel, k);
        break;
      case 4: 
        str6 = a.k(paramParcel, k);
        break;
      case 5: 
        str5 = a.k(paramParcel, k);
        break;
      case 6: 
        localUri = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 7: 
        str4 = a.k(paramParcel, k);
        break;
      case 8: 
        l = a.h(paramParcel, k);
        break;
      case 9: 
        str3 = a.k(paramParcel, k);
        break;
      case 10: 
        localArrayList = a.c(paramParcel, k, Scope.CREATOR);
        break;
      case 11: 
        str2 = a.k(paramParcel, k);
        break;
      case 12: 
        str1 = a.k(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new GoogleSignInAccount(i, str8, str7, str6, str5, localUri, str4, l, str3, localArrayList, str2, str1);
  }
  
  public GoogleSignInAccount[] a(int paramInt)
  {
    return new GoogleSignInAccount[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */