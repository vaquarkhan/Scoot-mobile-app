package e.b.a.c;

import e.b.a.d;

public class l
  extends m
{
  private final int b;
  private final e.b.a.l c;
  
  public l(d paramd, e.b.a.l paraml1, e.b.a.l paraml2)
  {
    super(paramd, paraml1);
    if (!paraml2.c()) {
      throw new IllegalArgumentException("Range duration field must be precise");
    }
    this.b = ((int)(paraml2.d() / i()));
    if (this.b < 2) {
      throw new IllegalArgumentException("The effective range must be at least 2");
    }
    this.c = paraml2;
  }
  
  public int a(long paramLong)
  {
    if (paramLong >= 0L) {
      return (int)(paramLong / i() % this.b);
    }
    return this.b - 1 + (int)((1L + paramLong) / i() % this.b);
  }
  
  public long b(long paramLong, int paramInt)
  {
    g.a(this, paramInt, g(), h());
    return (paramInt - a(paramLong)) * this.a + paramLong;
  }
  
  public e.b.a.l e()
  {
    return this.c;
  }
  
  public int h()
  {
    return this.b - 1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */