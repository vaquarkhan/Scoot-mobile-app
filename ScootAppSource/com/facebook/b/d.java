package com.facebook.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.facebook.p;
import java.lang.reflect.Method;

public class d
{
  private static final String a = d.class.getCanonicalName();
  private static d g;
  private String b;
  private String c;
  private String d;
  private boolean e;
  private long f;
  
  /* Error */
  public static d a(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 34	com/facebook/b/d:g	Lcom/facebook/b/d;
    //   3: ifnull +28 -> 31
    //   6: invokestatic 40	java/lang/System:currentTimeMillis	()J
    //   9: getstatic 34	com/facebook/b/d:g	Lcom/facebook/b/d;
    //   12: getfield 42	com/facebook/b/d:f	J
    //   15: lsub
    //   16: ldc2_w 43
    //   19: lcmp
    //   20: ifge +11 -> 31
    //   23: getstatic 34	com/facebook/b/d:g	Lcom/facebook/b/d;
    //   26: astore 4
    //   28: aload 4
    //   30: areturn
    //   31: aload_0
    //   32: invokestatic 46	com/facebook/b/d:b	(Landroid/content/Context;)Lcom/facebook/b/d;
    //   35: astore 5
    //   37: aload_0
    //   38: invokevirtual 52	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   41: ldc 54
    //   43: iconst_0
    //   44: invokevirtual 60	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   47: ifnull +52 -> 99
    //   50: ldc 62
    //   52: invokestatic 68	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   55: astore 4
    //   57: aload_0
    //   58: invokestatic 71	com/facebook/b/d:e	(Landroid/content/Context;)Ljava/lang/String;
    //   61: astore 6
    //   63: aload 6
    //   65: ifnull +10 -> 75
    //   68: aload 5
    //   70: aload 6
    //   72: putfield 73	com/facebook/b/d:d	Ljava/lang/String;
    //   75: aload 4
    //   77: ifnonnull +45 -> 122
    //   80: aload 5
    //   82: invokestatic 76	com/facebook/b/d:a	(Lcom/facebook/b/d;)Lcom/facebook/b/d;
    //   85: astore 4
    //   87: iconst_0
    //   88: ifeq -60 -> 28
    //   91: new 78	java/lang/NullPointerException
    //   94: dup
    //   95: invokespecial 79	java/lang/NullPointerException:<init>	()V
    //   98: athrow
    //   99: aload_0
    //   100: invokevirtual 52	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   103: ldc 81
    //   105: iconst_0
    //   106: invokevirtual 60	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   109: ifnull +283 -> 392
    //   112: ldc 83
    //   114: invokestatic 68	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   117: astore 4
    //   119: goto -62 -> 57
    //   122: aload_0
    //   123: invokevirtual 87	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   126: aload 4
    //   128: iconst_3
    //   129: anewarray 89	java/lang/String
    //   132: dup
    //   133: iconst_0
    //   134: ldc 91
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: ldc 93
    //   141: aastore
    //   142: dup
    //   143: iconst_2
    //   144: ldc 95
    //   146: aastore
    //   147: aconst_null
    //   148: aconst_null
    //   149: aconst_null
    //   150: invokevirtual 101	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   153: astore_0
    //   154: aload_0
    //   155: ifnull +15 -> 170
    //   158: aload_0
    //   159: astore 4
    //   161: aload_0
    //   162: invokeinterface 107 1 0
    //   167: ifne +30 -> 197
    //   170: aload_0
    //   171: astore 4
    //   173: aload 5
    //   175: invokestatic 76	com/facebook/b/d:a	(Lcom/facebook/b/d;)Lcom/facebook/b/d;
    //   178: astore 5
    //   180: aload 5
    //   182: astore 4
    //   184: aload_0
    //   185: ifnull -157 -> 28
    //   188: aload_0
    //   189: invokeinterface 110 1 0
    //   194: aload 5
    //   196: areturn
    //   197: aload_0
    //   198: astore 4
    //   200: aload_0
    //   201: ldc 91
    //   203: invokeinterface 114 2 0
    //   208: istore_2
    //   209: aload_0
    //   210: astore 4
    //   212: aload_0
    //   213: ldc 93
    //   215: invokeinterface 114 2 0
    //   220: istore_1
    //   221: aload_0
    //   222: astore 4
    //   224: aload_0
    //   225: ldc 95
    //   227: invokeinterface 114 2 0
    //   232: istore_3
    //   233: aload_0
    //   234: astore 4
    //   236: aload 5
    //   238: aload_0
    //   239: iload_2
    //   240: invokeinterface 118 2 0
    //   245: putfield 120	com/facebook/b/d:b	Ljava/lang/String;
    //   248: iload_1
    //   249: ifle +51 -> 300
    //   252: iload_3
    //   253: ifle +47 -> 300
    //   256: aload_0
    //   257: astore 4
    //   259: aload 5
    //   261: invokevirtual 122	com/facebook/b/d:b	()Ljava/lang/String;
    //   264: ifnonnull +36 -> 300
    //   267: aload_0
    //   268: astore 4
    //   270: aload 5
    //   272: aload_0
    //   273: iload_1
    //   274: invokeinterface 118 2 0
    //   279: putfield 124	com/facebook/b/d:c	Ljava/lang/String;
    //   282: aload_0
    //   283: astore 4
    //   285: aload 5
    //   287: aload_0
    //   288: iload_3
    //   289: invokeinterface 118 2 0
    //   294: invokestatic 130	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   297: putfield 132	com/facebook/b/d:e	Z
    //   300: aload_0
    //   301: ifnull +9 -> 310
    //   304: aload_0
    //   305: invokeinterface 110 1 0
    //   310: aload 5
    //   312: invokestatic 76	com/facebook/b/d:a	(Lcom/facebook/b/d;)Lcom/facebook/b/d;
    //   315: areturn
    //   316: astore 5
    //   318: aconst_null
    //   319: astore_0
    //   320: aload_0
    //   321: astore 4
    //   323: getstatic 25	com/facebook/b/d:a	Ljava/lang/String;
    //   326: new 134	java/lang/StringBuilder
    //   329: dup
    //   330: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   333: ldc -119
    //   335: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: aload 5
    //   340: invokevirtual 144	java/lang/Exception:toString	()Ljava/lang/String;
    //   343: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   349: invokestatic 150	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   352: pop
    //   353: aload_0
    //   354: ifnull +9 -> 363
    //   357: aload_0
    //   358: invokeinterface 110 1 0
    //   363: aconst_null
    //   364: areturn
    //   365: astore_0
    //   366: aconst_null
    //   367: astore 4
    //   369: aload 4
    //   371: ifnull +10 -> 381
    //   374: aload 4
    //   376: invokeinterface 110 1 0
    //   381: aload_0
    //   382: athrow
    //   383: astore_0
    //   384: goto -15 -> 369
    //   387: astore 5
    //   389: goto -69 -> 320
    //   392: aconst_null
    //   393: astore 4
    //   395: goto -338 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	398	0	paramContext	Context
    //   220	54	1	i	int
    //   208	32	2	j	int
    //   232	57	3	k	int
    //   26	368	4	localObject	Object
    //   35	276	5	locald	d
    //   316	23	5	localException1	Exception
    //   387	1	5	localException2	Exception
    //   61	10	6	str	String
    // Exception table:
    //   from	to	target	type
    //   37	57	316	java/lang/Exception
    //   57	63	316	java/lang/Exception
    //   68	75	316	java/lang/Exception
    //   80	87	316	java/lang/Exception
    //   99	119	316	java/lang/Exception
    //   122	154	316	java/lang/Exception
    //   37	57	365	finally
    //   57	63	365	finally
    //   68	75	365	finally
    //   80	87	365	finally
    //   99	119	365	finally
    //   122	154	365	finally
    //   161	170	383	finally
    //   173	180	383	finally
    //   200	209	383	finally
    //   212	221	383	finally
    //   224	233	383	finally
    //   236	248	383	finally
    //   259	267	383	finally
    //   270	282	383	finally
    //   285	300	383	finally
    //   323	353	383	finally
    //   161	170	387	java/lang/Exception
    //   173	180	387	java/lang/Exception
    //   200	209	387	java/lang/Exception
    //   212	221	387	java/lang/Exception
    //   224	233	387	java/lang/Exception
    //   236	248	387	java/lang/Exception
    //   259	267	387	java/lang/Exception
    //   270	282	387	java/lang/Exception
    //   285	300	387	java/lang/Exception
  }
  
  private static d a(d paramd)
  {
    paramd.f = System.currentTimeMillis();
    g = paramd;
    return paramd;
  }
  
  private static d b(Context paramContext)
  {
    d locald = c(paramContext);
    Object localObject = locald;
    if (locald == null)
    {
      paramContext = d(paramContext);
      localObject = paramContext;
      if (paramContext == null) {
        localObject = new d();
      }
    }
    return (d)localObject;
  }
  
  private static d c(Context paramContext)
  {
    try
    {
      if (Looper.myLooper() == Looper.getMainLooper()) {
        throw new p("getAndroidId cannot be called on the main thread.");
      }
    }
    catch (Exception paramContext)
    {
      as.a("android_id", paramContext);
      return null;
    }
    Object localObject = as.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] { Context.class });
    if (localObject == null) {
      return null;
    }
    localObject = as.a(null, (Method)localObject, new Object[] { paramContext });
    if (((localObject instanceof Integer)) && (((Integer)localObject).intValue() == 0))
    {
      localObject = as.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] { Context.class });
      if (localObject == null) {
        return null;
      }
      paramContext = as.a(null, (Method)localObject, new Object[] { paramContext });
      if (paramContext == null) {
        return null;
      }
      localObject = as.a(paramContext.getClass(), "getId", new Class[0]);
      Method localMethod = as.a(paramContext.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
      if ((localObject != null) && (localMethod != null))
      {
        d locald = new d();
        locald.c = ((String)as.a(paramContext, (Method)localObject, new Object[0]));
        locald.e = ((Boolean)as.a(paramContext, localMethod, new Object[0])).booleanValue();
        return locald;
      }
    }
    else
    {
      return null;
    }
    return null;
  }
  
  private static d d(Context paramContext)
  {
    g localg = new g(null);
    Object localObject1 = new Intent("com.google.android.gms.ads.identifier.service.START");
    ((Intent)localObject1).setPackage("com.google.android.gms");
    if (paramContext.bindService((Intent)localObject1, localg, 1)) {}
    try
    {
      localObject1 = new f(localg.a());
      d locald = new d();
      locald.c = ((f)localObject1).a();
      locald.e = ((f)localObject1).b();
      return locald;
    }
    catch (Exception localException)
    {
      as.a("android_id", localException);
      return null;
    }
    finally
    {
      paramContext.unbindService(localg);
    }
  }
  
  private static String e(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager != null) {
      return localPackageManager.getInstallerPackageName(paramContext.getPackageName());
    }
    return null;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.e;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */