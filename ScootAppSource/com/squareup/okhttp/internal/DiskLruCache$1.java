package com.squareup.okhttp.internal;

import java.io.IOException;

class DiskLruCache$1
  implements Runnable
{
  DiskLruCache$1(DiskLruCache paramDiskLruCache) {}
  
  public void run()
  {
    int i = 0;
    synchronized (this.this$0)
    {
      if (!DiskLruCache.access$000(this.this$0)) {
        i = 1;
      }
      if ((i | DiskLruCache.access$100(this.this$0)) != 0) {
        return;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */