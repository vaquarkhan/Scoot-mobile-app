package com.google.android.gms.b;

import java.lang.ref.WeakReference;

final class cp
  extends db
{
  private WeakReference<cj> a;
  
  cp(cj paramcj)
  {
    this.a = new WeakReference(paramcj);
  }
  
  public void a()
  {
    cj localcj = (cj)this.a.get();
    if (localcj == null) {
      return;
    }
    cj.a(localcj);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */