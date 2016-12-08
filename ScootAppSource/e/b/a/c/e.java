package e.b.a.c;

import e.b.a.l;
import e.b.a.m;

public class e
  extends c
{
  private final l a;
  
  public e(l paraml, m paramm)
  {
    super(paramm);
    if (paraml == null) {
      throw new IllegalArgumentException("The field must not be null");
    }
    if (!paraml.b()) {
      throw new IllegalArgumentException("The field must be supported");
    }
    this.a = paraml;
  }
  
  public long a(long paramLong, int paramInt)
  {
    return this.a.a(paramLong, paramInt);
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    return this.a.a(paramLong1, paramLong2);
  }
  
  public boolean c()
  {
    return this.a.c();
  }
  
  public long d()
  {
    return this.a.d();
  }
  
  public final l f()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */