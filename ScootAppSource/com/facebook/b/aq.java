package com.facebook.b;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

final class aq
{
  private static final ConcurrentHashMap<String, JSONObject> a = new ConcurrentHashMap();
  
  public static JSONObject a(String paramString)
  {
    return (JSONObject)a.get(paramString);
  }
  
  public static void a(String paramString, JSONObject paramJSONObject)
  {
    a.put(paramString, paramJSONObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */