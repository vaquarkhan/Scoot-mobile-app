package com.twitter.sdk.android.core.internal;

import b.a.a.a.a;
import b.a.a.a.a.b.ai;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class f<T extends l>
{
  protected final i a;
  private final ai b;
  private final m<T> c;
  private final ExecutorService d;
  private final k e;
  
  f(m<T> paramm, ai paramai, ExecutorService paramExecutorService, i parami, k paramk)
  {
    this.b = paramai;
    this.c = paramm;
    this.d = paramExecutorService;
    this.a = parami;
    this.e = paramk;
  }
  
  public f(m<T> paramm, ExecutorService paramExecutorService, k paramk)
  {
    this(paramm, new ai(), paramExecutorService, new i(), paramk);
  }
  
  public void a()
  {
    l locall = this.c.b();
    long l = this.b.a();
    if ((locall != null) && (this.a.a(l))) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        this.d.submit(new h(this));
      }
      return;
    }
  }
  
  public void a(a parama)
  {
    parama.a(new g(this));
  }
  
  protected void b()
  {
    Iterator localIterator = this.c.d().values().iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      this.e.a(locall);
    }
    this.a.b(this.b.a());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */