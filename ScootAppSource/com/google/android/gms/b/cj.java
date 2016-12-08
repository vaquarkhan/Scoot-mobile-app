package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.au;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class cj
  extends q
  implements dg
{
  final Queue<be<?, ?>> a = new LinkedList();
  da b;
  final Map<i<?>, k> c;
  Set<Scope> d = new HashSet();
  final ai e;
  final Map<a<?>, Integer> f;
  final g<? extends fh, fi> g;
  Set<dv> h = null;
  final dy i;
  private final Lock j;
  private final at k;
  private df l = null;
  private final int m;
  private final Context n;
  private final Looper o;
  private volatile boolean p;
  private long q = 120000L;
  private long r = 5000L;
  private final co s;
  private final com.google.android.gms.common.b t;
  private final do u = new do();
  private final ArrayList<bo> v;
  private Integer w = null;
  private final au x = new ck(this);
  
  public cj(Context paramContext, Lock paramLock, Looper paramLooper, ai paramai, com.google.android.gms.common.b paramb, g<? extends fh, fi> paramg, Map<a<?>, Integer> paramMap, List<s> paramList, List<t> paramList1, Map<i<?>, k> paramMap1, int paramInt1, int paramInt2, ArrayList<bo> paramArrayList)
  {
    this.n = paramContext;
    this.j = paramLock;
    this.k = new at(paramLooper, this.x);
    this.o = paramLooper;
    this.s = new co(this, paramLooper);
    this.t = paramb;
    this.m = paramInt1;
    if (this.m >= 0) {
      this.w = Integer.valueOf(paramInt2);
    }
    this.f = paramMap;
    this.c = paramMap1;
    this.v = paramArrayList;
    this.i = new dy(this.c);
    paramContext = paramList.iterator();
    while (paramContext.hasNext())
    {
      paramLock = (s)paramContext.next();
      this.k.a(paramLock);
    }
    paramContext = paramList1.iterator();
    while (paramContext.hasNext())
    {
      paramLock = (t)paramContext.next();
      this.k.a(paramLock);
    }
    this.e = paramai;
    this.g = paramg;
  }
  
  public static int a(Iterable<k> paramIterable, boolean paramBoolean)
  {
    int i3 = 1;
    paramIterable = paramIterable.iterator();
    int i1 = 0;
    int i2 = 0;
    if (paramIterable.hasNext())
    {
      k localk = (k)paramIterable.next();
      if (localk.j()) {
        i2 = 1;
      }
      if (!localk.d()) {
        break label85;
      }
      i1 = 1;
    }
    label85:
    for (;;)
    {
      break;
      if (i2 != 0)
      {
        i2 = i3;
        if (i1 != 0)
        {
          i2 = i3;
          if (paramBoolean) {
            i2 = 2;
          }
        }
        return i2;
      }
      return 3;
    }
  }
  
  private void a(q paramq, ds paramds, boolean paramBoolean)
  {
    ek.c.a(paramq).a(new cn(this, paramds, paramBoolean, paramq));
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 3: 
      return "SIGN_IN_MODE_NONE";
    case 1: 
      return "SIGN_IN_MODE_REQUIRED";
    }
    return "SIGN_IN_MODE_OPTIONAL";
  }
  
  private void c(int paramInt)
  {
    if (this.w == null) {
      this.w = Integer.valueOf(paramInt);
    }
    Object localObject2;
    while (this.l != null)
    {
      return;
      if (this.w.intValue() != paramInt)
      {
        localObject1 = String.valueOf(b(paramInt));
        localObject2 = String.valueOf(b(this.w.intValue()));
        throw new IllegalStateException(String.valueOf(localObject1).length() + 51 + String.valueOf(localObject2).length() + "Cannot use sign-in mode: " + (String)localObject1 + ". Mode was already set to " + (String)localObject2);
      }
    }
    Object localObject1 = this.c.values().iterator();
    paramInt = 0;
    int i1 = 0;
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (k)((Iterator)localObject1).next();
      if (((k)localObject2).j()) {
        i1 = 1;
      }
      if (!((k)localObject2).d()) {
        break label341;
      }
      paramInt = 1;
    }
    label341:
    for (;;)
    {
      break;
      switch (this.w.intValue())
      {
      }
      do
      {
        do
        {
          this.l = new cr(this.n, this, this.j, this.o, this.t, this.c, this.e, this.f, this.g, this.v, this);
          return;
          if (i1 == 0) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
          }
        } while (paramInt == 0);
        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
      } while (i1 == 0);
      this.l = bp.a(this.n, this, this.j, this.o, this.t, this.c, this.e, this.f, this.g, this.v);
      return;
    }
  }
  
  private void r()
  {
    this.k.b();
    this.l.a();
  }
  
  private void s()
  {
    this.j.lock();
    try
    {
      if (l()) {
        r();
      }
      return;
    }
    finally
    {
      this.j.unlock();
    }
  }
  
  private void t()
  {
    this.j.lock();
    try
    {
      if (n()) {
        r();
      }
      return;
    }
    finally
    {
      this.j.unlock();
    }
  }
  
  public <A extends h, R extends x, T extends be<R, A>> T a(T paramT)
  {
    boolean bool;
    if (paramT.b() != null) {
      bool = true;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.b.b(bool, "This task can not be enqueued (it's probably a Batch or malformed)");
      bool = this.c.containsKey(paramT.b());
      String str;
      if (paramT.c() != null)
      {
        str = paramT.c().f();
        label45:
        com.google.android.gms.common.internal.b.b(bool, String.valueOf(str).length() + 65 + "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.j.lock();
      }
      try
      {
        if (this.l == null)
        {
          this.a.add(paramT);
          return paramT;
          bool = false;
          continue;
          str = "the API";
          break label45;
        }
        paramT = this.l.a(paramT);
        return paramT;
      }
      finally
      {
        this.j.unlock();
      }
    }
  }
  
  public <C extends k> C a(i<C> parami)
  {
    parami = (k)this.c.get(parami);
    com.google.android.gms.common.internal.b.a(parami, "Appropriate Api was not requested.");
    return parami;
  }
  
  /* Error */
  public void a(int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 103	com/google/android/gms/b/cj:j	Ljava/util/concurrent/locks/Lock;
    //   6: invokeinterface 294 1 0
    //   11: iload_3
    //   12: istore_2
    //   13: iload_1
    //   14: iconst_3
    //   15: if_icmpeq +17 -> 32
    //   18: iload_3
    //   19: istore_2
    //   20: iload_1
    //   21: iconst_1
    //   22: if_icmpeq +10 -> 32
    //   25: iload_1
    //   26: iconst_2
    //   27: if_icmpne +50 -> 77
    //   30: iload_3
    //   31: istore_2
    //   32: iload_2
    //   33: new 240	java/lang/StringBuilder
    //   36: dup
    //   37: bipush 33
    //   39: invokespecial 245	java/lang/StringBuilder:<init>	(I)V
    //   42: ldc_w 354
    //   45: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: iload_1
    //   49: invokevirtual 357	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   52: invokevirtual 257	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokestatic 316	com/google/android/gms/common/internal/b:b	(ZLjava/lang/Object;)V
    //   58: aload_0
    //   59: iload_1
    //   60: invokespecial 359	com/google/android/gms/b/cj:c	(I)V
    //   63: aload_0
    //   64: invokespecial 298	com/google/android/gms/b/cj:r	()V
    //   67: aload_0
    //   68: getfield 103	com/google/android/gms/b/cj:j	Ljava/util/concurrent/locks/Lock;
    //   71: invokeinterface 301 1 0
    //   76: return
    //   77: iconst_0
    //   78: istore_2
    //   79: goto -47 -> 32
    //   82: astore 4
    //   84: aload_0
    //   85: getfield 103	com/google/android/gms/b/cj:j	Ljava/util/concurrent/locks/Lock;
    //   88: invokeinterface 301 1 0
    //   93: aload 4
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	cj
    //   0	96	1	paramInt	int
    //   12	67	2	bool1	boolean
    //   1	30	3	bool2	boolean
    //   82	12	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   32	67	82	finally
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 1) && (!paramBoolean)) {
      m();
    }
    this.i.b();
    this.k.a(paramInt);
    this.k.a();
    if (paramInt == 2) {
      r();
    }
  }
  
  public void a(Bundle paramBundle)
  {
    while (!this.a.isEmpty()) {
      b((be)this.a.remove());
    }
    this.k.a(paramBundle);
  }
  
  public void a(dv paramdv)
  {
    this.j.lock();
    try
    {
      if (this.h == null) {
        this.h = new HashSet();
      }
      this.h.add(paramdv);
      return;
    }
    finally
    {
      this.j.unlock();
    }
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    if (!this.t.a(this.n, paramConnectionResult.c())) {
      n();
    }
    if (!l())
    {
      this.k.a(paramConnectionResult);
      this.k.a();
    }
  }
  
  public void a(t paramt)
  {
    this.k.a(paramt);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("mContext=").println(this.n);
    paramPrintWriter.append(paramString).append("mResuming=").print(this.p);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.a.size());
    this.i.a(paramPrintWriter);
    if (this.l != null) {
      this.l.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public boolean a(dr paramdr)
  {
    return (this.l != null) && (this.l.a(paramdr));
  }
  
  public Context b()
  {
    return this.n;
  }
  
  public <A extends h, T extends be<? extends x, A>> T b(T paramT)
  {
    boolean bool;
    if (paramT.b() != null)
    {
      bool = true;
      com.google.android.gms.common.internal.b.b(bool, "This task can not be executed (it's probably a Batch or malformed)");
      bool = this.c.containsKey(paramT.b());
      if (paramT.c() == null) {
        break label129;
      }
    }
    label129:
    for (Object localObject = paramT.c().f();; localObject = "the API")
    {
      com.google.android.gms.common.internal.b.b(bool, String.valueOf(localObject).length() + 65 + "GoogleApiClient is not configured to use " + (String)localObject + " required for this call.");
      this.j.lock();
      try
      {
        if (this.l != null) {
          break label136;
        }
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
      }
      finally
      {
        this.j.unlock();
      }
      bool = false;
      break;
    }
    label136:
    if (l())
    {
      this.a.add(paramT);
      while (!this.a.isEmpty())
      {
        localObject = (be)this.a.remove();
        this.i.a((be)localObject);
        ((be)localObject).c(Status.c);
      }
      this.j.unlock();
      return paramT;
    }
    paramT = this.l.b(paramT);
    this.j.unlock();
    return paramT;
  }
  
  <C extends k> C b(i<?> parami)
  {
    parami = (k)this.c.get(parami);
    com.google.android.gms.common.internal.b.a(parami, "Appropriate Api was not requested.");
    return parami;
  }
  
  public void b(dv paramdv)
  {
    this.j.lock();
    for (;;)
    {
      try
      {
        if (this.h == null)
        {
          Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
          return;
        }
        if (!this.h.remove(paramdv))
        {
          Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
          continue;
        }
        if (o()) {
          continue;
        }
      }
      finally
      {
        this.j.unlock();
      }
      this.l.f();
    }
  }
  
  public void b(t paramt)
  {
    this.k.b(paramt);
  }
  
  public Looper c()
  {
    return this.o;
  }
  
  public void d()
  {
    if (this.l != null) {
      this.l.g();
    }
  }
  
  public void e()
  {
    boolean bool = false;
    this.j.lock();
    try
    {
      if (this.m >= 0)
      {
        if (this.w != null) {
          bool = true;
        }
        com.google.android.gms.common.internal.b.a(bool, "Sign-in mode should have been set explicitly by auto-manage.");
      }
      do
      {
        for (;;)
        {
          a(this.w.intValue());
          return;
          if (this.w != null) {
            break;
          }
          this.w = Integer.valueOf(a(this.c.values(), false));
        }
      } while (this.w.intValue() != 2);
    }
    finally
    {
      this.j.unlock();
    }
    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
  }
  
  public ConnectionResult f()
  {
    boolean bool2 = true;
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool1 = true;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.b.a(bool1, "blockingConnect must not be called on the UI thread");
      this.j.lock();
      try
      {
        if (this.m >= 0) {
          if (this.w != null)
          {
            bool1 = bool2;
            label45:
            com.google.android.gms.common.internal.b.a(bool1, "Sign-in mode should have been set explicitly by auto-manage.");
          }
        }
        do
        {
          for (;;)
          {
            c(this.w.intValue());
            this.k.b();
            ConnectionResult localConnectionResult = this.l.b();
            return localConnectionResult;
            bool1 = false;
            break;
            bool1 = false;
            break label45;
            if (this.w != null) {
              break label143;
            }
            this.w = Integer.valueOf(a(this.c.values(), false));
          }
        } while (this.w.intValue() != 2);
      }
      finally
      {
        this.j.unlock();
      }
    }
    label143:
    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
  }
  
  public void g()
  {
    this.j.lock();
    try
    {
      this.i.a();
      if (this.l != null) {
        this.l.c();
      }
      this.u.a();
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        be localbe = (be)localIterator.next();
        localbe.a(null);
        localbe.g();
      }
      this.a.clear();
    }
    finally
    {
      this.j.unlock();
    }
    df localdf = this.l;
    if (localdf == null)
    {
      this.j.unlock();
      return;
    }
    n();
    this.k.a();
    this.j.unlock();
  }
  
  public u<Status> h()
  {
    com.google.android.gms.common.internal.b.a(i(), "GoogleApiClient is not connected yet.");
    if (this.w.intValue() != 2) {}
    ds localds;
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.b.a(bool, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
      localds = new ds(this);
      if (!this.c.containsKey(ek.a)) {
        break;
      }
      a(this, localds, false);
      return localds;
    }
    AtomicReference localAtomicReference = new AtomicReference();
    Object localObject = new cl(this, localAtomicReference, localds);
    cm localcm = new cm(this, localds);
    localObject = new r(this.n).a(ek.b).a((s)localObject).a(localcm).a(this.s).b();
    localAtomicReference.set(localObject);
    ((q)localObject).e();
    return localds;
  }
  
  public boolean i()
  {
    return (this.l != null) && (this.l.d());
  }
  
  public void k()
  {
    g();
    e();
  }
  
  boolean l()
  {
    return this.p;
  }
  
  void m()
  {
    if (l()) {
      return;
    }
    this.p = true;
    if (this.b == null) {
      this.b = this.t.a(this.n.getApplicationContext(), new cp(this));
    }
    this.s.sendMessageDelayed(this.s.obtainMessage(1), this.q);
    this.s.sendMessageDelayed(this.s.obtainMessage(2), this.r);
  }
  
  boolean n()
  {
    if (!l()) {
      return false;
    }
    this.p = false;
    this.s.removeMessages(2);
    this.s.removeMessages(1);
    if (this.b != null)
    {
      this.b.a();
      this.b = null;
    }
    return true;
  }
  
  boolean o()
  {
    boolean bool1 = false;
    this.j.lock();
    try
    {
      Set localSet = this.h;
      if (localSet == null) {
        return false;
      }
      boolean bool2 = this.h.isEmpty();
      if (!bool2) {
        bool1 = true;
      }
      return bool1;
    }
    finally
    {
      this.j.unlock();
    }
  }
  
  String p()
  {
    StringWriter localStringWriter = new StringWriter();
    a("", null, new PrintWriter(localStringWriter), null);
    return localStringWriter.toString();
  }
  
  public int q()
  {
    return System.identityHashCode(this);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */