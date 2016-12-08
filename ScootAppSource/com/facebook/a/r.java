package com.facebook.a;

import android.os.Bundle;
import com.facebook.av;
import com.facebook.b.ag;
import java.io.Serializable;
import java.util.Locale;

final class r
  implements Serializable
{
  private static final String a = a.class.getCanonicalName();
  private static final long[] b = { 300000L, 900000L, 1800000L, 3600000L, 21600000L, 43200000L, 86400000L, 172800000L, 259200000L, 604800000L, 1209600000L, 1814400000L, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L };
  private boolean c;
  private boolean d;
  private long e;
  private long f;
  private long g;
  private long h;
  private int i;
  private String j;
  
  r()
  {
    a();
  }
  
  private static int a(long paramLong)
  {
    int k = 0;
    while ((k < b.length) && (b[k] < paramLong)) {
      k += 1;
    }
    return k;
  }
  
  private void a()
  {
    this.d = false;
    this.f = -1L;
    this.g = -1L;
    this.i = 0;
    this.h = 0L;
  }
  
  private void a(a parama, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("fb_mobile_app_interruptions", this.i);
    localBundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] { Integer.valueOf(a(paramLong)) }));
    localBundle.putString("fb_mobile_launch_source", this.j);
    parama.a("fb_mobile_deactivate_app", this.h / 1000L, localBundle);
    a();
  }
  
  private boolean b()
  {
    return this.g != -1L;
  }
  
  private boolean c()
  {
    if (!this.c) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = true;
      return bool;
    }
  }
  
  void a(a parama, long paramLong, String paramString)
  {
    long l2 = 0L;
    if ((c()) || (paramLong - this.e > 300000L))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("fb_mobile_launch_source", paramString);
      parama.a("fb_mobile_activate_app", localBundle);
      this.e = paramLong;
    }
    if (this.d)
    {
      ag.a(av.e, a, "Resume for active app");
      return;
    }
    long l1;
    if (b())
    {
      l1 = paramLong - this.g;
      if (l1 >= 0L) {
        break label178;
      }
      ag.a(av.e, a, "Clock skew detected");
      l1 = l2;
    }
    label178:
    for (;;)
    {
      if (l1 > 60000L) {
        a(parama, l1);
      }
      for (;;)
      {
        if (this.i == 0) {
          this.j = paramString;
        }
        this.f = paramLong;
        this.d = true;
        return;
        l1 = 0L;
        break;
        if (l1 > 1000L) {
          this.i += 1;
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */