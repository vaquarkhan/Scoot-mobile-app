package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SaveRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<SaveRequest> CREATOR = new l();
  final int a;
  private final Credential b;
  
  SaveRequest(int paramInt, Credential paramCredential)
  {
    this.a = paramInt;
    this.b = paramCredential;
  }
  
  public Credential a()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\internal\SaveRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */