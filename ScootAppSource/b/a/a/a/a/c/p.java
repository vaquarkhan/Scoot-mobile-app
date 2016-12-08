package b.a.a.a.a.c;

import java.util.Collection;
import java.util.concurrent.ExecutorService;

public abstract class p<Params, Progress, Result>
  extends a<Params, Progress, Result>
  implements l<y>, u, y
{
  private final v a = new v();
  
  public void a(y paramy)
  {
    if (m_() != j.a) {
      throw new IllegalStateException("Must not add Dependency after task is running");
    }
    ((l)g()).c(paramy);
  }
  
  public void a(Throwable paramThrowable)
  {
    ((y)g()).a(paramThrowable);
  }
  
  public final void a(ExecutorService paramExecutorService, Params... paramVarArgs)
  {
    super.a(new q(paramExecutorService, this), paramVarArgs);
  }
  
  public int b()
  {
    return ((u)g()).b();
  }
  
  public void b(boolean paramBoolean)
  {
    ((y)g()).b(paramBoolean);
  }
  
  public Collection<y> c()
  {
    return ((l)g()).c();
  }
  
  public int compareTo(Object paramObject)
  {
    return o.a(this, paramObject);
  }
  
  public boolean d()
  {
    return ((l)g()).d();
  }
  
  public boolean f()
  {
    return ((y)g()).f();
  }
  
  public <T extends l<y>,  extends u,  extends y> T g()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */