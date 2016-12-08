package e.b.a.c;

import e.b.a.c;
import e.b.a.l;

public final class f
  extends d
{
  final int a;
  final l b;
  final l c;
  private final int d;
  private final int e;
  
  public f(c paramc, e.b.a.d paramd, int paramInt)
  {
    this(paramc, paramc.e(), paramd, paramInt);
  }
  
  public f(c paramc, l paraml, e.b.a.d paramd, int paramInt)
  {
    super(paramc, paramd);
    if (paramInt < 2) {
      throw new IllegalArgumentException("The divisor must be at least 2");
    }
    l locall = paramc.d();
    int i;
    label67:
    int j;
    if (locall == null)
    {
      this.b = null;
      this.c = paraml;
      this.a = paramInt;
      i = paramc.g();
      if (i < 0) {
        break label120;
      }
      i /= paramInt;
      j = paramc.h();
      if (j < 0) {
        break label134;
      }
    }
    label120:
    label134:
    for (paramInt = j / paramInt;; paramInt = (j + 1) / paramInt - 1)
    {
      this.d = i;
      this.e = paramInt;
      return;
      this.b = new p(locall, paramd.y(), paramInt);
      break;
      i = (i + 1) / paramInt - 1;
      break label67;
    }
  }
  
  private int a(int paramInt)
  {
    if (paramInt >= 0) {
      return paramInt % this.a;
    }
    return this.a - 1 + (paramInt + 1) % this.a;
  }
  
  public int a(long paramLong)
  {
    int i = i().a(paramLong);
    if (i >= 0) {
      return i / this.a;
    }
    return (i + 1) / this.a - 1;
  }
  
  public long a(long paramLong, int paramInt)
  {
    return i().a(paramLong, this.a * paramInt);
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    return i().a(paramLong1, this.a * paramLong2);
  }
  
  public long b(long paramLong, int paramInt)
  {
    g.a(this, paramInt, this.d, this.e);
    int i = a(i().a(paramLong));
    return i().b(paramLong, i + this.a * paramInt);
  }
  
  public long d(long paramLong)
  {
    c localc = i();
    return localc.d(localc.b(paramLong, a(paramLong) * this.a));
  }
  
  public l d()
  {
    return this.b;
  }
  
  public l e()
  {
    if (this.c != null) {
      return this.c;
    }
    return super.e();
  }
  
  public int g()
  {
    return this.d;
  }
  
  public int h()
  {
    return this.e;
  }
  
  public long i(long paramLong)
  {
    return b(paramLong, a(i().i(paramLong)));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */