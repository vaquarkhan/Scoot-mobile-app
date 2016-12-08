package e.b.a.b;

import e.b.a.c;
import e.b.a.c.g;
import e.b.a.c.h;

final class l
  extends h
{
  private final d a;
  
  l(d paramd)
  {
    super(e.b.a.d.p(), paramd.T());
    this.a = paramd;
  }
  
  public int a(long paramLong)
  {
    return this.a.e(paramLong);
  }
  
  public long a(long paramLong, int paramInt)
  {
    if (paramInt == 0) {
      return paramLong;
    }
    return b(paramLong, a(paramLong) + paramInt);
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    return a(paramLong1, g.a(paramLong2));
  }
  
  public long b(long paramLong, int paramInt)
  {
    g.a(this, Math.abs(paramInt), this.a.Q(), this.a.R());
    int i = a(paramLong);
    if (i == paramInt) {
      return paramLong;
    }
    int k = this.a.g(paramLong);
    i = this.a.b(i);
    int j = this.a.b(paramInt);
    if (j < i)
    {
      i = j;
      j = this.a.f(paramLong);
      if (j <= i) {
        break label185;
      }
    }
    for (;;)
    {
      long l = this.a.f(paramLong, paramInt);
      j = a(l);
      if (j < paramInt) {
        paramLong = l + 604800000L;
      }
      for (;;)
      {
        l = i - this.a.f(paramLong);
        return this.a.t().b(l * 604800000L + paramLong, k);
        break;
        paramLong = l;
        if (j > paramInt) {
          paramLong = l - 604800000L;
        }
      }
      label185:
      i = j;
    }
  }
  
  public boolean b(long paramLong)
  {
    return this.a.b(this.a.e(paramLong)) > 52;
  }
  
  public long d(long paramLong)
  {
    long l = this.a.x().d(paramLong);
    int i = this.a.f(l);
    paramLong = l;
    if (i > 1) {
      paramLong = l - (i - 1) * 604800000L;
    }
    return paramLong;
  }
  
  public e.b.a.l e()
  {
    return null;
  }
  
  public e.b.a.l f()
  {
    return this.a.w();
  }
  
  public int g()
  {
    return this.a.Q();
  }
  
  public int h()
  {
    return this.a.R();
  }
  
  public long i(long paramLong)
  {
    return paramLong - d(paramLong);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */