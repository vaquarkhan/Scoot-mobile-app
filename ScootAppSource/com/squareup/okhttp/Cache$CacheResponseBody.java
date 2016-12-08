package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache.Snapshot;
import d.j;
import d.r;

class Cache$CacheResponseBody
  extends ResponseBody
{
  private final j bodySource;
  private final String contentLength;
  private final String contentType;
  private final DiskLruCache.Snapshot snapshot;
  
  public Cache$CacheResponseBody(DiskLruCache.Snapshot paramSnapshot, String paramString1, String paramString2)
  {
    this.snapshot = paramSnapshot;
    this.contentType = paramString1;
    this.contentLength = paramString2;
    this.bodySource = r.a(new Cache.CacheResponseBody.1(this, paramSnapshot.getSource(1), paramSnapshot));
  }
  
  public long contentLength()
  {
    long l = -1L;
    try
    {
      if (this.contentLength != null) {
        l = Long.parseLong(this.contentLength);
      }
      return l;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return -1L;
  }
  
  public MediaType contentType()
  {
    if (this.contentType != null) {
      return MediaType.parse(this.contentType);
    }
    return null;
  }
  
  public j source()
  {
    return this.bodySource;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Cache$CacheResponseBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */