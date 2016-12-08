package com.google.android.gms.common.a;

import android.os.SystemClock;

public final class e
  implements c
{
  private static e a;
  
  public static c c()
  {
    try
    {
      if (a == null) {
        a = new e();
      }
      e locale = a;
      return locale;
    }
    finally {}
  }
  
  public long a()
  {
    return System.currentTimeMillis();
  }
  
  public long b()
  {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */