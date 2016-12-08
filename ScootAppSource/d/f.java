package d;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class f
  implements i, j, Cloneable
{
  private static final byte[] c = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  z a;
  long b;
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ag.a(paramArrayOfByte.length, paramInt1, paramInt2);
    z localz = this.a;
    if (localz == null) {
      paramInt1 = -1;
    }
    do
    {
      return paramInt1;
      paramInt2 = Math.min(paramInt2, localz.c - localz.b);
      System.arraycopy(localz.a, localz.b, paramArrayOfByte, paramInt1, paramInt2);
      localz.b += paramInt2;
      this.b -= paramInt2;
      paramInt1 = paramInt2;
    } while (localz.b != localz.c);
    this.a = localz.a();
    aa.a(localz);
    return paramInt2;
  }
  
  public long a()
  {
    return this.b;
  }
  
  public long a(byte paramByte)
  {
    return a(paramByte, 0L);
  }
  
  public long a(byte paramByte, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("fromIndex < 0");
    }
    Object localObject1 = this.a;
    if (localObject1 == null) {
      return -1L;
    }
    long l = 0L;
    int j = ((z)localObject1).c - ((z)localObject1).b;
    if (paramLong >= j) {}
    for (paramLong -= j;; paramLong = 0L)
    {
      l += j;
      Object localObject2 = ((z)localObject1).f;
      localObject1 = localObject2;
      if (localObject2 != this.a) {
        break;
      }
      return -1L;
      localObject2 = ((z)localObject1).a;
      int i = (int)(((z)localObject1).b + paramLong);
      int k = ((z)localObject1).c;
      while (i < k)
      {
        if (localObject2[i] == paramByte) {
          return l + i - ((z)localObject1).b;
        }
        i += 1;
      }
    }
  }
  
  public long a(ad paramad)
  {
    if (paramad == null) {
      throw new IllegalArgumentException("source == null");
    }
    long l2;
    for (long l1 = 0L;; l1 += l2)
    {
      l2 = paramad.read(this, 2048L);
      if (l2 == -1L) {
        break;
      }
    }
    return l1;
  }
  
  public f a(int paramInt)
  {
    if (paramInt < 128)
    {
      b(paramInt);
      return this;
    }
    if (paramInt < 2048)
    {
      b(paramInt >> 6 | 0xC0);
      b(paramInt & 0x3F | 0x80);
      return this;
    }
    if (paramInt < 65536)
    {
      if ((paramInt >= 55296) && (paramInt <= 57343)) {
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(paramInt));
      }
      b(paramInt >> 12 | 0xE0);
      b(paramInt >> 6 & 0x3F | 0x80);
      b(paramInt & 0x3F | 0x80);
      return this;
    }
    if (paramInt <= 1114111)
    {
      b(paramInt >> 18 | 0xF0);
      b(paramInt >> 12 & 0x3F | 0x80);
      b(paramInt >> 6 & 0x3F | 0x80);
      b(paramInt & 0x3F | 0x80);
      return this;
    }
    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(paramInt));
  }
  
  public f a(f paramf, long paramLong1, long paramLong2)
  {
    if (paramf == null) {
      throw new IllegalArgumentException("out == null");
    }
    ag.a(this.b, paramLong1, paramLong2);
    if (paramLong2 == 0L) {
      return this;
    }
    paramf.b += paramLong2;
    z localz2;
    long l1;
    long l2;
    for (z localz1 = this.a;; localz1 = localz1.f)
    {
      localz2 = localz1;
      l1 = paramLong1;
      l2 = paramLong2;
      if (paramLong1 < localz1.c - localz1.b) {
        break;
      }
      paramLong1 -= localz1.c - localz1.b;
    }
    label103:
    if (l2 > 0L)
    {
      localz1 = new z(localz2);
      localz1.b = ((int)(localz1.b + l1));
      localz1.c = Math.min(localz1.b + (int)l2, localz1.c);
      if (paramf.a != null) {
        break label215;
      }
      localz1.g = localz1;
      localz1.f = localz1;
      paramf.a = localz1;
    }
    for (;;)
    {
      l2 -= localz1.c - localz1.b;
      localz2 = localz2.f;
      l1 = 0L;
      break label103;
      break;
      label215:
      paramf.a.g.a(localz1);
    }
  }
  
  public f a(k paramk)
  {
    if (paramk == null) {
      throw new IllegalArgumentException("byteString == null");
    }
    paramk.a(this);
    return this;
  }
  
  public f a(String paramString)
  {
    return a(paramString, 0, paramString.length());
  }
  
  public f a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("string == null");
    }
    if (paramInt1 < 0) {
      throw new IllegalAccessError("beginIndex < 0: " + paramInt1);
    }
    if (paramInt2 < paramInt1) {
      throw new IllegalArgumentException("endIndex < beginIndex: " + paramInt2 + " < " + paramInt1);
    }
    int i;
    label136:
    int j;
    label168:
    byte[] arrayOfByte;
    int k;
    if (paramInt2 > paramString.length())
    {
      throw new IllegalArgumentException("endIndex > string.length: " + paramInt2 + " > " + paramString.length());
      i = 0;
      if ((j > 56319) || (i < 56320) || (i > 57343))
      {
        b(63);
        paramInt1 += 1;
      }
    }
    else
    {
      if (paramInt1 >= paramInt2) {
        return this;
      }
      j = paramString.charAt(paramInt1);
      if (j < 128)
      {
        z localz = e(1);
        arrayOfByte = localz.a;
        k = localz.c - paramInt1;
        int m = Math.min(paramInt2, 2048 - k);
        i = paramInt1 + 1;
        arrayOfByte[(k + paramInt1)] = ((byte)j);
        paramInt1 = i;
        label241:
        if (paramInt1 < m)
        {
          i = paramString.charAt(paramInt1);
          if (i < 128) {}
        }
        else
        {
          i = paramInt1 + k - localz.c;
          localz.c += i;
          this.b += i;
        }
      }
    }
    for (;;)
    {
      break label168;
      arrayOfByte[(paramInt1 + k)] = ((byte)i);
      paramInt1 += 1;
      break label241;
      if (j < 2048)
      {
        b(j >> 6 | 0xC0);
        b(j & 0x3F | 0x80);
        paramInt1 += 1;
      }
      else if ((j < 55296) || (j > 57343))
      {
        b(j >> 12 | 0xE0);
        b(j >> 6 & 0x3F | 0x80);
        b(j & 0x3F | 0x80);
        paramInt1 += 1;
      }
      else
      {
        if (paramInt1 + 1 >= paramInt2) {
          break;
        }
        i = paramString.charAt(paramInt1 + 1);
        break label136;
        i = (i & 0xFFFF23FF | (j & 0xFFFF27FF) << 10) + 65536;
        b(i >> 18 | 0xF0);
        b(i >> 12 & 0x3F | 0x80);
        b(i >> 6 & 0x3F | 0x80);
        b(i & 0x3F | 0x80);
        paramInt1 += 2;
      }
    }
    return this;
  }
  
  public f a(String paramString, int paramInt1, int paramInt2, Charset paramCharset)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("string == null");
    }
    if (paramInt1 < 0) {
      throw new IllegalAccessError("beginIndex < 0: " + paramInt1);
    }
    if (paramInt2 < paramInt1) {
      throw new IllegalArgumentException("endIndex < beginIndex: " + paramInt2 + " < " + paramInt1);
    }
    if (paramInt2 > paramString.length()) {
      throw new IllegalArgumentException("endIndex > string.length: " + paramInt2 + " > " + paramString.length());
    }
    if (paramCharset == null) {
      throw new IllegalArgumentException("charset == null");
    }
    if (paramCharset.equals(ag.a)) {
      return a(paramString);
    }
    paramString = paramString.substring(paramInt1, paramInt2).getBytes(paramCharset);
    return b(paramString, 0, paramString.length);
  }
  
  public f a(String paramString, Charset paramCharset)
  {
    return a(paramString, 0, paramString.length(), paramCharset);
  }
  
  public String a(long paramLong, Charset paramCharset)
  {
    ag.a(this.b, 0L, paramLong);
    if (paramCharset == null) {
      throw new IllegalArgumentException("charset == null");
    }
    if (paramLong > 2147483647L) {
      throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + paramLong);
    }
    if (paramLong == 0L) {
      paramCharset = "";
    }
    z localz;
    String str;
    do
    {
      return paramCharset;
      localz = this.a;
      if (localz.b + paramLong > localz.c) {
        return new String(f(paramLong), paramCharset);
      }
      str = new String(localz.a, localz.b, (int)paramLong, paramCharset);
      localz.b = ((int)(localz.b + paramLong));
      this.b -= paramLong;
      paramCharset = str;
    } while (localz.b != localz.c);
    this.a = localz.a();
    aa.a(localz);
    return str;
  }
  
  public void a(long paramLong)
  {
    if (this.b < paramLong) {
      throw new EOFException();
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = a(paramArrayOfByte, i, paramArrayOfByte.length - i);
      if (j == -1) {
        throw new EOFException();
      }
      i += j;
    }
  }
  
  public byte b(long paramLong)
  {
    ag.a(this.b, paramLong, 1L);
    for (z localz = this.a;; localz = localz.f)
    {
      int i = localz.c - localz.b;
      if (paramLong < i) {
        return localz.a[(localz.b + (int)paramLong)];
      }
      paramLong -= i;
    }
  }
  
  public f b()
  {
    return this;
  }
  
  public f b(int paramInt)
  {
    z localz = e(1);
    byte[] arrayOfByte = localz.a;
    int i = localz.c;
    localz.c = (i + 1);
    arrayOfByte[i] = ((byte)paramInt);
    this.b += 1L;
    return this;
  }
  
  public f b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("source == null");
    }
    return b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public f b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("source == null");
    }
    ag.a(paramArrayOfByte.length, paramInt1, paramInt2);
    int i = paramInt1 + paramInt2;
    while (paramInt1 < i)
    {
      z localz = e(1);
      int j = Math.min(i - paramInt1, 2048 - localz.c);
      System.arraycopy(paramArrayOfByte, paramInt1, localz.a, localz.c, j);
      paramInt1 += j;
      localz.c = (j + localz.c);
    }
    this.b += paramInt2;
    return this;
  }
  
  public f c(int paramInt)
  {
    z localz = e(2);
    byte[] arrayOfByte = localz.a;
    int i = localz.c;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(paramInt >>> 8 & 0xFF));
    arrayOfByte[j] = ((byte)(paramInt & 0xFF));
    localz.c = (j + 1);
    this.b += 2L;
    return this;
  }
  
  public k c(long paramLong)
  {
    return new k(f(paramLong));
  }
  
  public OutputStream c()
  {
    return new g(this);
  }
  
  public void close() {}
  
  public f d()
  {
    return this;
  }
  
  public f d(int paramInt)
  {
    z localz = e(4);
    byte[] arrayOfByte = localz.a;
    int j = localz.c;
    int i = j + 1;
    arrayOfByte[j] = ((byte)(paramInt >>> 24 & 0xFF));
    j = i + 1;
    arrayOfByte[i] = ((byte)(paramInt >>> 16 & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(paramInt >>> 8 & 0xFF));
    arrayOfByte[i] = ((byte)(paramInt & 0xFF));
    localz.c = (i + 1);
    this.b += 4L;
    return this;
  }
  
  public String d(long paramLong)
  {
    return a(paramLong, ag.a);
  }
  
  public i e()
  {
    return this;
  }
  
  z e(int paramInt)
  {
    if ((paramInt < 1) || (paramInt > 2048)) {
      throw new IllegalArgumentException();
    }
    z localz2;
    z localz1;
    if (this.a == null)
    {
      this.a = aa.a();
      localz2 = this.a;
      z localz3 = this.a;
      localz1 = this.a;
      localz3.g = localz1;
      localz2.f = localz1;
    }
    do
    {
      return localz1;
      localz2 = this.a.g;
      if (localz2.c + paramInt > 2048) {
        break;
      }
      localz1 = localz2;
    } while (localz2.e);
    return localz2.a(aa.a());
  }
  
  String e(long paramLong)
  {
    if ((paramLong > 0L) && (b(paramLong - 1L) == 13))
    {
      str = d(paramLong - 1L);
      g(2L);
      return str;
    }
    String str = d(paramLong);
    g(1L);
    return str;
  }
  
  public boolean equals(Object paramObject)
  {
    long l1 = 0L;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f)) {
      return false;
    }
    paramObject = (f)paramObject;
    if (this.b != ((f)paramObject).b) {
      return false;
    }
    if (this.b == 0L) {
      return true;
    }
    Object localObject2 = this.a;
    paramObject = ((f)paramObject).a;
    int j = ((z)localObject2).b;
    int i = ((z)paramObject).b;
    while (l1 < this.b)
    {
      long l2 = Math.min(((z)localObject2).c - j, ((z)paramObject).c - i);
      int k = 0;
      while (k < l2)
      {
        if (localObject2.a[j] != paramObject.a[i]) {
          return false;
        }
        k += 1;
        i += 1;
        j += 1;
      }
      k = j;
      Object localObject1 = localObject2;
      if (j == ((z)localObject2).c)
      {
        localObject1 = ((z)localObject2).f;
        k = ((z)localObject1).b;
      }
      j = i;
      localObject2 = paramObject;
      if (i == ((z)paramObject).c)
      {
        localObject2 = ((z)paramObject).f;
        j = ((z)localObject2).b;
      }
      l1 += l2;
      i = j;
      j = k;
      paramObject = localObject2;
      localObject2 = localObject1;
    }
    return true;
  }
  
  public k f(int paramInt)
  {
    if (paramInt == 0) {
      return k.b;
    }
    return new ab(this, paramInt);
  }
  
  public boolean f()
  {
    return this.b == 0L;
  }
  
  public byte[] f(long paramLong)
  {
    ag.a(this.b, 0L, paramLong);
    if (paramLong > 2147483647L) {
      throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + paramLong);
    }
    byte[] arrayOfByte = new byte[(int)paramLong];
    a(arrayOfByte);
    return arrayOfByte;
  }
  
  public void flush() {}
  
  public InputStream g()
  {
    return new h(this);
  }
  
  public void g(long paramLong)
  {
    while (paramLong > 0L)
    {
      if (this.a == null) {
        throw new EOFException();
      }
      int i = (int)Math.min(paramLong, this.a.c - this.a.b);
      this.b -= i;
      long l = paramLong - i;
      z localz = this.a;
      localz.b = (i + localz.b);
      paramLong = l;
      if (this.a.b == this.a.c)
      {
        localz = this.a;
        this.a = localz.a();
        aa.a(localz);
        paramLong = l;
      }
    }
  }
  
  public long h()
  {
    long l2 = this.b;
    long l1;
    if (l2 == 0L) {
      l1 = 0L;
    }
    z localz;
    do
    {
      do
      {
        return l1;
        localz = this.a.g;
        l1 = l2;
      } while (localz.c >= 2048);
      l1 = l2;
    } while (!localz.e);
    return l2 - (localz.c - localz.b);
  }
  
  public f h(long paramLong)
  {
    if (paramLong == 0L) {
      return b(48);
    }
    if (paramLong < 0L)
    {
      paramLong = -paramLong;
      if (paramLong < 0L) {
        return a("-9223372036854775808");
      }
    }
    for (int j = 1;; j = 0)
    {
      int i;
      if (paramLong < 100000000L) {
        if (paramLong < 10000L) {
          if (paramLong < 100L) {
            if (paramLong < 10L) {
              i = 1;
            }
          }
        }
      }
      int k;
      z localz;
      byte[] arrayOfByte;
      for (;;)
      {
        k = i;
        if (j != 0) {
          k = i + 1;
        }
        localz = e(k);
        arrayOfByte = localz.a;
        i = localz.c + k;
        while (paramLong != 0L)
        {
          int m = (int)(paramLong % 10L);
          i -= 1;
          arrayOfByte[i] = c[m];
          paramLong /= 10L;
        }
        i = 2;
        continue;
        if (paramLong < 1000L)
        {
          i = 3;
        }
        else
        {
          i = 4;
          continue;
          if (paramLong < 1000000L)
          {
            if (paramLong < 100000L) {
              i = 5;
            } else {
              i = 6;
            }
          }
          else if (paramLong < 10000000L)
          {
            i = 7;
          }
          else
          {
            i = 8;
            continue;
            if (paramLong < 1000000000000L)
            {
              if (paramLong < 10000000000L)
              {
                if (paramLong < 1000000000L) {
                  i = 9;
                } else {
                  i = 10;
                }
              }
              else if (paramLong < 100000000000L) {
                i = 11;
              } else {
                i = 12;
              }
            }
            else if (paramLong < 1000000000000000L)
            {
              if (paramLong < 10000000000000L) {
                i = 13;
              } else if (paramLong < 100000000000000L) {
                i = 14;
              } else {
                i = 15;
              }
            }
            else if (paramLong < 100000000000000000L)
            {
              if (paramLong < 10000000000000000L) {
                i = 16;
              } else {
                i = 17;
              }
            }
            else if (paramLong < 1000000000000000000L) {
              i = 18;
            } else {
              i = 19;
            }
          }
        }
      }
      if (j != 0) {
        arrayOfByte[(i - 1)] = 45;
      }
      localz.c += k;
      paramLong = this.b;
      this.b = (k + paramLong);
      return this;
    }
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    if (localObject == null) {
      return 0;
    }
    int j = 1;
    int i;
    z localz;
    do
    {
      int k = ((z)localObject).b;
      int m = ((z)localObject).c;
      for (i = j; k < m; i = j + i * 31)
      {
        j = localObject.a[k];
        k += 1;
      }
      localz = ((z)localObject).f;
      j = i;
      localObject = localz;
    } while (localz != this.a);
    return i;
  }
  
  public byte i()
  {
    if (this.b == 0L) {
      throw new IllegalStateException("size == 0");
    }
    z localz = this.a;
    int i = localz.b;
    int j = localz.c;
    byte[] arrayOfByte = localz.a;
    int k = i + 1;
    byte b1 = arrayOfByte[i];
    this.b -= 1L;
    if (k == j)
    {
      this.a = localz.a();
      aa.a(localz);
      return b1;
    }
    localz.b = k;
    return b1;
  }
  
  public f i(long paramLong)
  {
    if (paramLong == 0L) {
      return b(48);
    }
    int j = Long.numberOfTrailingZeros(Long.highestOneBit(paramLong)) / 4 + 1;
    z localz = e(j);
    byte[] arrayOfByte = localz.a;
    int i = localz.c + j - 1;
    int k = localz.c;
    while (i >= k)
    {
      arrayOfByte[i] = c[((int)(0xF & paramLong))];
      paramLong >>>= 4;
      i -= 1;
    }
    localz.c += j;
    paramLong = this.b;
    this.b = (j + paramLong);
    return this;
  }
  
  public short j()
  {
    if (this.b < 2L) {
      throw new IllegalStateException("size < 2: " + this.b);
    }
    z localz = this.a;
    int k = localz.b;
    int i = localz.c;
    if (i - k < 2) {
      return (short)((i() & 0xFF) << 8 | i() & 0xFF);
    }
    byte[] arrayOfByte = localz.a;
    int j = k + 1;
    k = arrayOfByte[k];
    int m = j + 1;
    j = arrayOfByte[j];
    this.b -= 2L;
    if (m == i)
    {
      this.a = localz.a();
      aa.a(localz);
    }
    for (;;)
    {
      return (short)((k & 0xFF) << 8 | j & 0xFF);
      localz.b = m;
    }
  }
  
  public int k()
  {
    if (this.b < 4L) {
      throw new IllegalStateException("size < 4: " + this.b);
    }
    z localz = this.a;
    int j = localz.b;
    int i = localz.c;
    if (i - j < 4) {
      return (i() & 0xFF) << 24 | (i() & 0xFF) << 16 | (i() & 0xFF) << 8 | i() & 0xFF;
    }
    byte[] arrayOfByte = localz.a;
    int k = j + 1;
    j = arrayOfByte[j];
    int n = k + 1;
    k = arrayOfByte[k];
    int m = n + 1;
    int i1 = arrayOfByte[n];
    n = m + 1;
    j = (j & 0xFF) << 24 | (k & 0xFF) << 16 | (i1 & 0xFF) << 8 | arrayOfByte[m] & 0xFF;
    this.b -= 4L;
    if (n == i)
    {
      this.a = localz.a();
      aa.a(localz);
      return j;
    }
    localz.b = n;
    return j;
  }
  
  public short l()
  {
    return ag.a(j());
  }
  
  public int m()
  {
    return ag.a(k());
  }
  
  public long n()
  {
    if (this.b == 0L) {
      throw new IllegalStateException("size == 0");
    }
    long l2 = 0L;
    int n = 0;
    int i1 = 0;
    int i = 0;
    long l3 = -7L;
    Object localObject = this.a;
    byte[] arrayOfByte = ((z)localObject).a;
    int m = ((z)localObject).b;
    int i2 = ((z)localObject).c;
    long l1 = l2;
    int j = n;
    int k = i1;
    l2 = l3;
    n = i;
    if (m < i2)
    {
      n = arrayOfByte[m];
      if ((n >= 48) && (n <= 57))
      {
        i1 = 48 - n;
        if ((l1 < -922337203685477580L) || ((l1 == -922337203685477580L) && (i1 < l2)))
        {
          localObject = new f().h(l1).b(n);
          if (k == 0) {
            ((f)localObject).i();
          }
          throw new NumberFormatException("Number too large: " + ((f)localObject).q());
        }
        l1 = l1 * 10L + i1;
      }
      for (;;)
      {
        m += 1;
        j += 1;
        break;
        if ((n != 45) || (j != 0)) {
          break label250;
        }
        k = 1;
        l2 -= 1L;
      }
      label250:
      if (j == 0) {
        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Integer.toHexString(n));
      }
      n = 1;
    }
    if (m == i2)
    {
      this.a = ((z)localObject).a();
      aa.a((z)localObject);
    }
    for (;;)
    {
      if (n == 0)
      {
        l3 = l2;
        i = n;
        i1 = k;
        n = j;
        l2 = l1;
        if (this.a != null) {
          break;
        }
      }
      this.b -= j;
      if (k == 0) {
        break label367;
      }
      return l1;
      ((z)localObject).b = m;
    }
    label367:
    return -l1;
  }
  
  public long o()
  {
    if (this.b == 0L) {
      throw new IllegalStateException("size == 0");
    }
    long l2 = 0L;
    int i = 0;
    int j = 0;
    Object localObject = this.a;
    byte[] arrayOfByte = ((z)localObject).a;
    int m = ((z)localObject).b;
    int n = ((z)localObject).c;
    long l1 = l2;
    int k = i;
    label60:
    i = j;
    if (m < n)
    {
      int i1 = arrayOfByte[m];
      if ((i1 >= 48) && (i1 <= 57)) {
        i = i1 - 48;
      }
      for (;;)
      {
        if ((0xF000000000000000 & l1) == 0L) {
          break label302;
        }
        localObject = new f().i(l1).b(i1);
        throw new NumberFormatException("Number too large: " + ((f)localObject).q());
        if ((i1 >= 97) && (i1 <= 102))
        {
          i = i1 - 97 + 10;
        }
        else
        {
          if ((i1 < 65) || (i1 > 70)) {
            break;
          }
          i = i1 - 65 + 10;
        }
      }
      if (k == 0) {
        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(i1));
      }
      i = 1;
    }
    if (m == n)
    {
      this.a = ((z)localObject).a();
      aa.a((z)localObject);
    }
    for (;;)
    {
      if (i == 0)
      {
        j = i;
        i = k;
        l2 = l1;
        if (this.a != null) {
          break;
        }
      }
      this.b -= k;
      return l1;
      label302:
      l2 = i;
      k += 1;
      m += 1;
      l1 = l2 | l1 << 4;
      break label60;
      ((z)localObject).b = m;
    }
  }
  
  public k p()
  {
    return new k(s());
  }
  
  public String q()
  {
    try
    {
      String str = a(this.b, ag.a);
      return str;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public String r()
  {
    long l = a((byte)10);
    if (l == -1L)
    {
      f localf = new f();
      a(localf, 0L, Math.min(32L, this.b));
      throw new EOFException("\\n not found: size=" + a() + " content=" + localf.p().d() + "...");
    }
    return e(l);
  }
  
  public long read(f paramf, long paramLong)
  {
    if (paramf == null) {
      throw new IllegalArgumentException("sink == null");
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.b == 0L) {
      return -1L;
    }
    long l = paramLong;
    if (paramLong > this.b) {
      l = this.b;
    }
    paramf.write(this, l);
    return l;
  }
  
  public byte[] s()
  {
    try
    {
      byte[] arrayOfByte = f(this.b);
      return arrayOfByte;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public void t()
  {
    try
    {
      g(this.b);
      return;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public ae timeout()
  {
    return ae.NONE;
  }
  
  public String toString()
  {
    if (this.b == 0L) {
      return "Buffer[size=0]";
    }
    Object localObject;
    if (this.b <= 16L)
    {
      localObject = u().p();
      return String.format("Buffer[size=%s data=%s]", new Object[] { Long.valueOf(this.b), ((k)localObject).d() });
    }
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(this.a.a, this.a.b, this.a.c - this.a.b);
      for (localObject = this.a.f; localObject != this.a; localObject = ((z)localObject).f) {
        localMessageDigest.update(((z)localObject).a, ((z)localObject).b, ((z)localObject).c - ((z)localObject).b);
      }
      localObject = String.format("Buffer[size=%s md5=%s]", new Object[] { Long.valueOf(this.b), k.a(localMessageDigest.digest()).d() });
      return (String)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new AssertionError();
    }
  }
  
  public f u()
  {
    f localf = new f();
    if (this.b == 0L) {
      return localf;
    }
    localf.a = new z(this.a);
    z localz1 = localf.a;
    z localz2 = localf.a;
    z localz3 = localf.a;
    localz2.g = localz3;
    localz1.f = localz3;
    for (localz1 = this.a.f; localz1 != this.a; localz1 = localz1.f) {
      localf.a.g.a(new z(localz1));
    }
    localf.b = this.b;
    return localf;
  }
  
  public k v()
  {
    if (this.b > 2147483647L) {
      throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.b);
    }
    return f((int)this.b);
  }
  
  public void write(f paramf, long paramLong)
  {
    if (paramf == null) {
      throw new IllegalArgumentException("source == null");
    }
    if (paramf == this) {
      throw new IllegalArgumentException("source == this");
    }
    ag.a(paramf.b, 0L, paramLong);
    if (paramLong > 0L)
    {
      if (paramLong >= paramf.a.c - paramf.a.b) {
        break label190;
      }
      if (this.a == null) {
        break label161;
      }
      localz1 = this.a.g;
      if ((localz1 == null) || (!localz1.e)) {
        break label177;
      }
      l = localz1.c;
      if (!localz1.d) {
        break label167;
      }
    }
    label161:
    label167:
    for (int i = 0;; i = localz1.b)
    {
      if (l + paramLong - i > 2048L) {
        break label177;
      }
      paramf.a.a(localz1, (int)paramLong);
      paramf.b -= paramLong;
      this.b += paramLong;
      return;
      localz1 = null;
      break;
    }
    label177:
    paramf.a = paramf.a.a((int)paramLong);
    label190:
    z localz1 = paramf.a;
    long l = localz1.c - localz1.b;
    paramf.a = localz1.a();
    if (this.a == null)
    {
      this.a = localz1;
      localz1 = this.a;
      z localz2 = this.a;
      z localz3 = this.a;
      localz2.g = localz3;
      localz1.f = localz3;
    }
    for (;;)
    {
      paramf.b -= l;
      this.b += l;
      paramLong -= l;
      break;
      this.a.g.a(localz1).b();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */