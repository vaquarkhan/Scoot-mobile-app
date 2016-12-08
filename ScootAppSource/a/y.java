package a;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

final class y
  implements m<Object, Void>
{
  y(Object paramObject, ArrayList paramArrayList, AtomicBoolean paramAtomicBoolean, AtomicInteger paramAtomicInteger, ac paramac) {}
  
  public Void a(o<Object> paramo)
  {
    if (paramo.e()) {}
    synchronized (this.a)
    {
      this.b.add(paramo.g());
      if (paramo.d()) {
        this.c.set(true);
      }
      if (this.d.decrementAndGet() == 0)
      {
        if (this.b.size() == 0) {
          break label143;
        }
        if (this.b.size() == 1) {
          this.e.b((Exception)this.b.get(0));
        }
      }
      else
      {
        return null;
      }
    }
    paramo = new a(String.format("There were %d exceptions.", new Object[] { Integer.valueOf(this.b.size()) }), this.b);
    this.e.b(paramo);
    return null;
    label143:
    if (this.c.get())
    {
      this.e.c();
      return null;
    }
    this.e.b(null);
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */