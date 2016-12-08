package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import d.ad;
import d.ae;
import d.f;
import d.i;
import d.j;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

class HttpEngine$2
  implements ad
{
  boolean cacheRequestClosed;
  
  HttpEngine$2(HttpEngine paramHttpEngine, j paramj, CacheRequest paramCacheRequest, i parami) {}
  
  public void close()
  {
    if ((!this.cacheRequestClosed) && (!Util.discard(this, 100, TimeUnit.MILLISECONDS)))
    {
      this.cacheRequestClosed = true;
      this.val$cacheRequest.abort();
    }
    this.val$source.close();
  }
  
  public long read(f paramf, long paramLong)
  {
    try
    {
      paramLong = this.val$source.read(paramf, paramLong);
      if (paramLong == -1L)
      {
        if (!this.cacheRequestClosed)
        {
          this.cacheRequestClosed = true;
          this.val$cacheBody.close();
        }
        return -1L;
      }
    }
    catch (IOException paramf)
    {
      if (!this.cacheRequestClosed)
      {
        this.cacheRequestClosed = true;
        this.val$cacheRequest.abort();
      }
      throw paramf;
    }
    paramf.a(this.val$cacheBody.b(), paramf.a() - paramLong, paramLong);
    this.val$cacheBody.w();
    return paramLong;
  }
  
  public ae timeout()
  {
    return this.val$source.timeout();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpEngine$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */