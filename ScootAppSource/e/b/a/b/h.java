package e.b.a.b;

import e.b.a.c.m;
import e.b.a.l;

final class h
  extends m
{
  private final d b;
  
  h(d paramd, l paraml)
  {
    super(e.b.a.d.n(), paraml);
    this.b = paramd;
  }
  
  public int a(long paramLong)
  {
    return this.b.d(paramLong);
  }
  
  public boolean b(long paramLong)
  {
    return this.b.j(paramLong);
  }
  
  public int c(long paramLong)
  {
    int i = this.b.a(paramLong);
    return this.b.a(i);
  }
  
  protected int d(long paramLong, int paramInt)
  {
    int i = this.b.O() - 1;
    if ((paramInt > i) || (paramInt < 1)) {
      i = c(paramLong);
    }
    return i;
  }
  
  public l e()
  {
    return this.b.D();
  }
  
  public int g()
  {
    return 1;
  }
  
  public int h()
  {
    return this.b.O();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */