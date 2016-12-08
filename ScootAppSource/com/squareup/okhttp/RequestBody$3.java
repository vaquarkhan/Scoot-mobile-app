package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import d.ad;
import d.i;
import d.r;
import java.io.Closeable;
import java.io.File;

final class RequestBody$3
  extends RequestBody
{
  RequestBody$3(MediaType paramMediaType, File paramFile) {}
  
  public long contentLength()
  {
    return this.val$file.length();
  }
  
  public MediaType contentType()
  {
    return this.val$contentType;
  }
  
  public void writeTo(i parami)
  {
    Object localObject = null;
    try
    {
      ad localad = r.a(this.val$file);
      localObject = localad;
      parami.a(localad);
      Util.closeQuietly(localad);
      return;
    }
    finally
    {
      Util.closeQuietly((Closeable)localObject);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\RequestBody$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */