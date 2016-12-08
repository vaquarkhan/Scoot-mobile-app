package com.squareup.picasso;

import android.graphics.Bitmap;
import java.io.InputStream;

public class Downloader$Response
{
  final Bitmap bitmap;
  final boolean cached;
  final long contentLength;
  final InputStream stream;
  
  @Deprecated
  public Downloader$Response(Bitmap paramBitmap, boolean paramBoolean)
  {
    if (paramBitmap == null) {
      throw new IllegalArgumentException("Bitmap may not be null.");
    }
    this.stream = null;
    this.bitmap = paramBitmap;
    this.cached = paramBoolean;
    this.contentLength = -1L;
  }
  
  @Deprecated
  public Downloader$Response(Bitmap paramBitmap, boolean paramBoolean, long paramLong)
  {
    this(paramBitmap, paramBoolean);
  }
  
  @Deprecated
  public Downloader$Response(InputStream paramInputStream, boolean paramBoolean)
  {
    this(paramInputStream, paramBoolean, -1L);
  }
  
  public Downloader$Response(InputStream paramInputStream, boolean paramBoolean, long paramLong)
  {
    if (paramInputStream == null) {
      throw new IllegalArgumentException("Stream may not be null.");
    }
    this.stream = paramInputStream;
    this.bitmap = null;
    this.cached = paramBoolean;
    this.contentLength = paramLong;
  }
  
  @Deprecated
  public Bitmap getBitmap()
  {
    return this.bitmap;
  }
  
  public long getContentLength()
  {
    return this.contentLength;
  }
  
  public InputStream getInputStream()
  {
    return this.stream;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Downloader$Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */