package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class NetworkQueryController$2
  implements m<JSONObject, Integer>
{
  NetworkQueryController$2(NetworkQueryController paramNetworkQueryController) {}
  
  public Integer then(o<JSONObject> paramo)
  {
    return Integer.valueOf(((JSONObject)paramo.f()).optInt("count"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkQueryController$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */