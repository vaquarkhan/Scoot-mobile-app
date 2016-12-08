package e.b.a.c;

import e.b.a.c;
import e.b.a.l;

public final class o
  extends d
{
  final int a;
  final l b;
  final l c;
  
  public o(f paramf)
  {
    this(paramf, paramf.a());
  }
  
  public o(f paramf, e.b.a.d paramd)
  {
    this(paramf, paramf.i().d(), paramd);
  }
  
  public o(f paramf, l paraml, e.b.a.d paramd)
  {
    super(paramf.i(), paramd);
    this.a = paramf.a;
    this.b = paraml;
    this.c = paramf.b;
  }
  
  public o(c paramc, l paraml, e.b.a.d paramd, int paramInt)
  {
    super(paramc, paramd);
    if (paramInt < 2) {
      throw new IllegalArgumentException("The divisor must be at least 2");
    }
    this.c = paraml;
    this.b = paramc.d();
    this.a = paramInt;
  }
  
  private int a(int paramInt)
  {
    if (paramInt >= 0) {
      return paramInt / this.a;
    }
    return (paramInt + 1) / this.a - 1;
  }
  
  public int a(long paramLong)
  {
    int i = i().a(paramLong);
    if (i >= 0) {
      return i % this.a;
    }
    int j = this.a;
    return (i + 1) % this.a + (j - 1);
  }
  
  public long b(long paramLong, int paramInt)
  {
    g.a(this, paramInt, 0, this.a - 1);
    int i = a(i().a(paramLong));
    return i().b(paramLong, i * this.a + paramInt);
  }
  
  public long d(long paramLong)
  {
    return i().d(paramLong);
  }
  
  public l d()
  {
    return this.b;
  }
  
  public long e(long paramLong)
  {
    return i().e(paramLong);
  }
  
  public l e()
  {
    return this.c;
  }
  
  public long f(long paramLong)
  {
    return i().f(paramLong);
  }
  
  public int g()
  {
    return 0;
  }
  
  public long g(long paramLong)
  {
    return i().g(paramLong);
  }
  
  public int h()
  {
    return this.a - 1;
  }
  
  public long h(long paramLong)
  {
    return i().h(paramLong);
  }
  
  public long i(long paramLong)
  {
    return i().i(paramLong);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */