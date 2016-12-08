package com.google.android.gms.b;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class bu
  implements cq
{
  private final cr a;
  private boolean b = false;
  
  public bu(cr paramcr)
  {
    this.a = paramcr;
  }
  
  private <A extends h> void c(be<? extends x, A> parambe)
  {
    this.a.g.i.a(parambe);
    k localk = this.a.g.b(parambe.b());
    if ((!localk.h()) && (this.a.b.containsKey(parambe.b())))
    {
      parambe.c(new Status(17));
      return;
    }
    Object localObject = localk;
    if ((localk instanceof e)) {
      localObject = ((e)localk).f();
    }
    parambe.b((h)localObject);
  }
  
  public <A extends h, R extends x, T extends be<R, A>> T a(T paramT)
  {
    return b(paramT);
  }
  
  public void a() {}
  
  public void a(int paramInt)
  {
    this.a.a(null);
    this.a.h.a(paramInt, this.b);
  }
  
  public void a(Bundle paramBundle) {}
  
  public void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt) {}
  
  public <A extends h, T extends be<? extends x, A>> T b(T paramT)
  {
    try
    {
      c(paramT);
      return paramT;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      this.a.a(new bv(this, this));
    }
    return paramT;
  }
  
  public boolean b()
  {
    if (this.b) {
      return false;
    }
    if (this.a.g.o())
    {
      this.b = true;
      Iterator localIterator = this.a.g.h.iterator();
      while (localIterator.hasNext()) {
        ((dv)localIterator.next()).a();
      }
      return false;
    }
    this.a.a(null);
    return true;
  }
  
  public void c()
  {
    if (this.b)
    {
      this.b = false;
      this.a.a(new bw(this, this));
    }
  }
  
  void d()
  {
    if (this.b)
    {
      this.b = false;
      this.a.g.i.a();
      b();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */