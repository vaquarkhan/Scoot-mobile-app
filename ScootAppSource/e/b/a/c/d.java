package e.b.a.c;

import e.b.a.c;
import e.b.a.l;

public abstract class d
  extends b
{
  private final c a;
  
  protected d(c paramc, e.b.a.d paramd)
  {
    super(paramd);
    if (paramc == null) {
      throw new IllegalArgumentException("The field must not be null");
    }
    if (!paramc.c()) {
      throw new IllegalArgumentException("The field must be supported");
    }
    this.a = paramc;
  }
  
  public int a(long paramLong)
  {
    return this.a.a(paramLong);
  }
  
  public long b(long paramLong, int paramInt)
  {
    return this.a.b(paramLong, paramInt);
  }
  
  public long d(long paramLong)
  {
    return this.a.d(paramLong);
  }
  
  public l d()
  {
    return this.a.d();
  }
  
  public l e()
  {
    return this.a.e();
  }
  
  public int g()
  {
    return this.a.g();
  }
  
  public int h()
  {
    return this.a.h();
  }
  
  public final c i()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */