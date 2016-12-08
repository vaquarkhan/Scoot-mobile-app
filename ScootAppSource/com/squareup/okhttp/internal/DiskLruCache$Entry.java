package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.io.FileSystem;
import d.ad;
import d.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

final class DiskLruCache$Entry
{
  private final File[] cleanFiles;
  private DiskLruCache.Editor currentEditor;
  private final File[] dirtyFiles;
  private final String key;
  private final long[] lengths;
  private boolean readable;
  private long sequenceNumber;
  
  private DiskLruCache$Entry(DiskLruCache paramDiskLruCache, String paramString)
  {
    this.key = paramString;
    this.lengths = new long[DiskLruCache.access$2300(paramDiskLruCache)];
    this.cleanFiles = new File[DiskLruCache.access$2300(paramDiskLruCache)];
    this.dirtyFiles = new File[DiskLruCache.access$2300(paramDiskLruCache)];
    paramString = new StringBuilder(paramString).append('.');
    int j = paramString.length();
    int i = 0;
    while (i < DiskLruCache.access$2300(paramDiskLruCache))
    {
      paramString.append(i);
      this.cleanFiles[i] = new File(DiskLruCache.access$2800(paramDiskLruCache), paramString.toString());
      paramString.append(".tmp");
      this.dirtyFiles[i] = new File(DiskLruCache.access$2800(paramDiskLruCache), paramString.toString());
      paramString.setLength(j);
      i += 1;
    }
  }
  
  private IOException invalidLengths(String[] paramArrayOfString)
  {
    throw new IOException("unexpected journal line: " + Arrays.toString(paramArrayOfString));
  }
  
  private void setLengths(String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != DiskLruCache.access$2300(this.this$0)) {
      throw invalidLengths(paramArrayOfString);
    }
    int i = 0;
    try
    {
      while (i < paramArrayOfString.length)
      {
        this.lengths[i] = Long.parseLong(paramArrayOfString[i]);
        i += 1;
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw invalidLengths(paramArrayOfString);
    }
  }
  
  DiskLruCache.Snapshot snapshot()
  {
    j = 0;
    if (!Thread.holdsLock(this.this$0)) {
      throw new AssertionError();
    }
    ad[] arrayOfad = new ad[DiskLruCache.access$2300(this.this$0)];
    Object localObject = (long[])this.lengths.clone();
    i = 0;
    for (;;)
    {
      try
      {
        if (i < DiskLruCache.access$2300(this.this$0))
        {
          arrayOfad[i] = DiskLruCache.access$2400(this.this$0).source(this.cleanFiles[i]);
          i += 1;
          continue;
        }
        localObject = new DiskLruCache.Snapshot(this.this$0, this.key, this.sequenceNumber, arrayOfad, (long[])localObject, null);
        return (DiskLruCache.Snapshot)localObject;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        i = j;
        continue;
      }
      if ((i >= DiskLruCache.access$2300(this.this$0)) || (arrayOfad[i] == null)) {
        continue;
      }
      Util.closeQuietly(arrayOfad[i]);
      i += 1;
    }
    return null;
  }
  
  void writeLengths(i parami)
  {
    long[] arrayOfLong = this.lengths;
    int j = arrayOfLong.length;
    int i = 0;
    while (i < j)
    {
      long l = arrayOfLong[i];
      parami.i(32).k(l);
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache$Entry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */