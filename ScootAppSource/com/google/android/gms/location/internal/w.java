package com.google.android.gms.location.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.g;
import com.google.android.gms.location.r;
import com.google.android.gms.location.u;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class w
{
  private final af<q> a;
  private final Context b;
  private ContentProviderClient c = null;
  private boolean d = false;
  private Map<g, z> e = new HashMap();
  private Map<Object, x> f = new HashMap();
  
  public w(Context paramContext, af<q> paramaf)
  {
    this.b = paramContext;
    this.a = paramaf;
  }
  
  private z a(g paramg, Looper paramLooper)
  {
    synchronized (this.e)
    {
      z localz2 = (z)this.e.get(paramg);
      z localz1 = localz2;
      if (localz2 == null) {
        localz1 = new z(paramg, paramLooper);
      }
      this.e.put(paramg, localz1);
      return localz1;
    }
  }
  
  public Location a()
  {
    this.a.a();
    try
    {
      Location localLocation = ((q)this.a.c()).b(this.b.getPackageName());
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void a(LocationRequest paramLocationRequest, g paramg, Looper paramLooper, k paramk)
  {
    this.a.a();
    paramg = a(paramg, paramLooper);
    ((q)this.a.c()).a(LocationRequestUpdateData.a(LocationRequestInternal.a(paramLocationRequest), paramg, paramk));
  }
  
  public void a(g paramg, k paramk)
  {
    this.a.a();
    b.a(paramg, "Invalid null listener");
    synchronized (this.e)
    {
      paramg = (z)this.e.remove(paramg);
      if (paramg != null)
      {
        paramg.a();
        ((q)this.a.c()).a(LocationRequestUpdateData.a(paramg, paramk));
      }
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.a();
    ((q)this.a.c()).a(paramBoolean);
    this.d = paramBoolean;
  }
  
  public void b()
  {
    Object localObject3;
    try
    {
      synchronized (this.e)
      {
        Iterator localIterator1 = this.e.values().iterator();
        while (localIterator1.hasNext())
        {
          localObject3 = (z)localIterator1.next();
          if (localObject3 != null) {
            ((q)this.a.c()).a(LocationRequestUpdateData.a((u)localObject3, null));
          }
        }
      }
      this.e.clear();
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
    synchronized (this.f)
    {
      Iterator localIterator2 = this.f.values().iterator();
      while (localIterator2.hasNext())
      {
        localObject3 = (x)localIterator2.next();
        if (localObject3 != null) {
          ((q)this.a.c()).a(LocationRequestUpdateData.a((r)localObject3, null));
        }
      }
    }
    this.f.clear();
  }
  
  public void c()
  {
    if (this.d) {}
    try
    {
      a(false);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */