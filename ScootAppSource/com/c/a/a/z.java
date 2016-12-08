package com.c.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import b.a.a.a.a;
import b.a.a.a.a.b.u;
import b.a.a.a.a.b.y;
import b.a.a.a.f;
import b.a.a.a.q;
import b.a.a.a.t;
import java.util.concurrent.ScheduledExecutorService;

final class z
  implements o
{
  final b a;
  final a b;
  final m c;
  final k d;
  private final long e;
  
  z(b paramb, a parama, m paramm, k paramk, long paramLong)
  {
    this.a = paramb;
    this.b = parama;
    this.c = paramm;
    this.d = paramk;
    this.e = paramLong;
  }
  
  public static z a(q paramq, Context paramContext, y paramy, String paramString1, String paramString2, long paramLong)
  {
    paramy = new ah(paramContext, paramy, paramString1, paramString2);
    paramString1 = new i(paramContext, new b.a.a.a.a.f.b(paramq));
    paramString2 = new b.a.a.a.a.e.b(f.h());
    a locala = new a(paramContext);
    ScheduledExecutorService localScheduledExecutorService = u.b("Answers Events Handler");
    m localm = new m(localScheduledExecutorService);
    return new z(new b(paramq, paramContext, paramString1, paramy, paramString2, localScheduledExecutorService), locala, localm, k.a(paramContext), paramLong);
  }
  
  public void a()
  {
    f.h().a("Answers", "Flush events when app is backgrounded");
    this.a.c();
  }
  
  public void a(Activity paramActivity, ae paramae)
  {
    f.h().a("Answers", "Logged lifecycle event: " + paramae.name());
    this.a.a(ab.a(paramae, paramActivity));
  }
  
  public void a(b.a.a.a.a.g.b paramb, String paramString)
  {
    this.c.a(paramb.h);
    this.a.a(paramb, paramString);
  }
  
  public void a(String paramString1, String paramString2)
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      throw new IllegalStateException("onCrash called from main thread!!!");
    }
    f.h().a("Answers", "Logged crash");
    this.a.c(ab.a(paramString1, paramString2));
  }
  
  boolean a(long paramLong)
  {
    return (!this.d.b()) && (b(paramLong));
  }
  
  public void b()
  {
    this.a.b();
    this.b.a(new j(this, this.c));
    this.c.a(this);
    if (a(this.e))
    {
      d();
      this.d.a();
    }
  }
  
  boolean b(long paramLong)
  {
    return System.currentTimeMillis() - paramLong < 3600000L;
  }
  
  public void c()
  {
    this.b.a();
    this.a.a();
  }
  
  public void d()
  {
    f.h().a("Answers", "Logged install");
    this.a.b(ab.a());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */