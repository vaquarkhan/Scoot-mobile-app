package com.parse;

import a.m;
import a.o;
import java.util.List;
import org.json.JSONObject;

class NetworkQueryController$1
  implements m<JSONObject, List<T>>
{
  NetworkQueryController$1(NetworkQueryController paramNetworkQueryController, ParseQuery.State paramState, ParseRESTCommand paramParseRESTCommand, long paramLong1, long paramLong2) {}
  
  public List<T> then(o<JSONObject> paramo)
  {
    Object localObject = (JSONObject)paramo.f();
    ParseQuery.CachePolicy localCachePolicy = this.val$state.cachePolicy();
    if ((localCachePolicy != null) && (localCachePolicy != ParseQuery.CachePolicy.IGNORE_CACHE)) {
      ParseKeyValueCache.saveToKeyValueCache(this.val$command.getCacheKey(), ((JSONObject)localObject).toString());
    }
    long l1 = System.nanoTime();
    paramo = this.this$0.convertFindResponse(this.val$state, (JSONObject)paramo.f());
    long l2 = System.nanoTime();
    if (((JSONObject)localObject).has("trace"))
    {
      localObject = ((JSONObject)localObject).get("trace");
      PLog.d("ParseQuery", String.format("Query pre-processing took %f seconds\n%s\nClient side parsing took %f seconds\n", new Object[] { Float.valueOf((float)(this.val$querySent - this.val$queryStart) / 1000000.0F), localObject, Float.valueOf((float)(l2 - l1) / 1000000.0F) }));
    }
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkQueryController$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */