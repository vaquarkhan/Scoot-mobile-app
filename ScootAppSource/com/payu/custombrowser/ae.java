package com.payu.custombrowser;

import android.app.Activity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

final class ae
  implements Thread.UncaughtExceptionHandler
{
  ae(ad paramad, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    while (ad.a(this.b)) {}
    ad.b(this.b);
    try
    {
      FileOutputStream localFileOutputStream = ad.d(this.b).openFileOutput(ad.c(this.b), 0);
      int j = ad.e(this.b).size();
      if (j > 0)
      {
        JSONArray localJSONArray = new JSONArray();
        int i = 0;
        while (i < j)
        {
          JSONObject localJSONObject = new JSONObject((String)ad.e(this.b).get(i));
          localJSONArray.put(localJSONArray.length(), localJSONObject);
          i += 1;
        }
        localFileOutputStream.write(localJSONArray.toString().getBytes());
        ad.a(this.b, new ArrayList());
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
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    ad.f(this.b);
    this.a.uncaughtException(paramThread, paramThrowable);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */