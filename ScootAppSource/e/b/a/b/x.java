package e.b.a.b;

import e.b.a.c.c;
import e.b.a.i;
import e.b.a.l;

final class x
  extends c
{
  final l a;
  final boolean b;
  final i c;
  
  x(l paraml, i parami)
  {
    super(paraml.a());
    if (!paraml.b()) {
      throw new IllegalArgumentException();
    }
    this.a = paraml;
    this.b = v.a(paraml);
    this.c = parami;
  }
  
  private int a(long paramLong)
  {
    int i = this.c.b(paramLong);
    if (((i + paramLong ^ paramLong) < 0L) && ((i ^ paramLong) >= 0L)) {
      throw new ArithmeticException("Adding time zone offset caused overflow");
    }
    return i;
  }
  
  private int b(long paramLong)
  {
    int i = this.c.e(paramLong);
    if (((paramLong - i ^ paramLong) < 0L) && ((i ^ paramLong) < 0L)) {
      throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }
    return i;
  }
  
  public long a(long paramLong, int paramInt)
  {
    int i = a(paramLong);
    paramLong = this.a.a(i + paramLong, paramInt);
    if (this.b) {}
    for (paramInt = i;; paramInt = b(paramLong)) {
      return paramLong - paramInt;
    }
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    int i = a(paramLong1);
    paramLong1 = this.a.a(i + paramLong1, paramLong2);
    if (this.b) {}
    for (;;)
    {
      return paramLong1 - i;
      i = b(paramLong1);
    }
  }
  
  public boolean c()
  {
    if (this.b) {
      return this.a.c();
    }
    return (this.a.c()) && (this.c.f());
  }
  
  public long d()
  {
    return this.a.d();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof x)) {
        break;
      }
      paramObject = (x)paramObject;
    } while ((this.a.equals(((x)paramObject).a)) && (this.c.equals(((x)paramObject).c)));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return this.a.hashCode() ^ this.c.hashCode();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */