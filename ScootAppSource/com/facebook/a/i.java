package com.facebook.a;

import android.os.Bundle;
import com.facebook.av;
import com.facebook.b.ag;
import com.facebook.p;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class i
  implements Serializable
{
  private static final HashSet<String> c = new HashSet();
  private JSONObject a;
  private boolean b;
  private String d;
  
  public i(String paramString1, String paramString2, Double paramDouble, Bundle paramBundle, boolean paramBoolean)
  {
    try
    {
      a(paramString2);
      this.d = paramString2;
      this.b = paramBoolean;
      this.a = new JSONObject();
      this.a.put("_eventName", paramString2);
      this.a.put("_logTime", System.currentTimeMillis() / 1000L);
      this.a.put("_ui", paramString1);
      if (paramDouble != null) {
        this.a.put("_valueToSum", paramDouble.doubleValue());
      }
      if (this.b) {
        this.a.put("_implicitlyLogged", "1");
      }
      if (paramBundle == null) {
        break label265;
      }
      paramString1 = paramBundle.keySet().iterator();
    }
    catch (JSONException paramString1)
    {
      for (;;)
      {
        ag.a(av.e, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] { paramString1.toString() });
        this.a = null;
        return;
        this.a.put(paramString2, paramDouble.toString());
      }
    }
    catch (p paramString1)
    {
      ag.a(av.e, "AppEvents", "Invalid app event name or parameter:", new Object[] { paramString1.toString() });
      this.a = null;
      return;
    }
    if (paramString1.hasNext())
    {
      paramString2 = (String)paramString1.next();
      a(paramString2);
      paramDouble = paramBundle.get(paramString2);
      if ((!(paramDouble instanceof String)) && (!(paramDouble instanceof Number))) {
        throw new p(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] { paramDouble, paramString2 }));
      }
    }
    label265:
    while (this.b) {}
    ag.a(av.e, "AppEvents", "Created app event '%s'", new Object[] { this.a.toString() });
  }
  
  private void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramString.length() > 40))
    {
      ??? = paramString;
      if (paramString == null) {
        ??? = "<None Provided>";
      }
      throw new p(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] { ???, Integer.valueOf(40) }));
    }
    synchronized (c)
    {
      boolean bool = c.contains(paramString);
      if (!bool) {
        if (!paramString.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
          break label117;
        }
      }
    }
    synchronized (c)
    {
      c.add(paramString);
      return;
      paramString = finally;
      throw paramString;
    }
    label117:
    throw new p(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[] { paramString }));
  }
  
  public String a()
  {
    return this.d;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public JSONObject c()
  {
    return this.a;
  }
  
  public String toString()
  {
    return String.format("\"%s\", implicit: %b, json: %s", new Object[] { this.a.optString("_eventName"), Boolean.valueOf(this.b), this.a.toString() });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */