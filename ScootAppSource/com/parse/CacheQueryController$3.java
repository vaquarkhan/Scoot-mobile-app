package com.parse;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

class CacheQueryController$3
  implements Callable<List<T>>
{
  CacheQueryController$3(CacheQueryController paramCacheQueryController, String paramString, ParseQuery.State paramState) {}
  
  public List<T> call()
  {
    Object localObject = ParseKeyValueCache.jsonFromKeyValueCache(this.val$cacheKey, this.val$state.maxCacheAge());
    if (localObject == null) {
      throw new ParseException(120, "results not cached");
    }
    try
    {
      localObject = CacheQueryController.access$000(this.this$0).convertFindResponse(this.val$state, (JSONObject)localObject);
      return (List<T>)localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new ParseException(120, "the cache contains corrupted json");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CacheQueryController$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */