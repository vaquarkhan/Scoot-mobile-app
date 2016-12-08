package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class NetworkQueryController$3
  implements m<JSONObject, o<JSONObject>>
{
  NetworkQueryController$3(NetworkQueryController paramNetworkQueryController, ParseQuery.State paramState, ParseRESTCommand paramParseRESTCommand) {}
  
  public o<JSONObject> then(o<JSONObject> paramo)
  {
    Object localObject = this.val$state.cachePolicy();
    if ((localObject != null) && (localObject != ParseQuery.CachePolicy.IGNORE_CACHE))
    {
      localObject = (JSONObject)paramo.f();
      ParseKeyValueCache.saveToKeyValueCache(this.val$command.getCacheKey(), ((JSONObject)localObject).toString());
    }
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkQueryController$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */