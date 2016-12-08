package com.c.a.c;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

final class b
{
  public static final b a = new b(new byte[0]);
  private final byte[] b;
  private volatile int c = 0;
  
  private b(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  public static b a(String paramString)
  {
    try
    {
      paramString = new b(paramString.getBytes("UTF-8"));
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UTF-8 not supported.", paramString);
    }
  }
  
  public static b a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new b(arrayOfByte);
  }
  
  public int a()
  {
    return this.b.length;
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.b, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public InputStream b()
  {
    return new ByteArrayInputStream(this.b);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    for (;;)
    {
      return true;
      if (!(paramObject instanceof b)) {
        return false;
      }
      Object localObject = (b)paramObject;
      int j = this.b.length;
      if (j != ((b)localObject).b.length) {
        return false;
      }
      paramObject = this.b;
      localObject = ((b)localObject).b;
      int i = 0;
      while (i < j)
      {
        if (paramObject[i] != localObject[i]) {
          return false;
        }
        i += 1;
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.c;
    int j = i;
    if (i == 0)
    {
      byte[] arrayOfByte = this.b;
      int k = this.b.length;
      j = 0;
      int m;
      for (i = k; j < k; i = m + i * 31)
      {
        m = arrayOfByte[j];
        j += 1;
      }
      j = i;
      if (i == 0) {
        j = 1;
      }
      this.c = j;
    }
    return j;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */