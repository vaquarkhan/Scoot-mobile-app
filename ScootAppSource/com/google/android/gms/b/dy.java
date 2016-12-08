package com.google.android.gms.b;

import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.g.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.af;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.x;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class dy
{
  private static final be<?, ?>[] b = new be[0];
  final Set<be<?, ?>> a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
  private final eb c = new dz(this);
  private final Map<i<?>, k> d;
  
  public dy(i<?> parami, k paramk)
  {
    this.d = new a();
    this.d.put(parami, paramk);
  }
  
  public dy(Map<i<?>, k> paramMap)
  {
    this.d = paramMap;
  }
  
  private static void a(be<?, ?> parambe, af paramaf, IBinder paramIBinder)
  {
    if (parambe.f())
    {
      parambe.a(new ea(parambe, paramaf, paramIBinder, null));
      return;
    }
    if ((paramIBinder != null) && (paramIBinder.isBinderAlive()))
    {
      ea localea = new ea(parambe, paramaf, paramIBinder, null);
      parambe.a(localea);
      try
      {
        paramIBinder.linkToDeath(localea, 0);
        return;
      }
      catch (RemoteException paramIBinder)
      {
        parambe.g();
        paramaf.a(parambe.a().intValue());
        return;
      }
    }
    parambe.a(null);
    parambe.g();
    paramaf.a(parambe.a().intValue());
  }
  
  public void a()
  {
    be[] arrayOfbe = (be[])this.a.toArray(b);
    int j = arrayOfbe.length;
    int i = 0;
    if (i < j)
    {
      be localbe = arrayOfbe[i];
      localbe.a(null);
      if (localbe.a() == null) {
        if (localbe.h()) {
          this.a.remove(localbe);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        localbe.d();
        a(localbe, null, ((k)this.d.get(localbe.b())).l());
        this.a.remove(localbe);
      }
    }
  }
  
  <A extends h> void a(be<? extends x, A> parambe)
  {
    this.a.add(parambe);
    parambe.a(this.c);
  }
  
  public void a(PrintWriter paramPrintWriter)
  {
    paramPrintWriter.append(" mUnconsumedApiCalls.size()=").println(this.a.size());
  }
  
  public void b()
  {
    be[] arrayOfbe = (be[])this.a.toArray(b);
    int j = arrayOfbe.length;
    int i = 0;
    while (i < j)
    {
      arrayOfbe[i].d(new Status(8, "The connection to Google Play services was lost"));
      i += 1;
    }
  }
  
  public boolean c()
  {
    be[] arrayOfbe = (be[])this.a.toArray(b);
    int j = arrayOfbe.length;
    int i = 0;
    while (i < j)
    {
      if (!arrayOfbe[i].f()) {
        return true;
      }
      i += 1;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */