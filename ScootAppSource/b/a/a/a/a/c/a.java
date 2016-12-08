package b.a.a.a.a.c;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a<Params, Progress, Result>
{
  private static final int a = Runtime.getRuntime().availableProcessors();
  public static final Executor b = new ThreadPoolExecutor(d, e, 1L, TimeUnit.SECONDS, g, f);
  public static final Executor c = new h(null);
  private static final int d = a + 1;
  private static final int e = a * 2 + 1;
  private static final ThreadFactory f = new b();
  private static final BlockingQueue<Runnable> g = new LinkedBlockingQueue(128);
  private static final g h = new g();
  private static volatile Executor i = c;
  private final k<Params, Result> j = new c(this);
  private final FutureTask<Result> k = new d(this, this.j);
  private volatile int l = j.a;
  private final AtomicBoolean m = new AtomicBoolean();
  private final AtomicBoolean n = new AtomicBoolean();
  
  private void d(Result paramResult)
  {
    if (!this.n.get()) {
      e(paramResult);
    }
  }
  
  private Result e(Result paramResult)
  {
    h.obtainMessage(1, new f(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
  
  private void f(Result paramResult)
  {
    if (e()) {
      b(paramResult);
    }
    for (;;)
    {
      this.l = j.c;
      return;
      a(paramResult);
    }
  }
  
  public final a<Params, Progress, Result> a(Executor paramExecutor, Params... paramVarArgs)
  {
    if (this.l != j.a) {}
    switch (e.a[(this.l - 1)])
    {
    default: 
      this.l = j.b;
      a();
      this.j.b = paramVarArgs;
      paramExecutor.execute(this.k);
      return this;
    case 1: 
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    }
    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
  }
  
  protected abstract Result a(Params... paramVarArgs);
  
  protected void a() {}
  
  protected void a(Result paramResult) {}
  
  public final boolean a(boolean paramBoolean)
  {
    this.m.set(true);
    return this.k.cancel(paramBoolean);
  }
  
  protected void b(Result paramResult)
  {
    n_();
  }
  
  protected void b(Progress... paramVarArgs) {}
  
  public final boolean e()
  {
    return this.m.get();
  }
  
  public final int m_()
  {
    return this.l;
  }
  
  protected void n_() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */