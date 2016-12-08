package b.a.a.a.a.g;

import b.a.a.a.f;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class q
{
  private final AtomicReference<w> a = new AtomicReference();
  private final CountDownLatch b = new CountDownLatch(1);
  private v c;
  private boolean d = false;
  
  public static q a()
  {
    return s.a();
  }
  
  private void a(w paramw)
  {
    this.a.set(paramw);
    this.b.countDown();
  }
  
  /* Error */
  public q a(b.a.a.a.q paramq, b.a.a.a.a.b.y paramy, b.a.a.a.a.e.n paramn, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	b/a/a/a/a/g/q:d	Z
    //   6: istore 7
    //   8: iload 7
    //   10: ifeq +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_0
    //   16: areturn
    //   17: aload_0
    //   18: getfield 50	b/a/a/a/a/g/q:c	Lb/a/a/a/a/g/v;
    //   21: ifnonnull +180 -> 201
    //   24: aload_1
    //   25: invokevirtual 56	b/a/a/a/q:E	()Landroid/content/Context;
    //   28: astore 8
    //   30: aload_2
    //   31: invokevirtual 61	b/a/a/a/a/b/y:c	()Ljava/lang/String;
    //   34: astore 15
    //   36: new 63	b/a/a/a/a/b/k
    //   39: dup
    //   40: invokespecial 64	b/a/a/a/a/b/k:<init>	()V
    //   43: aload 8
    //   45: invokevirtual 67	b/a/a/a/a/b/k:a	(Landroid/content/Context;)Ljava/lang/String;
    //   48: astore 9
    //   50: aload_2
    //   51: invokevirtual 70	b/a/a/a/a/b/y:j	()Ljava/lang/String;
    //   54: astore 10
    //   56: new 72	b/a/a/a/a/b/ai
    //   59: dup
    //   60: invokespecial 73	b/a/a/a/a/b/ai:<init>	()V
    //   63: astore 11
    //   65: new 75	b/a/a/a/a/g/k
    //   68: dup
    //   69: invokespecial 76	b/a/a/a/a/g/k:<init>	()V
    //   72: astore 12
    //   74: new 78	b/a/a/a/a/g/i
    //   77: dup
    //   78: aload_1
    //   79: invokespecial 81	b/a/a/a/a/g/i:<init>	(Lb/a/a/a/q;)V
    //   82: astore 13
    //   84: aload 8
    //   86: invokestatic 86	b/a/a/a/a/b/m:k	(Landroid/content/Context;)Ljava/lang/String;
    //   89: astore 14
    //   91: new 88	b/a/a/a/a/g/l
    //   94: dup
    //   95: aload_1
    //   96: aload 6
    //   98: getstatic 94	java/util/Locale:US	Ljava/util/Locale;
    //   101: ldc 96
    //   103: iconst_1
    //   104: anewarray 4	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: aload 15
    //   111: aastore
    //   112: invokestatic 102	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   115: aload_3
    //   116: invokespecial 105	b/a/a/a/a/g/l:<init>	(Lb/a/a/a/q;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/n;)V
    //   119: astore_3
    //   120: aload_0
    //   121: new 107	b/a/a/a/a/g/j
    //   124: dup
    //   125: aload_1
    //   126: new 109	b/a/a/a/a/g/z
    //   129: dup
    //   130: aload 9
    //   132: aload_2
    //   133: invokevirtual 112	b/a/a/a/a/b/y:g	()Ljava/lang/String;
    //   136: aload_2
    //   137: invokevirtual 115	b/a/a/a/a/b/y:f	()Ljava/lang/String;
    //   140: aload_2
    //   141: invokevirtual 118	b/a/a/a/a/b/y:e	()Ljava/lang/String;
    //   144: aload_2
    //   145: invokevirtual 121	b/a/a/a/a/b/y:m	()Ljava/lang/String;
    //   148: aload_2
    //   149: invokevirtual 123	b/a/a/a/a/b/y:b	()Ljava/lang/String;
    //   152: aload_2
    //   153: invokevirtual 126	b/a/a/a/a/b/y:n	()Ljava/lang/String;
    //   156: iconst_1
    //   157: anewarray 98	java/lang/String
    //   160: dup
    //   161: iconst_0
    //   162: aload 8
    //   164: invokestatic 128	b/a/a/a/a/b/m:m	(Landroid/content/Context;)Ljava/lang/String;
    //   167: aastore
    //   168: invokestatic 131	b/a/a/a/a/b/m:a	([Ljava/lang/String;)Ljava/lang/String;
    //   171: aload 5
    //   173: aload 4
    //   175: aload 10
    //   177: invokestatic 136	b/a/a/a/a/b/s:a	(Ljava/lang/String;)Lb/a/a/a/a/b/s;
    //   180: invokevirtual 139	b/a/a/a/a/b/s:a	()I
    //   183: aload 14
    //   185: invokespecial 142	b/a/a/a/a/g/z:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    //   188: aload 11
    //   190: aload 12
    //   192: aload 13
    //   194: aload_3
    //   195: invokespecial 145	b/a/a/a/a/g/j:<init>	(Lb/a/a/a/q;Lb/a/a/a/a/g/z;Lb/a/a/a/a/b/r;Lb/a/a/a/a/g/y;Lb/a/a/a/a/g/g;Lb/a/a/a/a/g/aa;)V
    //   198: putfield 50	b/a/a/a/a/g/q:c	Lb/a/a/a/a/g/v;
    //   201: aload_0
    //   202: iconst_1
    //   203: putfield 31	b/a/a/a/a/g/q:d	Z
    //   206: goto -193 -> 13
    //   209: astore_1
    //   210: aload_0
    //   211: monitorexit
    //   212: aload_1
    //   213: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	this	q
    //   0	214	1	paramq	b.a.a.a.q
    //   0	214	2	paramy	b.a.a.a.a.b.y
    //   0	214	3	paramn	b.a.a.a.a.e.n
    //   0	214	4	paramString1	String
    //   0	214	5	paramString2	String
    //   0	214	6	paramString3	String
    //   6	3	7	bool	boolean
    //   28	135	8	localContext	android.content.Context
    //   48	83	9	str1	String
    //   54	122	10	str2	String
    //   63	126	11	localai	b.a.a.a.a.b.ai
    //   72	119	12	localk	k
    //   82	111	13	locali	i
    //   89	95	14	str3	String
    //   34	76	15	str4	String
    // Exception table:
    //   from	to	target	type
    //   2	8	209	finally
    //   17	201	209	finally
    //   201	206	209	finally
  }
  
  public <T> T a(t<T> paramt, T paramT)
  {
    w localw = (w)this.a.get();
    if (localw == null) {
      return paramT;
    }
    return (T)paramt.b(localw);
  }
  
  public w b()
  {
    try
    {
      this.b.await();
      w localw = (w)this.a.get();
      return localw;
    }
    catch (InterruptedException localInterruptedException)
    {
      f.h().e("Fabric", "Interrupted while waiting for settings data.");
    }
    return null;
  }
  
  /* Error */
  public boolean c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 50	b/a/a/a/a/g/q:c	Lb/a/a/a/a/g/v;
    //   6: invokeinterface 185 1 0
    //   11: astore_2
    //   12: aload_0
    //   13: aload_2
    //   14: invokespecial 187	b/a/a/a/a/g/q:a	(Lb/a/a/a/a/g/w;)V
    //   17: aload_2
    //   18: ifnull +9 -> 27
    //   21: iconst_1
    //   22: istore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: iload_1
    //   26: ireturn
    //   27: iconst_0
    //   28: istore_1
    //   29: goto -6 -> 23
    //   32: astore_2
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_2
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	q
    //   22	7	1	bool	boolean
    //   11	7	2	localw	w
    //   32	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	32	finally
  }
  
  /* Error */
  public boolean d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 50	b/a/a/a/a/g/q:c	Lb/a/a/a/a/g/v;
    //   6: getstatic 192	b/a/a/a/a/g/u:b	Lb/a/a/a/a/g/u;
    //   9: invokeinterface 195 2 0
    //   14: astore_2
    //   15: aload_0
    //   16: aload_2
    //   17: invokespecial 187	b/a/a/a/a/g/q:a	(Lb/a/a/a/a/g/w;)V
    //   20: aload_2
    //   21: ifnonnull +16 -> 37
    //   24: invokestatic 171	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   27: ldc -83
    //   29: ldc -59
    //   31: aconst_null
    //   32: invokeinterface 200 4 0
    //   37: aload_2
    //   38: ifnull +9 -> 47
    //   41: iconst_1
    //   42: istore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: iload_1
    //   46: ireturn
    //   47: iconst_0
    //   48: istore_1
    //   49: goto -6 -> 43
    //   52: astore_2
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_2
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	q
    //   42	7	1	bool	boolean
    //   14	24	2	localw	w
    //   52	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	52	finally
    //   24	37	52	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\g\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */