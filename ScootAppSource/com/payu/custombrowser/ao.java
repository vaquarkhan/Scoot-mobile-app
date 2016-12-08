package com.payu.custombrowser;

import android.app.Activity;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

final class ao
  extends TimerTask
{
  ao(am paramam) {}
  
  public void run()
  {
    while (am.a(this.a)) {}
    am.a(this.a, 5000L);
    am.b(this.a);
    String str1 = "";
    str3 = str1;
    str2 = str1;
    for (;;)
    {
      try
      {
        if (!new File(am.c(this.a).getFilesDir(), am.f(this.a)).exists())
        {
          str3 = str1;
          str2 = str1;
          am.c(this.a).openFileOutput(am.f(this.a), 0);
        }
        str3 = str1;
        str2 = str1;
        FileInputStream localFileInputStream = am.c(this.a).openFileInput(am.f(this.a));
        str3 = str1;
        str2 = str1;
        i = localFileInputStream.read();
        if (i != -1)
        {
          str3 = str1;
          str2 = str1;
          str1 = str1 + Character.toString((char)i);
          continue;
        }
        str3 = str1;
        str2 = str1;
        localFileInputStream.close();
        i = am.d(this.a).size();
      }
      catch (IOException localIOException)
      {
        str2 = str3;
        localIOException.printStackTrace();
        i = am.d(this.a).size();
        localObject1 = str3;
        if (i <= 0) {
          continue;
        }
        i -= 1;
        localObject1 = (String)localObject1 + (String)am.d(this.a).get(i) + "\r\n";
        if ((i < 0) || (am.d(this.a).size() <= i)) {
          continue;
        }
        am.d(this.a).remove(i);
        continue;
        localObject1 = ((String)localObject1).trim();
        if (((String)localObject1).length() <= 0) {
          continue;
        }
        new ap(this.a, (String)localObject1).execute(new String[] { localObject1 });
        continue;
        am.g(this.a).cancel();
        continue;
      }
      finally
      {
        int i = am.d(this.a).size();
        Object localObject1 = str2;
        if (i <= 0) {
          continue;
        }
        i -= 1;
        localObject1 = (String)localObject1 + (String)am.d(this.a).get(i) + "\r\n";
        if ((i < 0) || (am.d(this.a).size() <= i)) {
          continue;
        }
        am.d(this.a).remove(i);
        continue;
        localObject1 = ((String)localObject1).trim();
        if (((String)localObject1).length() <= 0) {
          continue;
        }
        new ap(this.a, (String)localObject1).execute(new String[] { localObject1 });
        throw ((Throwable)localObject2);
        am.g(this.a).cancel();
        continue;
        continue;
        continue;
        continue;
      }
      if (i <= 0) {
        continue;
      }
      i -= 1;
      str1 = str1 + (String)am.d(this.a).get(i) + "\r\n";
      if ((i < 0) || (am.d(this.a).size() <= i)) {
        continue;
      }
      am.d(this.a).remove(i);
    }
    str1 = str1.trim();
    if (str1.length() > 0) {
      new ap(this.a, str1).execute(new String[] { str1 });
    }
    for (;;)
    {
      if (am.d(this.a).size() > 0) {
        am.h(this.a);
      }
      am.e(this.a);
      return;
      am.g(this.a).cancel();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */