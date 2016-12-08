package e.b.a.a;

import e.b.a.b.t;
import e.b.a.f;
import e.b.a.i;
import e.b.a.w;
import java.io.Serializable;

public abstract class c
  extends a
  implements w, Serializable
{
  private volatile long a;
  private volatile e.b.a.a b = a(parama);
  
  public c()
  {
    this(f.a(), t.O());
  }
  
  public c(long paramLong, e.b.a.a parama)
  {
    this.a = a(paramLong, this.b);
    g();
  }
  
  public c(long paramLong, i parami)
  {
    this(paramLong, t.b(parami));
  }
  
  private void g()
  {
    if ((this.a == Long.MIN_VALUE) || (this.a == Long.MAX_VALUE)) {
      this.b = this.b.b();
    }
  }
  
  public long a()
  {
    return this.a;
  }
  
  protected long a(long paramLong, e.b.a.a parama)
  {
    return paramLong;
  }
  
  protected e.b.a.a a(e.b.a.a parama)
  {
    return f.a(parama);
  }
  
  protected void a(long paramLong)
  {
    this.a = a(paramLong, this.b);
  }
  
  public e.b.a.a b()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */