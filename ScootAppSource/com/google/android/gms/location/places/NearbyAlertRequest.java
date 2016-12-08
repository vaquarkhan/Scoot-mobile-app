package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Set;

public final class NearbyAlertRequest
  extends AbstractSafeParcelable
{
  public static final v CREATOR = new v();
  private final int a;
  private final int b;
  private final int c;
  @Deprecated
  private final PlaceFilter d;
  private final NearbyAlertFilter e;
  private final boolean f;
  private final int g;
  private int h = 110;
  
  NearbyAlertRequest(int paramInt1, int paramInt2, int paramInt3, PlaceFilter paramPlaceFilter, NearbyAlertFilter paramNearbyAlertFilter, boolean paramBoolean, int paramInt4, int paramInt5)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    if (paramNearbyAlertFilter != null) {
      this.e = paramNearbyAlertFilter;
    }
    for (;;)
    {
      this.d = null;
      this.f = paramBoolean;
      this.g = paramInt4;
      this.h = paramInt5;
      return;
      if (paramPlaceFilter != null)
      {
        if ((paramPlaceFilter.a() != null) && (!paramPlaceFilter.a().isEmpty())) {
          this.e = NearbyAlertFilter.a(paramPlaceFilter.a());
        } else if ((paramPlaceFilter.b() != null) && (!paramPlaceFilter.b().isEmpty())) {
          this.e = NearbyAlertFilter.b(paramPlaceFilter.b());
        } else {
          this.e = null;
        }
      }
      else {
        this.e = null;
      }
    }
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  @Deprecated
  public PlaceFilter d()
  {
    return null;
  }
  
  public NearbyAlertFilter e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof NearbyAlertRequest)) {
        return false;
      }
      paramObject = (NearbyAlertRequest)paramObject;
    } while ((this.b == ((NearbyAlertRequest)paramObject).b) && (this.c == ((NearbyAlertRequest)paramObject).c) && (br.a(this.e, ((NearbyAlertRequest)paramObject).e)) && (this.h == ((NearbyAlertRequest)paramObject).h));
    return false;
  }
  
  public boolean f()
  {
    return this.f;
  }
  
  public int g()
  {
    return this.g;
  }
  
  public int h()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), this.e, Integer.valueOf(this.h) });
  }
  
  public String toString()
  {
    return br.a(this).a("transitionTypes", Integer.valueOf(this.b)).a("loiteringTimeMillis", Integer.valueOf(this.c)).a("nearbyAlertFilter", this.e).a("priority", Integer.valueOf(this.h)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    v.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\NearbyAlertRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */