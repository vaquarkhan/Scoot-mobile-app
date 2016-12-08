package e.b.a.e;

import e.b.a.i;

final class b
{
  public final long a;
  public final i b;
  b c;
  private String d;
  private int e = Integer.MIN_VALUE;
  private int f = Integer.MIN_VALUE;
  
  b(i parami, long paramLong)
  {
    this.a = paramLong;
    this.b = parami;
  }
  
  public String a(long paramLong)
  {
    if ((this.c == null) || (paramLong < this.c.a))
    {
      if (this.d == null) {
        this.d = this.b.a(this.a);
      }
      return this.d;
    }
    return this.c.a(paramLong);
  }
  
  public int b(long paramLong)
  {
    if ((this.c == null) || (paramLong < this.c.a))
    {
      if (this.e == Integer.MIN_VALUE) {
        this.e = this.b.b(this.a);
      }
      return this.e;
    }
    return this.c.b(paramLong);
  }
  
  public int c(long paramLong)
  {
    if ((this.c == null) || (paramLong < this.c.a))
    {
      if (this.f == Integer.MIN_VALUE) {
        this.f = this.b.c(this.a);
      }
      return this.f;
    }
    return this.c.c(paramLong);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */