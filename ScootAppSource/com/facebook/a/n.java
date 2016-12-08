package com.facebook.a;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class n
{
  private static final Object a = new Object();
  private static boolean b = false;
  private static boolean c = false;
  private static Map<h, r> d;
  private static final Runnable e = new o();
  
  private static r a(Context paramContext, h paramh)
  {
    b(paramContext);
    r localr = (r)d.get(paramh);
    paramContext = localr;
    if (localr == null)
    {
      paramContext = new r();
      d.put(paramh, paramContext);
    }
    return paramContext;
  }
  
  private static void a()
  {
    if (!b)
    {
      b = true;
      a.g().schedule(e, 30L, TimeUnit.SECONDS);
    }
  }
  
  /* Error */
  static void a(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 21	com/facebook/a/n:a	Ljava/lang/Object;
    //   3: astore 4
    //   5: aload 4
    //   7: monitorenter
    //   8: getstatic 23	com/facebook/a/n:b	Z
    //   11: istore_1
    //   12: iload_1
    //   13: ifeq +56 -> 69
    //   16: new 74	java/io/ObjectOutputStream
    //   19: dup
    //   20: new 76	java/io/BufferedOutputStream
    //   23: dup
    //   24: aload_0
    //   25: ldc 78
    //   27: iconst_0
    //   28: invokevirtual 84	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   31: invokespecial 87	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   34: invokespecial 88	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   37: astore_2
    //   38: aload_2
    //   39: astore_0
    //   40: aload_2
    //   41: getstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   44: invokevirtual 92	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   47: aload_2
    //   48: astore_0
    //   49: iconst_0
    //   50: putstatic 23	com/facebook/a/n:b	Z
    //   53: aload_2
    //   54: astore_0
    //   55: getstatic 97	com/facebook/av:e	Lcom/facebook/av;
    //   58: ldc 99
    //   60: ldc 101
    //   62: invokestatic 106	com/facebook/b/ag:a	(Lcom/facebook/av;Ljava/lang/String;Ljava/lang/String;)V
    //   65: aload_2
    //   66: invokestatic 111	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   69: aload 4
    //   71: monitorexit
    //   72: return
    //   73: astore_3
    //   74: aconst_null
    //   75: astore_2
    //   76: aload_2
    //   77: astore_0
    //   78: invokestatic 115	com/facebook/a/a:f	()Ljava/lang/String;
    //   81: new 117	java/lang/StringBuilder
    //   84: dup
    //   85: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   88: ldc 120
    //   90: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: aload_3
    //   94: invokevirtual 127	java/lang/Exception:toString	()Ljava/lang/String;
    //   97: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokestatic 133	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   106: pop
    //   107: aload_2
    //   108: invokestatic 111	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   111: goto -42 -> 69
    //   114: astore_0
    //   115: aload 4
    //   117: monitorexit
    //   118: aload_0
    //   119: athrow
    //   120: astore_2
    //   121: aconst_null
    //   122: astore_0
    //   123: aload_0
    //   124: invokestatic 111	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   127: aload_2
    //   128: athrow
    //   129: astore_2
    //   130: goto -7 -> 123
    //   133: astore_3
    //   134: goto -58 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	paramContext	Context
    //   11	2	1	bool	boolean
    //   37	71	2	localObjectOutputStream	java.io.ObjectOutputStream
    //   120	8	2	localObject1	Object
    //   129	1	2	localObject2	Object
    //   73	21	3	localException1	Exception
    //   133	1	3	localException2	Exception
    //   3	113	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   16	38	73	java/lang/Exception
    //   8	12	114	finally
    //   65	69	114	finally
    //   69	72	114	finally
    //   107	111	114	finally
    //   115	118	114	finally
    //   123	129	114	finally
    //   16	38	120	finally
    //   40	47	129	finally
    //   49	53	129	finally
    //   55	65	129	finally
    //   78	107	129	finally
    //   40	47	133	java/lang/Exception
    //   49	53	133	java/lang/Exception
    //   55	65	133	java/lang/Exception
  }
  
  static void a(Context paramContext, h paramh, a parama, long paramLong, String paramString)
  {
    synchronized (a)
    {
      a(paramContext, paramh).a(parama, paramLong, paramString);
      a();
      return;
    }
  }
  
  /* Error */
  private static void b(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 21	com/facebook/a/n:a	Ljava/lang/Object;
    //   5: astore 5
    //   7: aload 5
    //   9: monitorenter
    //   10: getstatic 25	com/facebook/a/n:c	Z
    //   13: istore_1
    //   14: iload_1
    //   15: ifne +76 -> 91
    //   18: new 145	java/io/ObjectInputStream
    //   21: dup
    //   22: aload_0
    //   23: ldc 78
    //   25: invokevirtual 149	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   28: invokespecial 152	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   31: astore_2
    //   32: aload_2
    //   33: astore_3
    //   34: aload_2
    //   35: invokevirtual 156	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   38: checkcast 158	java/util/HashMap
    //   41: putstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   44: aload_2
    //   45: astore_3
    //   46: getstatic 97	com/facebook/av:e	Lcom/facebook/av;
    //   49: ldc 99
    //   51: ldc -96
    //   53: invokestatic 106	com/facebook/b/ag:a	(Lcom/facebook/av;Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload_2
    //   57: invokestatic 111	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   60: aload_0
    //   61: ldc 78
    //   63: invokevirtual 164	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   66: pop
    //   67: getstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   70: ifnonnull +13 -> 83
    //   73: new 158	java/util/HashMap
    //   76: dup
    //   77: invokespecial 165	java/util/HashMap:<init>	()V
    //   80: putstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   83: iconst_1
    //   84: putstatic 25	com/facebook/a/n:c	Z
    //   87: iconst_0
    //   88: putstatic 23	com/facebook/a/n:b	Z
    //   91: aload 5
    //   93: monitorexit
    //   94: return
    //   95: aload_2
    //   96: invokestatic 111	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   99: aload_0
    //   100: ldc 78
    //   102: invokevirtual 164	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   105: pop
    //   106: getstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   109: ifnonnull +13 -> 122
    //   112: new 158	java/util/HashMap
    //   115: dup
    //   116: invokespecial 165	java/util/HashMap:<init>	()V
    //   119: putstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   122: iconst_1
    //   123: putstatic 25	com/facebook/a/n:c	Z
    //   126: iconst_0
    //   127: putstatic 23	com/facebook/a/n:b	Z
    //   130: goto -39 -> 91
    //   133: astore_0
    //   134: aload 5
    //   136: monitorexit
    //   137: aload_0
    //   138: athrow
    //   139: astore 4
    //   141: aconst_null
    //   142: astore_2
    //   143: aload_2
    //   144: astore_3
    //   145: invokestatic 115	com/facebook/a/a:f	()Ljava/lang/String;
    //   148: new 117	java/lang/StringBuilder
    //   151: dup
    //   152: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   155: ldc 120
    //   157: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: aload 4
    //   162: invokevirtual 127	java/lang/Exception:toString	()Ljava/lang/String;
    //   165: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 133	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   174: pop
    //   175: aload_2
    //   176: invokestatic 111	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   179: aload_0
    //   180: ldc 78
    //   182: invokevirtual 164	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   185: pop
    //   186: getstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   189: ifnonnull +13 -> 202
    //   192: new 158	java/util/HashMap
    //   195: dup
    //   196: invokespecial 165	java/util/HashMap:<init>	()V
    //   199: putstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   202: iconst_1
    //   203: putstatic 25	com/facebook/a/n:c	Z
    //   206: iconst_0
    //   207: putstatic 23	com/facebook/a/n:b	Z
    //   210: goto -119 -> 91
    //   213: aload_3
    //   214: invokestatic 111	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   217: aload_0
    //   218: ldc 78
    //   220: invokevirtual 164	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   223: pop
    //   224: getstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   227: ifnonnull +13 -> 240
    //   230: new 158	java/util/HashMap
    //   233: dup
    //   234: invokespecial 165	java/util/HashMap:<init>	()V
    //   237: putstatic 37	com/facebook/a/n:d	Ljava/util/Map;
    //   240: iconst_1
    //   241: putstatic 25	com/facebook/a/n:c	Z
    //   244: iconst_0
    //   245: putstatic 23	com/facebook/a/n:b	Z
    //   248: aload_2
    //   249: athrow
    //   250: astore_2
    //   251: goto -38 -> 213
    //   254: astore 4
    //   256: goto -113 -> 143
    //   259: astore_3
    //   260: goto -165 -> 95
    //   263: astore_2
    //   264: aload_3
    //   265: astore_2
    //   266: goto -171 -> 95
    //   269: astore_2
    //   270: aconst_null
    //   271: astore_3
    //   272: goto -59 -> 213
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	paramContext	Context
    //   13	2	1	bool	boolean
    //   31	218	2	localObjectInputStream	java.io.ObjectInputStream
    //   250	1	2	localObject1	Object
    //   263	1	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   265	1	2	localFileNotFoundException2	java.io.FileNotFoundException
    //   269	1	2	localObject2	Object
    //   1	213	3	localObject3	Object
    //   259	6	3	localFileNotFoundException3	java.io.FileNotFoundException
    //   271	1	3	localObject4	Object
    //   139	22	4	localException1	Exception
    //   254	1	4	localException2	Exception
    //   5	130	5	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   10	14	133	finally
    //   56	83	133	finally
    //   83	91	133	finally
    //   91	94	133	finally
    //   95	122	133	finally
    //   122	130	133	finally
    //   134	137	133	finally
    //   175	202	133	finally
    //   202	210	133	finally
    //   213	240	133	finally
    //   240	250	133	finally
    //   18	32	139	java/lang/Exception
    //   34	44	250	finally
    //   46	56	250	finally
    //   145	175	250	finally
    //   34	44	254	java/lang/Exception
    //   46	56	254	java/lang/Exception
    //   34	44	259	java/io/FileNotFoundException
    //   46	56	259	java/io/FileNotFoundException
    //   18	32	263	java/io/FileNotFoundException
    //   18	32	269	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */