package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.i;
import java.util.ArrayList;

public final class g
  implements Thread.UncaughtExceptionHandler
{
  private final Thread.UncaughtExceptionHandler a;
  private final r b;
  private final Context c;
  private f d;
  private h e;
  
  public g(r paramr, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, Context paramContext)
  {
    if (paramr == null) {
      throw new NullPointerException("tracker cannot be null");
    }
    if (paramContext == null) {
      throw new NullPointerException("context cannot be null");
    }
    this.a = paramUncaughtExceptionHandler;
    this.b = paramr;
    this.d = new q(paramContext, new ArrayList());
    this.c = paramContext.getApplicationContext();
    if (paramUncaughtExceptionHandler == null)
    {
      paramr = "null";
      paramr = String.valueOf(paramr);
      if (paramr.length() == 0) {
        break label111;
      }
    }
    label111:
    for (paramr = "ExceptionReporter created, original handler is ".concat(paramr);; paramr = new String("ExceptionReporter created, original handler is "))
    {
      i.b(paramr);
      return;
      paramr = paramUncaughtExceptionHandler.getClass().getName();
      break;
    }
  }
  
  h a()
  {
    if (this.e == null) {
      this.e = h.a(this.c);
    }
    return this.e;
  }
  
  Thread.UncaughtExceptionHandler b()
  {
    return this.a;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Object localObject = "UncaughtException";
    if (this.d != null)
    {
      if (paramThread != null)
      {
        localObject = paramThread.getName();
        localObject = this.d.a((String)localObject, paramThrowable);
      }
    }
    else
    {
      str = String.valueOf(localObject);
      if (str.length() == 0) {
        break label126;
      }
    }
    label126:
    for (String str = "Reporting uncaught exception: ".concat(str);; str = new String("Reporting uncaught exception: "))
    {
      i.b(str);
      this.b.a(new m().a((String)localObject).a(true).a());
      localObject = a();
      ((h)localObject).i();
      ((h)localObject).j();
      if (this.a != null)
      {
        i.b("Passing exception to the original handler");
        this.a.uncaughtException(paramThread, paramThrowable);
      }
      return;
      localObject = null;
      break;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */