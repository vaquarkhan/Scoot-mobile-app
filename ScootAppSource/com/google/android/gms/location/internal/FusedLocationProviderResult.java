package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class FusedLocationProviderResult
  extends AbstractSafeParcelable
  implements x
{
  public static final Parcelable.Creator<FusedLocationProviderResult> CREATOR = new i();
  public static final FusedLocationProviderResult a = new FusedLocationProviderResult(Status.a);
  private final int b;
  private final Status c;
  
  FusedLocationProviderResult(int paramInt, Status paramStatus)
  {
    this.b = paramInt;
    this.c = paramStatus;
  }
  
  public FusedLocationProviderResult(Status paramStatus)
  {
    this(1, paramStatus);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public Status b()
  {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\FusedLocationProviderResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */