package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.Bundle;
import com.facebook.b.ae;
import com.facebook.b.az;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class w
{
  private static final String a = w.class.getCanonicalName();
  private static final HashSet<av> b = new HashSet(Arrays.asList(new av[] { av.f }));
  private static volatile Executor c;
  private static volatile String d;
  private static volatile String e;
  private static volatile String f;
  private static volatile int g;
  private static volatile String h = "facebook.com";
  private static AtomicLong i = new AtomicLong(65536L);
  private static volatile boolean j = false;
  private static boolean k = false;
  private static ae<File> l;
  private static Context m;
  private static int n = 64206;
  private static final Object o = new Object();
  private static final BlockingQueue<Runnable> p = new LinkedBlockingQueue(10);
  private static final ThreadFactory q = new x();
  private static Boolean r = Boolean.valueOf(false);
  
  public static void a(int paramInt)
  {
    g = paramInt;
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      a(paramContext, null);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  /* Error */
  public static void a(Context paramContext, aa paramaa)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 110	com/facebook/w:r	Ljava/lang/Boolean;
    //   6: invokevirtual 121	java/lang/Boolean:booleanValue	()Z
    //   9: ifeq +17 -> 26
    //   12: aload_1
    //   13: ifnull +9 -> 22
    //   16: aload_1
    //   17: invokeinterface 125 1 0
    //   22: ldc 2
    //   24: monitorexit
    //   25: return
    //   26: aload_0
    //   27: ldc 127
    //   29: invokestatic 132	com/facebook/b/az:a	(Ljava/lang/Object;Ljava/lang/String;)V
    //   32: aload_0
    //   33: iconst_0
    //   34: invokestatic 135	com/facebook/b/az:b	(Landroid/content/Context;Z)V
    //   37: aload_0
    //   38: iconst_0
    //   39: invokestatic 137	com/facebook/b/az:a	(Landroid/content/Context;Z)V
    //   42: aload_0
    //   43: invokevirtual 143	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   46: putstatic 145	com/facebook/w:m	Landroid/content/Context;
    //   49: getstatic 145	com/facebook/w:m	Landroid/content/Context;
    //   52: invokestatic 147	com/facebook/w:c	(Landroid/content/Context;)V
    //   55: getstatic 145	com/facebook/w:m	Landroid/content/Context;
    //   58: getstatic 149	com/facebook/w:d	Ljava/lang/String;
    //   61: invokestatic 154	com/facebook/b/as:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   64: invokestatic 158	com/facebook/b/ah:b	()V
    //   67: getstatic 145	com/facebook/w:m	Landroid/content/Context;
    //   70: invokestatic 163	com/facebook/b/h:a	(Landroid/content/Context;)Lcom/facebook/b/h;
    //   73: pop
    //   74: new 165	com/facebook/b/ae
    //   77: dup
    //   78: new 167	com/facebook/y
    //   81: dup
    //   82: invokespecial 168	com/facebook/y:<init>	()V
    //   85: invokespecial 171	com/facebook/b/ae:<init>	(Ljava/util/concurrent/Callable;)V
    //   88: putstatic 173	com/facebook/w:l	Lcom/facebook/b/ae;
    //   91: new 175	java/util/concurrent/FutureTask
    //   94: dup
    //   95: new 177	com/facebook/z
    //   98: dup
    //   99: aload_1
    //   100: invokespecial 180	com/facebook/z:<init>	(Lcom/facebook/aa;)V
    //   103: invokespecial 181	java/util/concurrent/FutureTask:<init>	(Ljava/util/concurrent/Callable;)V
    //   106: astore_0
    //   107: invokestatic 184	com/facebook/w:d	()Ljava/util/concurrent/Executor;
    //   110: aload_0
    //   111: invokeinterface 190 2 0
    //   116: iconst_1
    //   117: invokestatic 108	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   120: putstatic 110	com/facebook/w:r	Ljava/lang/Boolean;
    //   123: goto -101 -> 22
    //   126: astore_0
    //   127: ldc 2
    //   129: monitorexit
    //   130: aload_0
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	paramContext	Context
    //   0	132	1	paramaa	aa
    // Exception table:
    //   from	to	target	type
    //   3	12	126	finally
    //   16	22	126	finally
    //   26	123	126	finally
  }
  
  public static boolean a()
  {
    try
    {
      boolean bool = r.booleanValue();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean a(av paramav)
  {
    for (;;)
    {
      synchronized (b)
      {
        if ((b()) && (b.contains(paramav)))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public static boolean b()
  {
    return j;
  }
  
  public static boolean b(Context paramContext)
  {
    az.b();
    return paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
  }
  
  static void c(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        if ((paramContext != null) && (paramContext.metaData != null))
        {
          Object localObject;
          if (d == null)
          {
            localObject = paramContext.metaData.get("com.facebook.sdk.ApplicationId");
            if (!(localObject instanceof String)) {
              break label148;
            }
            localObject = (String)localObject;
            if (!((String)localObject).toLowerCase(Locale.ROOT).startsWith("fb")) {
              break label141;
            }
            d = ((String)localObject).substring(2);
          }
          label141:
          label148:
          while (!(localObject instanceof Integer)) {
            for (;;)
            {
              if (e == null) {
                e = paramContext.metaData.getString("com.facebook.sdk.ApplicationName");
              }
              if (f == null) {
                f = paramContext.metaData.getString("com.facebook.sdk.ClientToken");
              }
              if (g != 0) {
                break;
              }
              a(paramContext.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
              return;
              d = (String)localObject;
            }
          }
          throw new p("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
        }
      }
      catch (PackageManager.NameNotFoundException paramContext) {}
    }
  }
  
  public static boolean c()
  {
    return k;
  }
  
  public static Executor d()
  {
    synchronized (o)
    {
      if (c == null) {
        c = AsyncTask.THREAD_POOL_EXECUTOR;
      }
      return c;
    }
  }
  
  public static String e()
  {
    return h;
  }
  
  public static Context f()
  {
    az.b();
    return m;
  }
  
  public static String g()
  {
    return "4.7.0";
  }
  
  public static long h()
  {
    az.b();
    return i.get();
  }
  
  public static String i()
  {
    az.b();
    return d;
  }
  
  public static String j()
  {
    az.b();
    return f;
  }
  
  public static int k()
  {
    az.b();
    return g;
  }
  
  public static int l()
  {
    az.b();
    return n;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */