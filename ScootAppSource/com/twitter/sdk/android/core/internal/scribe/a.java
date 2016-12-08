package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import b.a.a.a.a.b.u;
import b.a.a.a.a.b.y;
import b.a.a.a.a.g.b;
import b.a.a.a.a.g.w;
import com.google.a.d;
import com.google.a.k;
import com.google.a.r;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.m;
import com.twitter.sdk.android.core.t;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

public class a
  extends e
{
  private static volatile ScheduledExecutorService b;
  private final b.a.a.a.q c;
  private final List<m<? extends l>> d;
  private final String e;
  
  public a(b.a.a.a.q paramq, String paramString, k paramk, List<m<? extends l>> paramList, y paramy)
  {
    super(paramq, c(), a(b.a.a.a.a.g.q.a().b(), a(paramString, paramq)), new h(paramk), t.d().f(), paramList, t.d().g(), paramy);
    this.d = paramList;
    this.c = paramq;
    this.e = paramy.m();
  }
  
  public a(b.a.a.a.q paramq, String paramString, List<m<? extends l>> paramList, y paramy)
  {
    this(paramq, paramString, b(), paramList, paramy);
  }
  
  static f a(w paramw, String paramString)
  {
    int i;
    if ((paramw != null) && (paramw.e != null)) {
      i = paramw.e.e;
    }
    for (int j = paramw.e.b;; j = 600)
    {
      paramw = a("https://syndication.twitter.com", "");
      return new f(d(), paramw, "i", "sdk", "", paramString, i, j);
      i = 100;
    }
  }
  
  static String a(String paramString, b.a.a.a.q paramq)
  {
    return "Fabric/" + paramq.F().c() + " (Android " + Build.VERSION.SDK_INT + ") " + paramString + "/" + paramq.a();
  }
  
  static String a(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      return paramString2;
    }
    return paramString1;
  }
  
  private static k b()
  {
    return new r().a(d.d).a();
  }
  
  private static ScheduledExecutorService c()
  {
    if (b == null) {}
    try
    {
      if (b == null) {
        b = u.b("scribe");
      }
      return b;
    }
    finally {}
  }
  
  private static boolean d()
  {
    return !"release".equals("debug");
  }
  
  long a(l paraml)
  {
    if (paraml != null) {
      return paraml.e();
    }
    return 0L;
  }
  
  l a()
  {
    Object localObject = null;
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      l locall = ((m)localIterator.next()).b();
      localObject = locall;
      if (locall != null) {
        localObject = locall;
      }
    }
    return (l)localObject;
  }
  
  public void a(c paramc, List<Object> paramList)
  {
    if (this.c.E() != null) {}
    for (String str = this.c.E().getResources().getConfiguration().locale.getLanguage();; str = "")
    {
      a(i.a(paramc, System.currentTimeMillis(), str, this.e, paramList));
      return;
    }
  }
  
  public void a(g paramg)
  {
    super.a(paramg, a(a()));
  }
  
  public void a(c... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      a(paramVarArgs[i], Collections.emptyList());
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */