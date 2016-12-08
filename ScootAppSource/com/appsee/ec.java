package com.appsee;

import org.json.JSONObject;

class ec
{
  private long A;
  ml l;
  
  public ec(long paramLong, ml paramml)
  {
    this.A = paramLong;
    this.l = paramml;
  }
  
  public long C()
  {
    return this.A;
  }
  
  public ml C()
  {
    return this.l;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(qc.C(" "), C());
    localJSONObject.put(qc.C(";"), this.l.ordinal());
    return localJSONObject;
  }
  
  public void C(long paramLong)
  {
    this.A = paramLong;
  }
  
  public void C(ml paramml)
  {
    this.l = paramml;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */