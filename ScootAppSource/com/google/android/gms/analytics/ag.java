package com.google.android.gms.analytics;

import android.util.Log;
import java.util.concurrent.FutureTask;

final class ag
  extends FutureTask<T>
{
  ag(af paramaf, Runnable paramRunnable, Object paramObject)
  {
    super(paramRunnable, paramObject);
  }
  
  protected void setException(Throwable paramThrowable)
  {
    Object localObject = ad.b(this.a.a);
    if (localObject != null) {
      ((Thread.UncaughtExceptionHandler)localObject).uncaughtException(Thread.currentThread(), paramThrowable);
    }
    for (;;)
    {
      super.setException(paramThrowable);
      return;
      if (Log.isLoggable("GAv4", 6))
      {
        localObject = String.valueOf(paramThrowable);
        Log.e("GAv4", String.valueOf(localObject).length() + 37 + "MeasurementExecutor: job failed with " + (String)localObject);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */