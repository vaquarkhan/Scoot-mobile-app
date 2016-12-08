package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class i<T extends IInterface>
{
  public static final String[] c = { "service_esmobile", "service_googleme" };
  final Handler a;
  protected AtomicInteger b = new AtomicInteger(0);
  private int d;
  private long e;
  private long f;
  private int g;
  private long h;
  private final Context i;
  private final Looper j;
  private final av k;
  private final j l;
  private final Object m = new Object();
  private final Object n = new Object();
  private bk o;
  private o p;
  private T q;
  private final ArrayList<n<?>> r = new ArrayList();
  private q s;
  private int t = 1;
  private final k u;
  private final l v;
  private final int w;
  private final String x;
  
  protected i(Context paramContext, Looper paramLooper, av paramav, j paramj, int paramInt, k paramk, l paraml, String paramString)
  {
    this.i = ((Context)b.a(paramContext, "Context must not be null"));
    this.j = ((Looper)b.a(paramLooper, "Looper must not be null"));
    this.k = ((av)b.a(paramav, "Supervisor must not be null"));
    this.l = ((j)b.a(paramj, "API availability must not be null"));
    this.a = new m(this, paramLooper);
    this.w = paramInt;
    this.u = paramk;
    this.v = paraml;
    this.x = paramString;
  }
  
  private boolean a(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (this.m)
    {
      if (this.t != paramInt1) {
        return false;
      }
      b(paramInt2, paramT);
      return true;
    }
  }
  
  private void b(int paramInt, T paramT)
  {
    boolean bool = true;
    int i1;
    int i2;
    if (paramInt == 3)
    {
      i1 = 1;
      if (paramT == null) {
        break label120;
      }
      i2 = 1;
      label17:
      if (i1 != i2) {
        break label126;
      }
    }
    for (;;)
    {
      b.b(bool);
      for (;;)
      {
        synchronized (this.m)
        {
          this.t = paramInt;
          this.q = paramT;
          a(paramInt, paramT);
          switch (paramInt)
          {
          case 2: 
            return;
            f();
          }
        }
        a(paramT);
        continue;
        w();
      }
      i1 = 0;
      break;
      label120:
      i2 = 0;
      break label17;
      label126:
      bool = false;
    }
  }
  
  private void f()
  {
    String str1;
    String str2;
    if (this.s != null)
    {
      str1 = String.valueOf(a());
      str2 = String.valueOf(i_());
      Log.e("GmsClient", String.valueOf(str1).length() + 70 + String.valueOf(str2).length() + "Calling connect() while still connected, missing disconnect() for " + str1 + " on " + str2);
      this.k.b(a(), i_(), this.s, n());
      this.b.incrementAndGet();
    }
    this.s = new q(this, this.b.get());
    if (!this.k.a(a(), i_(), this.s, n()))
    {
      str1 = String.valueOf(a());
      str2 = String.valueOf(i_());
      Log.e("GmsClient", String.valueOf(str1).length() + 34 + String.valueOf(str2).length() + "unable to connect to service: " + str1 + " on " + str2);
      a(16, null, this.b.get());
    }
  }
  
  private void w()
  {
    if (this.s != null)
    {
      this.k.b(a(), i_(), this.s, n());
      this.s = null;
    }
  }
  
  protected abstract String a();
  
  protected void a(int paramInt)
  {
    this.d = paramInt;
    this.e = System.currentTimeMillis();
  }
  
  protected void a(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    this.a.sendMessage(this.a.obtainMessage(5, paramInt2, -1, new t(this, paramInt1, paramBundle)));
  }
  
  protected void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    this.a.sendMessage(this.a.obtainMessage(1, paramInt2, -1, new s(this, paramInt1, paramIBinder, paramBundle)));
  }
  
  void a(int paramInt, T paramT) {}
  
  protected void a(T paramT)
  {
    this.f = System.currentTimeMillis();
  }
  
  protected void a(ConnectionResult paramConnectionResult)
  {
    this.g = paramConnectionResult.c();
    this.h = System.currentTimeMillis();
  }
  
  public void a(bb arg1, Set<Scope> paramSet)
  {
    try
    {
      Object localObject = c();
      localObject = new GetServiceRequest(this.w).a(this.i.getPackageName()).a((Bundle)localObject);
      if (paramSet != null) {
        ((GetServiceRequest)localObject).a(paramSet);
      }
      if (j()) {
        ((GetServiceRequest)localObject).a(q()).a(???);
      }
      return;
    }
    catch (DeadObjectException ???)
    {
      synchronized (this.n)
      {
        while (this.o != null)
        {
          this.o.a(new p(this, this.b.get()), (GetServiceRequest)localObject);
          return;
          if (u())
          {
            ((GetServiceRequest)localObject).a(p());
            continue;
            ??? = ???;
            Log.w("GmsClient", "service died");
            b(1);
            return;
          }
        }
        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
      }
    }
    catch (RemoteException ???)
    {
      Log.w("GmsClient", "Remote exception occurred", ???);
    }
  }
  
  public void a(o paramo)
  {
    this.p = ((o)b.a(paramo, "Connection progress callbacks cannot be null."));
    b(2, null);
  }
  
  public void a(String paramString, FileDescriptor arg2, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    for (;;)
    {
      synchronized (this.m)
      {
        int i1 = this.t;
        paramArrayOfString = this.q;
        paramPrintWriter.append(paramString).append("mConnectState=");
        switch (i1)
        {
        default: 
          paramPrintWriter.print("UNKNOWN");
          paramPrintWriter.append(" mService=");
          if (paramArrayOfString != null) {
            break label482;
          }
          paramPrintWriter.println("null");
          ??? = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
          long l1;
          String str;
          if (this.f > 0L)
          {
            paramArrayOfString = paramPrintWriter.append(paramString).append("lastConnectedTime=");
            l1 = this.f;
            str = String.valueOf(???.format(new Date(this.f)));
            paramArrayOfString.println(String.valueOf(str).length() + 21 + l1 + " " + str);
          }
          if (this.e > 0L) {
            paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          }
          switch (this.d)
          {
          default: 
            paramPrintWriter.append(String.valueOf(this.d));
            paramArrayOfString = paramPrintWriter.append(" lastSuspendedTime=");
            l1 = this.e;
            str = String.valueOf(???.format(new Date(this.e)));
            paramArrayOfString.println(String.valueOf(str).length() + 21 + l1 + " " + str);
            if (this.h > 0L)
            {
              paramPrintWriter.append(paramString).append("lastFailedStatus=").append(com.google.android.gms.common.api.p.a(this.g));
              paramString = paramPrintWriter.append(" lastFailedTime=");
              l1 = this.h;
              ??? = String.valueOf(???.format(new Date(this.h)));
              paramString.println(String.valueOf(???).length() + 21 + l1 + " " + ???);
            }
            return;
          }
          break;
        }
      }
      paramPrintWriter.print("CONNECTING");
      continue;
      paramPrintWriter.print("CONNECTED");
      continue;
      paramPrintWriter.print("DISCONNECTING");
      continue;
      paramPrintWriter.print("DISCONNECTED");
      continue;
      label482:
      paramPrintWriter.append(b()).append("@").println(Integer.toHexString(System.identityHashCode(paramArrayOfString.asBinder())));
      continue;
      paramPrintWriter.append("CAUSE_SERVICE_DISCONNECTED");
      continue;
      paramPrintWriter.append("CAUSE_NETWORK_LOST");
    }
  }
  
  protected abstract T b(IBinder paramIBinder);
  
  protected abstract String b();
  
  public void b(int paramInt)
  {
    this.a.sendMessage(this.a.obtainMessage(4, this.b.get(), paramInt));
  }
  
  protected Bundle c()
  {
    return new Bundle();
  }
  
  public boolean d()
  {
    return false;
  }
  
  public Intent e()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }
  
  public void g()
  {
    this.b.incrementAndGet();
    synchronized (this.r)
    {
      int i2 = this.r.size();
      int i1 = 0;
      while (i1 < i2)
      {
        ((n)this.r.get(i1)).e();
        i1 += 1;
      }
      this.r.clear();
    }
    synchronized (this.n)
    {
      this.o = null;
      b(1, null);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public boolean h()
  {
    for (;;)
    {
      synchronized (this.m)
      {
        if (this.t == 3)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean i()
  {
    for (;;)
    {
      synchronized (this.m)
      {
        if (this.t == 2)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  protected String i_()
  {
    return "com.google.android.gms";
  }
  
  public boolean j()
  {
    return false;
  }
  
  public boolean k()
  {
    return true;
  }
  
  public IBinder l()
  {
    synchronized (this.n)
    {
      if (this.o == null) {
        return null;
      }
      IBinder localIBinder = this.o.asBinder();
      return localIBinder;
    }
  }
  
  protected final String n()
  {
    if (this.x == null) {
      return this.i.getClass().getName();
    }
    return this.x;
  }
  
  public final Context o()
  {
    return this.i;
  }
  
  public Account p()
  {
    return null;
  }
  
  public final Account q()
  {
    if (p() != null) {
      return p();
    }
    return new Account("<<default account>>", "com.google");
  }
  
  protected final void r()
  {
    if (!h()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  public Bundle s()
  {
    return null;
  }
  
  public final T t()
  {
    synchronized (this.m)
    {
      if (this.t == 4) {
        throw new DeadObjectException();
      }
    }
    r();
    if (this.q != null) {}
    for (boolean bool = true;; bool = false)
    {
      b.a(bool, "Client is connected but service is null");
      IInterface localIInterface = this.q;
      return localIInterface;
    }
  }
  
  public boolean u()
  {
    return false;
  }
  
  protected Set<Scope> v()
  {
    return Collections.EMPTY_SET;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */