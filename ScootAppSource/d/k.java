package d;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class k
  implements Serializable, Comparable<k>
{
  static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  public static final k b = a(new byte[0]);
  final byte[] c;
  transient int d;
  transient String e;
  
  k(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
  }
  
  public static k a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("s == null");
    }
    k localk = new k(paramString.getBytes(ag.a));
    localk.e = paramString;
    return localk;
  }
  
  public static k a(byte... paramVarArgs)
  {
    if (paramVarArgs == null) {
      throw new IllegalArgumentException("data == null");
    }
    return new k((byte[])paramVarArgs.clone());
  }
  
  public static k b(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("base64 == null");
    }
    paramString = e.a(paramString);
    if (paramString != null) {
      return new k(paramString);
    }
    return null;
  }
  
  private k c(String paramString)
  {
    try
    {
      paramString = a(MessageDigest.getInstance(paramString).digest(this.c));
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  public byte a(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public int a(k paramk)
  {
    int j = f();
    int k = paramk.f();
    int m = Math.min(j, k);
    int i = 0;
    for (;;)
    {
      if (i < m)
      {
        int n = a(i) & 0xFF;
        int i1 = paramk.a(i) & 0xFF;
        if (n == i1) {
          i += 1;
        } else {
          if (n >= i1) {
            break;
          }
        }
      }
    }
    do
    {
      return -1;
      return 1;
      if (j == k) {
        return 0;
      }
    } while (j < k);
    return 1;
  }
  
  public String a()
  {
    String str = this.e;
    if (str != null) {
      return str;
    }
    str = new String(this.c, ag.a);
    this.e = str;
    return str;
  }
  
  void a(f paramf)
  {
    paramf.b(this.c, 0, this.c.length);
  }
  
  public boolean a(int paramInt1, k paramk, int paramInt2, int paramInt3)
  {
    return paramk.a(paramInt2, this.c, paramInt1, paramInt3);
  }
  
  public boolean a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    return (paramInt1 <= this.c.length - paramInt3) && (paramInt2 <= paramArrayOfByte.length - paramInt3) && (ag.a(this.c, paramInt1, paramArrayOfByte, paramInt2, paramInt3));
  }
  
  public String b()
  {
    return e.a(this.c);
  }
  
  public k c()
  {
    return c("MD5");
  }
  
  public String d()
  {
    int i = 0;
    char[] arrayOfChar = new char[this.c.length * 2];
    byte[] arrayOfByte = this.c;
    int k = arrayOfByte.length;
    int j = 0;
    while (i < k)
    {
      int m = arrayOfByte[i];
      int n = j + 1;
      arrayOfChar[j] = a[(m >> 4 & 0xF)];
      j = n + 1;
      arrayOfChar[n] = a[(m & 0xF)];
      i += 1;
    }
    return new String(arrayOfChar);
  }
  
  public k e()
  {
    int i = 0;
    int j;
    for (;;)
    {
      localObject = this;
      if (i >= this.c.length) {
        return localObject;
      }
      j = this.c[i];
      if ((j >= 65) && (j <= 90)) {
        break;
      }
      i += 1;
    }
    Object localObject = (byte[])this.c.clone();
    localObject[i] = ((byte)(j + 32));
    i += 1;
    if (i < localObject.length)
    {
      j = localObject[i];
      if ((j < 65) || (j > 90)) {}
      for (;;)
      {
        i += 1;
        break;
        localObject[i] = ((byte)(j + 32));
      }
    }
    localObject = new k((byte[])localObject);
    return (k)localObject;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof k)) && (((k)paramObject).f() == this.c.length) && (((k)paramObject).a(0, this.c, 0, this.c.length))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int f()
  {
    return this.c.length;
  }
  
  public byte[] g()
  {
    return (byte[])this.c.clone();
  }
  
  public int hashCode()
  {
    int i = this.d;
    if (i != 0) {
      return i;
    }
    i = Arrays.hashCode(this.c);
    this.d = i;
    return i;
  }
  
  public String toString()
  {
    if (this.c.length == 0) {
      return "ByteString[size=0]";
    }
    if (this.c.length <= 16) {
      return String.format("ByteString[size=%s data=%s]", new Object[] { Integer.valueOf(this.c.length), d() });
    }
    return String.format("ByteString[size=%s md5=%s]", new Object[] { Integer.valueOf(this.c.length), c().d() });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */