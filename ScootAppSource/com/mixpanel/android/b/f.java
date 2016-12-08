package com.mixpanel.android.b;

import org.json.JSONObject;

public final class f
{
  public static String a(JSONObject paramJSONObject, String paramString)
  {
    if ((paramJSONObject.has(paramString)) && (!paramJSONObject.isNull(paramString))) {
      return paramJSONObject.getString(paramString);
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */