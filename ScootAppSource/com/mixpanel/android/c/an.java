package com.mixpanel.android.c;

import android.util.Log;
import com.mixpanel.android.mpmetrics.bd;
import org.json.JSONException;
import org.json.JSONObject;

final class an
  implements bd
{
  an(am paramam, JSONObject paramJSONObject) {}
  
  public JSONObject a(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject.put("$experiments", this.a);
      return paramJSONObject;
    }
    catch (JSONException localJSONException)
    {
      Log.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", localJSONException);
    }
    return paramJSONObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */