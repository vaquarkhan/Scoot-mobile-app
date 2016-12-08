package com.payu.custombrowser;

import android.app.Activity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

final class an
  implements Thread.UncaughtExceptionHandler
{
  an(am paramam, String paramString, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    while (am.a(this.c)) {}
    am.b(this.c);
    try
    {
      FileOutputStream localFileOutputStream = am.c(this.c).openFileOutput(this.a, 0);
      int j = am.d(this.c).size();
      int i = 0;
      while (i < j)
      {
        localFileOutputStream.write(((String)am.d(this.c).get(i) + "\r\n").getBytes());
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
    am.e(this.c);
    this.b.uncaughtException(paramThread, paramThrowable);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */