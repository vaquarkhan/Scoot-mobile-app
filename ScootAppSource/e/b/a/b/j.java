package e.b.a.b;

import e.b.a.c.g;
import e.b.a.c.h;
import e.b.a.l;

class j
  extends h
{
  private final d a;
  private final int c;
  private final int d;
  
  j(d paramd, int paramInt)
  {
    super(e.b.a.d.r(), paramd.V());
    this.a = paramd;
    this.c = this.a.S();
    this.d = paramInt;
  }
  
  public int a(long paramLong)
  {
    return this.a.b(paramLong);
  }
  
  public long a(long paramLong, int paramInt)
  {
    if (paramInt == 0) {
      return paramLong;
    }
    long l = this.a.h(paramLong);
    int j = this.a.a(paramLong);
    int n = this.a.a(paramLong, j);
    int k = n - 1 + paramInt;
    int i;
    if ((n > 0) && (k < 0)) {
      i = j + 1;
    }
    for (paramInt = paramInt - this.c + (n - 1);; paramInt = k)
    {
      if (paramInt >= 0)
      {
        i += paramInt / this.c;
        k = paramInt % this.c + 1;
        paramInt = i;
        i = k;
        j = this.a.a(paramLong, j, n);
        k = this.a.b(paramInt, i);
        if (j <= k) {
          break label232;
        }
        j = k;
      }
      label232:
      for (;;)
      {
        return this.a.a(paramInt, i, j) + l;
        k = i + paramInt / this.c - 1;
        i = Math.abs(paramInt) % this.c;
        paramInt = i;
        if (i == 0) {
          paramInt = this.c;
        }
        int m = this.c - paramInt + 1;
        i = m;
        paramInt = k;
        if (m != 1) {
          break;
        }
        paramInt = k + 1;
        i = m;
        break;
      }
      i = j;
    }
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    int i = (int)paramLong2;
    if (i == paramLong2) {
      return a(paramLong1, i);
    }
    long l5 = this.a.h(paramLong1);
    int n = this.a.a(paramLong1);
    int i1 = this.a.a(paramLong1, n);
    long l2 = i1 - 1 + paramLong2;
    long l1;
    if (l2 >= 0L)
    {
      l1 = n + l2 / this.c;
      l2 = l2 % this.c + 1L;
    }
    while ((l1 < this.a.Q()) || (l1 > this.a.R()))
    {
      throw new IllegalArgumentException("Magnitude of add amount is too large: " + paramLong2);
      long l3 = n + l2 / this.c - 1L;
      j = (int)(Math.abs(l2) % this.c);
      i = j;
      if (j == 0) {
        i = this.c;
      }
      long l4 = this.c - i + 1;
      l2 = l4;
      l1 = l3;
      if (l4 == 1L)
      {
        l1 = l3 + 1L;
        l2 = l4;
      }
    }
    int k = (int)l1;
    int m = (int)l2;
    i = this.a.a(paramLong1, n, i1);
    int j = this.a.b(k, m);
    if (i > j) {
      i = j;
    }
    for (;;)
    {
      return this.a.a(k, m, i) + l5;
    }
  }
  
  public long b(long paramLong, int paramInt)
  {
    g.a(this, paramInt, 1, this.c);
    int k = this.a.a(paramLong);
    int i = this.a.b(paramLong, k);
    int j = this.a.b(k, paramInt);
    if (i > j) {
      i = j;
    }
    for (;;)
    {
      return this.a.a(k, paramInt, i) + this.a.h(paramLong);
    }
  }
  
  public boolean b(long paramLong)
  {
    boolean bool2 = false;
    int i = this.a.a(paramLong);
    boolean bool1 = bool2;
    if (this.a.e(i))
    {
      bool1 = bool2;
      if (this.a.a(paramLong, i) == this.d) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public long d(long paramLong)
  {
    int i = this.a.a(paramLong);
    int j = this.a.a(paramLong, i);
    return this.a.a(i, j);
  }
  
  public l e()
  {
    return this.a.D();
  }
  
  public l f()
  {
    return this.a.s();
  }
  
  public int g()
  {
    return 1;
  }
  
  public int h()
  {
    return this.c;
  }
  
  public long i(long paramLong)
  {
    return paramLong - d(paramLong);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */