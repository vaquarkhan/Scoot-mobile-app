package com.tushar.taxiapp.scootapp;

import android.content.SharedPreferences;
import com.b.a.a.q;
import com.b.a.x;
import com.b.a.y;
import java.util.HashMap;
import java.util.Map;

final class aa
  extends q
{
  aa(OlaBooking paramOlaBooking, int paramInt, String paramString1, y paramy, x paramx, String paramString2)
  {
    super(paramInt, paramString1, paramy, paramx);
  }
  
  public Map<String, String> i()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("Authorization", "Bearer " + this.b.getSharedPreferences("olaUser", 0).getString("access_token", "null"));
    localHashMap.put("X-APP-TOKEN", "0c65eea5e8f94f3e84739b02512df022");
    return localHashMap;
  }
  
  public Map<String, String> n()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("booking_id", this.a);
    localHashMap.put("reason", "Changed my mind");
    return localHashMap;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */