package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.io.FileSystem;
import d.ac;
import d.ad;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class DiskLruCache$Editor
{
  private boolean committed;
  private final DiskLruCache.Entry entry;
  private boolean hasErrors;
  private final boolean[] written;
  
  private DiskLruCache$Editor(DiskLruCache paramDiskLruCache, DiskLruCache.Entry paramEntry)
  {
    this.entry = paramEntry;
    if (DiskLruCache.Entry.access$800(paramEntry)) {}
    for (paramDiskLruCache = null;; paramDiskLruCache = new boolean[DiskLruCache.access$2300(paramDiskLruCache)])
    {
      this.written = paramDiskLruCache;
      return;
    }
  }
  
  public void abort()
  {
    synchronized (this.this$0)
    {
      DiskLruCache.access$2600(this.this$0, this, false);
      return;
    }
  }
  
  public void abortUnlessCommitted()
  {
    synchronized (this.this$0)
    {
      boolean bool = this.committed;
      if (bool) {}
    }
    try
    {
      DiskLruCache.access$2600(this.this$0, this, false);
      return;
      localObject = finally;
      throw ((Throwable)localObject);
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public void commit()
  {
    synchronized (this.this$0)
    {
      if (this.hasErrors)
      {
        DiskLruCache.access$2600(this.this$0, this, false);
        DiskLruCache.access$2700(this.this$0, this.entry);
        this.committed = true;
        return;
      }
      DiskLruCache.access$2600(this.this$0, this, true);
    }
  }
  
  public ac newSink(int paramInt)
  {
    synchronized (this.this$0)
    {
      if (DiskLruCache.Entry.access$900(this.entry) != this) {
        throw new IllegalStateException();
      }
    }
    if (!DiskLruCache.Entry.access$800(this.entry)) {
      this.written[paramInt] = true;
    }
    Object localObject2 = DiskLruCache.Entry.access$1400(this.entry)[paramInt];
    try
    {
      localObject2 = DiskLruCache.access$2400(this.this$0).sink((File)localObject2);
      localObject2 = new DiskLruCache.Editor.1(this, (ac)localObject2);
      return (ac)localObject2;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      ac localac = DiskLruCache.access$2500();
      return localac;
    }
  }
  
  public ad newSource(int paramInt)
  {
    synchronized (this.this$0)
    {
      if (DiskLruCache.Entry.access$900(this.entry) != this) {
        throw new IllegalStateException();
      }
    }
    if (!DiskLruCache.Entry.access$800(this.entry)) {
      return null;
    }
    try
    {
      ad localad = DiskLruCache.access$2400(this.this$0).source(DiskLruCache.Entry.access$1300(this.entry)[paramInt]);
      return localad;
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache$Editor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */