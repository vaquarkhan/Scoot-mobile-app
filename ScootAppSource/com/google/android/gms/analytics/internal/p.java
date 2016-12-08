package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.internal.b;
import java.util.UUID;

public final class p
{
  private final String b;
  private final long c;
  
  private p(n paramn, String paramString, long paramLong)
  {
    b.a(paramString);
    if (paramLong > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool);
      this.b = paramString;
      this.c = paramLong;
      return;
    }
  }
  
  private void c()
  {
    long l = this.a.n().a();
    SharedPreferences.Editor localEditor = n.a(this.a).edit();
    localEditor.remove(g());
    localEditor.remove(b());
    localEditor.putLong(f(), l);
    localEditor.commit();
  }
  
  private long d()
  {
    long l = e();
    if (l == 0L) {
      return 0L;
    }
    return Math.abs(l - this.a.n().a());
  }
  
  private long e()
  {
    return n.a(this.a).getLong(f(), 0L);
  }
  
  private String f()
  {
    return String.valueOf(this.b).concat(":start");
  }
  
  private String g()
  {
    return String.valueOf(this.b).concat(":count");
  }
  
  public Pair<String, Long> a()
  {
    long l = d();
    if (l < this.c) {}
    String str;
    do
    {
      return null;
      if (l > this.c * 2L)
      {
        c();
        return null;
      }
      str = n.a(this.a).getString(b(), null);
      l = n.a(this.a).getLong(g(), 0L);
      c();
    } while ((str == null) || (l <= 0L));
    return new Pair(str, Long.valueOf(l));
  }
  
  public void a(String paramString)
  {
    if (e() == 0L) {
      c();
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    for (;;)
    {
      try
      {
        long l = n.a(this.a).getLong(g(), 0L);
        if (l <= 0L)
        {
          paramString = n.a(this.a).edit();
          paramString.putString(b(), str);
          paramString.putLong(g(), 1L);
          paramString.apply();
          return;
        }
        if ((UUID.randomUUID().getLeastSignificantBits() & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / (l + 1L))
        {
          i = 1;
          paramString = n.a(this.a).edit();
          if (i != 0) {
            paramString.putString(b(), str);
          }
          paramString.putLong(g(), l + 1L);
          paramString.apply();
          return;
        }
      }
      finally {}
      int i = 0;
    }
  }
  
  protected String b()
  {
    return String.valueOf(this.b).concat(":value");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */