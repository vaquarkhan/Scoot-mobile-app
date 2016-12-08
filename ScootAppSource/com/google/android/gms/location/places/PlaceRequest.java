package com.google.android.gms.location.places;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.concurrent.TimeUnit;

public final class PlaceRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<PlaceRequest> CREATOR = new aa();
  static final long a = TimeUnit.SECONDS.toMillis(20L);
  static final long b = TimeUnit.MINUTES.toMillis(5L);
  static final long c = TimeUnit.MINUTES.toMillis(40L);
  static final long d = TimeUnit.HOURS.toMillis(1L);
  static final long e = b;
  final int f;
  private final PlaceFilter g;
  private final long h;
  private final int i;
  private final long j;
  
  public PlaceRequest(int paramInt1, PlaceFilter paramPlaceFilter, long paramLong1, int paramInt2, long paramLong2)
  {
    this.f = paramInt1;
    this.g = paramPlaceFilter;
    this.h = paramLong1;
    this.i = paramInt2;
    this.j = paramLong2;
  }
  
  public PlaceFilter a()
  {
    return this.g;
  }
  
  public long b()
  {
    return this.h;
  }
  
  public int c()
  {
    return this.i;
  }
  
  public long d()
  {
    return this.j;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceRequest)) {
        return false;
      }
      paramObject = (PlaceRequest)paramObject;
    } while ((br.a(this.g, ((PlaceRequest)paramObject).g)) && (this.h == ((PlaceRequest)paramObject).h) && (this.i == ((PlaceRequest)paramObject).i) && (this.j == ((PlaceRequest)paramObject).j));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.g, Long.valueOf(this.h), Integer.valueOf(this.i), Long.valueOf(this.j) });
  }
  
  @SuppressLint({"DefaultLocale"})
  public String toString()
  {
    return br.a(this).a("filter", this.g).a("interval", Long.valueOf(this.h)).a("priority", Integer.valueOf(this.i)).a("expireAt", Long.valueOf(this.j)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    aa.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\PlaceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */