package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ProxyRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ProxyRequest> CREATOR = new c();
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 4;
  public static final int f = 5;
  public static final int g = 6;
  public static final int h = 7;
  public static final int i = 7;
  final int j;
  public final String k;
  public final int l;
  public final long m;
  public final byte[] n;
  Bundle o;
  
  ProxyRequest(int paramInt1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    this.j = paramInt1;
    this.k = paramString;
    this.l = paramInt2;
    this.m = paramLong;
    this.n = paramArrayOfByte;
    this.o = paramBundle;
  }
  
  public String toString()
  {
    String str = this.k;
    int i1 = this.l;
    return String.valueOf(str).length() + 42 + "ProxyRequest[ url: " + str + ", method: " + i1 + " ]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\proxy\ProxyRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */