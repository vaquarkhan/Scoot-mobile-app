package com.facebook.b;

import com.facebook.w;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public final class ae<T>
{
  private T a;
  private CountDownLatch b = new CountDownLatch(1);
  
  public ae(Callable<T> paramCallable)
  {
    w.d().execute(new FutureTask(new af(this, paramCallable)));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */