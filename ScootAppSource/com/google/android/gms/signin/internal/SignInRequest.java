package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<SignInRequest> CREATOR = new l();
  final int a;
  final ResolveAccountRequest b;
  
  SignInRequest(int paramInt, ResolveAccountRequest paramResolveAccountRequest)
  {
    this.a = paramInt;
    this.b = paramResolveAccountRequest;
  }
  
  public SignInRequest(ResolveAccountRequest paramResolveAccountRequest)
  {
    this(1, paramResolveAccountRequest);
  }
  
  public ResolveAccountRequest a()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\signin\internal\SignInRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */