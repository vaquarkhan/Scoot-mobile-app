package b.a.a.a.a.c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class t<V>
  extends FutureTask<V>
  implements l<y>, u, y
{
  final Object b = a(paramCallable);
  
  public t(Runnable paramRunnable, V paramV)
  {
    super(paramRunnable, paramV);
  }
  
  public t(Callable<V> paramCallable)
  {
    super(paramCallable);
  }
  
  public <T extends l<y>,  extends u,  extends y> T a()
  {
    return (l)this.b;
  }
  
  protected <T extends l<y>,  extends u,  extends y> T a(Object paramObject)
  {
    if (v.a(paramObject)) {
      return (l)paramObject;
    }
    return new v();
  }
  
  public void a(y paramy)
  {
    ((l)a()).c(paramy);
  }
  
  public void a(Throwable paramThrowable)
  {
    ((y)a()).a(paramThrowable);
  }
  
  public int b()
  {
    return ((u)a()).b();
  }
  
  public void b(boolean paramBoolean)
  {
    ((y)a()).b(paramBoolean);
  }
  
  public Collection<y> c()
  {
    return ((l)a()).c();
  }
  
  public int compareTo(Object paramObject)
  {
    return ((u)a()).compareTo(paramObject);
  }
  
  public boolean d()
  {
    return ((l)a()).d();
  }
  
  public boolean f()
  {
    return ((y)a()).f();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */