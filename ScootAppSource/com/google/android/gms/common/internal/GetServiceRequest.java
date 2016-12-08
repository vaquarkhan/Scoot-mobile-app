package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.j;
import java.util.Collection;

public class GetServiceRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GetServiceRequest> CREATOR = new ap();
  final int a;
  final int b;
  int c;
  String d;
  IBinder e;
  Scope[] f;
  Bundle g;
  Account h;
  long i;
  
  public GetServiceRequest(int paramInt)
  {
    this.a = 3;
    this.c = j.b;
    this.b = paramInt;
  }
  
  GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, long paramLong)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramString;
    if (paramInt1 < 2) {}
    for (this.h = a(paramIBinder);; this.h = paramAccount)
    {
      this.f = paramArrayOfScope;
      this.g = paramBundle;
      this.i = paramLong;
      return;
      this.e = paramIBinder;
    }
  }
  
  private Account a(IBinder paramIBinder)
  {
    Account localAccount = null;
    if (paramIBinder != null) {
      localAccount = a.a(bc.a(paramIBinder));
    }
    return localAccount;
  }
  
  public GetServiceRequest a(Account paramAccount)
  {
    this.h = paramAccount;
    return this;
  }
  
  public GetServiceRequest a(Bundle paramBundle)
  {
    this.g = paramBundle;
    return this;
  }
  
  public GetServiceRequest a(bb parambb)
  {
    if (parambb != null) {
      this.e = parambb.asBinder();
    }
    return this;
  }
  
  public GetServiceRequest a(String paramString)
  {
    this.d = paramString;
    return this;
  }
  
  public GetServiceRequest a(Collection<Scope> paramCollection)
  {
    this.f = ((Scope[])paramCollection.toArray(new Scope[paramCollection.size()]));
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ap.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\GetServiceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */