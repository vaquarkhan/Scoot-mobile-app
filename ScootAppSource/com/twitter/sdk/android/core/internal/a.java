package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.c;
import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.u;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class a
{
  private final j a;
  final Queue<f<l>> b;
  final AtomicBoolean c;
  
  public a(j paramj)
  {
    this.a = paramj;
    this.b = new ConcurrentLinkedQueue();
    this.c = new AtomicBoolean(true);
  }
  
  void a()
  {
    this.a.a(new b(this));
  }
  
  public void a(l paraml)
  {
    if (paraml != null) {}
    for (;;)
    {
      try
      {
        b(paraml);
        return;
      }
      finally {}
      if (this.b.size() > 0) {
        a();
      } else {
        this.c.set(false);
      }
    }
  }
  
  void a(u paramu)
  {
    try
    {
      this.c.set(false);
      while (!this.b.isEmpty()) {
        ((f)this.b.poll()).a(paramu);
      }
    }
    finally {}
  }
  
  l b()
  {
    l locall = this.a.a();
    if ((locall != null) && (locall.d() != null) && (!locall.d().a())) {
      return locall;
    }
    return null;
  }
  
  void b(l paraml)
  {
    try
    {
      this.c.set(false);
      while (!this.b.isEmpty()) {
        ((f)this.b.poll()).a(new k(paraml, null));
      }
    }
    finally {}
  }
  
  public boolean b(f<l> paramf)
  {
    boolean bool = true;
    if (paramf == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      try
      {
        if (this.c.get()) {
          break label80;
        }
        l locall = b();
        if (locall != null)
        {
          paramf.a(new k(locall, null));
          continue;
        }
      }
      finally {}
      this.b.add(paramf);
      this.c.set(true);
      a();
      continue;
      label80:
      this.b.add(paramf);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */