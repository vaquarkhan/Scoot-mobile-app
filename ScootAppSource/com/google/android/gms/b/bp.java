package com.google.android.gms.b;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

final class bp
  implements df
{
  private final Context a;
  private final cj b;
  private final Looper c;
  private final cr d;
  private final cr e;
  private final Map<i<?>, cr> f;
  private final Set<dr> g = Collections.newSetFromMap(new WeakHashMap());
  private final k h;
  private Bundle i;
  private ConnectionResult j = null;
  private ConnectionResult k = null;
  private boolean l = false;
  private final Lock m;
  private int n = 0;
  
  private bp(Context paramContext, cj paramcj, Lock paramLock, Looper paramLooper, j paramj, Map<i<?>, k> paramMap1, Map<i<?>, k> paramMap2, ai paramai, g<? extends fh, fi> paramg, k paramk, ArrayList<bo> paramArrayList1, ArrayList<bo> paramArrayList2, Map<com.google.android.gms.common.api.a<?>, Integer> paramMap3, Map<com.google.android.gms.common.api.a<?>, Integer> paramMap4)
  {
    this.a = paramContext;
    this.b = paramcj;
    this.m = paramLock;
    this.c = paramLooper;
    this.h = paramk;
    this.d = new cr(paramContext, this.b, paramLock, paramLooper, paramj, paramMap2, null, paramMap4, null, paramArrayList2, new br(this, null));
    this.e = new cr(paramContext, this.b, paramLock, paramLooper, paramj, paramMap1, paramai, paramMap3, paramg, paramArrayList1, new bs(this, null));
    paramContext = new android.support.v4.g.a();
    paramcj = paramMap2.keySet().iterator();
    while (paramcj.hasNext()) {
      paramContext.put((i)paramcj.next(), this.d);
    }
    paramcj = paramMap1.keySet().iterator();
    while (paramcj.hasNext()) {
      paramContext.put((i)paramcj.next(), this.e);
    }
    this.f = Collections.unmodifiableMap(paramContext);
  }
  
  public static bp a(Context paramContext, cj paramcj, Lock paramLock, Looper paramLooper, j paramj, Map<i<?>, k> paramMap, ai paramai, Map<com.google.android.gms.common.api.a<?>, Integer> paramMap1, g<? extends fh, fi> paramg, ArrayList<bo> paramArrayList)
  {
    Object localObject1 = null;
    android.support.v4.g.a locala1 = new android.support.v4.g.a();
    android.support.v4.g.a locala2 = new android.support.v4.g.a();
    Object localObject2 = paramMap.entrySet().iterator();
    paramMap = (Map<i<?>, k>)localObject1;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      localObject1 = (k)((Map.Entry)localObject3).getValue();
      if (((k)localObject1).d()) {
        paramMap = (Map<i<?>, k>)localObject1;
      }
      if (((k)localObject1).j()) {
        locala1.put((i)((Map.Entry)localObject3).getKey(), localObject1);
      } else {
        locala2.put((i)((Map.Entry)localObject3).getKey(), localObject1);
      }
    }
    boolean bool;
    if (!locala1.isEmpty())
    {
      bool = true;
      b.a(bool, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
      localObject1 = new android.support.v4.g.a();
      localObject2 = new android.support.v4.g.a();
      localObject3 = paramMap1.keySet().iterator();
    }
    Object localObject4;
    for (;;)
    {
      if (((Iterator)localObject3).hasNext())
      {
        localObject4 = (com.google.android.gms.common.api.a)((Iterator)localObject3).next();
        i locali = ((com.google.android.gms.common.api.a)localObject4).d();
        if (locala1.containsKey(locali))
        {
          ((Map)localObject1).put(localObject4, (Integer)paramMap1.get(localObject4));
          continue;
          bool = false;
          break;
        }
        if (locala2.containsKey(locali)) {
          ((Map)localObject2).put(localObject4, (Integer)paramMap1.get(localObject4));
        } else {
          throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
        }
      }
    }
    paramMap1 = new ArrayList();
    Object localObject3 = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      localObject4 = (bo)paramArrayList.next();
      if (((Map)localObject1).containsKey(((bo)localObject4).a)) {
        paramMap1.add(localObject4);
      } else if (((Map)localObject2).containsKey(((bo)localObject4).a)) {
        ((ArrayList)localObject3).add(localObject4);
      } else {
        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
      }
    }
    return new bp(paramContext, paramcj, paramLock, paramLooper, paramj, locala1, locala2, paramai, paramg, paramMap, paramMap1, (ArrayList)localObject3, (Map)localObject1, (Map)localObject2);
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    this.b.a(paramInt, paramBoolean);
    this.k = null;
    this.j = null;
  }
  
  private void a(Bundle paramBundle)
  {
    if (this.i == null) {
      this.i = paramBundle;
    }
    while (paramBundle == null) {
      return;
    }
    this.i.putAll(paramBundle);
  }
  
  private void a(ConnectionResult paramConnectionResult)
  {
    switch (this.n)
    {
    default: 
      Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
    }
    for (;;)
    {
      this.n = 0;
      return;
      this.b.a(paramConnectionResult);
      l();
    }
  }
  
  private static boolean b(ConnectionResult paramConnectionResult)
  {
    return (paramConnectionResult != null) && (paramConnectionResult.b());
  }
  
  private boolean c(be<? extends x, ? extends h> parambe)
  {
    parambe = parambe.b();
    b.b(this.f.containsKey(parambe), "GoogleApiClient is not configured to use the API required for this call.");
    return ((cr)this.f.get(parambe)).equals(this.e);
  }
  
  private void i()
  {
    this.k = null;
    this.j = null;
    this.d.a();
    this.e.a();
  }
  
  private void j()
  {
    if (b(this.j)) {
      if ((b(this.k)) || (m())) {
        k();
      }
    }
    do
    {
      do
      {
        return;
      } while (this.k == null);
      if (this.n == 1)
      {
        l();
        return;
      }
      a(this.k);
      this.d.c();
      return;
      if ((this.j != null) && (b(this.k)))
      {
        this.e.c();
        a(this.j);
        return;
      }
    } while ((this.j == null) || (this.k == null));
    ConnectionResult localConnectionResult = this.j;
    if (this.e.f < this.d.f) {
      localConnectionResult = this.k;
    }
    a(localConnectionResult);
  }
  
  private void k()
  {
    switch (this.n)
    {
    default: 
      Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
    }
    for (;;)
    {
      this.n = 0;
      return;
      this.b.a(this.i);
      l();
    }
  }
  
  private void l()
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext()) {
      ((dr)localIterator.next()).v();
    }
    this.g.clear();
  }
  
  private boolean m()
  {
    return (this.k != null) && (this.k.c() == 4);
  }
  
  private PendingIntent n()
  {
    if (this.h == null) {
      return null;
    }
    return PendingIntent.getActivity(this.a, this.b.q(), this.h.e(), 134217728);
  }
  
  public <A extends h, R extends x, T extends be<R, A>> T a(T paramT)
  {
    if (c(paramT))
    {
      if (m())
      {
        paramT.c(new Status(4, null, n()));
        return paramT;
      }
      return this.e.a(paramT);
    }
    return this.d.a(paramT);
  }
  
  public void a()
  {
    this.n = 2;
    this.l = false;
    i();
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("authClient").println(":");
    this.e.a(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.append(paramString).append("anonClient").println(":");
    this.d.a(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public boolean a(dr paramdr)
  {
    this.m.lock();
    try
    {
      if (((e()) || (d())) && (!h()))
      {
        this.g.add(paramdr);
        if (this.n == 0) {
          this.n = 1;
        }
        this.k = null;
        this.e.a();
        return true;
      }
      return false;
    }
    finally
    {
      this.m.unlock();
    }
  }
  
  public <A extends h, T extends be<? extends x, A>> T b(T paramT)
  {
    if (c(paramT))
    {
      if (m())
      {
        paramT.c(new Status(4, null, n()));
        return paramT;
      }
      return this.e.b(paramT);
    }
    return this.d.b(paramT);
  }
  
  public ConnectionResult b()
  {
    throw new UnsupportedOperationException();
  }
  
  public void c()
  {
    this.k = null;
    this.j = null;
    this.n = 0;
    this.d.c();
    this.e.c();
    l();
  }
  
  /* Error */
  public boolean d()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 64	com/google/android/gms/b/bp:m	Ljava/util/concurrent/locks/Lock;
    //   6: invokeinterface 354 1 0
    //   11: aload_0
    //   12: getfield 80	com/google/android/gms/b/bp:d	Lcom/google/android/gms/b/cr;
    //   15: invokevirtual 371	com/google/android/gms/b/cr:d	()Z
    //   18: ifeq +44 -> 62
    //   21: iload_3
    //   22: istore_2
    //   23: aload_0
    //   24: invokevirtual 359	com/google/android/gms/b/bp:h	()Z
    //   27: ifne +24 -> 51
    //   30: iload_3
    //   31: istore_2
    //   32: aload_0
    //   33: invokespecial 262	com/google/android/gms/b/bp:m	()Z
    //   36: ifne +15 -> 51
    //   39: aload_0
    //   40: getfield 58	com/google/android/gms/b/bp:n	I
    //   43: istore_1
    //   44: iload_1
    //   45: iconst_1
    //   46: if_icmpne +16 -> 62
    //   49: iload_3
    //   50: istore_2
    //   51: aload_0
    //   52: getfield 64	com/google/android/gms/b/bp:m	Ljava/util/concurrent/locks/Lock;
    //   55: invokeinterface 363 1 0
    //   60: iload_2
    //   61: ireturn
    //   62: iconst_0
    //   63: istore_2
    //   64: goto -13 -> 51
    //   67: astore 4
    //   69: aload_0
    //   70: getfield 64	com/google/android/gms/b/bp:m	Ljava/util/concurrent/locks/Lock;
    //   73: invokeinterface 363 1 0
    //   78: aload 4
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	bp
    //   43	4	1	i1	int
    //   22	42	2	bool1	boolean
    //   1	49	3	bool2	boolean
    //   67	12	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	21	67	finally
    //   23	30	67	finally
    //   32	44	67	finally
  }
  
  /* Error */
  public boolean e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	com/google/android/gms/b/bp:m	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 354 1 0
    //   9: aload_0
    //   10: getfield 58	com/google/android/gms/b/bp:n	I
    //   13: istore_1
    //   14: iload_1
    //   15: iconst_2
    //   16: if_icmpne +16 -> 32
    //   19: iconst_1
    //   20: istore_2
    //   21: aload_0
    //   22: getfield 64	com/google/android/gms/b/bp:m	Ljava/util/concurrent/locks/Lock;
    //   25: invokeinterface 363 1 0
    //   30: iload_2
    //   31: ireturn
    //   32: iconst_0
    //   33: istore_2
    //   34: goto -13 -> 21
    //   37: astore_3
    //   38: aload_0
    //   39: getfield 64	com/google/android/gms/b/bp:m	Ljava/util/concurrent/locks/Lock;
    //   42: invokeinterface 363 1 0
    //   47: aload_3
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	bp
    //   13	4	1	i1	int
    //   20	14	2	bool	boolean
    //   37	11	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
  }
  
  public void f()
  {
    this.d.f();
    this.e.f();
  }
  
  /* Error */
  public void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	com/google/android/gms/b/bp:m	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 354 1 0
    //   9: aload_0
    //   10: invokevirtual 356	com/google/android/gms/b/bp:e	()Z
    //   13: istore_1
    //   14: aload_0
    //   15: getfield 85	com/google/android/gms/b/bp:e	Lcom/google/android/gms/b/cr;
    //   18: invokevirtual 267	com/google/android/gms/b/cr:c	()V
    //   21: aload_0
    //   22: new 238	com/google/android/gms/common/ConnectionResult
    //   25: dup
    //   26: iconst_4
    //   27: invokespecial 376	com/google/android/gms/common/ConnectionResult:<init>	(I)V
    //   30: putfield 54	com/google/android/gms/b/bp:k	Lcom/google/android/gms/common/ConnectionResult;
    //   33: iload_1
    //   34: ifeq +36 -> 70
    //   37: new 378	android/os/Handler
    //   40: dup
    //   41: aload_0
    //   42: getfield 66	com/google/android/gms/b/bp:c	Landroid/os/Looper;
    //   45: invokespecial 381	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   48: new 383	com/google/android/gms/b/bq
    //   51: dup
    //   52: aload_0
    //   53: invokespecial 385	com/google/android/gms/b/bq:<init>	(Lcom/google/android/gms/b/bp;)V
    //   56: invokevirtual 389	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   59: pop
    //   60: aload_0
    //   61: getfield 64	com/google/android/gms/b/bp:m	Ljava/util/concurrent/locks/Lock;
    //   64: invokeinterface 363 1 0
    //   69: return
    //   70: aload_0
    //   71: invokespecial 231	com/google/android/gms/b/bp:l	()V
    //   74: goto -14 -> 60
    //   77: astore_2
    //   78: aload_0
    //   79: getfield 64	com/google/android/gms/b/bp:m	Ljava/util/concurrent/locks/Lock;
    //   82: invokeinterface 363 1 0
    //   87: aload_2
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	bp
    //   13	21	1	bool	boolean
    //   77	11	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	33	77	finally
    //   37	60	77	finally
    //   70	74	77	finally
  }
  
  public boolean h()
  {
    return this.e.d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */