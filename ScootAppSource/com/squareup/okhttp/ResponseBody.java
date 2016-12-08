package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import d.f;
import d.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public abstract class ResponseBody
  implements Closeable
{
  private Reader reader;
  
  private Charset charset()
  {
    MediaType localMediaType = contentType();
    if (localMediaType != null) {
      return localMediaType.charset(Util.UTF_8);
    }
    return Util.UTF_8;
  }
  
  public static ResponseBody create(MediaType paramMediaType, long paramLong, j paramj)
  {
    if (paramj == null) {
      throw new NullPointerException("source == null");
    }
    return new ResponseBody.1(paramMediaType, paramLong, paramj);
  }
  
  public static ResponseBody create(MediaType paramMediaType, String paramString)
  {
    Object localObject = Util.UTF_8;
    MediaType localMediaType = paramMediaType;
    if (paramMediaType != null)
    {
      Charset localCharset = paramMediaType.charset();
      localObject = localCharset;
      localMediaType = paramMediaType;
      if (localCharset == null)
      {
        localObject = Util.UTF_8;
        localMediaType = MediaType.parse(paramMediaType + "; charset=utf-8");
      }
    }
    paramMediaType = new f().a(paramString, (Charset)localObject);
    return create(localMediaType, paramMediaType.a(), paramMediaType);
  }
  
  public static ResponseBody create(MediaType paramMediaType, byte[] paramArrayOfByte)
  {
    f localf = new f().b(paramArrayOfByte);
    return create(paramMediaType, paramArrayOfByte.length, localf);
  }
  
  public final InputStream byteStream()
  {
    return source().g();
  }
  
  public final byte[] bytes()
  {
    long l = contentLength();
    if (l > 2147483647L) {
      throw new IOException("Cannot buffer entire body for content length: " + l);
    }
    j localj = source();
    try
    {
      byte[] arrayOfByte1 = localj.s();
      Util.closeQuietly(localj);
      if ((l != -1L) && (l != arrayOfByte1.length)) {
        throw new IOException("Content-Length and stream length disagree");
      }
    }
    finally
    {
      Util.closeQuietly(localj);
    }
    return arrayOfByte2;
  }
  
  public final Reader charStream()
  {
    Object localObject = this.reader;
    if (localObject != null) {
      return (Reader)localObject;
    }
    localObject = new InputStreamReader(byteStream(), charset());
    this.reader = ((Reader)localObject);
    return (Reader)localObject;
  }
  
  public void close()
  {
    source().close();
  }
  
  public abstract long contentLength();
  
  public abstract MediaType contentType();
  
  public abstract j source();
  
  public final String string()
  {
    return new String(bytes(), charset().name());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\ResponseBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */