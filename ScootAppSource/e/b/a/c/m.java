package e.b.a.c;

import e.b.a.d;
import e.b.a.l;

public abstract class m
  extends b
{
  final long a;
  private final l b;
  
  public m(d paramd, l paraml)
  {
    super(paramd);
    if (!paraml.c()) {
      throw new IllegalArgumentException("Unit duration field must be precise");
    }
    this.a = paraml.d();
    if (this.a < 1L) {
      throw new IllegalArgumentException("The unit milliseconds must be at least 1");
    }
    this.b = paraml;
  }
  
  public long b(long paramLong, int paramInt)
  {
    g.a(this, paramInt, g(), d(paramLong, paramInt));
    return (paramInt - a(paramLong)) * this.a + paramLong;
  }
  
  protected int d(long paramLong, int paramInt)
  {
    return c(paramLong);
  }
  
  public long d(long paramLong)
  {
    if (paramLong >= 0L) {
      return paramLong - paramLong % this.a;
    }
    paramLong = 1L + paramLong;
    return paramLong - paramLong % this.a - this.a;
  }
  
  public l d()
  {
    return this.b;
  }
  
  public long e(long paramLong)
  {
    if (paramLong > 0L)
    {
      paramLong -= 1L;
      return paramLong - paramLong % this.a + this.a;
    }
    return paramLong - paramLong % this.a;
  }
  
  public int g()
  {
    return 0;
  }
  
  public final long i()
  {
    return this.a;
  }
  
  public long i(long paramLong)
  {
    if (paramLong >= 0L) {
      return paramLong % this.a;
    }
    return (paramLong + 1L) % this.a + this.a - 1L;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */