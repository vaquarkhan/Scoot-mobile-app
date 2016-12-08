package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInAccount
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<SignInAccount> CREATOR = new h();
  final int a;
  @Deprecated
  String b;
  @Deprecated
  String c;
  private GoogleSignInAccount d;
  
  SignInAccount(int paramInt, String paramString1, GoogleSignInAccount paramGoogleSignInAccount, String paramString2)
  {
    this.a = paramInt;
    this.d = paramGoogleSignInAccount;
    this.b = b.a(paramString1, "8.3 and 8.4 SDKs require non-null email");
    this.c = b.a(paramString2, "8.3 and 8.4 SDKs require non-null userId");
  }
  
  public GoogleSignInAccount a()
  {
    return this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\SignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */