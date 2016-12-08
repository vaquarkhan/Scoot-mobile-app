package b.a.a.a.a.c.a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class a<V>
  implements Future<V>
{
  private final b<V> a = new b();
  
  static final CancellationException a(String paramString, Throwable paramThrowable)
  {
    paramString = new CancellationException(paramString);
    paramString.initCause(paramThrowable);
    return paramString;
  }
  
  protected void a() {}
  
  protected boolean a(V paramV)
  {
    return this.a.a(paramV);
  }
  
  protected boolean a(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      throw new NullPointerException();
    }
    return this.a.a(paramThrowable);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    if (!this.a.a(paramBoolean)) {
      return false;
    }
    if (paramBoolean) {
      a();
    }
    return true;
  }
  
  public V get()
  {
    return (V)this.a.a();
  }
  
  public V get(long paramLong, TimeUnit paramTimeUnit)
  {
    return (V)this.a.a(paramTimeUnit.toNanos(paramLong));
  }
  
  public boolean isCancelled()
  {
    return this.a.c();
  }
  
  public boolean isDone()
  {
    return this.a.b();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */