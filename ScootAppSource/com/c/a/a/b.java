package com.c.a.a;

import android.content.Context;
import b.a.a.a.a.d.l;
import b.a.a.a.a.e.n;
import b.a.a.a.q;
import b.a.a.a.t;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

final class b
  implements l
{
  final ScheduledExecutorService a;
  aa b = new p();
  private final q c;
  private final Context d;
  private final i e;
  private final ah f;
  private final n g;
  
  public b(q paramq, Context paramContext, i parami, ah paramah, n paramn, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.c = paramq;
    this.d = paramContext;
    this.e = parami;
    this.f = paramah;
    this.g = paramn;
    this.a = paramScheduledExecutorService;
  }
  
  private void a(Runnable paramRunnable)
  {
    try
    {
      this.a.submit(paramRunnable).get();
      return;
    }
    catch (Exception paramRunnable)
    {
      b.a.a.a.f.h().e("Answers", "Failed to run events task", paramRunnable);
    }
  }
  
  private void b(Runnable paramRunnable)
  {
    try
    {
      this.a.submit(paramRunnable);
      return;
    }
    catch (Exception paramRunnable)
    {
      b.a.a.a.f.h().e("Answers", "Failed to submit events task", paramRunnable);
    }
  }
  
  public void a()
  {
    b(new d(this));
  }
  
  public void a(b.a.a.a.a.g.b paramb, String paramString)
  {
    b(new c(this, paramb, paramString));
  }
  
  public void a(ad paramad)
  {
    a(paramad, false, false);
  }
  
  void a(ad paramad, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramad = new h(this, paramad, paramBoolean2);
    if (paramBoolean1)
    {
      a(paramad);
      return;
    }
    b(paramad);
  }
  
  public void a(String paramString)
  {
    b(new e(this));
  }
  
  public void b()
  {
    b(new f(this));
  }
  
  public void b(ad paramad)
  {
    a(paramad, false, true);
  }
  
  public void c()
  {
    b(new g(this));
  }
  
  public void c(ad paramad)
  {
    a(paramad, true, false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */