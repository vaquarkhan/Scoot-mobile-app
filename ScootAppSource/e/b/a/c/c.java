package e.b.a.c;

import e.b.a.l;
import e.b.a.m;
import java.io.Serializable;

public abstract class c
  extends l
  implements Serializable
{
  private final m a;
  
  protected c(m paramm)
  {
    if (paramm == null) {
      throw new IllegalArgumentException("The type must not be null");
    }
    this.a = paramm;
  }
  
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
  
  public final m a()
  {
    return this.a;
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final String e()
  {
    return this.a.m();
  }
  
  public String toString()
  {
    return "DurationField[" + e() + ']';
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */