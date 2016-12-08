package com.sagar.taxiapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class dg
{
  private List<HashMap<String, String>> a(JSONArray paramJSONArray)
  {
    int j = paramJSONArray.length();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      if (i < j) {
        try
        {
          localArrayList.add(b((JSONObject)paramJSONArray.get(i)));
          i += 1;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            localJSONException.printStackTrace();
          }
        }
      }
    }
    return localArrayList;
  }
  
  private HashMap<String, String> b(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      String str1 = paramJSONObject.getString("description");
      String str2 = paramJSONObject.getString("id");
      String str3 = paramJSONObject.getString("reference");
      paramJSONObject = paramJSONObject.getString("place_id");
      localHashMap.put("description", str1);
      localHashMap.put("_id", str2);
      localHashMap.put("reference", str3);
      localHashMap.put("place_id", paramJSONObject);
      return localHashMap;
    }
    catch (JSONException paramJSONObject)
    {
      paramJSONObject.printStackTrace();
    }
    return localHashMap;
  }
  
  public List<HashMap<String, String>> a(JSONObject paramJSONObject)
  {
    Object localObject = null;
    try
    {
      paramJSONObject = paramJSONObject.getJSONArray("predictions");
      return a(paramJSONObject);
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        paramJSONObject.printStackTrace();
        paramJSONObject = (JSONObject)localObject;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */