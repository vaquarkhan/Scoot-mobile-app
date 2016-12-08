package e.b.a.c;

import e.b.a.m;

public final class n
  extends c
{
  private final long a;
  
  public n(m paramm, long paramLong)
  {
    super(paramm);
    this.a = paramLong;
  }
  
  public long a(long paramLong, int paramInt)
  {
    return g.a(paramLong, paramInt * this.a);
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    return g.a(paramLong1, g.b(paramLong2, this.a));
  }
  
  public final boolean c()
  {
    return true;
  }
  
  public final long d()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof n)) {
        break;
      }
      paramObject = (n)paramObject;
    } while ((a() == ((n)paramObject).a()) && (this.a == ((n)paramObject).a));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    long l = this.a;
    return (int)(l ^ l >>> 32) + a().hashCode();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */