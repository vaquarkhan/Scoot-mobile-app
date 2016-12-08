package com.google.android.gms.analytics.internal;

final class ai
  implements Thread.UncaughtExceptionHandler
{
  ai(ah paramah) {}
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    paramThread = this.a.g();
    if (paramThread != null) {
      paramThread.e("Job execution failed", paramThrowable);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */