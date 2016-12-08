package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CredentialRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<CredentialRequest> CREATOR = new h();
  final int a;
  private final boolean b;
  private final String[] c;
  private final CredentialPickerConfig d;
  private final CredentialPickerConfig e;
  
  CredentialRequest(int paramInt, boolean paramBoolean, String[] paramArrayOfString, CredentialPickerConfig paramCredentialPickerConfig1, CredentialPickerConfig paramCredentialPickerConfig2)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = ((String[])com.google.android.gms.common.internal.b.a(paramArrayOfString));
    paramArrayOfString = paramCredentialPickerConfig1;
    if (paramCredentialPickerConfig1 == null) {
      paramArrayOfString = new b().a();
    }
    this.d = paramArrayOfString;
    paramArrayOfString = paramCredentialPickerConfig2;
    if (paramCredentialPickerConfig2 == null) {
      paramArrayOfString = new b().a();
    }
    this.e = paramArrayOfString;
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public String[] b()
  {
    return this.c;
  }
  
  public CredentialPickerConfig c()
  {
    return this.d;
  }
  
  public CredentialPickerConfig d()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\CredentialRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */