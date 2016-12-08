package com.parse;

import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

class CacheQueryController$4
  implements Callable<Integer>
{
  CacheQueryController$4(CacheQueryController paramCacheQueryController, String paramString, ParseQuery.State paramState) {}
  
  public Integer call()
  {
    JSONObject localJSONObject = ParseKeyValueCache.jsonFromKeyValueCache(this.val$cacheKey, this.val$state.maxCacheAge());
    if (localJSONObject == null) {
      throw new ParseException(120, "results not cached");
    }
    try
    {
      int i = localJSONObject.getInt("count");
      return Integer.valueOf(i);
    }
    catch (JSONException localJSONException)
    {
      throw new ParseException(120, "the cache contains corrupted json");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CacheQueryController$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */