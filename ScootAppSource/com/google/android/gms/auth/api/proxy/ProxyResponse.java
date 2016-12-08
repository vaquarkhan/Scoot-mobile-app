package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ProxyResponse
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ProxyResponse> CREATOR = new d();
  final int a;
  public final int b;
  public final PendingIntent c;
  public final int d;
  final Bundle e;
  public final byte[] f;
  
  ProxyResponse(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, int paramInt3, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.d = paramInt3;
    this.e = paramBundle;
    this.f = paramArrayOfByte;
    this.c = paramPendingIntent;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\proxy\ProxyResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */