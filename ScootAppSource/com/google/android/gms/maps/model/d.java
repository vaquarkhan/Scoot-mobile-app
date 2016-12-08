package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.b;

public final class d
{
  private double a = Double.POSITIVE_INFINITY;
  private double b = Double.NEGATIVE_INFINITY;
  private double c = NaN.0D;
  private double d = NaN.0D;
  
  private boolean a(double paramDouble)
  {
    boolean bool = false;
    if (this.c <= this.d) {
      return (this.c <= paramDouble) && (paramDouble <= this.d);
    }
    if ((this.c <= paramDouble) || (paramDouble <= this.d)) {
      bool = true;
    }
    return bool;
  }
  
  public LatLngBounds a()
  {
    if (!Double.isNaN(this.c)) {}
    for (boolean bool = true;; bool = false)
    {
      b.a(bool, "no included points");
      return new LatLngBounds(new LatLng(this.a, this.c), new LatLng(this.b, this.d));
    }
  }
  
  public d a(LatLng paramLatLng)
  {
    this.a = Math.min(this.a, paramLatLng.a);
    this.b = Math.max(this.b, paramLatLng.a);
    double d1 = paramLatLng.b;
    if (Double.isNaN(this.c))
    {
      this.c = d1;
      this.d = d1;
    }
    while (a(d1)) {
      return this;
    }
    if (LatLngBounds.a(this.c, d1) < LatLngBounds.b(this.d, d1))
    {
      this.c = d1;
      return this;
    }
    this.d = d1;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */