package d;

import java.util.Arrays;

final class ab
  extends k
{
  final transient byte[][] f;
  final transient int[] g;
  
  ab(f paramf, int paramInt)
  {
    super(null);
    ag.a(paramf.b, 0L, paramInt);
    z localz = paramf.a;
    int i = 0;
    int j = 0;
    while (j < paramInt)
    {
      if (localz.c == localz.b) {
        throw new AssertionError("s.limit == s.pos");
      }
      j += localz.c - localz.b;
      i += 1;
      localz = localz.f;
    }
    this.f = new byte[i][];
    this.g = new int[i * 2];
    paramf = paramf.a;
    i = 0;
    j = k;
    while (j < paramInt)
    {
      this.f[i] = paramf.a;
      j += paramf.c - paramf.b;
      this.g[i] = j;
      this.g[(this.f.length + i)] = paramf.b;
      paramf.d = true;
      i += 1;
      paramf = paramf.f;
    }
  }
  
  private int b(int paramInt)
  {
    paramInt = Arrays.binarySearch(this.g, 0, this.f.length, paramInt + 1);
    if (paramInt >= 0) {
      return paramInt;
    }
    return paramInt ^ 0xFFFFFFFF;
  }
  
  private k h()
  {
    return new k(g());
  }
  
  public byte a(int paramInt)
  {
    ag.a(this.g[(this.f.length - 1)], paramInt, 1L);
    int j = b(paramInt);
    if (j == 0) {}
    for (int i = 0;; i = this.g[(j - 1)])
    {
      int k = this.g[(this.f.length + j)];
      return this.f[j][(paramInt - i + k)];
    }
  }
  
  public String a()
  {
    return h().a();
  }
  
  void a(f paramf)
  {
    int i = 0;
    int m = this.f.length;
    int j = 0;
    if (i < m)
    {
      int n = this.g[(m + i)];
      int k = this.g[i];
      z localz = new z(this.f[i], n, n + k - j);
      if (paramf.a == null)
      {
        localz.g = localz;
        localz.f = localz;
        paramf.a = localz;
      }
      for (;;)
      {
        i += 1;
        j = k;
        break;
        paramf.a.g.a(localz);
      }
    }
    long l = paramf.b;
    paramf.b = (j + l);
  }
  
  public boolean a(int paramInt1, k paramk, int paramInt2, int paramInt3)
  {
    if (paramInt1 > f() - paramInt3) {
      return false;
    }
    int j = b(paramInt1);
    int i = paramInt1;
    paramInt1 = j;
    label26:
    if (paramInt3 > 0)
    {
      if (paramInt1 == 0) {}
      for (j = 0;; j = this.g[(paramInt1 - 1)])
      {
        int k = Math.min(paramInt3, this.g[paramInt1] - j + j - i);
        int m = this.g[(this.f.length + paramInt1)];
        if (!paramk.a(paramInt2, this.f[paramInt1], i - j + m, k)) {
          break;
        }
        i += k;
        paramInt2 += k;
        paramInt3 -= k;
        paramInt1 += 1;
        break label26;
      }
    }
    return true;
  }
  
  public boolean a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if ((paramInt1 > f() - paramInt3) || (paramInt2 > paramArrayOfByte.length - paramInt3)) {
      return false;
    }
    int j = b(paramInt1);
    int i = paramInt1;
    paramInt1 = j;
    label35:
    if (paramInt3 > 0)
    {
      if (paramInt1 == 0) {}
      for (j = 0;; j = this.g[(paramInt1 - 1)])
      {
        int k = Math.min(paramInt3, this.g[paramInt1] - j + j - i);
        int m = this.g[(this.f.length + paramInt1)];
        if (!ag.a(this.f[paramInt1], i - j + m, paramArrayOfByte, paramInt2, k)) {
          break;
        }
        i += k;
        paramInt2 += k;
        paramInt3 -= k;
        paramInt1 += 1;
        break label35;
      }
    }
    return true;
  }
  
  public String b()
  {
    return h().b();
  }
  
  public k c()
  {
    return h().c();
  }
  
  public String d()
  {
    return h().d();
  }
  
  public k e()
  {
    return h().e();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof k)) && (((k)paramObject).f() == f()) && (a(0, (k)paramObject, 0, f()))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int f()
  {
    return this.g[(this.f.length - 1)];
  }
  
  public byte[] g()
  {
    int i = 0;
    byte[] arrayOfByte = new byte[this.g[(this.f.length - 1)]];
    int m = this.f.length;
    int k;
    for (int j = 0; i < m; j = k)
    {
      int n = this.g[(m + i)];
      k = this.g[i];
      System.arraycopy(this.f[i], n, arrayOfByte, j, k - j);
      i += 1;
    }
    return arrayOfByte;
  }
  
  public int hashCode()
  {
    int i = this.d;
    if (i != 0) {
      return i;
    }
    i = 1;
    int i2 = this.f.length;
    int j = 0;
    int n;
    for (int k = 0; j < i2; k = n)
    {
      byte[] arrayOfByte = this.f[j];
      int i1 = this.g[(i2 + j)];
      n = this.g[j];
      int m = i1;
      while (m < n - k + i1)
      {
        i = i * 31 + arrayOfByte[m];
        m += 1;
      }
      j += 1;
    }
    this.d = i;
    return i;
  }
  
  public String toString()
  {
    return h().toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */