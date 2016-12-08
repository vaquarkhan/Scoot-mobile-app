package com.b.a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class u
{
  private AtomicInteger a = new AtomicInteger();
  private final Map<String, Queue<r<?>>> b = new HashMap();
  private final Set<r<?>> c = new HashSet();
  private final PriorityBlockingQueue<r<?>> d = new PriorityBlockingQueue();
  private final PriorityBlockingQueue<r<?>> e = new PriorityBlockingQueue();
  private final b f;
  private final k g;
  private final z h;
  private l[] i;
  private d j;
  private List<v> k = new ArrayList();
  
  public u(b paramb, k paramk)
  {
    this(paramb, paramk, 4);
  }
  
  public u(b paramb, k paramk, int paramInt)
  {
    this(paramb, paramk, paramInt, new g(new Handler(Looper.getMainLooper())));
  }
  
  public u(b paramb, k paramk, int paramInt, z paramz)
  {
    this.f = paramb;
    this.g = paramk;
    this.i = new l[paramInt];
    this.h = paramz;
  }
  
  public <T> r<T> a(r<T> paramr)
  {
    paramr.a(this);
    synchronized (this.c)
    {
      this.c.add(paramr);
      paramr.a(c());
      paramr.a("add-to-queue");
      if (!paramr.r())
      {
        this.e.add(paramr);
        return paramr;
      }
    }
    for (;;)
    {
      String str;
      synchronized (this.b)
      {
        str = paramr.f();
        if (this.b.containsKey(str))
        {
          Queue localQueue = (Queue)this.b.get(str);
          ??? = localQueue;
          if (localQueue == null) {
            ??? = new LinkedList();
          }
          ((Queue)???).add(paramr);
          this.b.put(str, ???);
          if (ae.b) {
            ae.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] { str });
          }
          return paramr;
        }
      }
      this.b.put(str, null);
      this.d.add(paramr);
    }
  }
  
  public void a()
  {
    b();
    this.j = new d(this.d, this.e, this.f, this.h);
    this.j.start();
    int m = 0;
    while (m < this.i.length)
    {
      l locall = new l(this.e, this.g, this.f, this.h);
      this.i[m] = locall;
      locall.start();
      m += 1;
    }
  }
  
  public void b()
  {
    if (this.j != null) {
      this.j.a();
    }
    int m = 0;
    while (m < this.i.length)
    {
      if (this.i[m] != null) {
        this.i[m].a();
      }
      m += 1;
    }
  }
  
  <T> void b(r<T> paramr)
  {
    Object localObject2;
    synchronized (this.c)
    {
      this.c.remove(paramr);
      synchronized (this.k)
      {
        localObject2 = this.k.iterator();
        if (((Iterator)localObject2).hasNext()) {
          ((v)((Iterator)localObject2).next()).a(paramr);
        }
      }
    }
    if (paramr.r()) {
      synchronized (this.b)
      {
        paramr = paramr.f();
        localObject2 = (Queue)this.b.remove(paramr);
        if (localObject2 != null)
        {
          if (ae.b) {
            ae.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] { Integer.valueOf(((Queue)localObject2).size()), paramr });
          }
          this.d.addAll((Collection)localObject2);
        }
        return;
      }
    }
  }
  
  public int c()
  {
    return this.a.incrementAndGet();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */