package com.google.android.gms.maps.model;

public final class c
{
  private LatLng a;
  private float b;
  private float c;
  private float d;
  
  public CameraPosition a()
  {
    return new CameraPosition(this.a, this.b, this.c, this.d);
  }
  
  public c a(float paramFloat)
  {
    this.b = paramFloat;
    return this;
  }
  
  public c a(LatLng paramLatLng)
  {
    this.a = paramLatLng;
    return this;
  }
  
  public c b(float paramFloat)
  {
    this.c = paramFloat;
    return this;
  }
  
  public c c(float paramFloat)
  {
    this.d = paramFloat;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */