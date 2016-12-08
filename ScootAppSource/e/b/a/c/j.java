package e.b.a.c;

import e.b.a.l;
import e.b.a.m;
import java.io.Serializable;

public final class j
  extends l
  implements Serializable
{
  public static final l a = new j();
  
  public int a(l paraml)
  {
    long l1 = paraml.d();
    long l2 = d();
    if (l2 == l1) {
      return 0;
    }
    if (l2 < l1) {
      return -1;
    }
    return 1;
  }
  
  public long a(long paramLong, int paramInt)
  {
    return g.a(paramLong, paramInt);
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    return g.a(paramLong1, paramLong2);
  }
  
  public m a()
  {
    return m.a();
  }
  
  public boolean b()
  {
    return true;
  }
  
  public final boolean c()
  {
    return true;
  }
  
  public final long d()
  {
    return 1L;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof j))
    {
      bool1 = bool2;
      if (d() == ((j)paramObject).d()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return (int)d();
  }
  
  public String toString()
  {
    return "DurationField[millis]";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */