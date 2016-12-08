package com.twitter.sdk.android.core.internal.scribe;

import java.util.List;

public final class n
  extends g
{
  @com.google.a.a.c(a="external_ids")
  public final o f;
  @com.google.a.a.c(a="device_id_created_at")
  public final long g;
  @com.google.a.a.c(a="language")
  public final String h;
  
  public n(c paramc, long paramLong, String paramString1, String paramString2, List<Object> paramList)
  {
    super("syndicated_sdk_impression", paramc, paramLong, paramList);
    this.h = paramString1;
    this.f = new o(this, paramString2);
    this.g = 0L;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */