package e.b.a.a;

import e.b.a.c.g;
import e.b.a.d.z;
import e.b.a.x;
import org.joda.convert.ToString;

public abstract class b
  implements x
{
  public int a(x paramx)
  {
    if (this == paramx) {}
    long l1;
    long l2;
    do
    {
      return 0;
      l1 = paramx.a();
      l2 = a();
    } while (l2 == l1);
    if (l2 < l1) {
      return -1;
    }
    return 1;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof x)) {
        return false;
      }
      paramObject = (x)paramObject;
    } while ((a() == ((x)paramObject).a()) && (g.a(b(), ((x)paramObject).b())));
    return false;
  }
  
  public int hashCode()
  {
    return (int)(a() ^ a() >>> 32) + b().hashCode();
  }
  
  @ToString
  public String toString()
  {
    return z.b().a(this);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */