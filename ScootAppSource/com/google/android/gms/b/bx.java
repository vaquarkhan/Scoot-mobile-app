package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aj;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class bx
  implements cq
{
  private final cr a;
  private final Lock b;
  private final Context c;
  private final com.google.android.gms.common.j d;
  private ConnectionResult e;
  private int f;
  private int g = 0;
  private int h;
  private final Bundle i = new Bundle();
  private final Set<i> j = new HashSet();
  private fh k;
  private int l;
  private boolean m;
  private boolean n;
  private bb o;
  private boolean p;
  private boolean q;
  private final ai r;
  private final Map<a<?>, Integer> s;
  private final g<? extends fh, fi> t;
  private ArrayList<Future<?>> u = new ArrayList();
  
  public bx(cr paramcr, ai paramai, Map<a<?>, Integer> paramMap, com.google.android.gms.common.j paramj, g<? extends fh, fi> paramg, Lock paramLock, Context paramContext)
  {
    this.a = paramcr;
    this.r = paramai;
    this.s = paramMap;
    this.d = paramj;
    this.t = paramg;
    this.b = paramLock;
    this.c = paramContext;
  }
  
  private void a(SignInResponse paramSignInResponse)
  {
    if (!b(0)) {
      return;
    }
    Object localObject = paramSignInResponse.a();
    if (((ConnectionResult)localObject).b())
    {
      localObject = paramSignInResponse.b();
      paramSignInResponse = ((ResolveAccountResponse)localObject).b();
      if (!paramSignInResponse.b())
      {
        localObject = String.valueOf(paramSignInResponse);
        Log.wtf("GoogleApiClientConnecting", String.valueOf(localObject).length() + 48 + "Sign-in succeeded with resolve account failure: " + (String)localObject, new Exception());
        c(paramSignInResponse);
        return;
      }
      this.n = true;
      this.o = ((ResolveAccountResponse)localObject).a();
      this.p = ((ResolveAccountResponse)localObject).c();
      this.q = ((ResolveAccountResponse)localObject).d();
      e();
      return;
    }
    if (b((ConnectionResult)localObject))
    {
      h();
      e();
      return;
    }
    c((ConnectionResult)localObject);
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.k != null)
    {
      if ((this.k.h()) && (paramBoolean)) {
        this.k.f();
      }
      this.k.g();
      this.o = null;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, ConnectionResult paramConnectionResult)
  {
    if ((paramInt2 == 1) && (!a(paramConnectionResult))) {}
    while ((this.e != null) && (paramInt1 >= this.f)) {
      return false;
    }
    return true;
  }
  
  private boolean a(ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult.a()) {}
    while (this.d.b(paramConnectionResult.c()) != null) {
      return true;
    }
    return false;
  }
  
  private void b(ConnectionResult paramConnectionResult, a<?> parama, int paramInt)
  {
    if (paramInt != 2)
    {
      int i1 = parama.a().a();
      if (a(i1, paramInt, paramConnectionResult))
      {
        this.e = paramConnectionResult;
        this.f = i1;
      }
    }
    this.a.b.put(parama.d(), paramConnectionResult);
  }
  
  private boolean b(int paramInt)
  {
    if (this.g != paramInt)
    {
      Log.i("GoogleApiClientConnecting", this.a.g.p());
      String str1 = String.valueOf(c(this.g));
      String str2 = String.valueOf(c(paramInt));
      Log.wtf("GoogleApiClientConnecting", String.valueOf(str1).length() + 70 + String.valueOf(str2).length() + "GoogleApiClient connecting is in step " + str1 + " but received callback for step " + str2, new Exception());
      c(new ConnectionResult(8, null));
      return false;
    }
    return true;
  }
  
  private boolean b(ConnectionResult paramConnectionResult)
  {
    return (this.l == 2) || ((this.l == 1) && (!paramConnectionResult.a()));
  }
  
  private String c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 0: 
      return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }
    return "STEP_GETTING_REMOTE_SERVICE";
  }
  
  private void c(ConnectionResult paramConnectionResult)
  {
    i();
    if (!paramConnectionResult.a()) {}
    for (boolean bool = true;; bool = false)
    {
      a(bool);
      this.a.a(paramConnectionResult);
      this.a.h.a(paramConnectionResult);
      return;
    }
  }
  
  private boolean d()
  {
    this.h -= 1;
    if (this.h > 0) {
      return false;
    }
    if (this.h < 0)
    {
      Log.i("GoogleApiClientConnecting", this.a.g.p());
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
      c(new ConnectionResult(8, null));
      return false;
    }
    if (this.e != null)
    {
      this.a.f = this.f;
      c(this.e);
      return false;
    }
    return true;
  }
  
  private void e()
  {
    if (this.h != 0) {}
    while ((this.m) && (!this.n)) {
      return;
    }
    f();
  }
  
  private void f()
  {
    ArrayList localArrayList = new ArrayList();
    this.g = 1;
    this.h = this.a.a.size();
    Iterator localIterator = this.a.a.keySet().iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (this.a.b.containsKey(locali))
      {
        if (d()) {
          g();
        }
      }
      else {
        localArrayList.add((k)this.a.a.get(locali));
      }
    }
    if (!localArrayList.isEmpty()) {
      this.u.add(cu.a().submit(new cd(this, localArrayList)));
    }
  }
  
  private void g()
  {
    this.a.h();
    cu.a().execute(new by(this));
    if (this.k != null)
    {
      if (this.p) {
        this.k.a(this.o, this.q);
      }
      a(false);
    }
    Object localObject = this.a.b.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      i locali = (i)((Iterator)localObject).next();
      ((k)this.a.a.get(locali)).g();
    }
    if (this.i.isEmpty()) {}
    for (localObject = null;; localObject = this.i)
    {
      this.a.h.a((Bundle)localObject);
      return;
    }
  }
  
  private void h()
  {
    this.m = false;
    this.a.g.d = Collections.emptySet();
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      if (!this.a.b.containsKey(locali)) {
        this.a.b.put(locali, new ConnectionResult(17, null));
      }
    }
  }
  
  private void i()
  {
    Iterator localIterator = this.u.iterator();
    while (localIterator.hasNext()) {
      ((Future)localIterator.next()).cancel(true);
    }
    this.u.clear();
  }
  
  private Set<Scope> j()
  {
    if (this.r == null) {
      return Collections.emptySet();
    }
    HashSet localHashSet = new HashSet(this.r.d());
    Map localMap = this.r.f();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (!this.a.b.containsKey(locala.d())) {
        localHashSet.addAll(((aj)localMap.get(locala)).a);
      }
    }
    return localHashSet;
  }
  
  public <A extends h, R extends x, T extends be<R, A>> T a(T paramT)
  {
    this.a.g.a.add(paramT);
    return paramT;
  }
  
  public void a()
  {
    this.a.b.clear();
    this.m = false;
    this.e = null;
    this.g = 0;
    this.l = 2;
    this.n = false;
    this.p = false;
    HashMap localHashMap = new HashMap();
    Object localObject = this.s.keySet().iterator();
    int i1 = 0;
    if (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      k localk = (k)this.a.a.get(locala.d());
      int i3 = ((Integer)this.s.get(locala)).intValue();
      if (locala.a().a() == 1) {}
      for (int i2 = 1;; i2 = 0)
      {
        if (localk.j())
        {
          this.m = true;
          if (i3 < this.l) {
            this.l = i3;
          }
          if (i3 != 0) {
            this.j.add(locala.d());
          }
        }
        localHashMap.put(localk, new bz(this, locala, i3));
        i1 = i2 | i1;
        break;
      }
    }
    if (i1 != 0) {
      this.m = false;
    }
    if (this.m)
    {
      this.r.a(Integer.valueOf(this.a.g.q()));
      localObject = new cg(this, null);
      this.k = ((fh)this.t.a(this.c, this.a.g.c(), this.r, this.r.i(), (s)localObject, (t)localObject));
    }
    this.h = this.a.a.size();
    this.u.add(cu.a().submit(new ca(this, localHashMap)));
  }
  
  public void a(int paramInt)
  {
    c(new ConnectionResult(8, null));
  }
  
  public void a(Bundle paramBundle)
  {
    if (!b(1)) {}
    do
    {
      return;
      if (paramBundle != null) {
        this.i.putAll(paramBundle);
      }
    } while (!d());
    g();
  }
  
  public void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt)
  {
    if (!b(1)) {}
    do
    {
      return;
      b(paramConnectionResult, parama, paramInt);
    } while (!d());
    g();
  }
  
  public <A extends h, T extends be<? extends x, A>> T b(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public boolean b()
  {
    i();
    a(true);
    this.a.a(null);
    return true;
  }
  
  public void c() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */