package com.google.android.gms.b;

import java.util.concurrent.locks.Lock;

abstract class cs
{
  private final cq a;
  
  protected cs(cq paramcq)
  {
    this.a = paramcq;
  }
  
  protected abstract void a();
  
  public final void a(cr paramcr)
  {
    cr.a(paramcr).lock();
    try
    {
      cq localcq1 = cr.b(paramcr);
      cq localcq2 = this.a;
      if (localcq1 != localcq2) {
        return;
      }
      a();
      return;
    }
    finally
    {
      cr.a(paramcr).unlock();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */