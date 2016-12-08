package com.squareup.picasso;

import java.io.IOException;

public class Downloader$ResponseException
  extends IOException
{
  final boolean localCacheOnly;
  final int responseCode;
  
  public Downloader$ResponseException(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString);
    this.localCacheOnly = NetworkPolicy.isOfflineOnly(paramInt1);
    this.responseCode = paramInt2;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Downloader$ResponseException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */