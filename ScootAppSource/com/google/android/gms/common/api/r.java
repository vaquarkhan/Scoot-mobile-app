package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.aa;
import android.view.View;
import com.google.android.gms.b.ba;
import com.google.android.gms.b.bo;
import com.google.android.gms.b.cj;
import com.google.android.gms.b.dh;
import com.google.android.gms.b.fd;
import com.google.android.gms.b.fh;
import com.google.android.gms.b.fi;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class r
{
  private Account a;
  private final Set<Scope> b = new HashSet();
  private final Set<Scope> c = new HashSet();
  private int d;
  private View e;
  private String f;
  private String g;
  private final Map<a<?>, aj> h = new android.support.v4.g.a();
  private final Context i;
  private final Map<a<?>, b> j = new android.support.v4.g.a();
  private dh k;
  private int l = -1;
  private t m;
  private Looper n;
  private com.google.android.gms.common.b o = com.google.android.gms.common.b.a();
  private g<? extends fh, fi> p = fd.c;
  private final ArrayList<s> q = new ArrayList();
  private final ArrayList<t> r = new ArrayList();
  
  public r(Context paramContext)
  {
    this.i = paramContext;
    this.n = paramContext.getMainLooper();
    this.f = paramContext.getPackageName();
    this.g = paramContext.getClass().getName();
  }
  
  private static <C extends k, O> C a(g<C, O> paramg, Object paramObject, Context paramContext, Looper paramLooper, ai paramai, s params, t paramt)
  {
    return paramg.a(paramContext, paramLooper, paramai, paramObject, params, paramt);
  }
  
  private r a(dh paramdh, int paramInt, t paramt)
  {
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.b.b(bool, "clientId must be non-negative");
      this.l = paramInt;
      this.m = paramt;
      this.k = paramdh;
      return this;
    }
  }
  
  private static <C extends m, O> com.google.android.gms.common.internal.e a(n<C, O> paramn, Object paramObject, Context paramContext, Looper paramLooper, ai paramai, s params, t paramt)
  {
    return new com.google.android.gms.common.internal.e(paramContext, paramLooper, paramn.b(), params, paramt, paramai, paramn.b(paramObject));
  }
  
  private void a(q paramq)
  {
    ba.a(this.k).a(this.l, paramq, this.m);
  }
  
  private q c()
  {
    ai localai = a();
    Object localObject2 = null;
    Map localMap = localai.f();
    android.support.v4.g.a locala1 = new android.support.v4.g.a();
    android.support.v4.g.a locala2 = new android.support.v4.g.a();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.j.keySet().iterator();
    Object localObject1 = null;
    a locala;
    Object localObject3;
    int i1;
    label130:
    bo localbo;
    Object localObject4;
    if (localIterator.hasNext())
    {
      locala = (a)localIterator.next();
      localObject3 = this.j.get(locala);
      i1 = 0;
      if (localMap.get(locala) != null)
      {
        if (((aj)localMap.get(locala)).b) {
          i1 = 1;
        }
      }
      else
      {
        locala1.put(locala, Integer.valueOf(i1));
        localbo = new bo(locala, i1);
        localArrayList.add(localbo);
        if (!locala.e()) {
          break label323;
        }
        localObject4 = locala.c();
        if (((n)localObject4).a() != 1) {
          break label588;
        }
        localObject1 = locala;
      }
    }
    label214:
    label323:
    label372:
    label580:
    label585:
    label588:
    for (;;)
    {
      localObject3 = a((n)localObject4, localObject3, this.i, this.n, localai, localbo, localbo);
      locala2.put(locala.d(), localObject3);
      if (((k)localObject3).d())
      {
        localObject3 = locala;
        if (localObject2 == null) {
          break label372;
        }
        localObject1 = String.valueOf(locala.f());
        localObject2 = String.valueOf(((a)localObject2).f());
        throw new IllegalStateException(String.valueOf(localObject1).length() + 21 + String.valueOf(localObject2).length() + (String)localObject1 + " cannot be used with " + (String)localObject2);
        i1 = 2;
        break label130;
        localObject4 = locala.b();
        if (((g)localObject4).a() != 1) {
          break label585;
        }
        localObject1 = locala;
      }
      for (;;)
      {
        localObject3 = a((g)localObject4, localObject3, this.i, this.n, localai, localbo, localbo);
        break label214;
        localObject3 = localObject2;
        localObject2 = localObject3;
        break;
        if (localObject2 != null)
        {
          if (localObject1 != null)
          {
            localObject2 = String.valueOf(((a)localObject2).f());
            localObject1 = String.valueOf(((a)localObject1).f());
            throw new IllegalStateException(String.valueOf(localObject2).length() + 21 + String.valueOf(localObject1).length() + (String)localObject2 + " cannot be used with " + (String)localObject1);
          }
          if (this.a != null) {
            break label580;
          }
        }
        for (boolean bool = true;; bool = false)
        {
          com.google.android.gms.common.internal.b.a(bool, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] { ((a)localObject2).f() });
          com.google.android.gms.common.internal.b.a(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] { ((a)localObject2).f() });
          i1 = cj.a(locala2.values(), true);
          return new cj(this.i, new ReentrantLock(), this.n, localai, this.o, this.p, locala1, this.q, this.r, locala2, this.l, i1, localArrayList);
        }
      }
    }
  }
  
  public r a(Handler paramHandler)
  {
    com.google.android.gms.common.internal.b.a(paramHandler, "Handler must not be null");
    this.n = paramHandler.getLooper();
    return this;
  }
  
  public r a(aa paramaa, int paramInt, t paramt)
  {
    return a(new dh(paramaa), paramInt, paramt);
  }
  
  public r a(aa paramaa, t paramt)
  {
    return a(paramaa, 0, paramt);
  }
  
  public r a(a<? extends e> parama)
  {
    com.google.android.gms.common.internal.b.a(parama, "Api must not be null");
    this.j.put(parama, null);
    parama = parama.a().a(null);
    this.c.addAll(parama);
    this.b.addAll(parama);
    return this;
  }
  
  public <O extends c> r a(a<O> parama, O paramO)
  {
    com.google.android.gms.common.internal.b.a(parama, "Api must not be null");
    com.google.android.gms.common.internal.b.a(paramO, "Null options are not permitted for this Api");
    this.j.put(parama, paramO);
    parama = parama.a().a(paramO);
    this.c.addAll(parama);
    this.b.addAll(parama);
    return this;
  }
  
  public r a(s params)
  {
    com.google.android.gms.common.internal.b.a(params, "Listener must not be null");
    this.q.add(params);
    return this;
  }
  
  public r a(t paramt)
  {
    com.google.android.gms.common.internal.b.a(paramt, "Listener must not be null");
    this.r.add(paramt);
    return this;
  }
  
  public ai a()
  {
    fi localfi = fi.a;
    if (this.j.containsKey(fd.g)) {
      localfi = (fi)this.j.get(fd.g);
    }
    return new ai(this.a, this.b, this.h, this.d, this.e, this.f, this.g, localfi);
  }
  
  public q b()
  {
    boolean bool;
    if (!this.j.isEmpty()) {
      bool = true;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.b.b(bool, "must call addApi() to add at least one API");
      q localq = c();
      synchronized (q.j())
      {
        q.j().add(localq);
        if (this.l >= 0) {
          a(localq);
        }
        return localq;
        bool = false;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\api\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */