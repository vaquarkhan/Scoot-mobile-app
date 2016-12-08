package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class ValidateAccountRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ValidateAccountRequest> CREATOR = new g();
  final int a;
  final IBinder b;
  private final int c;
  private final Scope[] d;
  private final Bundle e;
  private final String f;
  
  ValidateAccountRequest(int paramInt1, int paramInt2, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, String paramString)
  {
    this.a = paramInt1;
    this.c = paramInt2;
    this.b = paramIBinder;
    this.d = paramArrayOfScope;
    this.e = paramBundle;
    this.f = paramString;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public Scope[] b()
  {
    return this.d;
  }
  
  public String c()
  {
    return this.f;
  }
  
  public Bundle d()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\ValidateAccountRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */