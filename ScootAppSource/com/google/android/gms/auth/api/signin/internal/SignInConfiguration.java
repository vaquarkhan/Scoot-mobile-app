package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SignInConfiguration
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<SignInConfiguration> CREATOR = new t();
  final int a;
  private final String b;
  private GoogleSignInOptions c;
  
  SignInConfiguration(int paramInt, String paramString, GoogleSignInOptions paramGoogleSignInOptions)
  {
    this.a = paramInt;
    this.b = b.a(paramString);
    this.c = paramGoogleSignInOptions;
  }
  
  public SignInConfiguration(String paramString, GoogleSignInOptions paramGoogleSignInOptions)
  {
    this(3, paramString, paramGoogleSignInOptions);
  }
  
  public String a()
  {
    return this.b;
  }
  
  public GoogleSignInOptions b()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return false;
      try
      {
        paramObject = (SignInConfiguration)paramObject;
        if (this.b.equals(((SignInConfiguration)paramObject).a())) {
          if (this.c == null)
          {
            if (((SignInConfiguration)paramObject).b() != null) {
              continue;
            }
          }
          else
          {
            boolean bool = this.c.equals(((SignInConfiguration)paramObject).b());
            if (!bool) {
              continue;
            }
          }
        }
      }
      catch (ClassCastException paramObject)
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    return new j().a(this.b).a(this.c).a();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\SignInConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */