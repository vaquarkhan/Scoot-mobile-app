package com.twitter.sdk.android.core.internal.scribe;

import java.util.List;

public final class p
  extends g
{
  @com.google.a.a.c(a="language")
  public final String f;
  @com.google.a.a.c(a="external_ids")
  public final q g;
  
  public p(c paramc, long paramLong, String paramString1, String paramString2, List<Object> paramList)
  {
    super("tfw_client_event", paramc, paramLong, paramList);
    this.f = paramString1;
    this.g = new q(this, paramString2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */