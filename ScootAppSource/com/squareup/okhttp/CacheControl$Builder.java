package com.squareup.okhttp;

import java.util.concurrent.TimeUnit;

public final class CacheControl$Builder
{
  int maxAgeSeconds = -1;
  int maxStaleSeconds = -1;
  int minFreshSeconds = -1;
  boolean noCache;
  boolean noStore;
  boolean noTransform;
  boolean onlyIfCached;
  
  public CacheControl build()
  {
    return new CacheControl(this, null);
  }
  
  public Builder maxAge(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("maxAge < 0: " + paramInt);
    }
    long l = paramTimeUnit.toSeconds(paramInt);
    if (l > 2147483647L) {}
    for (paramInt = Integer.MAX_VALUE;; paramInt = (int)l)
    {
      this.maxAgeSeconds = paramInt;
      return this;
    }
  }
  
  public Builder maxStale(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("maxStale < 0: " + paramInt);
    }
    long l = paramTimeUnit.toSeconds(paramInt);
    if (l > 2147483647L) {}
    for (paramInt = Integer.MAX_VALUE;; paramInt = (int)l)
    {
      this.maxStaleSeconds = paramInt;
      return this;
    }
  }
  
  public Builder minFresh(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("minFresh < 0: " + paramInt);
    }
    long l = paramTimeUnit.toSeconds(paramInt);
    if (l > 2147483647L) {}
    for (paramInt = Integer.MAX_VALUE;; paramInt = (int)l)
    {
      this.minFreshSeconds = paramInt;
      return this;
    }
  }
  
  public Builder noCache()
  {
    this.noCache = true;
    return this;
  }
  
  public Builder noStore()
  {
    this.noStore = true;
    return this;
  }
  
  public Builder noTransform()
  {
    this.noTransform = true;
    return this;
  }
  
  public Builder onlyIfCached()
  {
    this.onlyIfCached = true;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\CacheControl$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */