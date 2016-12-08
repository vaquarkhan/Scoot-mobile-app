package com.squareup.okhttp.internal;

import d.ad;
import java.io.Closeable;

public final class DiskLruCache$Snapshot
  implements Closeable
{
  private final String key;
  private final long[] lengths;
  private final long sequenceNumber;
  private final ad[] sources;
  
  private DiskLruCache$Snapshot(DiskLruCache paramDiskLruCache, String paramString, long paramLong, ad[] paramArrayOfad, long[] paramArrayOfLong)
  {
    this.key = paramString;
    this.sequenceNumber = paramLong;
    this.sources = paramArrayOfad;
    this.lengths = paramArrayOfLong;
  }
  
  public void close()
  {
    ad[] arrayOfad = this.sources;
    int j = arrayOfad.length;
    int i = 0;
    while (i < j)
    {
      Util.closeQuietly(arrayOfad[i]);
      i += 1;
    }
  }
  
  public DiskLruCache.Editor edit()
  {
    return DiskLruCache.access$2200(this.this$0, this.key, this.sequenceNumber);
  }
  
  public long getLength(int paramInt)
  {
    return this.lengths[paramInt];
  }
  
  public ad getSource(int paramInt)
  {
    return this.sources[paramInt];
  }
  
  public String key()
  {
    return this.key;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache$Snapshot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */