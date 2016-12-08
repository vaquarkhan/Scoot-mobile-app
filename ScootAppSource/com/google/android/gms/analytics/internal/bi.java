package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.p;

final class bi
  implements p
{
  private int a = 2;
  private boolean b;
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
    if (!this.b)
    {
      String str1 = (String)bp.c.a();
      String str2 = (String)bp.c.a();
      Log.i(str1, String.valueOf(str2).length() + 91 + "Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + str2 + " DEBUG");
      this.b = true;
    }
  }
  
  public void a(String paramString) {}
  
  public void b(String paramString) {}
  
  public void c(String paramString) {}
  
  public void d(String paramString) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */