package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache.Editor;
import d.ac;
import d.m;

class Cache$CacheRequestImpl$1
  extends m
{
  Cache$CacheRequestImpl$1(Cache.CacheRequestImpl paramCacheRequestImpl, ac paramac, Cache paramCache, DiskLruCache.Editor paramEditor)
  {
    super(paramac);
  }
  
  public void close()
  {
    synchronized (this.this$1.this$0)
    {
      if (Cache.CacheRequestImpl.access$700(this.this$1)) {
        return;
      }
      Cache.CacheRequestImpl.access$702(this.this$1, true);
      Cache.access$808(this.this$1.this$0);
      super.close();
      this.val$editor.commit();
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Cache$CacheRequestImpl$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */