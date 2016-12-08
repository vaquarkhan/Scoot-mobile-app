package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache;
import com.squareup.okhttp.internal.DiskLruCache.Snapshot;
import d.j;
import d.r;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Cache$2
  implements Iterator<String>
{
  boolean canRemove;
  final Iterator<DiskLruCache.Snapshot> delegate = Cache.access$600(this.this$0).snapshots();
  String nextUrl;
  
  Cache$2(Cache paramCache) {}
  
  public boolean hasNext()
  {
    if (this.nextUrl != null) {
      return true;
    }
    this.canRemove = false;
    while (this.delegate.hasNext())
    {
      DiskLruCache.Snapshot localSnapshot = (DiskLruCache.Snapshot)this.delegate.next();
      try
      {
        this.nextUrl = r.a(localSnapshot.getSource(0)).r();
        localSnapshot.close();
        return true;
      }
      catch (IOException localIOException)
      {
        localIOException = localIOException;
        localSnapshot.close();
      }
      finally
      {
        localObject = finally;
        localSnapshot.close();
        throw ((Throwable)localObject);
      }
    }
    return false;
  }
  
  public String next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    String str = this.nextUrl;
    this.nextUrl = null;
    this.canRemove = true;
    return str;
  }
  
  public void remove()
  {
    if (!this.canRemove) {
      throw new IllegalStateException("remove() before next()");
    }
    this.delegate.remove();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Cache$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */