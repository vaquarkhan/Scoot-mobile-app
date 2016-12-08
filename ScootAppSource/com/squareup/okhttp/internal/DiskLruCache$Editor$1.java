package com.squareup.okhttp.internal;

import d.ac;
import java.io.IOException;

class DiskLruCache$Editor$1
  extends FaultHidingSink
{
  DiskLruCache$Editor$1(DiskLruCache.Editor paramEditor, ac paramac)
  {
    super(paramac);
  }
  
  protected void onException(IOException arg1)
  {
    synchronized (this.this$1.this$0)
    {
      DiskLruCache.Editor.access$1902(this.this$1, true);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache$Editor$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */