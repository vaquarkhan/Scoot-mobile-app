package com.c.a.b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import b.a.a.a.a.b.ai;
import b.a.a.a.a.b.m;
import b.a.a.a.a.b.y;
import b.a.a.a.a.b.z;
import b.a.a.a.a.f.d;
import b.a.a.a.a.g.w;
import java.util.HashMap;
import java.util.Map;

public final class e
  extends b.a.a.a.q<Boolean>
  implements b.a.a.a.a.b.t
{
  private final b.a.a.a.a.a.b<String> a = new b.a.a.a.a.a.b();
  private final j b = new j();
  private l c;
  
  /* Error */
  private f a(Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 40	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   4: ldc 42
    //   6: invokevirtual 48	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnull +206 -> 217
    //   14: aload_2
    //   15: astore_3
    //   16: aload_2
    //   17: invokestatic 53	com/c/a/b/f:a	(Ljava/io/InputStream;)Lcom/c/a/b/f;
    //   20: astore_1
    //   21: aload_2
    //   22: astore_3
    //   23: invokestatic 59	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   26: ldc 61
    //   28: new 63	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   35: aload_1
    //   36: getfield 68	com/c/a/b/f:d	Ljava/lang/String;
    //   39: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc 74
    //   44: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload_1
    //   48: getfield 76	com/c/a/b/f:b	Ljava/lang/String;
    //   51: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: ldc 78
    //   56: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload_1
    //   60: getfield 80	com/c/a/b/f:a	Ljava/lang/String;
    //   63: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: ldc 82
    //   68: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: ldc 84
    //   73: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_1
    //   77: getfield 86	com/c/a/b/f:c	Ljava/lang/String;
    //   80: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokeinterface 95 3 0
    //   91: aload_1
    //   92: astore_3
    //   93: aload_2
    //   94: ifnull +9 -> 103
    //   97: aload_2
    //   98: invokevirtual 100	java/io/InputStream:close	()V
    //   101: aload_1
    //   102: astore_3
    //   103: aload_3
    //   104: areturn
    //   105: astore_2
    //   106: invokestatic 59	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   109: ldc 61
    //   111: ldc 102
    //   113: aload_2
    //   114: invokeinterface 106 4 0
    //   119: aload_1
    //   120: areturn
    //   121: astore 4
    //   123: aconst_null
    //   124: astore_2
    //   125: aconst_null
    //   126: astore_1
    //   127: aload_2
    //   128: astore_3
    //   129: invokestatic 59	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   132: ldc 61
    //   134: ldc 108
    //   136: aload 4
    //   138: invokeinterface 106 4 0
    //   143: aload_1
    //   144: astore_3
    //   145: aload_2
    //   146: ifnull -43 -> 103
    //   149: aload_2
    //   150: invokevirtual 100	java/io/InputStream:close	()V
    //   153: aload_1
    //   154: areturn
    //   155: astore_2
    //   156: invokestatic 59	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   159: ldc 61
    //   161: ldc 102
    //   163: aload_2
    //   164: invokeinterface 106 4 0
    //   169: aload_1
    //   170: areturn
    //   171: astore_1
    //   172: aconst_null
    //   173: astore_3
    //   174: aload_3
    //   175: ifnull +7 -> 182
    //   178: aload_3
    //   179: invokevirtual 100	java/io/InputStream:close	()V
    //   182: aload_1
    //   183: athrow
    //   184: astore_2
    //   185: invokestatic 59	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   188: ldc 61
    //   190: ldc 102
    //   192: aload_2
    //   193: invokeinterface 106 4 0
    //   198: goto -16 -> 182
    //   201: astore_1
    //   202: goto -28 -> 174
    //   205: astore 4
    //   207: aconst_null
    //   208: astore_1
    //   209: goto -82 -> 127
    //   212: astore 4
    //   214: goto -87 -> 127
    //   217: aconst_null
    //   218: astore_1
    //   219: goto -128 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	222	0	this	e
    //   0	222	1	paramContext	Context
    //   9	89	2	localInputStream	java.io.InputStream
    //   105	9	2	localIOException1	java.io.IOException
    //   124	26	2	localObject1	Object
    //   155	9	2	localIOException2	java.io.IOException
    //   184	9	2	localIOException3	java.io.IOException
    //   15	164	3	localObject2	Object
    //   121	16	4	localException1	Exception
    //   205	1	4	localException2	Exception
    //   212	1	4	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   97	101	105	java/io/IOException
    //   0	10	121	java/lang/Exception
    //   149	153	155	java/io/IOException
    //   0	10	171	finally
    //   178	182	184	java/io/IOException
    //   16	21	201	finally
    //   23	91	201	finally
    //   129	143	201	finally
    //   16	21	205	java/lang/Exception
    //   23	91	212	java/lang/Exception
  }
  
  private String a(Context paramContext, String paramString)
  {
    if (a(paramString, Build.VERSION.SDK_INT))
    {
      b.a.a.a.f.h().a("Beta", "App was possibly installed by Beta. Getting device token");
      try
      {
        paramContext = (String)this.a.a(paramContext, this.b);
        boolean bool = "".equals(paramContext);
        if (bool) {
          paramContext = null;
        }
        return paramContext;
      }
      catch (Exception paramContext)
      {
        b.a.a.a.f.h().e("Beta", "Failed to load the Beta device token", paramContext);
        return null;
      }
    }
    b.a.a.a.f.h().a("Beta", "App was not installed by Beta. Skipping device token");
    return null;
  }
  
  private b.a.a.a.a.g.f h()
  {
    w localw = b.a.a.a.a.g.q.a().b();
    if (localw != null) {
      return localw.f;
    }
    return null;
  }
  
  @TargetApi(14)
  l a(int paramInt, Application paramApplication)
  {
    if (paramInt >= 14) {
      return new b(F().e(), F().f());
    }
    return new k();
  }
  
  public String a()
  {
    return "1.1.6.127";
  }
  
  boolean a(b.a.a.a.a.g.f paramf, f paramf1)
  {
    return (paramf != null) && (!TextUtils.isEmpty(paramf.a)) && (paramf1 != null);
  }
  
  @TargetApi(11)
  boolean a(String paramString, int paramInt)
  {
    if (paramInt < 11) {
      return paramString == null;
    }
    return "io.crash.air".equals(paramString);
  }
  
  public String b()
  {
    return "com.crashlytics.sdk.android:beta";
  }
  
  protected Boolean d()
  {
    b.a.a.a.f.h().a("Beta", "Beta kit initializing...");
    Context localContext = E();
    y localy = D();
    if (TextUtils.isEmpty(a(localContext, localy.j())))
    {
      b.a.a.a.f.h().a("Beta", "A Beta device token was not found for this app");
      return Boolean.valueOf(false);
    }
    b.a.a.a.f.h().a("Beta", "Beta device token is present, checking for app updates.");
    b.a.a.a.a.g.f localf = h();
    f localf1 = a(localContext);
    if (a(localf, localf1)) {
      this.c.a(localContext, this, localy, localf, localf1, new d(this), new ai(), new b.a.a.a.a.e.b(b.a.a.a.f.h()));
    }
    return Boolean.valueOf(true);
  }
  
  public Map<z, String> f()
  {
    String str = D().j();
    str = a(E(), str);
    HashMap localHashMap = new HashMap();
    if (!TextUtils.isEmpty(str)) {
      localHashMap.put(z.c, str);
    }
    return localHashMap;
  }
  
  String g()
  {
    return m.b(E(), "com.crashlytics.ApiEndpoint");
  }
  
  @TargetApi(14)
  protected boolean h_()
  {
    Application localApplication = (Application)E().getApplicationContext();
    this.c = a(Build.VERSION.SDK_INT, localApplication);
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */