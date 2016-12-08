package com.appsee;

import org.json.JSONObject;

class od
{
  private float A;
  private double B;
  private float G;
  private double l;
  
  public od(double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2)
  {
    this.l = paramDouble1;
    this.B = paramDouble2;
    this.G = paramFloat1;
    this.A = paramFloat2;
  }
  
  public double C()
  {
    return this.l;
  }
  
  public float C()
  {
    return this.G;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(qc.C("\030f "), this.l);
    localJSONObject.put(bc.C("\020\032;"), this.B);
    localJSONObject.put(qc.C("\034F7d!u5d-"), this.G);
    localJSONObject.put(bc.C("\n5?\027)\006=\027%"), this.A);
    return localJSONObject;
  }
  
  public void C(double paramDouble)
  {
    this.B = paramDouble;
  }
  
  public void C(float paramFloat)
  {
    this.G = paramFloat;
  }
  
  public double H()
  {
    return this.B;
  }
  
  public float H()
  {
    return this.A;
  }
  
  public void H(double paramDouble)
  {
    this.l = paramDouble;
  }
  
  public void H(float paramFloat)
  {
    this.A = paramFloat;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\od.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */