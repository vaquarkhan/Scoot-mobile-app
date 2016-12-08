package com.facebook;

import android.util.Log;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

final class f
  implements ai
{
  f(d paramd, AtomicBoolean paramAtomicBoolean, Set paramSet1, Set paramSet2) {}
  
  public void a(as paramas)
  {
    paramas = paramas.b();
    if (paramas == null) {}
    do
    {
      return;
      paramas = paramas.optJSONArray("data");
    } while (paramas == null);
    this.a.set(true);
    int i = 0;
    label31:
    Object localObject;
    if (i < paramas.length())
    {
      localObject = paramas.optJSONObject(i);
      if (localObject != null) {
        break label58;
      }
    }
    for (;;)
    {
      i += 1;
      break label31;
      break;
      label58:
      String str = ((JSONObject)localObject).optString("permission");
      localObject = ((JSONObject)localObject).optString("status");
      if ((!com.facebook.b.as.a(str)) && (!com.facebook.b.as.a((String)localObject)))
      {
        localObject = ((String)localObject).toLowerCase(Locale.US);
        if (((String)localObject).equals("granted")) {
          this.b.add(str);
        } else if (((String)localObject).equals("declined")) {
          this.c.add(str);
        } else {
          Log.w("AccessTokenManager", "Unexpected status: " + (String)localObject);
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */