package com.scootapp.tv.services;

import android.content.SharedPreferences;
import com.b.a.a.n;
import com.b.a.x;
import com.b.a.y;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class c
  extends n
{
  c(OlaBookingTrackingService paramOlaBookingTrackingService, String paramString, JSONObject paramJSONObject, y paramy, x paramx)
  {
    super(paramString, paramJSONObject, paramy, paramx);
  }
  
  public Map<String, String> i()
  {
    HashMap localHashMap = new HashMap();
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("olaUser", 0);
    localHashMap.put("Authorization", "Bearer " + localSharedPreferences.getString("access_token", "null"));
    localHashMap.put("X-APP-TOKEN", "0c65eea5e8f94f3e84739b02512df022");
    return localHashMap;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\services\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */