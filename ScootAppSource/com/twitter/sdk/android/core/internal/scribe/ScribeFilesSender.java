package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.text.TextUtils;
import b.a.a.a.a.b.ac;
import b.a.a.a.a.b.y;
import b.a.a.a.a.d.o;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.l;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSocketFactory;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

final class ScribeFilesSender
  implements o
{
  private static final byte[] a = { 91 };
  private static final byte[] b = { 44 };
  private static final byte[] c = { 93 };
  private final Context d;
  private final f e;
  private final long f;
  private final TwitterAuthConfig g;
  private final List<com.twitter.sdk.android.core.m<? extends l>> h;
  private final SSLSocketFactory i;
  private final AtomicReference<RestAdapter> j;
  private final ExecutorService k;
  private final y l;
  
  public ScribeFilesSender(Context paramContext, f paramf, long paramLong, TwitterAuthConfig paramTwitterAuthConfig, List<com.twitter.sdk.android.core.m<? extends l>> paramList, SSLSocketFactory paramSSLSocketFactory, ExecutorService paramExecutorService, y paramy)
  {
    this.d = paramContext;
    this.e = paramf;
    this.f = paramLong;
    this.g = paramTwitterAuthConfig;
    this.h = paramList;
    this.i = paramSSLSocketFactory;
    this.k = paramExecutorService;
    this.l = paramy;
    this.j = new AtomicReference();
  }
  
  private l a(long paramLong)
  {
    Object localObject = null;
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      l locall = ((com.twitter.sdk.android.core.m)localIterator.next()).a(paramLong);
      localObject = locall;
      if (locall != null) {
        localObject = locall;
      }
    }
    return (l)localObject;
  }
  
  private boolean a(l paraml)
  {
    return (paraml != null) && (paraml.d() != null);
  }
  
  private boolean c()
  {
    return a() != null;
  }
  
  /* Error */
  RestAdapter a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 64	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:j	Ljava/util/concurrent/atomic/AtomicReference;
    //   6: invokevirtual 100	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   9: ifnonnull +102 -> 111
    //   12: aload_0
    //   13: aload_0
    //   14: getfield 49	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:f	J
    //   17: invokespecial 101	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:a	(J)Lcom/twitter/sdk/android/core/l;
    //   20: astore_1
    //   21: new 103	com/twitter/sdk/android/core/internal/scribe/l
    //   24: dup
    //   25: aload_0
    //   26: getfield 47	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:e	Lcom/twitter/sdk/android/core/internal/scribe/f;
    //   29: aload_0
    //   30: getfield 59	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:l	Lb/a/a/a/a/b/y;
    //   33: invokespecial 106	com/twitter/sdk/android/core/internal/scribe/l:<init>	(Lcom/twitter/sdk/android/core/internal/scribe/f;Lb/a/a/a/a/b/y;)V
    //   36: astore_2
    //   37: aload_0
    //   38: aload_1
    //   39: invokespecial 108	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:a	(Lcom/twitter/sdk/android/core/l;)Z
    //   42: ifeq +84 -> 126
    //   45: aload_0
    //   46: getfield 64	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:j	Ljava/util/concurrent/atomic/AtomicReference;
    //   49: aconst_null
    //   50: new 110	retrofit/RestAdapter$Builder
    //   53: dup
    //   54: invokespecial 111	retrofit/RestAdapter$Builder:<init>	()V
    //   57: aload_0
    //   58: getfield 47	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:e	Lcom/twitter/sdk/android/core/internal/scribe/f;
    //   61: getfield 116	com/twitter/sdk/android/core/internal/scribe/f:b	Ljava/lang/String;
    //   64: invokevirtual 120	retrofit/RestAdapter$Builder:setEndpoint	(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;
    //   67: aload_0
    //   68: getfield 57	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:k	Ljava/util/concurrent/ExecutorService;
    //   71: new 122	retrofit/android/MainThreadExecutor
    //   74: dup
    //   75: invokespecial 123	retrofit/android/MainThreadExecutor:<init>	()V
    //   78: invokevirtual 127	retrofit/RestAdapter$Builder:setExecutors	(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Lretrofit/RestAdapter$Builder;
    //   81: aload_2
    //   82: invokevirtual 131	retrofit/RestAdapter$Builder:setRequestInterceptor	(Lretrofit/RequestInterceptor;)Lretrofit/RestAdapter$Builder;
    //   85: new 133	com/twitter/sdk/android/core/e
    //   88: dup
    //   89: aload_0
    //   90: getfield 51	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:g	Lcom/twitter/sdk/android/core/TwitterAuthConfig;
    //   93: aload_1
    //   94: aload_0
    //   95: getfield 55	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:i	Ljavax/net/ssl/SSLSocketFactory;
    //   98: invokespecial 136	com/twitter/sdk/android/core/e:<init>	(Lcom/twitter/sdk/android/core/TwitterAuthConfig;Lcom/twitter/sdk/android/core/l;Ljavax/net/ssl/SSLSocketFactory;)V
    //   101: invokevirtual 140	retrofit/RestAdapter$Builder:setClient	(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;
    //   104: invokevirtual 143	retrofit/RestAdapter$Builder:build	()Lretrofit/RestAdapter;
    //   107: invokevirtual 147	java/util/concurrent/atomic/AtomicReference:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   110: pop
    //   111: aload_0
    //   112: getfield 64	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:j	Ljava/util/concurrent/atomic/AtomicReference;
    //   115: invokevirtual 100	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   118: checkcast 149	retrofit/RestAdapter
    //   121: astore_1
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_1
    //   125: areturn
    //   126: aload_0
    //   127: getfield 45	com/twitter/sdk/android/core/internal/scribe/ScribeFilesSender:d	Landroid/content/Context;
    //   130: ldc -105
    //   132: invokestatic 156	b/a/a/a/a/b/m:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   135: goto -24 -> 111
    //   138: astore_1
    //   139: aload_0
    //   140: monitorexit
    //   141: aload_1
    //   142: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	ScribeFilesSender
    //   20	105	1	localObject1	Object
    //   138	4	1	localObject2	Object
    //   36	46	2	locall	l
    // Exception table:
    //   from	to	target	type
    //   2	111	138	finally
    //   111	122	138	finally
    //   126	135	138	finally
  }
  
  Response a(String paramString)
  {
    ScribeFilesSender.ScribeService localScribeService = (ScribeFilesSender.ScribeService)((RestAdapter)this.j.get()).create(ScribeFilesSender.ScribeService.class);
    if (!TextUtils.isEmpty(this.e.e)) {
      return localScribeService.uploadSequence(this.e.e, paramString);
    }
    return localScribeService.upload(this.e.c, this.e.d, paramString);
  }
  
  public boolean a(List<File> paramList)
  {
    if (c()) {}
    for (;;)
    {
      try
      {
        paramList = b(paramList);
        b.a.a.a.a.b.m.a(this.d, paramList);
        if (a(paramList).getStatus() == 200) {
          return true;
        }
        b.a.a.a.a.b.m.a(this.d, "Failed sending files", null);
      }
      catch (RetrofitError paramList)
      {
        b.a.a.a.a.b.m.a(this.d, "Failed sending files", paramList);
        if (paramList.getResponse() == null) {
          continue;
        }
        if (paramList.getResponse().getStatus() == 500) {
          break;
        }
        if (paramList.getResponse().getStatus() != 400) {
          continue;
        }
        return true;
      }
      catch (IOException paramList)
      {
        b.a.a.a.a.b.m.a(this.d, "Failed sending files", paramList);
        continue;
      }
      return false;
      b.a.a.a.a.b.m.a(this.d, "Cannot attempt upload at this time");
    }
    return true;
  }
  
  String b(List<File> paramList)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(1024);
    boolean[] arrayOfBoolean = new boolean[1];
    localByteArrayOutputStream.write(a);
    paramList = paramList.iterator();
    Object localObject;
    if (paramList.hasNext()) {
      localObject = (File)paramList.next();
    }
    try
    {
      localObject = new ac((File)localObject);
    }
    finally
    {
      try
      {
        ((ac)localObject).a(new k(this, arrayOfBoolean, localByteArrayOutputStream));
        b.a.a.a.a.b.m.a((Closeable)localObject);
      }
      finally
      {
        for (;;) {}
      }
      paramList = finally;
      localObject = null;
      b.a.a.a.a.b.m.a((Closeable)localObject);
      throw paramList;
      localByteArrayOutputStream.write(c);
      return localByteArrayOutputStream.toString("UTF-8");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\ScribeFilesSender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */