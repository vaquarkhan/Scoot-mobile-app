package com.twitter.sdk.android.core;

import b.a.a.a.a.b.ai;
import b.a.a.a.a.b.r;
import java.util.Iterator;
import java.util.List;
import retrofit.client.Header;

final class w
{
  private final long a;
  private int b;
  private int c;
  private long d;
  
  w(List<Header> paramList)
  {
    this(paramList, new ai());
  }
  
  w(List<Header> paramList, r paramr)
  {
    if (paramList == null) {
      throw new IllegalArgumentException("headers must not be null");
    }
    this.a = (paramr.a() / 1000L);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      paramr = (Header)paramList.next();
      if ("x-rate-limit-limit".equals(paramr.getName())) {
        this.b = Integer.valueOf(paramr.getValue()).intValue();
      } else if ("x-rate-limit-remaining".equals(paramr.getName())) {
        this.c = Integer.valueOf(paramr.getValue()).intValue();
      } else if ("x-rate-limit-reset".equals(paramr.getName())) {
        this.d = Long.valueOf(paramr.getValue()).longValue();
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */