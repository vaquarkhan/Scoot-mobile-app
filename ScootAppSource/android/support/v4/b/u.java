package android.support.v4.b;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class u<Params, Progress, Result>
{
  private static final ThreadFactory a = new v();
  private static final BlockingQueue<Runnable> b = new LinkedBlockingQueue(10);
  public static final Executor c = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, b, a);
  private static aa d;
  private static volatile Executor e = c;
  private final ac<Params, Result> f = new w(this);
  private final FutureTask<Result> g = new x(this, this.f);
  private volatile int h = ab.a;
  private final AtomicBoolean i = new AtomicBoolean();
  
  private void c(Result paramResult)
  {
    if (!this.i.get()) {
      d(paramResult);
    }
  }
  
  private static Handler d()
  {
    try
    {
      if (d == null) {
        d = new aa();
      }
      aa localaa = d;
      return localaa;
    }
    finally {}
  }
  
  private Result d(Result paramResult)
  {
    d().obtainMessage(1, new z(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
  
  private void e(Result paramResult)
  {
    if (c()) {
      b(paramResult);
    }
    for (;;)
    {
      this.h = ab.c;
      return;
      a(paramResult);
    }
  }
  
  public final u<Params, Progress, Result> a(Executor paramExecutor, Params... paramVarArgs)
  {
    if (this.h != ab.a) {}
    switch (y.a[(this.h - 1)])
    {
    default: 
      this.h = ab.b;
      a();
      this.f.b = paramVarArgs;
      paramExecutor.execute(this.g);
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
    return this.g.cancel(paramBoolean);
  }
  
  protected void b() {}
  
  protected void b(Result paramResult)
  {
    b();
  }
  
  protected void b(Progress... paramVarArgs) {}
  
  public final boolean c()
  {
    return this.g.isCancelled();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */