package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import b.a.a.a.a.b.ai;
import b.a.a.a.a.b.y;
import b.a.a.a.a.d.a;
import b.a.a.a.a.d.d;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.l;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

public class e
{
  final ConcurrentHashMap<Long, m> a;
  private final b.a.a.a.q b;
  private final ScheduledExecutorService c;
  private final f d;
  private final h e;
  private final TwitterAuthConfig f;
  private final List<com.twitter.sdk.android.core.m<? extends l>> g;
  private final SSLSocketFactory h;
  private final y i;
  
  public e(b.a.a.a.q paramq, ScheduledExecutorService paramScheduledExecutorService, f paramf, h paramh, TwitterAuthConfig paramTwitterAuthConfig, List<com.twitter.sdk.android.core.m<? extends l>> paramList, SSLSocketFactory paramSSLSocketFactory, y paramy)
  {
    this.b = paramq;
    this.c = paramScheduledExecutorService;
    this.d = paramf;
    this.e = paramh;
    this.f = paramTwitterAuthConfig;
    this.g = paramList;
    this.h = paramSSLSocketFactory;
    this.i = paramy;
    this.a = new ConcurrentHashMap(2);
  }
  
  private m d(long paramLong)
  {
    Context localContext = this.b.E();
    Object localObject = new b.a.a.a.a.d.q(localContext, new b.a.a.a.a.f.b(this.b).a(), b(paramLong), c(paramLong));
    localObject = new j(localContext, this.e, new ai(), (b.a.a.a.a.d.q)localObject, this.d.g);
    return new m(localContext, a(paramLong, (j)localObject), (d)localObject, this.c);
  }
  
  b.a.a.a.a.d.m<g> a(long paramLong, j paramj)
  {
    Context localContext = this.b.E();
    if (this.d.a)
    {
      b.a.a.a.a.b.m.a(localContext, "Scribe enabled");
      return new b(localContext, this.c, paramj, this.d, new ScribeFilesSender(localContext, this.d, paramLong, this.f, this.g, this.h, this.c, this.i));
    }
    b.a.a.a.a.b.m.a(localContext, "Scribe disabled");
    return new a();
  }
  
  m a(long paramLong)
  {
    if (!this.a.containsKey(Long.valueOf(paramLong))) {
      this.a.putIfAbsent(Long.valueOf(paramLong), d(paramLong));
    }
    return (m)this.a.get(Long.valueOf(paramLong));
  }
  
  public boolean a(g paramg, long paramLong)
  {
    try
    {
      a(paramLong).a(paramg);
      return true;
    }
    catch (IOException paramg)
    {
      b.a.a.a.a.b.m.a(this.b.E(), "Failed to scribe event", paramg);
    }
    return false;
  }
  
  String b(long paramLong)
  {
    return paramLong + "_se.tap";
  }
  
  String c(long paramLong)
  {
    return paramLong + "_se_to_send";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */