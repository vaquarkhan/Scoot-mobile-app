package b.a.a.a.a.b;

import android.content.Context;

final class f
  implements j
{
  private final Context a;
  
  public f(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  /* Error */
  public b a()
  {
    // Byte code:
    //   0: invokestatic 35	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   3: invokestatic 38	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   6: if_acmpne +17 -> 23
    //   9: invokestatic 44	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   12: ldc 46
    //   14: ldc 48
    //   16: invokeinterface 53 3 0
    //   21: aconst_null
    //   22: areturn
    //   23: aload_0
    //   24: getfield 21	b/a/a/a/a/b/f:a	Landroid/content/Context;
    //   27: invokevirtual 57	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   30: ldc 59
    //   32: iconst_0
    //   33: invokevirtual 65	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   36: pop
    //   37: new 67	b/a/a/a/a/b/h
    //   40: dup
    //   41: aconst_null
    //   42: invokespecial 70	b/a/a/a/a/b/h:<init>	(Lb/a/a/a/a/b/g;)V
    //   45: astore_2
    //   46: new 72	android/content/Intent
    //   49: dup
    //   50: ldc 74
    //   52: invokespecial 77	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   55: astore_3
    //   56: aload_3
    //   57: ldc 79
    //   59: invokevirtual 83	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   62: pop
    //   63: aload_0
    //   64: getfield 21	b/a/a/a/a/b/f:a	Landroid/content/Context;
    //   67: aload_3
    //   68: aload_2
    //   69: iconst_1
    //   70: invokevirtual 87	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   73: istore_1
    //   74: iload_1
    //   75: ifeq +123 -> 198
    //   78: new 89	b/a/a/a/a/b/i
    //   81: dup
    //   82: aload_2
    //   83: invokevirtual 92	b/a/a/a/a/b/h:a	()Landroid/os/IBinder;
    //   86: invokespecial 95	b/a/a/a/a/b/i:<init>	(Landroid/os/IBinder;)V
    //   89: astore_3
    //   90: new 97	b/a/a/a/a/b/b
    //   93: dup
    //   94: aload_3
    //   95: invokevirtual 100	b/a/a/a/a/b/i:a	()Ljava/lang/String;
    //   98: aload_3
    //   99: invokevirtual 104	b/a/a/a/a/b/i:b	()Z
    //   102: invokespecial 107	b/a/a/a/a/b/b:<init>	(Ljava/lang/String;Z)V
    //   105: astore_3
    //   106: aload_0
    //   107: getfield 21	b/a/a/a/a/b/f:a	Landroid/content/Context;
    //   110: aload_2
    //   111: invokevirtual 111	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   114: aload_3
    //   115: areturn
    //   116: astore_2
    //   117: invokestatic 44	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   120: ldc 46
    //   122: ldc 113
    //   124: invokeinterface 53 3 0
    //   129: aconst_null
    //   130: areturn
    //   131: astore_2
    //   132: invokestatic 44	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   135: ldc 46
    //   137: ldc 115
    //   139: aload_2
    //   140: invokeinterface 118 4 0
    //   145: aconst_null
    //   146: areturn
    //   147: astore_3
    //   148: invokestatic 44	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   151: ldc 46
    //   153: ldc 120
    //   155: aload_3
    //   156: invokeinterface 123 4 0
    //   161: aload_0
    //   162: getfield 21	b/a/a/a/a/b/f:a	Landroid/content/Context;
    //   165: aload_2
    //   166: invokevirtual 111	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   169: aconst_null
    //   170: areturn
    //   171: astore_2
    //   172: invokestatic 44	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   175: ldc 46
    //   177: ldc 125
    //   179: aload_2
    //   180: invokeinterface 118 4 0
    //   185: aconst_null
    //   186: areturn
    //   187: astore_3
    //   188: aload_0
    //   189: getfield 21	b/a/a/a/a/b/f:a	Landroid/content/Context;
    //   192: aload_2
    //   193: invokevirtual 111	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   196: aload_3
    //   197: athrow
    //   198: invokestatic 44	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   201: ldc 46
    //   203: ldc 125
    //   205: invokeinterface 53 3 0
    //   210: aconst_null
    //   211: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	f
    //   73	2	1	bool	boolean
    //   45	66	2	localh	h
    //   116	1	2	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   131	35	2	localException1	Exception
    //   171	22	2	localThrowable	Throwable
    //   55	60	3	localObject1	Object
    //   147	9	3	localException2	Exception
    //   187	10	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   23	37	116	android/content/pm/PackageManager$NameNotFoundException
    //   23	37	131	java/lang/Exception
    //   78	106	147	java/lang/Exception
    //   63	74	171	java/lang/Throwable
    //   106	114	171	java/lang/Throwable
    //   161	169	171	java/lang/Throwable
    //   188	198	171	java/lang/Throwable
    //   198	210	171	java/lang/Throwable
    //   78	106	187	finally
    //   148	161	187	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */