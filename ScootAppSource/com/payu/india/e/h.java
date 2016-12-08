package com.payu.india.e;

import android.app.Activity;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimerTask;

final class h
  extends TimerTask
{
  h(f paramf) {}
  
  public void run()
  {
    while (f.a(this.a)) {}
    f.a(5000L);
    this.a.a();
    String str1 = "";
    String str3 = str1;
    String str2 = str1;
    label591:
    label594:
    label597:
    for (;;)
    {
      try
      {
        if (!new File(f.c(this.a).getFilesDir(), f.b(this.a)).exists())
        {
          str3 = str1;
          str2 = str1;
          f.c(this.a).openFileOutput(f.b(this.a), 0);
        }
        str3 = str1;
        str2 = str1;
        FileInputStream localFileInputStream = f.c(this.a).openFileInput(f.b(this.a));
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
        i = f.d(this.a).size();
        if (i > 0)
        {
          i -= 1;
          str1 = str1 + (String)f.d(this.a).get(i) + "\r\n";
          if ((i < 0) || (f.d(this.a).size() <= i)) {
            break label597;
          }
          f.d(this.a).remove(i);
          continue;
        }
        str1 = str1.trim();
        if (str1.length() > 0) {
          new i(this.a, str1).execute(new String[] { str1 });
        }
      }
      catch (IOException localIOException)
      {
        str2 = str3;
        localIOException.printStackTrace();
        i = f.d(this.a).size();
        localObject1 = str3;
        if (i <= 0) {
          continue;
        }
        i -= 1;
        localObject1 = (String)localObject1 + (String)f.d(this.a).get(i) + "\r\n";
        if ((i < 0) || (f.d(this.a).size() <= i)) {
          break label594;
        }
        f.d(this.a).remove(i);
        continue;
        localObject1 = ((String)localObject1).trim();
        if (((String)localObject1).length() <= 0) {
          continue;
        }
        new i(this.a, (String)localObject1).execute(new String[] { localObject1 });
        continue;
      }
      finally
      {
        int i = f.d(this.a).size();
        Object localObject1 = str2;
        if (i <= 0) {
          continue;
        }
        i -= 1;
        localObject1 = (String)localObject1 + (String)f.d(this.a).get(i) + "\r\n";
        if ((i < 0) || (f.d(this.a).size() <= i)) {
          break label591;
        }
        f.d(this.a).remove(i);
        continue;
        localObject1 = ((String)localObject1).trim();
        if (((String)localObject1).length() <= 0) {
          continue;
        }
        new i(this.a, (String)localObject1).execute(new String[] { localObject1 });
      }
      if (f.d(this.a).size() > 0) {
        f.e(this.a);
      }
      this.a.b();
      return;
      continue;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\e\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */