package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationAvailability
  extends AbstractSafeParcelable
{
  public static final f CREATOR = new f();
  int a;
  int b;
  long c;
  int d;
  private final int e;
  
  LocationAvailability(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    this.e = paramInt1;
    this.d = paramInt2;
    this.a = paramInt3;
    this.b = paramInt4;
    this.c = paramLong;
  }
  
  public boolean a()
  {
    return this.d < 1000;
  }
  
  int b()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof LocationAvailability)) {}
    do
    {
      return false;
      paramObject = (LocationAvailability)paramObject;
    } while ((this.d != ((LocationAvailability)paramObject).d) || (this.a != ((LocationAvailability)paramObject).a) || (this.b != ((LocationAvailability)paramObject).b) || (this.c != ((LocationAvailability)paramObject).c));
    return true;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c) });
  }
  
  public String toString()
  {
    boolean bool = a();
    return 48 + "LocationAvailability[isLocationAvailable: " + bool + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\LocationAvailability.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */