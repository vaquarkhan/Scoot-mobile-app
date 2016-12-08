package com.payu.india.e;

import android.app.Activity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

final class g
  implements Thread.UncaughtExceptionHandler
{
  g(f paramf, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    while (f.a(this.b)) {}
    this.b.a();
    try
    {
      FileOutputStream localFileOutputStream = f.c(this.b).openFileOutput(f.b(this.b), 0);
      int j = f.d(this.b).size();
      int i = 0;
      while (i < j)
      {
        localFileOutputStream.write(((String)f.d(this.b).get(i) + "\r\n").getBytes());
        i += 1;
      }
      localFileOutputStream.close();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
    this.b.b();
    this.a.uncaughtException(paramThread, paramThrowable);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */