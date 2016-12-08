package com.digits.sdk.android;

import java.lang.ref.WeakReference;

final class eh
  implements g
{
  private final WeakReference<g> a;
  private final ca b;
  
  public eh(g paramg)
  {
    this(paramg, new j(ao.d().j()));
  }
  
  eh(g paramg, ca paramca)
  {
    this.a = new WeakReference(paramg);
    this.b = paramca;
  }
  
  public void a(bs parambs)
  {
    g localg = (g)this.a.get();
    if (localg != null)
    {
      this.b.b();
      localg.a(parambs);
    }
  }
  
  public void a(cb paramcb, String paramString)
  {
    g localg = (g)this.a.get();
    if (localg != null)
    {
      this.b.c();
      localg.a(paramcb, paramString);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */