package com.appsee;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.VmPolicy.Builder;

class rb
{
  @TargetApi(11)
  public static void C()
  {
    if (Build.VERSION.SDK_INT >= 9)
    {
      StrictMode.ThreadPolicy.Builder localBuilder = new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog();
      StrictMode.VmPolicy.Builder localBuilder1 = new StrictMode.VmPolicy.Builder().detectAll().penaltyLog();
      if (Build.VERSION.SDK_INT >= 11) {
        localBuilder.penaltyFlashScreen();
      }
      StrictMode.setThreadPolicy(localBuilder.build());
      StrictMode.setVmPolicy(localBuilder1.build());
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\rb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */