package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ProxyGrpcRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ProxyGrpcRequest> CREATOR = new b();
  final int a;
  public final String b;
  public final int c;
  public final long d;
  public final byte[] e;
  public final String f;
  
  ProxyGrpcRequest(int paramInt1, String paramString1, int paramInt2, long paramLong, byte[] paramArrayOfByte, String paramString2)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramInt2;
    this.d = paramLong;
    this.e = paramArrayOfByte;
    this.f = paramString2;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\proxy\ProxyGrpcRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */