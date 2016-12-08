package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class cr
  implements df
{
  final Map<i<?>, k> a;
  final Map<i<?>, ConnectionResult> b = new HashMap();
  final ai c;
  final Map<a<?>, Integer> d;
  final g<? extends fh, fi> e;
  int f;
  final cj g;
  final dg h;
  private final Lock i;
  private final Condition j;
  private final Context k;
  private final j l;
  private final ct m;
  private volatile cq n;
  private ConnectionResult o = null;
  
  public cr(Context paramContext, cj paramcj, Lock paramLock, Looper paramLooper, j paramj, Map<i<?>, k> paramMap, ai paramai, Map<a<?>, Integer> paramMap1, g<? extends fh, fi> paramg, ArrayList<bo> paramArrayList, dg paramdg)
  {
    this.k = paramContext;
    this.i = paramLock;
    this.l = paramj;
    this.a = paramMap;
    this.c = paramai;
    this.d = paramMap1;
    this.e = paramg;
    this.g = paramcj;
    this.h = paramdg;
    paramContext = paramArrayList.iterator();
    while (paramContext.hasNext()) {
      ((bo)paramContext.next()).a(this);
    }
    this.m = new ct(this, paramLooper);
    this.j = paramLock.newCondition();
    this.n = new ci(this);
  }
  
  public <A extends h, R extends x, T extends be<R, A>> T a(T paramT)
  {
    paramT.j();
    return this.n.a(paramT);
  }
  
  public void a()
  {
    this.n.c();
  }
  
  public void a(int paramInt)
  {
    this.i.lock();
    try
    {
      this.n.a(paramInt);
      return;
    }
    finally
    {
      this.i.unlock();
    }
  }
  
  public void a(Bundle paramBundle)
  {
    this.i.lock();
    try
    {
      this.n.a(paramBundle);
      return;
    }
    finally
    {
      this.i.unlock();
    }
  }
  
  void a(cs paramcs)
  {
    paramcs = this.m.obtainMessage(1, paramcs);
    this.m.sendMessage(paramcs);
  }
  
  void a(ConnectionResult paramConnectionResult)
  {
    this.i.lock();
    try
    {
      this.o = paramConnectionResult;
      this.n = new ci(this);
      this.n.a();
      this.j.signalAll();
      return;
    }
    finally
    {
      this.i.unlock();
    }
  }
  
  public void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt)
  {
    this.i.lock();
    try
    {
      this.n.a(paramConnectionResult, parama, paramInt);
      return;
    }
    finally
    {
      this.i.unlock();
    }
  }
  
  void a(RuntimeException paramRuntimeException)
  {
    paramRuntimeException = this.m.obtainMessage(2, paramRuntimeException);
    this.m.sendMessage(paramRuntimeException);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    String str = String.valueOf(paramString).concat("  ");
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      paramPrintWriter.append(paramString).append(locala.f()).println(":");
      ((k)this.a.get(locala.d())).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public boolean a(dr paramdr)
  {
    return false;
  }
  
  public <A extends h, T extends be<? extends x, A>> T b(T paramT)
  {
    paramT.j();
    return this.n.b(paramT);
  }
  
  public ConnectionResult b()
  {
    a();
    while (j()) {
      try
      {
        this.j.await();
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
        return new ConnectionResult(15, null);
      }
    }
    if (d()) {
      return ConnectionResult.a;
    }
    if (this.o != null) {
      return this.o;
    }
    return new ConnectionResult(13, null);
  }
  
  public void c()
  {
    if (this.n.b()) {
      this.b.clear();
    }
  }
  
  public boolean d()
  {
    return this.n instanceof bu;
  }
  
  void e()
  {
    this.i.lock();
    try
    {
      this.n = new bx(this, this.c, this.d, this.l, this.e, this.i, this.k);
      this.n.a();
      this.j.signalAll();
      return;
    }
    finally
    {
      this.i.unlock();
    }
  }
  
  public void f()
  {
    if (d()) {
      ((bu)this.n).d();
    }
  }
  
  public void g() {}
  
  void h()
  {
    this.i.lock();
    try
    {
      this.g.n();
      this.n = new bu(this);
      this.n.a();
      this.j.signalAll();
      return;
    }
    finally
    {
      this.i.unlock();
    }
  }
  
  void i()
  {
    Iterator localIterator = this.a.values().iterator();
    while (localIterator.hasNext()) {
      ((k)localIterator.next()).g();
    }
  }
  
  public boolean j()
  {
    return this.n instanceof bx;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */