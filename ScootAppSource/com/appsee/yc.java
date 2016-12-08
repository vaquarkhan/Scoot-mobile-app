package com.appsee;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class yc
{
  private String A;
  private List<String> B;
  private String G;
  private String l;
  
  public yc(String paramString1, String paramString2, List<String> paramList)
  {
    this.A = paramString1;
    this.l = paramString2;
    this.B = paramList;
    if (this.A == null) {
      this.A = "";
    }
    if (this.l == null) {
      this.l = "";
    }
    C();
  }
  
  public String C()
  {
    return this.G;
  }
  
  public List<String> C()
  {
    return this.B;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    JSONArray localJSONArray = new JSONArray();
    if (this.B != null)
    {
      Iterator localIterator = this.B.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put((String)localIterator.next());
      }
    }
    localJSONObject.put(qc.C("'"), this.G);
    localJSONObject.put(kl.C("3"), this.A);
    localJSONObject.put(qc.C(","), this.l);
    localJSONObject.put(kl.C("("), localJSONArray);
    return localJSONObject;
  }
  
  public void C(String paramString)
  {
    this.l = paramString;
  }
  
  public void C(List<String> paramList)
  {
    this.B = paramList;
  }
  
  public String H()
  {
    return this.A;
  }
  
  public void H(String paramString)
  {
    this.A = paramString;
  }
  
  public String a()
  {
    return this.l;
  }
  
  public void a(String paramString)
  {
    this.G = paramString;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\yc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */