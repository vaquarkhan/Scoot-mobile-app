package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.ad;
import com.google.android.gms.analytics.h;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.a.e;

public final class aj
{
  private final Context a;
  private final Context b;
  
  public aj(Context paramContext)
  {
    com.google.android.gms.common.internal.b.a(paramContext);
    paramContext = paramContext.getApplicationContext();
    com.google.android.gms.common.internal.b.a(paramContext, "Application context can't be null");
    this.a = paramContext;
    this.b = paramContext;
  }
  
  public Context a()
  {
    return this.a;
  }
  
  protected ad a(Context paramContext)
  {
    return ad.a(paramContext);
  }
  
  protected bl a(ah paramah)
  {
    return new bl(paramah);
  }
  
  public Context b()
  {
    return this.b;
  }
  
  protected as b(ah paramah)
  {
    return new as(paramah);
  }
  
  protected b c(ah paramah)
  {
    return new b(paramah);
  }
  
  protected ba d(ah paramah)
  {
    return new ba(paramah);
  }
  
  protected x e(ah paramah)
  {
    return new x(paramah);
  }
  
  protected j f(ah paramah)
  {
    return new j(paramah);
  }
  
  protected bh g(ah paramah)
  {
    return new bh(paramah);
  }
  
  protected c h(ah paramah)
  {
    return e.c();
  }
  
  protected h i(ah paramah)
  {
    return new h(paramah);
  }
  
  at j(ah paramah)
  {
    return new at(paramah, this);
  }
  
  k k(ah paramah)
  {
    return new k(paramah);
  }
  
  protected y l(ah paramah)
  {
    return new y(paramah, this);
  }
  
  public aq m(ah paramah)
  {
    return new aq(paramah);
  }
  
  public l n(ah paramah)
  {
    return new l(paramah);
  }
  
  public al o(ah paramah)
  {
    return new al(paramah);
  }
  
  public bm p(ah paramah)
  {
    return new bm(paramah);
  }
  
  public n q(ah paramah)
  {
    return new n(paramah);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */