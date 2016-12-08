package com.codetroopers.betterpickers;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings.System;

public final class a
{
  private final Context a;
  private final ContentObserver b;
  private Vibrator c;
  private boolean d;
  private boolean e;
  private long f;
  
  public a(Context paramContext)
  {
    this.a = paramContext;
    this.b = new b(this, null);
  }
  
  private static boolean b(Context paramContext)
  {
    return Settings.System.getInt(paramContext.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
  }
  
  private static boolean c(Context paramContext)
  {
    return paramContext.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0;
  }
  
  public void a()
  {
    this.c = ((Vibrator)this.a.getSystemService("vibrator"));
    this.d = b(this.a);
    this.e = c(this.a);
    Uri localUri = Settings.System.getUriFor("haptic_feedback_enabled");
    this.a.getContentResolver().registerContentObserver(localUri, false, this.b);
  }
  
  public void b()
  {
    this.c = null;
    this.a.getContentResolver().unregisterContentObserver(this.b);
  }
  
  public void c()
  {
    if ((this.c != null) && (this.d) && (this.e))
    {
      long l = SystemClock.uptimeMillis();
      if (l - this.f >= 125L)
      {
        this.c.vibrate(5L);
        this.f = l;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */