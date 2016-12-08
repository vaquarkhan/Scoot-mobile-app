package com.appsee;

import org.json.JSONObject;

class tb
{
  private String A;
  private String B;
  private boolean G;
  private boolean l;
  
  public tb() {}
  
  public tb(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.B = paramString1;
    this.A = paramString2;
    this.G = paramBoolean1;
    this.l = paramBoolean2;
  }
  
  public String C()
  {
    return this.B;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(fc.C("i"), this.B);
    localJSONObject.put(kl.C("1"), this.A);
    localJSONObject.put(fc.C("b"), this.G);
    localJSONObject.put(kl.C("7"), this.l);
    return localJSONObject;
  }
  
  public void C(String paramString)
  {
    this.A = paramString;
  }
  
  public void C(boolean paramBoolean)
  {
    this.G = paramBoolean;
  }
  
  public boolean C()
  {
    return this.G;
  }
  
  public String H()
  {
    return this.A;
  }
  
  public void H(String paramString)
  {
    this.B = paramString;
  }
  
  public void H(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public boolean H()
  {
    return this.l;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */