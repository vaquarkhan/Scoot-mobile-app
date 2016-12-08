package com.c.a.c;

import android.os.Looper;
import b.a.a.a.f;
import b.a.a.a.t;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

final class v
{
  private final ExecutorService a;
  
  public v(ExecutorService paramExecutorService)
  {
    this.a = paramExecutorService;
  }
  
  <T> T a(Callable<T> paramCallable)
  {
    try
    {
      if (Looper.getMainLooper() == Looper.myLooper()) {
        return (T)this.a.submit(paramCallable).get(4L, TimeUnit.SECONDS);
      }
      paramCallable = this.a.submit(paramCallable).get();
      return paramCallable;
    }
    catch (RejectedExecutionException paramCallable)
    {
      f.h().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
      return null;
    }
    catch (Exception paramCallable)
    {
      f.h().e("CrashlyticsCore", "Failed to execute task.", paramCallable);
    }
    return null;
  }
  
  Future<?> a(Runnable paramRunnable)
  {
    try
    {
      paramRunnable = this.a.submit(new w(this, paramRunnable));
      return paramRunnable;
    }
    catch (RejectedExecutionException paramRunnable)
    {
      f.h().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
    }
    return null;
  }
  
  <T> Future<T> b(Callable<T> paramCallable)
  {
    try
    {
      paramCallable = this.a.submit(new x(this, paramCallable));
      return paramCallable;
    }
    catch (RejectedExecutionException paramCallable)
    {
      f.h().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */