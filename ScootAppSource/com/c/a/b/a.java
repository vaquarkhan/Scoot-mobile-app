package com.c.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import b.a.a.a.a.b.k;
import b.a.a.a.a.b.r;
import b.a.a.a.a.b.y;
import b.a.a.a.a.b.z;
import b.a.a.a.a.e.n;
import b.a.a.a.a.f.c;
import b.a.a.a.t;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class a
  implements l
{
  private final AtomicBoolean a = new AtomicBoolean();
  private final AtomicBoolean b;
  private Context c;
  private e d;
  private y e;
  private b.a.a.a.a.g.f f;
  private f g;
  private c h;
  private r i;
  private n j;
  private long k = 0L;
  
  public a()
  {
    this(false);
  }
  
  public a(boolean paramBoolean)
  {
    this.b = new AtomicBoolean(paramBoolean);
  }
  
  private void e()
  {
    b.a.a.a.f.h().a("Beta", "Performing update check");
    String str1 = new k().a(this.c);
    String str2 = (String)this.e.i().get(z.c);
    new g(this.d, this.d.g(), this.f.a, this.j, new i()).a(str1, str2, this.g);
  }
  
  void a(long paramLong)
  {
    this.k = paramLong;
  }
  
  public void a(Context paramContext, e parame, y paramy, b.a.a.a.a.g.f paramf, f paramf1, c paramc, r paramr, n paramn)
  {
    this.c = paramContext;
    this.d = parame;
    this.e = paramy;
    this.f = paramf;
    this.g = paramf1;
    this.h = paramc;
    this.i = paramr;
    this.j = paramn;
    if (b()) {
      c();
    }
  }
  
  protected boolean a()
  {
    this.b.set(true);
    return this.a.get();
  }
  
  boolean b()
  {
    this.a.set(true);
    return this.b.get();
  }
  
  @SuppressLint({"CommitPrefEdits"})
  protected void c()
  {
    long l1;
    synchronized (this.h)
    {
      if (this.h.a().contains("last_update_check")) {
        this.h.a(this.h.b().remove("last_update_check"));
      }
      l1 = this.i.a();
      long l2 = this.f.b * 1000L;
      b.a.a.a.f.h().a("Beta", "Check for updates delay: " + l2);
      b.a.a.a.f.h().a("Beta", "Check for updates last check time: " + d());
      l2 += d();
      b.a.a.a.f.h().a("Beta", "Check for updates current time: " + l1 + ", next check time: " + l2);
      if (l1 < l2) {}
    }
    b.a.a.a.f.h().a("Beta", "Check for updates next check time was not passed");
  }
  
  long d()
  {
    return this.k;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */