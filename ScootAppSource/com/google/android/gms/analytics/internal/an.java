package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.analytics.ad;
import com.google.android.gms.common.internal.b;

public final class an
  implements ServiceConnection
{
  private volatile e b;
  private volatile boolean c;
  
  protected an(al paramal) {}
  
  /* Error */
  public e a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   4: invokevirtual 28	com/google/android/gms/analytics/internal/al:m	()V
    //   7: new 30	android/content/Intent
    //   10: dup
    //   11: ldc 32
    //   13: invokespecial 35	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: new 37	android/content/ComponentName
    //   21: dup
    //   22: ldc 39
    //   24: ldc 41
    //   26: invokespecial 44	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: invokevirtual 48	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   32: pop
    //   33: aload_0
    //   34: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   37: invokevirtual 52	com/google/android/gms/analytics/internal/al:o	()Landroid/content/Context;
    //   40: astore_3
    //   41: aload_2
    //   42: ldc 54
    //   44: aload_3
    //   45: invokevirtual 60	android/content/Context:getPackageName	()Ljava/lang/String;
    //   48: invokevirtual 64	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   51: pop
    //   52: invokestatic 69	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
    //   55: astore 4
    //   57: aload_0
    //   58: monitorenter
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 71	com/google/android/gms/analytics/internal/an:b	Lcom/google/android/gms/analytics/internal/e;
    //   64: aload_0
    //   65: iconst_1
    //   66: putfield 73	com/google/android/gms/analytics/internal/an:c	Z
    //   69: aload 4
    //   71: aload_3
    //   72: aload_2
    //   73: aload_0
    //   74: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   77: invokestatic 76	com/google/android/gms/analytics/internal/al:a	(Lcom/google/android/gms/analytics/internal/al;)Lcom/google/android/gms/analytics/internal/an;
    //   80: sipush 129
    //   83: invokevirtual 79	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   86: istore_1
    //   87: aload_0
    //   88: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   91: ldc 81
    //   93: iload_1
    //   94: invokestatic 87	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   97: invokevirtual 90	com/google/android/gms/analytics/internal/al:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   100: iload_1
    //   101: ifne +12 -> 113
    //   104: aload_0
    //   105: iconst_0
    //   106: putfield 73	com/google/android/gms/analytics/internal/an:c	Z
    //   109: aload_0
    //   110: monitorexit
    //   111: aconst_null
    //   112: areturn
    //   113: aload_0
    //   114: aload_0
    //   115: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   118: invokevirtual 94	com/google/android/gms/analytics/internal/al:q	()Lcom/google/android/gms/analytics/internal/bh;
    //   121: invokevirtual 100	com/google/android/gms/analytics/internal/bh:w	()J
    //   124: invokevirtual 104	java/lang/Object:wait	(J)V
    //   127: aload_0
    //   128: iconst_0
    //   129: putfield 73	com/google/android/gms/analytics/internal/an:c	Z
    //   132: aload_0
    //   133: getfield 71	com/google/android/gms/analytics/internal/an:b	Lcom/google/android/gms/analytics/internal/e;
    //   136: astore_2
    //   137: aload_0
    //   138: aconst_null
    //   139: putfield 71	com/google/android/gms/analytics/internal/an:b	Lcom/google/android/gms/analytics/internal/e;
    //   142: aload_2
    //   143: ifnonnull +12 -> 155
    //   146: aload_0
    //   147: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   150: ldc 106
    //   152: invokevirtual 109	com/google/android/gms/analytics/internal/al:f	(Ljava/lang/String;)V
    //   155: aload_0
    //   156: monitorexit
    //   157: aload_2
    //   158: areturn
    //   159: astore_2
    //   160: aload_0
    //   161: monitorexit
    //   162: aload_2
    //   163: athrow
    //   164: astore_2
    //   165: aload_0
    //   166: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   169: ldc 111
    //   171: invokevirtual 114	com/google/android/gms/analytics/internal/al:e	(Ljava/lang/String;)V
    //   174: goto -47 -> 127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	an
    //   86	15	1	bool	boolean
    //   16	142	2	localObject1	Object
    //   159	4	2	localObject2	Object
    //   164	1	2	localInterruptedException	InterruptedException
    //   40	32	3	localContext	android.content.Context
    //   55	15	4	localb	com.google.android.gms.common.stats.b
    // Exception table:
    //   from	to	target	type
    //   59	100	159	finally
    //   104	111	159	finally
    //   113	127	159	finally
    //   127	142	159	finally
    //   146	155	159	finally
    //   155	157	159	finally
    //   160	162	159	finally
    //   165	174	159	finally
    //   113	127	164	java/lang/InterruptedException
  }
  
  /* Error */
  public void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: ldc 122
    //   2: invokestatic 126	com/google/android/gms/common/internal/b:b	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_2
    //   8: ifnonnull +19 -> 27
    //   11: aload_0
    //   12: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   15: ldc -128
    //   17: invokevirtual 109	com/google/android/gms/analytics/internal/al:f	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: invokevirtual 131	java/lang/Object:notifyAll	()V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aconst_null
    //   28: astore 4
    //   30: aconst_null
    //   31: astore_3
    //   32: aload 4
    //   34: astore_1
    //   35: aload_2
    //   36: invokeinterface 136 1 0
    //   41: astore 5
    //   43: aload 4
    //   45: astore_1
    //   46: ldc -118
    //   48: aload 5
    //   50: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   53: ifeq +60 -> 113
    //   56: aload 4
    //   58: astore_1
    //   59: aload_2
    //   60: invokestatic 149	com/google/android/gms/analytics/internal/f:a	(Landroid/os/IBinder;)Lcom/google/android/gms/analytics/internal/e;
    //   63: astore_2
    //   64: aload_2
    //   65: astore_1
    //   66: aload_0
    //   67: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   70: ldc -105
    //   72: invokevirtual 152	com/google/android/gms/analytics/internal/al:b	(Ljava/lang/String;)V
    //   75: aload_2
    //   76: astore_1
    //   77: aload_1
    //   78: ifnonnull +74 -> 152
    //   81: invokestatic 69	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
    //   84: aload_0
    //   85: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   88: invokevirtual 52	com/google/android/gms/analytics/internal/al:o	()Landroid/content/Context;
    //   91: aload_0
    //   92: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   95: invokestatic 76	com/google/android/gms/analytics/internal/al:a	(Lcom/google/android/gms/analytics/internal/al;)Lcom/google/android/gms/analytics/internal/an;
    //   98: invokevirtual 155	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   101: aload_0
    //   102: invokevirtual 131	java/lang/Object:notifyAll	()V
    //   105: aload_0
    //   106: monitorexit
    //   107: return
    //   108: astore_1
    //   109: aload_0
    //   110: monitorexit
    //   111: aload_1
    //   112: athrow
    //   113: aload 4
    //   115: astore_1
    //   116: aload_0
    //   117: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   120: ldc -99
    //   122: aload 5
    //   124: invokevirtual 159	com/google/android/gms/analytics/internal/al:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   127: aload_3
    //   128: astore_1
    //   129: goto -52 -> 77
    //   132: astore_2
    //   133: aload_0
    //   134: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   137: ldc -95
    //   139: invokevirtual 109	com/google/android/gms/analytics/internal/al:f	(Ljava/lang/String;)V
    //   142: goto -65 -> 77
    //   145: astore_1
    //   146: aload_0
    //   147: invokevirtual 131	java/lang/Object:notifyAll	()V
    //   150: aload_1
    //   151: athrow
    //   152: aload_0
    //   153: getfield 73	com/google/android/gms/analytics/internal/an:c	Z
    //   156: ifne +34 -> 190
    //   159: aload_0
    //   160: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   163: ldc -93
    //   165: invokevirtual 114	com/google/android/gms/analytics/internal/al:e	(Ljava/lang/String;)V
    //   168: aload_0
    //   169: getfield 16	com/google/android/gms/analytics/internal/an:a	Lcom/google/android/gms/analytics/internal/al;
    //   172: invokevirtual 167	com/google/android/gms/analytics/internal/al:r	()Lcom/google/android/gms/analytics/ad;
    //   175: new 169	com/google/android/gms/analytics/internal/ao
    //   178: dup
    //   179: aload_0
    //   180: aload_1
    //   181: invokespecial 172	com/google/android/gms/analytics/internal/ao:<init>	(Lcom/google/android/gms/analytics/internal/an;Lcom/google/android/gms/analytics/internal/e;)V
    //   184: invokevirtual 177	com/google/android/gms/analytics/ad:a	(Ljava/lang/Runnable;)V
    //   187: goto -86 -> 101
    //   190: aload_0
    //   191: aload_1
    //   192: putfield 71	com/google/android/gms/analytics/internal/an:b	Lcom/google/android/gms/analytics/internal/e;
    //   195: goto -94 -> 101
    //   198: astore_1
    //   199: goto -98 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	an
    //   0	202	1	paramComponentName	ComponentName
    //   0	202	2	paramIBinder	android.os.IBinder
    //   31	97	3	localObject1	Object
    //   28	86	4	localObject2	Object
    //   41	82	5	str	String
    // Exception table:
    //   from	to	target	type
    //   20	26	108	finally
    //   101	107	108	finally
    //   109	111	108	finally
    //   146	152	108	finally
    //   35	43	132	android/os/RemoteException
    //   46	56	132	android/os/RemoteException
    //   59	64	132	android/os/RemoteException
    //   66	75	132	android/os/RemoteException
    //   116	127	132	android/os/RemoteException
    //   11	20	145	finally
    //   35	43	145	finally
    //   46	56	145	finally
    //   59	64	145	finally
    //   66	75	145	finally
    //   81	101	145	finally
    //   116	127	145	finally
    //   133	142	145	finally
    //   152	187	145	finally
    //   190	195	145	finally
    //   81	101	198	java/lang/IllegalArgumentException
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    b.b("AnalyticsServiceConnection.onServiceDisconnected");
    this.a.r().a(new ap(this, paramComponentName));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */