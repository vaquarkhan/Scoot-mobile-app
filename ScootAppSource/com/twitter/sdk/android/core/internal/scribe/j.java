package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import b.a.a.a.a.b.r;
import b.a.a.a.a.d.c;
import b.a.a.a.a.d.d;
import b.a.a.a.a.d.q;
import java.util.UUID;

final class j
  extends d<g>
{
  public j(Context paramContext, c<g> paramc, r paramr, q paramq, int paramInt)
  {
    super(paramContext, paramc, paramr, paramq, paramInt);
  }
  
  protected String a()
  {
    UUID localUUID = UUID.randomUUID();
    return "se" + "_" + localUUID.toString() + "_" + this.c.a() + ".tap";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */