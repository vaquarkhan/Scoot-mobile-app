package com.facebook.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

final class at
  implements Runnable
{
  at(Context paramContext, String paramString1, String paramString2) {}
  
  public void run()
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
    Object localObject1 = localSharedPreferences.getString(this.b, null);
    if (!as.a((String)localObject1)) {}
    try
    {
      localObject1 = new JSONObject((String)localObject1);
      if (localObject1 != null) {
        as.a(this.c, (JSONObject)localObject1);
      }
      localObject1 = as.e(this.c);
      if (localObject1 != null)
      {
        as.a(this.c, (JSONObject)localObject1);
        localSharedPreferences.edit().putString(this.b, ((JSONObject)localObject1).toString()).apply();
      }
      as.a().set(false);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        as.a("FacebookSDK", localJSONException);
        Object localObject2 = null;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */