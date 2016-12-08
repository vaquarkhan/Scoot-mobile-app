package com.squareup.picasso;

import android.net.Uri;

public abstract interface Downloader
{
  public abstract Downloader.Response load(Uri paramUri, int paramInt);
  
  public abstract void shutdown();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Downloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */