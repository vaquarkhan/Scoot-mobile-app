package e.b.a.b;

import e.b.a.c.g;
import e.b.a.c.h;
import e.b.a.l;

final class m
  extends h
{
  protected final d a;
  
  m(d paramd)
  {
    super(e.b.a.d.s(), paramd.T());
    this.a = paramd;
  }
  
  public int a(long paramLong)
  {
    return this.a.a(paramLong);
  }
  
  public long a(long paramLong, int paramInt)
  {
    if (paramInt == 0) {
      return paramLong;
    }
    return b(paramLong, g.a(a(paramLong), paramInt));
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    return a(paramLong1, g.a(paramLong2));
  }
  
  public long b(long paramLong, int paramInt)
  {
    g.a(this, paramInt, this.a.Q(), this.a.R());
    return this.a.f(paramLong, paramInt);
  }
  
  public boolean b(long paramLong)
  {
    return this.a.e(a(paramLong));
  }
  
  public long c(long paramLong, int paramInt)
  {
    g.a(this, paramInt, this.a.Q() - 1, this.a.R() + 1);
    return this.a.f(paramLong, paramInt);
  }
  
  public long d(long paramLong)
  {
    return this.a.d(a(paramLong));
  }
  
  public long e(long paramLong)
  {
    int i = a(paramLong);
    long l = paramLong;
    if (paramLong != this.a.d(i)) {
      l = this.a.d(i + 1);
    }
    return l;
  }
  
  public l e()
  {
    return null;
  }
  
  public l f()
  {
    return this.a.s();
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */