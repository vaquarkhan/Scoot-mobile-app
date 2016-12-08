package com.google.android.gms.common.api;

import android.content.Context;
import com.google.android.gms.b.az;
import com.google.android.gms.b.cv;
import com.google.android.gms.b.do;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ae<O extends b>
{
  private final Context a;
  private final do b;
  private final a<O> c;
  private final O d;
  private final az<O> e;
  private final int f;
  private final cv g;
  private final AtomicBoolean h;
  private final AtomicInteger i;
  
  public void a()
  {
    boolean bool = true;
    if (this.h.getAndSet(true)) {
      return;
    }
    this.b.a();
    cv localcv = this.g;
    int j = this.f;
    if (this.i.get() > 0) {}
    for (;;)
    {
      localcv.a(j, bool);
      return;
      bool = false;
    }
  }
  
  public a<O> b()
  {
    return this.c;
  }
  
  public O c()
  {
    return this.d;
  }
  
  public az<O> d()
  {
    return this.e;
  }
  
  public Context e()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\api\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */