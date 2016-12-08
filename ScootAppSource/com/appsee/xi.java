package com.appsee;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

class xi
{
  private long A;
  private String G;
  private Map<String, Object> l;
  
  public xi(String paramString, long paramLong, Map<String, Object> paramMap)
  {
    this.G = paramString;
    this.A = paramLong;
    this.l = paramMap;
  }
  
  public long C()
  {
    return this.A;
  }
  
  public String C()
  {
    return this.G;
  }
  
  public Map<String, Object> C()
  {
    return this.l;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put(rd.C("K"), C());
    localJSONObject1.put(qi.C(" "), C());
    if ((this.l != null) && (!this.l.isEmpty()))
    {
      JSONObject localJSONObject2 = new JSONObject();
      Iterator localIterator = this.l.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localJSONObject2.put((String)localEntry.getKey(), localEntry.getValue());
      }
      localJSONObject1.put(rd.C("U"), localJSONObject2);
    }
    return localJSONObject1;
  }
  
  public void C(long paramLong)
  {
    this.A = paramLong;
  }
  
  public void C(String paramString)
  {
    this.G = paramString;
  }
  
  public void C(Map<String, Object> paramMap)
  {
    this.l = paramMap;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\xi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */