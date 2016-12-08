package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import b.a.a.a.a.d.o;
import java.util.concurrent.ScheduledExecutorService;

final class b
  extends b.a.a.a.a.d.b<g>
{
  private final o f;
  
  public b(Context paramContext, ScheduledExecutorService paramScheduledExecutorService, j paramj, f paramf, ScribeFilesSender paramScribeFilesSender)
  {
    super(paramContext, paramScheduledExecutorService, paramj);
    this.f = paramScribeFilesSender;
    a(paramf.h);
  }
  
  public o a()
  {
    return this.f;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */