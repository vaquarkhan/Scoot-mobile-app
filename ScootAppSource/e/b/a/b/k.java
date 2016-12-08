package e.b.a.b;

import e.b.a.c.m;
import e.b.a.l;

final class k
  extends m
{
  private final d b;
  
  k(d paramd, l paraml)
  {
    super(e.b.a.d.o(), paraml);
    this.b = paramd;
  }
  
  public int a(long paramLong)
  {
    return this.b.f(paramLong);
  }
  
  public int c(long paramLong)
  {
    int i = this.b.e(paramLong);
    return this.b.b(i);
  }
  
  protected int d(long paramLong, int paramInt)
  {
    int i = 52;
    if (paramInt > 52) {
      i = c(paramLong);
    }
    return i;
  }
  
  public long d(long paramLong)
  {
    return super.d(paramLong + 259200000L) - 259200000L;
  }
  
  public long e(long paramLong)
  {
    return super.e(paramLong + 259200000L) - 259200000L;
  }
  
  public l e()
  {
    return this.b.y();
  }
  
  public int g()
  {
    return 1;
  }
  
  public int h()
  {
    return 53;
  }
  
  public long i(long paramLong)
  {
    return super.i(259200000L + paramLong);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */