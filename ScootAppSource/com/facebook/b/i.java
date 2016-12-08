package com.facebook.b;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i
{
  private static final Map<Class<?>, q> a = new HashMap();
  
  static
  {
    a.put(Boolean.class, new j());
    a.put(Integer.class, new k());
    a.put(Long.class, new l());
    a.put(Double.class, new m());
    a.put(String.class, new n());
    a.put(String[].class, new o());
    a.put(JSONArray.class, new p());
  }
  
  public static Bundle a(JSONObject paramJSONObject)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramJSONObject.get(str);
      if ((localObject != null) && (localObject != JSONObject.NULL)) {
        if ((localObject instanceof JSONObject))
        {
          localBundle.putBundle(str, a((JSONObject)localObject));
        }
        else
        {
          q localq = (q)a.get(localObject.getClass());
          if (localq == null) {
            throw new IllegalArgumentException("Unsupported type: " + localObject.getClass());
          }
          localq.a(localBundle, str, localObject);
        }
      }
    }
    return localBundle;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */