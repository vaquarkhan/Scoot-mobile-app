package com.appsee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class dl
{
  private static dl l;
  private Map<String, Boolean> A;
  
  public static dl C()
  {
    try
    {
      if (l == null) {
        l = new dl();
      }
      dl localdl = l;
      return localdl;
    }
    finally {}
  }
  
  public JSONObject C()
  {
    if ((this.A == null) || (this.A.isEmpty())) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      Iterator localIterator = this.A.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localJSONObject.put(str, this.A.get(str));
      }
      if (localJSONObject.length() != 0) {
        break label108;
      }
    }
    catch (JSONException localJSONException)
    {
      ue.C(localJSONException, sc.C("'{\020f\020)\025a\013e\007)\021l\020`\003e\013s\013g\005)\007q\026l\020g\003eBz\006b\021"));
    }
    localJSONObject = null;
    label108:
    for (;;)
    {
      this.A = null;
      return localJSONObject;
    }
  }
  
  public void C(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {}
    for (;;)
    {
      return;
      this.A = new HashMap();
      int i = 0;
      for (int j = 0; i < paramJSONArray.length(); j = i)
      {
        try
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(j);
          if (localJSONObject != null)
          {
            boolean bool = C(localJSONObject.getJSONArray(nc.C("\0073%,7:7")));
            this.A.put((String)localJSONObject.get(sc.C("1m\tG\003d\007")), Boolean.valueOf(bool));
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            ue.C(localException, nc.C("\0326-+-d;!+!<06*8d:<+!-*>(7;/"));
          }
        }
        i = j + 1;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */