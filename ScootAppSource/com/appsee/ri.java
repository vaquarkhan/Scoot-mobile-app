package com.appsee;

import org.json.JSONArray;
import org.json.JSONObject;

class ri
{
  private boolean A;
  private StackTraceElement[] G;
  private String M;
  private long l;
  
  public ri(he paramhe, long paramLong, String paramString, boolean paramBoolean, StackTraceElement[] paramArrayOfStackTraceElement)
  {
    this.l = paramLong;
    this.M = paramString;
    this.A = paramBoolean;
    this.G = paramArrayOfStackTraceElement;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(lb.C("r"), this.l);
    localJSONObject.put(fc.C("i"), this.M);
    localJSONObject.put(lb.C("x"), this.A);
    JSONArray localJSONArray = new JSONArray();
    int j = 0;
    for (int i = 0; j < this.G.length; i = j)
    {
      he localhe = this.B;
      StackTraceElement[] arrayOfStackTraceElement = this.G;
      j = i + 1;
      localJSONArray.put(he.C(localhe, arrayOfStackTraceElement[i]));
    }
    localJSONObject.put(fc.C("ns"), localJSONArray);
    return localJSONObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\ri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */