package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import java.util.Iterator;
import java.util.Set;

public abstract class aq<T extends IInterface>
  extends i<T>
  implements com.google.android.gms.common.api.k, au
{
  private final ai d;
  private final Set<Scope> e;
  private final Account f;
  
  protected aq(Context paramContext, Looper paramLooper, int paramInt, ai paramai, s params, t paramt)
  {
    this(paramContext, paramLooper, av.a(paramContext), com.google.android.gms.common.b.a(), paramInt, paramai, (s)b.a(params), (t)b.a(paramt));
  }
  
  protected aq(Context paramContext, Looper paramLooper, av paramav, com.google.android.gms.common.b paramb, int paramInt, ai paramai, s params, t paramt)
  {
    super(paramContext, paramLooper, paramav, paramb, paramInt, a(params), a(paramt), paramai.h());
    this.d = paramai;
    this.f = paramai.b();
    this.e = b(paramai.e());
  }
  
  private static k a(s params)
  {
    if (params == null) {
      return null;
    }
    return new ar(params);
  }
  
  private static l a(t paramt)
  {
    if (paramt == null) {
      return null;
    }
    return new as(paramt);
  }
  
  private Set<Scope> b(Set<Scope> paramSet)
  {
    Set localSet = a(paramSet);
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext()) {
      if (!paramSet.contains((Scope)localIterator.next())) {
        throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
      }
    }
    return localSet;
  }
  
  protected Set<Scope> a(Set<Scope> paramSet)
  {
    return paramSet;
  }
  
  public final Account p()
  {
    return this.f;
  }
  
  protected final Set<Scope> v()
  {
    return this.e;
  }
  
  protected final ai w()
  {
    return this.d;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */