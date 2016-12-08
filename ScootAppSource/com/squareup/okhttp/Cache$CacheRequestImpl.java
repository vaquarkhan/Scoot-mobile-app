package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache.Editor;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.CacheRequest;
import d.ac;
import java.io.IOException;

final class Cache$CacheRequestImpl
  implements CacheRequest
{
  private ac body;
  private ac cacheOut;
  private boolean done;
  private final DiskLruCache.Editor editor;
  
  public Cache$CacheRequestImpl(Cache paramCache, DiskLruCache.Editor paramEditor)
  {
    this.editor = paramEditor;
    this.cacheOut = paramEditor.newSink(1);
    this.body = new Cache.CacheRequestImpl.1(this, this.cacheOut, paramCache, paramEditor);
  }
  
  public void abort()
  {
    synchronized (this.this$0)
    {
      if (this.done) {
        return;
      }
      this.done = true;
      Cache.access$908(this.this$0);
      Util.closeQuietly(this.cacheOut);
      try
      {
        this.editor.abort();
        return;
      }
      catch (IOException localIOException) {}
    }
  }
  
  public ac body()
  {
    return this.body;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Cache$CacheRequestImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */