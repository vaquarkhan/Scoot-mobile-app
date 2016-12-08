package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLngBounds
  implements SafeParcelable
{
  public static final n CREATOR = new n();
  public final LatLng a;
  public final LatLng b;
  private final int c;
  
  LatLngBounds(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    b.a(paramLatLng1, "null southwest");
    b.a(paramLatLng2, "null northeast");
    if (paramLatLng2.a >= paramLatLng1.a) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool, "southern latitude exceeds northern latitude (%s > %s)", new Object[] { Double.valueOf(paramLatLng1.a), Double.valueOf(paramLatLng2.a) });
      this.c = paramInt;
      this.a = paramLatLng1;
      this.b = paramLatLng2;
      return;
    }
  }
  
  public LatLngBounds(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    this(1, paramLatLng1, paramLatLng2);
  }
  
  private static double c(double paramDouble1, double paramDouble2)
  {
    return (paramDouble1 - paramDouble2 + 360.0D) % 360.0D;
  }
  
  private static double d(double paramDouble1, double paramDouble2)
  {
    return (paramDouble2 - paramDouble1 + 360.0D) % 360.0D;
  }
  
  int a()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof LatLngBounds)) {
        return false;
      }
      paramObject = (LatLngBounds)paramObject;
    } while ((this.a.equals(((LatLngBounds)paramObject).a)) && (this.b.equals(((LatLngBounds)paramObject).b)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.a, this.b });
  }
  
  public String toString()
  {
    return br.a(this).a("southwest", this.a).a("northeast", this.b).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\LatLngBounds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */