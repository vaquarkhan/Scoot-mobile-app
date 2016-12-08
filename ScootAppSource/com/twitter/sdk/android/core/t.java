package com.twitter.sdk.android.core;

import b.a.a.a.a.f.d;
import b.a.a.a.q;
import com.twitter.sdk.android.core.internal.c;
import com.twitter.sdk.android.core.internal.scribe.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLSocketFactory;

public class t
  extends q<Boolean>
{
  m<x> a;
  m<a> b;
  com.twitter.sdk.android.core.internal.f<x> c;
  private final TwitterAuthConfig d;
  private final ConcurrentHashMap<l, n> k;
  private volatile SSLSocketFactory l;
  
  public t(TwitterAuthConfig paramTwitterAuthConfig)
  {
    this.d = paramTwitterAuthConfig;
    this.k = new ConcurrentHashMap();
  }
  
  public static t d()
  {
    k();
    return (t)b.a.a.a.f.a(t.class);
  }
  
  /* Error */
  private void j()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 46	com/twitter/sdk/android/core/t:l	Ljavax/net/ssl/SSLSocketFactory;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +33 -> 41
    //   11: aload_0
    //   12: new 48	com/twitter/sdk/android/core/v
    //   15: dup
    //   16: aload_0
    //   17: invokevirtual 52	com/twitter/sdk/android/core/t:E	()Landroid/content/Context;
    //   20: invokespecial 55	com/twitter/sdk/android/core/v:<init>	(Landroid/content/Context;)V
    //   23: invokestatic 60	b/a/a/a/a/e/o:a	(Lb/a/a/a/a/e/p;)Ljavax/net/ssl/SSLSocketFactory;
    //   26: putfield 46	com/twitter/sdk/android/core/t:l	Ljavax/net/ssl/SSLSocketFactory;
    //   29: invokestatic 64	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   32: ldc 66
    //   34: ldc 68
    //   36: invokeinterface 73 3 0
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_1
    //   45: invokestatic 64	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   48: ldc 66
    //   50: ldc 75
    //   52: aload_1
    //   53: invokeinterface 79 4 0
    //   58: goto -17 -> 41
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	t
    //   6	2	1	localSSLSocketFactory	SSLSocketFactory
    //   44	9	1	localException	Exception
    //   61	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	41	44	java/lang/Exception
    //   2	7	61	finally
    //   11	41	61	finally
    //   45	58	61	finally
  }
  
  private static void k()
  {
    if (b.a.a.a.f.a(t.class) == null) {
      throw new IllegalStateException("Must start Twitter Kit with Fabric.with() first");
    }
  }
  
  private void l()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.a);
    localArrayList.add(this.b);
    r.a(this, localArrayList, D());
  }
  
  public String a()
  {
    return "1.6.6.111";
  }
  
  public String b()
  {
    return "com.twitter.sdk.android:twitter-core";
  }
  
  public TwitterAuthConfig f()
  {
    return this.d;
  }
  
  public SSLSocketFactory g()
  {
    
    if (this.l == null) {
      j();
    }
    return this.l;
  }
  
  protected Boolean h()
  {
    this.a.b();
    this.b.b();
    g();
    l();
    this.c.a(F().e());
    return Boolean.valueOf(true);
  }
  
  protected boolean h_()
  {
    new c().a(E(), b(), b() + ":" + "session_store" + ".xml");
    this.a = new j(new d(E(), "session_store"), new y(), "active_twittersession", "twittersession");
    this.c = new com.twitter.sdk.android.core.internal.f(this.a, F().f(), new com.twitter.sdk.android.core.internal.n());
    this.b = new j(new d(E(), "session_store"), new b(), "active_appsession", "appsession");
    return true;
  }
  
  public m<x> i()
  {
    k();
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */