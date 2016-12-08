package com.b.a;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import java.util.concurrent.BlockingQueue;

public final class l
  extends Thread
{
  private final BlockingQueue<r<?>> a;
  private final k b;
  private final b c;
  private final z d;
  private volatile boolean e = false;
  
  public l(BlockingQueue<r<?>> paramBlockingQueue, k paramk, b paramb, z paramz)
  {
    this.a = paramBlockingQueue;
    this.b = paramk;
    this.c = paramb;
    this.d = paramz;
  }
  
  @TargetApi(14)
  private void a(r<?> paramr)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      TrafficStats.setThreadStatsTag(paramr.b());
    }
  }
  
  private void a(r<?> paramr, ad paramad)
  {
    paramad = paramr.a(paramad);
    this.d.a(paramr, paramad);
  }
  
  public void a()
  {
    this.e = true;
    interrupt();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 80	android/os/Process:setThreadPriority	(I)V
    //   5: invokestatic 86	android/os/SystemClock:elapsedRealtime	()J
    //   8: lstore_1
    //   9: aload_0
    //   10: getfield 24	com/b/a/l:a	Ljava/util/concurrent/BlockingQueue;
    //   13: invokeinterface 92 1 0
    //   18: checkcast 45	com/b/a/r
    //   21: astore_3
    //   22: aload_3
    //   23: ldc 94
    //   25: invokevirtual 97	com/b/a/r:a	(Ljava/lang/String;)V
    //   28: aload_3
    //   29: invokevirtual 101	com/b/a/r:h	()Z
    //   32: ifeq +43 -> 75
    //   35: aload_3
    //   36: ldc 103
    //   38: invokevirtual 105	com/b/a/r:b	(Ljava/lang/String;)V
    //   41: goto -36 -> 5
    //   44: astore 4
    //   46: aload 4
    //   48: invokestatic 86	android/os/SystemClock:elapsedRealtime	()J
    //   51: lload_1
    //   52: lsub
    //   53: invokevirtual 108	com/b/a/ad:a	(J)V
    //   56: aload_0
    //   57: aload_3
    //   58: aload 4
    //   60: invokespecial 109	com/b/a/l:a	(Lcom/b/a/r;Lcom/b/a/ad;)V
    //   63: goto -58 -> 5
    //   66: astore_3
    //   67: aload_0
    //   68: getfield 22	com/b/a/l:e	Z
    //   71: ifeq -66 -> 5
    //   74: return
    //   75: aload_0
    //   76: aload_3
    //   77: invokespecial 111	com/b/a/l:a	(Lcom/b/a/r;)V
    //   80: aload_0
    //   81: getfield 26	com/b/a/l:b	Lcom/b/a/k;
    //   84: aload_3
    //   85: invokeinterface 116 2 0
    //   90: astore 4
    //   92: aload_3
    //   93: ldc 118
    //   95: invokevirtual 97	com/b/a/r:a	(Ljava/lang/String;)V
    //   98: aload 4
    //   100: getfield 122	com/b/a/n:d	Z
    //   103: ifeq +76 -> 179
    //   106: aload_3
    //   107: invokevirtual 125	com/b/a/r:w	()Z
    //   110: ifeq +69 -> 179
    //   113: aload_3
    //   114: ldc 127
    //   116: invokevirtual 105	com/b/a/r:b	(Ljava/lang/String;)V
    //   119: goto -114 -> 5
    //   122: astore 4
    //   124: aload 4
    //   126: ldc -127
    //   128: iconst_1
    //   129: anewarray 131	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload 4
    //   136: invokevirtual 135	java/lang/Exception:toString	()Ljava/lang/String;
    //   139: aastore
    //   140: invokestatic 140	com/b/a/ae:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: new 73	com/b/a/ad
    //   146: dup
    //   147: aload 4
    //   149: invokespecial 143	com/b/a/ad:<init>	(Ljava/lang/Throwable;)V
    //   152: astore 4
    //   154: aload 4
    //   156: invokestatic 86	android/os/SystemClock:elapsedRealtime	()J
    //   159: lload_1
    //   160: lsub
    //   161: invokevirtual 108	com/b/a/ad:a	(J)V
    //   164: aload_0
    //   165: getfield 30	com/b/a/l:d	Lcom/b/a/z;
    //   168: aload_3
    //   169: aload 4
    //   171: invokeinterface 64 3 0
    //   176: goto -171 -> 5
    //   179: aload_3
    //   180: aload 4
    //   182: invokevirtual 146	com/b/a/r:a	(Lcom/b/a/n;)Lcom/b/a/w;
    //   185: astore 4
    //   187: aload_3
    //   188: ldc -108
    //   190: invokevirtual 97	com/b/a/r:a	(Ljava/lang/String;)V
    //   193: aload_3
    //   194: invokevirtual 151	com/b/a/r:r	()Z
    //   197: ifeq +35 -> 232
    //   200: aload 4
    //   202: getfield 156	com/b/a/w:b	Lcom/b/a/c;
    //   205: ifnull +27 -> 232
    //   208: aload_0
    //   209: getfield 28	com/b/a/l:c	Lcom/b/a/b;
    //   212: aload_3
    //   213: invokevirtual 159	com/b/a/r:f	()Ljava/lang/String;
    //   216: aload 4
    //   218: getfield 156	com/b/a/w:b	Lcom/b/a/c;
    //   221: invokeinterface 164 3 0
    //   226: aload_3
    //   227: ldc -90
    //   229: invokevirtual 97	com/b/a/r:a	(Ljava/lang/String;)V
    //   232: aload_3
    //   233: invokevirtual 169	com/b/a/r:v	()V
    //   236: aload_0
    //   237: getfield 30	com/b/a/l:d	Lcom/b/a/z;
    //   240: aload_3
    //   241: aload 4
    //   243: invokeinterface 172 3 0
    //   248: goto -243 -> 5
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	this	l
    //   8	152	1	l	long
    //   21	37	3	localr	r
    //   66	175	3	localInterruptedException	InterruptedException
    //   44	15	4	localad	ad
    //   90	9	4	localn	n
    //   122	26	4	localException	Exception
    //   152	90	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   22	41	44	com/b/a/ad
    //   75	119	44	com/b/a/ad
    //   179	232	44	com/b/a/ad
    //   232	248	44	com/b/a/ad
    //   9	22	66	java/lang/InterruptedException
    //   22	41	122	java/lang/Exception
    //   75	119	122	java/lang/Exception
    //   179	232	122	java/lang/Exception
    //   232	248	122	java/lang/Exception
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */