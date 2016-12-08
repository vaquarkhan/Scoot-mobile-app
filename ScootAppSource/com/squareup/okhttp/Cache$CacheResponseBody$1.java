package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache.Snapshot;
import d.ad;
import d.n;

class Cache$CacheResponseBody$1
  extends n
{
  Cache$CacheResponseBody$1(Cache.CacheResponseBody paramCacheResponseBody, ad paramad, DiskLruCache.Snapshot paramSnapshot)
  {
    super(paramad);
  }
  
  public void close()
  {
    this.val$snapshot.close();
    super.close();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Cache$CacheResponseBody$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */