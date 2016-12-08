package com.facebook.b;

import android.content.Context;
import com.facebook.av;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  private static final Map<c, String> a = new b();
  
  public static JSONObject a(c paramc, d paramd, String paramString, boolean paramBoolean, Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("event", a.get(paramc));
    as.a(localJSONObject, paramd, paramString, paramBoolean);
    try
    {
      as.a(localJSONObject, paramContext);
      localJSONObject.put("application_package_name", paramContext.getPackageName());
      return localJSONObject;
    }
    catch (Exception paramc)
    {
      for (;;)
      {
        ag.a(av.e, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] { paramc.toString() });
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */