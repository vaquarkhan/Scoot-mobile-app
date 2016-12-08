package com.squareup.okhttp.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

class DiskLruCache$3
  implements Iterator<DiskLruCache.Snapshot>
{
  final Iterator<DiskLruCache.Entry> delegate = new ArrayList(DiskLruCache.access$2000(this.this$0).values()).iterator();
  DiskLruCache.Snapshot nextSnapshot;
  DiskLruCache.Snapshot removeSnapshot;
  
  DiskLruCache$3(DiskLruCache paramDiskLruCache) {}
  
  public boolean hasNext()
  {
    if (this.nextSnapshot != null) {
      return true;
    }
    synchronized (this.this$0)
    {
      if (DiskLruCache.access$100(this.this$0)) {
        return false;
      }
      while (this.delegate.hasNext())
      {
        DiskLruCache.Snapshot localSnapshot = ((DiskLruCache.Entry)this.delegate.next()).snapshot();
        if (localSnapshot != null)
        {
          this.nextSnapshot = localSnapshot;
          return true;
        }
      }
      return false;
    }
  }
  
  public DiskLruCache.Snapshot next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    this.removeSnapshot = this.nextSnapshot;
    this.nextSnapshot = null;
    return this.removeSnapshot;
  }
  
  public void remove()
  {
    if (this.removeSnapshot == null) {
      throw new IllegalStateException("remove() before next()");
    }
    try
    {
      this.this$0.remove(DiskLruCache.Snapshot.access$2100(this.removeSnapshot));
      this.removeSnapshot = null;
      return;
    }
    catch (IOException localIOException)
    {
      localIOException = localIOException;
      this.removeSnapshot = null;
      return;
    }
    finally
    {
      localObject = finally;
      this.removeSnapshot = null;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */