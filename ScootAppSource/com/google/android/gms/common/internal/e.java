package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;

public final class e<T extends IInterface>
  extends aq<T>
{
  private final m<T> d;
  
  public e(Context paramContext, Looper paramLooper, int paramInt, s params, t paramt, ai paramai, m<T> paramm)
  {
    super(paramContext, paramLooper, paramInt, paramai, params, paramt);
    this.d = paramm;
  }
  
  protected String a()
  {
    return this.d.a();
  }
  
  protected void a(int paramInt, T paramT)
  {
    this.d.a(paramInt, paramT);
  }
  
  protected T b(IBinder paramIBinder)
  {
    return this.d.a(paramIBinder);
  }
  
  protected String b()
  {
    return this.d.b();
  }
  
  public m<T> f()
  {
    return this.d;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */