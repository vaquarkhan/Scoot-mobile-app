package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GeneratePasswordRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GeneratePasswordRequest> CREATOR = new e();
  final int a;
  private final PasswordSpecification b;
  
  GeneratePasswordRequest(int paramInt, PasswordSpecification paramPasswordSpecification)
  {
    this.a = paramInt;
    this.b = paramPasswordSpecification;
  }
  
  public PasswordSpecification a()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\internal\GeneratePasswordRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */