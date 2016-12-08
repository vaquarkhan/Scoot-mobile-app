package com.b.a;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class g
  implements z
{
  private final Executor a;
  
  public g(Handler paramHandler)
  {
    this.a = new h(this, paramHandler);
  }
  
  public void a(r<?> paramr, ad paramad)
  {
    paramr.a("post-error");
    paramad = w.a(paramad);
    this.a.execute(new i(this, paramr, paramad, null));
  }
  
  public void a(r<?> paramr, w<?> paramw)
  {
    a(paramr, paramw, null);
  }
  
  public void a(r<?> paramr, w<?> paramw, Runnable paramRunnable)
  {
    paramr.v();
    paramr.a("post-response");
    this.a.execute(new i(this, paramr, paramw, paramRunnable));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */