package com.squareup.okhttp;

import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.http.CacheRequest;
import com.squareup.okhttp.internal.http.CacheStrategy;

class Cache$1
  implements InternalCache
{
  Cache$1(Cache paramCache) {}
  
  public Response get(Request paramRequest)
  {
    return this.this$0.get(paramRequest);
  }
  
  public CacheRequest put(Response paramResponse)
  {
    return Cache.access$000(this.this$0, paramResponse);
  }
  
  public void remove(Request paramRequest)
  {
    Cache.access$100(this.this$0, paramRequest);
  }
  
  public void trackConditionalCacheHit()
  {
    Cache.access$300(this.this$0);
  }
  
  public void trackResponse(CacheStrategy paramCacheStrategy)
  {
    Cache.access$400(this.this$0, paramCacheStrategy);
  }
  
  public void update(Response paramResponse1, Response paramResponse2)
  {
    Cache.access$200(this.this$0, paramResponse1, paramResponse2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Cache$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */