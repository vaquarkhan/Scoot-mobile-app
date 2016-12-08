package com.squareup.okhttp.internal;

import d.ac;
import java.io.IOException;

class DiskLruCache$2
  extends FaultHidingSink
{
  static
  {
    if (!DiskLruCache.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  DiskLruCache$2(DiskLruCache paramDiskLruCache, ac paramac)
  {
    super(paramac);
  }
  
  protected void onException(IOException paramIOException)
  {
    assert (Thread.holdsLock(this.this$0));
    DiskLruCache.access$602(this.this$0, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */