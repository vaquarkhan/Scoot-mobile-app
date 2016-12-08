package com.mixpanel.android.a;

import android.annotation.SuppressLint;
import com.mixpanel.android.a.b.h;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@SuppressLint({"Assert"})
public class e
  implements a
{
  public static int a;
  public static boolean b;
  public static final List<com.mixpanel.android.a.b.a> c;
  public SelectionKey d;
  public ByteChannel e;
  public final BlockingQueue<ByteBuffer> f;
  public final BlockingQueue<ByteBuffer> g;
  private volatile boolean i = false;
  private int j = b.a;
  private final f k;
  private List<com.mixpanel.android.a.b.a> l;
  private com.mixpanel.android.a.b.a m = null;
  private int n;
  private com.mixpanel.android.a.d.e o = null;
  private ByteBuffer p = ByteBuffer.allocate(0);
  private com.mixpanel.android.a.e.a q = null;
  private String r = null;
  private Integer s = null;
  private Boolean t = null;
  private String u = null;
  
  static
  {
    if (!e.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      h = bool;
      a = 16384;
      b = false;
      c = new ArrayList(4);
      c.add(new com.mixpanel.android.a.b.f());
      c.add(new com.mixpanel.android.a.b.d());
      c.add(new h());
      c.add(new com.mixpanel.android.a.b.g());
      return;
    }
  }
  
  public e(f paramf, com.mixpanel.android.a.b.a parama)
  {
    if ((paramf == null) || ((parama == null) && (this.n == c.b))) {
      throw new IllegalArgumentException("parameters must not be null");
    }
    this.f = new LinkedBlockingQueue();
    this.g = new LinkedBlockingQueue();
    this.k = paramf;
    this.n = c.a;
    if (parama != null) {
      this.m = parama.c();
    }
  }
  
  private void a(com.mixpanel.android.a.e.f paramf)
  {
    if (b) {
      System.out.println("open using draft: " + this.m.getClass().getSimpleName());
    }
    this.j = b.c;
    try
    {
      this.k.a(this, paramf);
      return;
    }
    catch (RuntimeException paramf)
    {
      this.k.a(this, paramf);
    }
  }
  
  private void a(Collection<com.mixpanel.android.a.d.d> paramCollection)
  {
    if (!c()) {
      throw new com.mixpanel.android.a.c.g();
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      a((com.mixpanel.android.a.d.d)paramCollection.next());
    }
  }
  
  private void a(List<ByteBuffer> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      e((ByteBuffer)paramList.next());
    }
  }
  
  /* Error */
  private boolean b(ByteBuffer paramByteBuffer)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   4: invokevirtual 236	java/nio/ByteBuffer:capacity	()I
    //   7: ifne +70 -> 77
    //   10: aload_1
    //   11: astore 4
    //   13: aload 4
    //   15: invokevirtual 240	java/nio/ByteBuffer:mark	()Ljava/nio/Buffer;
    //   18: pop
    //   19: aload_0
    //   20: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   23: ifnonnull +207 -> 230
    //   26: aload_0
    //   27: aload 4
    //   29: invokespecial 243	com/mixpanel/android/a/e:d	(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/a/b/c;
    //   32: astore 5
    //   34: getstatic 248	com/mixpanel/android/a/b/c:a	Lcom/mixpanel/android/a/b/c;
    //   37: astore 6
    //   39: aload 5
    //   41: aload 6
    //   43: if_acmpne +187 -> 230
    //   46: aload_0
    //   47: aload_0
    //   48: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   51: aload_0
    //   52: invokeinterface 251 2 0
    //   57: invokestatic 256	com/mixpanel/android/a/f/c:a	(Ljava/lang/String;)[B
    //   60: invokestatic 260	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   63: invokespecial 224	com/mixpanel/android/a/e:e	(Ljava/nio/ByteBuffer;)V
    //   66: aload_0
    //   67: bipush -3
    //   69: ldc_w 262
    //   72: invokevirtual 265	com/mixpanel/android/a/e:a	(ILjava/lang/String;)V
    //   75: iconst_0
    //   76: ireturn
    //   77: aload_0
    //   78: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   81: invokevirtual 268	java/nio/ByteBuffer:remaining	()I
    //   84: aload_1
    //   85: invokevirtual 268	java/nio/ByteBuffer:remaining	()I
    //   88: if_icmpge +44 -> 132
    //   91: aload_0
    //   92: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   95: invokevirtual 236	java/nio/ByteBuffer:capacity	()I
    //   98: aload_1
    //   99: invokevirtual 268	java/nio/ByteBuffer:remaining	()I
    //   102: iadd
    //   103: invokestatic 107	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   106: astore 4
    //   108: aload_0
    //   109: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   112: invokevirtual 271	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   115: pop
    //   116: aload 4
    //   118: aload_0
    //   119: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   122: invokevirtual 275	java/nio/ByteBuffer:put	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   125: pop
    //   126: aload_0
    //   127: aload 4
    //   129: putfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   132: aload_0
    //   133: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   136: aload_1
    //   137: invokevirtual 275	java/nio/ByteBuffer:put	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   140: pop
    //   141: aload_0
    //   142: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   145: invokevirtual 271	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   148: pop
    //   149: aload_0
    //   150: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   153: astore 4
    //   155: goto -142 -> 13
    //   158: astore 5
    //   160: aload_0
    //   161: sipush 1006
    //   164: ldc_w 277
    //   167: iconst_1
    //   168: invokespecial 280	com/mixpanel/android/a/e:c	(ILjava/lang/String;Z)V
    //   171: goto -96 -> 75
    //   174: astore 5
    //   176: aload_0
    //   177: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   180: invokevirtual 236	java/nio/ByteBuffer:capacity	()I
    //   183: ifne +606 -> 789
    //   186: aload 4
    //   188: invokevirtual 283	java/nio/ByteBuffer:reset	()Ljava/nio/Buffer;
    //   191: pop
    //   192: aload 5
    //   194: invokevirtual 285	com/mixpanel/android/a/c/a:a	()I
    //   197: istore_3
    //   198: iload_3
    //   199: ifne +559 -> 758
    //   202: aload 4
    //   204: invokevirtual 236	java/nio/ByteBuffer:capacity	()I
    //   207: bipush 16
    //   209: iadd
    //   210: istore_2
    //   211: aload_0
    //   212: iload_2
    //   213: invokestatic 107	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   216: putfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   219: aload_0
    //   220: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   223: aload_1
    //   224: invokevirtual 275	java/nio/ByteBuffer:put	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   227: pop
    //   228: iconst_0
    //   229: ireturn
    //   230: aload_0
    //   231: getfield 121	com/mixpanel/android/a/e:n	I
    //   234: getstatic 125	com/mixpanel/android/a/c:b	I
    //   237: if_icmpne +314 -> 551
    //   240: aload_0
    //   241: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   244: ifnonnull +233 -> 477
    //   247: aload_0
    //   248: getfield 287	com/mixpanel/android/a/e:l	Ljava/util/List;
    //   251: invokeinterface 221 1 0
    //   256: astore 5
    //   258: aload 5
    //   260: invokeinterface 208 1 0
    //   265: ifeq +192 -> 457
    //   268: aload 5
    //   270: invokeinterface 212 1 0
    //   275: checkcast 144	com/mixpanel/android/a/b/a
    //   278: invokevirtual 147	com/mixpanel/android/a/b/a:c	()Lcom/mixpanel/android/a/b/a;
    //   281: astore 6
    //   283: aload 6
    //   285: aload_0
    //   286: getfield 121	com/mixpanel/android/a/e:n	I
    //   289: invokevirtual 289	com/mixpanel/android/a/b/a:b	(I)V
    //   292: aload 4
    //   294: invokevirtual 283	java/nio/ByteBuffer:reset	()Ljava/nio/Buffer;
    //   297: pop
    //   298: aload 6
    //   300: aload 4
    //   302: invokevirtual 292	com/mixpanel/android/a/b/a:d	(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/a/e/f;
    //   305: astore 7
    //   307: aload 7
    //   309: instanceof 294
    //   312: ifne +16 -> 328
    //   315: aload_0
    //   316: sipush 1002
    //   319: ldc_w 296
    //   322: iconst_0
    //   323: invokevirtual 298	com/mixpanel/android/a/e:b	(ILjava/lang/String;Z)V
    //   326: iconst_0
    //   327: ireturn
    //   328: aload 7
    //   330: checkcast 294	com/mixpanel/android/a/e/a
    //   333: astore 7
    //   335: aload 6
    //   337: aload 7
    //   339: invokevirtual 301	com/mixpanel/android/a/b/a:a	(Lcom/mixpanel/android/a/e/a;)Lcom/mixpanel/android/a/b/c;
    //   342: getstatic 248	com/mixpanel/android/a/b/c:a	Lcom/mixpanel/android/a/b/c;
    //   345: if_acmpne -87 -> 258
    //   348: aload_0
    //   349: aload 7
    //   351: invokeinterface 303 1 0
    //   356: putfield 119	com/mixpanel/android/a/e:u	Ljava/lang/String;
    //   359: aload_0
    //   360: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   363: aload_0
    //   364: aload 6
    //   366: aload 7
    //   368: invokeinterface 306 4 0
    //   373: astore 8
    //   375: aload_0
    //   376: aload 6
    //   378: aload 6
    //   380: aload 7
    //   382: aload 8
    //   384: invokevirtual 309	com/mixpanel/android/a/b/a:a	(Lcom/mixpanel/android/a/e/a;Lcom/mixpanel/android/a/e/i;)Lcom/mixpanel/android/a/e/c;
    //   387: aload_0
    //   388: getfield 121	com/mixpanel/android/a/e:n	I
    //   391: invokevirtual 312	com/mixpanel/android/a/b/a:a	(Lcom/mixpanel/android/a/e/f;I)Ljava/util/List;
    //   394: invokespecial 314	com/mixpanel/android/a/e:a	(Ljava/util/List;)V
    //   397: aload_0
    //   398: aload 6
    //   400: putfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   403: aload_0
    //   404: aload 7
    //   406: invokespecial 316	com/mixpanel/android/a/e:a	(Lcom/mixpanel/android/a/e/f;)V
    //   409: iconst_1
    //   410: ireturn
    //   411: astore 6
    //   413: aload_0
    //   414: aload 6
    //   416: invokevirtual 317	com/mixpanel/android/a/c/b:a	()I
    //   419: aload 6
    //   421: invokevirtual 320	com/mixpanel/android/a/c/b:getMessage	()Ljava/lang/String;
    //   424: iconst_0
    //   425: invokevirtual 298	com/mixpanel/android/a/e:b	(ILjava/lang/String;Z)V
    //   428: iconst_0
    //   429: ireturn
    //   430: astore 6
    //   432: aload_0
    //   433: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   436: aload_0
    //   437: aload 6
    //   439: invokeinterface 191 3 0
    //   444: aload_0
    //   445: iconst_m1
    //   446: aload 6
    //   448: invokevirtual 321	java/lang/RuntimeException:getMessage	()Ljava/lang/String;
    //   451: iconst_0
    //   452: invokevirtual 298	com/mixpanel/android/a/e:b	(ILjava/lang/String;Z)V
    //   455: iconst_0
    //   456: ireturn
    //   457: aload_0
    //   458: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   461: ifnonnull +366 -> 827
    //   464: aload_0
    //   465: sipush 1002
    //   468: ldc_w 323
    //   471: invokevirtual 265	com/mixpanel/android/a/e:a	(ILjava/lang/String;)V
    //   474: goto +353 -> 827
    //   477: aload_0
    //   478: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   481: aload 4
    //   483: invokevirtual 292	com/mixpanel/android/a/b/a:d	(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/a/e/f;
    //   486: astore 5
    //   488: aload 5
    //   490: instanceof 294
    //   493: ifne +16 -> 509
    //   496: aload_0
    //   497: sipush 1002
    //   500: ldc_w 296
    //   503: iconst_0
    //   504: invokevirtual 298	com/mixpanel/android/a/e:b	(ILjava/lang/String;Z)V
    //   507: iconst_0
    //   508: ireturn
    //   509: aload 5
    //   511: checkcast 294	com/mixpanel/android/a/e/a
    //   514: astore 5
    //   516: aload_0
    //   517: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   520: aload 5
    //   522: invokevirtual 301	com/mixpanel/android/a/b/a:a	(Lcom/mixpanel/android/a/e/a;)Lcom/mixpanel/android/a/b/c;
    //   525: getstatic 248	com/mixpanel/android/a/b/c:a	Lcom/mixpanel/android/a/b/c;
    //   528: if_acmpne +11 -> 539
    //   531: aload_0
    //   532: aload 5
    //   534: invokespecial 316	com/mixpanel/android/a/e:a	(Lcom/mixpanel/android/a/e/f;)V
    //   537: iconst_1
    //   538: ireturn
    //   539: aload_0
    //   540: sipush 1002
    //   543: ldc_w 325
    //   546: invokevirtual 265	com/mixpanel/android/a/e:a	(ILjava/lang/String;)V
    //   549: iconst_0
    //   550: ireturn
    //   551: aload_0
    //   552: getfield 121	com/mixpanel/android/a/e:n	I
    //   555: getstatic 142	com/mixpanel/android/a/c:a	I
    //   558: if_icmpne -330 -> 228
    //   561: aload_0
    //   562: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   565: aload_0
    //   566: getfield 121	com/mixpanel/android/a/e:n	I
    //   569: invokevirtual 289	com/mixpanel/android/a/b/a:b	(I)V
    //   572: aload_0
    //   573: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   576: aload 4
    //   578: invokevirtual 292	com/mixpanel/android/a/b/a:d	(Ljava/nio/ByteBuffer;)Lcom/mixpanel/android/a/e/f;
    //   581: astore 5
    //   583: aload 5
    //   585: instanceof 327
    //   588: ifne +16 -> 604
    //   591: aload_0
    //   592: sipush 1002
    //   595: ldc_w 296
    //   598: iconst_0
    //   599: invokevirtual 298	com/mixpanel/android/a/e:b	(ILjava/lang/String;Z)V
    //   602: iconst_0
    //   603: ireturn
    //   604: aload 5
    //   606: checkcast 327	com/mixpanel/android/a/e/h
    //   609: astore 5
    //   611: aload_0
    //   612: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   615: aload_0
    //   616: getfield 111	com/mixpanel/android/a/e:q	Lcom/mixpanel/android/a/e/a;
    //   619: aload 5
    //   621: invokevirtual 330	com/mixpanel/android/a/b/a:a	(Lcom/mixpanel/android/a/e/a;Lcom/mixpanel/android/a/e/h;)Lcom/mixpanel/android/a/b/c;
    //   624: astore 6
    //   626: getstatic 248	com/mixpanel/android/a/b/c:a	Lcom/mixpanel/android/a/b/c;
    //   629: astore 7
    //   631: aload 6
    //   633: aload 7
    //   635: if_acmpne +73 -> 708
    //   638: aload_0
    //   639: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   642: aload_0
    //   643: aload_0
    //   644: getfield 111	com/mixpanel/android/a/e:q	Lcom/mixpanel/android/a/e/a;
    //   647: aload 5
    //   649: invokeinterface 333 4 0
    //   654: aload_0
    //   655: aload 5
    //   657: invokespecial 316	com/mixpanel/android/a/e:a	(Lcom/mixpanel/android/a/e/f;)V
    //   660: iconst_1
    //   661: ireturn
    //   662: astore 5
    //   664: aload_0
    //   665: aload 5
    //   667: invokevirtual 317	com/mixpanel/android/a/c/b:a	()I
    //   670: aload 5
    //   672: invokevirtual 320	com/mixpanel/android/a/c/b:getMessage	()Ljava/lang/String;
    //   675: iconst_0
    //   676: invokevirtual 298	com/mixpanel/android/a/e:b	(ILjava/lang/String;Z)V
    //   679: iconst_0
    //   680: ireturn
    //   681: astore 5
    //   683: aload_0
    //   684: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   687: aload_0
    //   688: aload 5
    //   690: invokeinterface 191 3 0
    //   695: aload_0
    //   696: iconst_m1
    //   697: aload 5
    //   699: invokevirtual 321	java/lang/RuntimeException:getMessage	()Ljava/lang/String;
    //   702: iconst_0
    //   703: invokevirtual 298	com/mixpanel/android/a/e:b	(ILjava/lang/String;Z)V
    //   706: iconst_0
    //   707: ireturn
    //   708: aload_0
    //   709: sipush 1002
    //   712: new 158	java/lang/StringBuilder
    //   715: dup
    //   716: invokespecial 159	java/lang/StringBuilder:<init>	()V
    //   719: ldc_w 335
    //   722: invokevirtual 165	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   725: aload_0
    //   726: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   729: invokevirtual 338	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   732: ldc_w 340
    //   735: invokevirtual 165	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   738: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   741: invokevirtual 265	com/mixpanel/android/a/e:a	(ILjava/lang/String;)V
    //   744: goto -516 -> 228
    //   747: astore 5
    //   749: aload_0
    //   750: aload 5
    //   752: invokevirtual 343	com/mixpanel/android/a/e:a	(Lcom/mixpanel/android/a/c/b;)V
    //   755: goto -527 -> 228
    //   758: iload_3
    //   759: istore_2
    //   760: getstatic 56	com/mixpanel/android/a/e:h	Z
    //   763: ifne -552 -> 211
    //   766: iload_3
    //   767: istore_2
    //   768: aload 5
    //   770: invokevirtual 285	com/mixpanel/android/a/c/a:a	()I
    //   773: aload 4
    //   775: invokevirtual 268	java/nio/ByteBuffer:remaining	()I
    //   778: if_icmpge -567 -> 211
    //   781: new 345	java/lang/AssertionError
    //   784: dup
    //   785: invokespecial 346	java/lang/AssertionError:<init>	()V
    //   788: athrow
    //   789: aload_0
    //   790: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   793: aload_0
    //   794: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   797: invokevirtual 349	java/nio/ByteBuffer:limit	()I
    //   800: invokevirtual 353	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   803: pop
    //   804: aload_0
    //   805: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   808: aload_0
    //   809: getfield 109	com/mixpanel/android/a/e:p	Ljava/nio/ByteBuffer;
    //   812: invokevirtual 236	java/nio/ByteBuffer:capacity	()I
    //   815: invokevirtual 355	java/nio/ByteBuffer:limit	(I)Ljava/nio/Buffer;
    //   818: pop
    //   819: goto -591 -> 228
    //   822: astore 6
    //   824: goto -566 -> 258
    //   827: iconst_0
    //   828: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	829	0	this	e
    //   0	829	1	paramByteBuffer	ByteBuffer
    //   210	558	2	i1	int
    //   197	570	3	i2	int
    //   11	763	4	localByteBuffer	ByteBuffer
    //   32	8	5	localc1	com.mixpanel.android.a.b.c
    //   158	1	5	localb1	com.mixpanel.android.a.c.b
    //   174	19	5	locala	com.mixpanel.android.a.c.a
    //   256	400	5	localObject1	Object
    //   662	9	5	localb2	com.mixpanel.android.a.c.b
    //   681	17	5	localRuntimeException1	RuntimeException
    //   747	22	5	locald1	com.mixpanel.android.a.c.d
    //   37	362	6	localObject2	Object
    //   411	9	6	localb3	com.mixpanel.android.a.c.b
    //   430	17	6	localRuntimeException2	RuntimeException
    //   624	8	6	localc2	com.mixpanel.android.a.b.c
    //   822	1	6	locald2	com.mixpanel.android.a.c.d
    //   305	329	7	localObject3	Object
    //   373	10	8	locali	com.mixpanel.android.a.e.i
    // Exception table:
    //   from	to	target	type
    //   46	75	158	com/mixpanel/android/a/c/b
    //   19	39	174	com/mixpanel/android/a/c/a
    //   46	75	174	com/mixpanel/android/a/c/a
    //   160	171	174	com/mixpanel/android/a/c/a
    //   230	258	174	com/mixpanel/android/a/c/a
    //   258	283	174	com/mixpanel/android/a/c/a
    //   283	326	174	com/mixpanel/android/a/c/a
    //   328	359	174	com/mixpanel/android/a/c/a
    //   359	375	174	com/mixpanel/android/a/c/a
    //   375	409	174	com/mixpanel/android/a/c/a
    //   413	428	174	com/mixpanel/android/a/c/a
    //   432	455	174	com/mixpanel/android/a/c/a
    //   457	474	174	com/mixpanel/android/a/c/a
    //   477	507	174	com/mixpanel/android/a/c/a
    //   509	537	174	com/mixpanel/android/a/c/a
    //   539	549	174	com/mixpanel/android/a/c/a
    //   551	602	174	com/mixpanel/android/a/c/a
    //   604	631	174	com/mixpanel/android/a/c/a
    //   638	654	174	com/mixpanel/android/a/c/a
    //   654	660	174	com/mixpanel/android/a/c/a
    //   664	679	174	com/mixpanel/android/a/c/a
    //   683	706	174	com/mixpanel/android/a/c/a
    //   708	744	174	com/mixpanel/android/a/c/a
    //   749	755	174	com/mixpanel/android/a/c/a
    //   359	375	411	com/mixpanel/android/a/c/b
    //   359	375	430	java/lang/RuntimeException
    //   638	654	662	com/mixpanel/android/a/c/b
    //   638	654	681	java/lang/RuntimeException
    //   230	258	747	com/mixpanel/android/a/c/d
    //   258	283	747	com/mixpanel/android/a/c/d
    //   457	474	747	com/mixpanel/android/a/c/d
    //   477	507	747	com/mixpanel/android/a/c/d
    //   509	537	747	com/mixpanel/android/a/c/d
    //   539	549	747	com/mixpanel/android/a/c/d
    //   551	602	747	com/mixpanel/android/a/c/d
    //   604	631	747	com/mixpanel/android/a/c/d
    //   638	654	747	com/mixpanel/android/a/c/d
    //   654	660	747	com/mixpanel/android/a/c/d
    //   664	679	747	com/mixpanel/android/a/c/d
    //   683	706	747	com/mixpanel/android/a/c/d
    //   708	744	747	com/mixpanel/android/a/c/d
    //   283	326	822	com/mixpanel/android/a/c/d
    //   328	359	822	com/mixpanel/android/a/c/d
    //   359	375	822	com/mixpanel/android/a/c/d
    //   375	409	822	com/mixpanel/android/a/c/d
    //   413	428	822	com/mixpanel/android/a/c/d
    //   432	455	822	com/mixpanel/android/a/c/d
  }
  
  private void c(int paramInt, String paramString, boolean paramBoolean)
  {
    if ((this.j != b.d) && (this.j != b.e))
    {
      if (this.j != b.c) {
        break label191;
      }
      if (paramInt == 1006)
      {
        if ((!h) && (paramBoolean)) {
          throw new AssertionError();
        }
        this.j = b.d;
        b(paramInt, paramString, false);
      }
    }
    else
    {
      return;
    }
    if ((this.m.b() == com.mixpanel.android.a.b.b.a) || (!paramBoolean)) {}
    for (;;)
    {
      try
      {
        this.k.a(this, paramInt, paramString);
        a(new com.mixpanel.android.a.d.b(paramInt, paramString));
        b(paramInt, paramString, paramBoolean);
        if (paramInt == 1002) {
          b(paramInt, paramString, paramBoolean);
        }
        this.j = b.d;
        this.p = null;
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        this.k.a(this, localRuntimeException);
        continue;
      }
      catch (com.mixpanel.android.a.c.b localb)
      {
        this.k.a(this, localb);
        b(1006, "generated frame is invalid", false);
        continue;
      }
      label191:
      if (paramInt == -3)
      {
        if ((!h) && (!paramBoolean)) {
          throw new AssertionError();
        }
        b(-3, paramString, true);
      }
      else
      {
        b(-1, paramString, false);
      }
    }
  }
  
  private void c(ByteBuffer paramByteBuffer)
  {
    for (;;)
    {
      com.mixpanel.android.a.d.e locale1;
      boolean bool;
      int i1;
      try
      {
        Iterator localIterator = this.m.c(paramByteBuffer).iterator();
        if (localIterator.hasNext())
        {
          paramByteBuffer = (com.mixpanel.android.a.d.d)localIterator.next();
          if (b) {
            System.out.println("matched frame: " + paramByteBuffer);
          }
          locale1 = paramByteBuffer.f();
          bool = paramByteBuffer.d();
          if (locale1 != com.mixpanel.android.a.d.e.f) {
            break label188;
          }
          if (!(paramByteBuffer instanceof com.mixpanel.android.a.d.a)) {
            break label492;
          }
          paramByteBuffer = (com.mixpanel.android.a.d.a)paramByteBuffer;
          i1 = paramByteBuffer.a();
          paramByteBuffer = paramByteBuffer.b();
          if (this.j == b.d) {
            a(i1, paramByteBuffer, true);
          }
        }
        else
        {
          return;
        }
      }
      catch (com.mixpanel.android.a.c.b paramByteBuffer)
      {
        this.k.a(this, paramByteBuffer);
        a(paramByteBuffer);
      }
      if (this.m.b() == com.mixpanel.android.a.b.b.c)
      {
        c(i1, paramByteBuffer, true);
      }
      else
      {
        b(i1, paramByteBuffer, false);
        continue;
        label188:
        if (locale1 == com.mixpanel.android.a.d.e.d)
        {
          this.k.b(this, paramByteBuffer);
        }
        else if (locale1 == com.mixpanel.android.a.d.e.e)
        {
          this.k.c(this, paramByteBuffer);
        }
        else
        {
          if ((!bool) || (locale1 == com.mixpanel.android.a.d.e.a))
          {
            if (locale1 != com.mixpanel.android.a.d.e.a)
            {
              if (this.o != null) {
                throw new com.mixpanel.android.a.c.b(1002, "Previous continuous frame sequence not completed.");
              }
              this.o = locale1;
            }
            label341:
            do
            {
              for (;;)
              {
                try
                {
                  this.k.a(this, paramByteBuffer);
                }
                catch (RuntimeException paramByteBuffer)
                {
                  this.k.a(this, paramByteBuffer);
                }
                break;
                if (!bool) {
                  break label341;
                }
                if (this.o == null) {
                  throw new com.mixpanel.android.a.c.b(1002, "Continuous frame sequence was not started.");
                }
                this.o = null;
              }
            } while (this.o != null);
            throw new com.mixpanel.android.a.c.b(1002, "Continuous frame sequence was not started.");
          }
          if (this.o != null) {
            throw new com.mixpanel.android.a.c.b(1002, "Continuous frame sequence not completed.");
          }
          com.mixpanel.android.a.d.e locale2 = com.mixpanel.android.a.d.e.b;
          if (locale1 == locale2)
          {
            try
            {
              this.k.a(this, com.mixpanel.android.a.f.c.a(paramByteBuffer.c()));
            }
            catch (RuntimeException paramByteBuffer)
            {
              this.k.a(this, paramByteBuffer);
            }
          }
          else
          {
            locale2 = com.mixpanel.android.a.d.e.c;
            if (locale1 == locale2)
            {
              try
              {
                this.k.a(this, paramByteBuffer.c());
              }
              catch (RuntimeException paramByteBuffer)
              {
                this.k.a(this, paramByteBuffer);
              }
            }
            else
            {
              throw new com.mixpanel.android.a.c.b(1002, "non control or continious frame expected");
              label492:
              paramByteBuffer = "";
              i1 = 1005;
            }
          }
        }
      }
    }
  }
  
  private com.mixpanel.android.a.b.c d(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.mark();
    if (paramByteBuffer.limit() > com.mixpanel.android.a.b.a.c.length) {
      return com.mixpanel.android.a.b.c.b;
    }
    if (paramByteBuffer.limit() < com.mixpanel.android.a.b.a.c.length) {
      throw new com.mixpanel.android.a.c.a(com.mixpanel.android.a.b.a.c.length);
    }
    int i1 = 0;
    while (paramByteBuffer.hasRemaining())
    {
      if (com.mixpanel.android.a.b.a.c[i1] != paramByteBuffer.get())
      {
        paramByteBuffer.reset();
        return com.mixpanel.android.a.b.c.b;
      }
      i1 += 1;
    }
    return com.mixpanel.android.a.b.c.a;
  }
  
  private void e(ByteBuffer paramByteBuffer)
  {
    PrintStream localPrintStream;
    StringBuilder localStringBuilder;
    if (b)
    {
      localPrintStream = System.out;
      localStringBuilder = new StringBuilder().append("write(").append(paramByteBuffer.remaining()).append("): {");
      if (paramByteBuffer.remaining() <= 1000) {
        break label93;
      }
    }
    label93:
    for (String str = "too big to display";; str = new String(paramByteBuffer.array()))
    {
      localPrintStream.println(str + "}");
      this.f.add(paramByteBuffer);
      this.k.b(this);
      return;
    }
  }
  
  public InetSocketAddress a()
  {
    return this.k.c(this);
  }
  
  public void a(int paramInt, String paramString)
  {
    c(paramInt, paramString, false);
  }
  
  /* Error */
  protected void a(int paramInt, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 97	com/mixpanel/android/a/e:j	I
    //   6: istore 4
    //   8: getstatic 359	com/mixpanel/android/a/b:e	I
    //   11: istore 5
    //   13: iload 4
    //   15: iload 5
    //   17: if_icmpne +6 -> 23
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: getfield 480	com/mixpanel/android/a/e:d	Ljava/nio/channels/SelectionKey;
    //   27: ifnull +10 -> 37
    //   30: aload_0
    //   31: getfield 480	com/mixpanel/android/a/e:d	Ljava/nio/channels/SelectionKey;
    //   34: invokevirtual 485	java/nio/channels/SelectionKey:cancel	()V
    //   37: aload_0
    //   38: getfield 487	com/mixpanel/android/a/e:e	Ljava/nio/channels/ByteChannel;
    //   41: astore 6
    //   43: aload 6
    //   45: ifnull +12 -> 57
    //   48: aload_0
    //   49: getfield 487	com/mixpanel/android/a/e:e	Ljava/nio/channels/ByteChannel;
    //   52: invokeinterface 492 1 0
    //   57: aload_0
    //   58: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   61: aload_0
    //   62: iload_1
    //   63: aload_2
    //   64: iload_3
    //   65: invokeinterface 495 5 0
    //   70: aload_0
    //   71: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   74: ifnull +10 -> 84
    //   77: aload_0
    //   78: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   81: invokevirtual 497	com/mixpanel/android/a/b/a:a	()V
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 111	com/mixpanel/android/a/e:q	Lcom/mixpanel/android/a/e/a;
    //   89: aload_0
    //   90: getstatic 359	com/mixpanel/android/a/b:e	I
    //   93: putfield 97	com/mixpanel/android/a/e:j	I
    //   96: aload_0
    //   97: getfield 137	com/mixpanel/android/a/e:f	Ljava/util/concurrent/BlockingQueue;
    //   100: invokeinterface 500 1 0
    //   105: goto -85 -> 20
    //   108: astore_2
    //   109: aload_0
    //   110: monitorexit
    //   111: aload_2
    //   112: athrow
    //   113: astore 6
    //   115: aload_0
    //   116: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   119: aload_0
    //   120: aload 6
    //   122: invokeinterface 191 3 0
    //   127: goto -70 -> 57
    //   130: astore_2
    //   131: aload_0
    //   132: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   135: aload_0
    //   136: aload_2
    //   137: invokeinterface 191 3 0
    //   142: goto -72 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	e
    //   0	145	1	paramInt	int
    //   0	145	2	paramString	String
    //   0	145	3	paramBoolean	boolean
    //   6	12	4	i1	int
    //   11	7	5	i2	int
    //   41	3	6	localByteChannel	ByteChannel
    //   113	8	6	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   2	13	108	finally
    //   23	37	108	finally
    //   37	43	108	finally
    //   48	57	108	finally
    //   57	70	108	finally
    //   70	84	108	finally
    //   84	105	108	finally
    //   115	127	108	finally
    //   131	142	108	finally
    //   48	57	113	java/io/IOException
    //   57	70	130	java/lang/RuntimeException
  }
  
  protected void a(int paramInt, boolean paramBoolean)
  {
    a(paramInt, "", paramBoolean);
  }
  
  public void a(com.mixpanel.android.a.c.b paramb)
  {
    c(paramb.a(), paramb.getMessage(), false);
  }
  
  public void a(com.mixpanel.android.a.d.d paramd)
  {
    if (b) {
      System.out.println("send frame: " + paramd);
    }
    e(this.m.a(paramd));
  }
  
  public void a(com.mixpanel.android.a.d.e parame, ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    a(this.m.a(parame, paramByteBuffer, paramBoolean));
  }
  
  public void a(com.mixpanel.android.a.e.b paramb)
  {
    if ((!h) && (this.j == b.b)) {
      throw new AssertionError("shall only be called once");
    }
    this.q = this.m.a(paramb);
    this.u = paramb.a();
    if ((!h) && (this.u == null)) {
      throw new AssertionError();
    }
    try
    {
      this.k.a(this, this.q);
      a(this.m.a(this.q, this.n));
      return;
    }
    catch (com.mixpanel.android.a.c.b paramb)
    {
      throw new com.mixpanel.android.a.c.d("Handshake data rejected by client.");
    }
    catch (RuntimeException paramb)
    {
      this.k.a(this, paramb);
      throw new com.mixpanel.android.a.c.d("rejected because of" + paramb);
    }
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    if ((!h) && (!paramByteBuffer.hasRemaining())) {
      throw new AssertionError();
    }
    String str;
    if (b)
    {
      PrintStream localPrintStream = System.out;
      StringBuilder localStringBuilder = new StringBuilder().append("process(").append(paramByteBuffer.remaining()).append("): {");
      if (paramByteBuffer.remaining() > 1000)
      {
        str = "too big to display";
        localPrintStream.println(str + "}");
      }
    }
    else
    {
      if (this.j == b.a) {
        break label165;
      }
      c(paramByteBuffer);
    }
    for (;;)
    {
      if ((h) || (d()) || (e()) || (!paramByteBuffer.hasRemaining())) {
        return;
      }
      throw new AssertionError();
      str = new String(paramByteBuffer.array(), paramByteBuffer.position(), paramByteBuffer.remaining());
      break;
      label165:
      if (b(paramByteBuffer))
      {
        if ((!h) && (this.p.hasRemaining() == paramByteBuffer.hasRemaining()) && (paramByteBuffer.hasRemaining())) {
          throw new AssertionError();
        }
        if (paramByteBuffer.hasRemaining()) {
          c(paramByteBuffer);
        } else if (this.p.hasRemaining()) {
          c(this.p);
        }
      }
    }
  }
  
  public void b()
  {
    if (g() == b.a)
    {
      a(-1, true);
      return;
    }
    if (this.i)
    {
      a(this.s.intValue(), this.r, this.t.booleanValue());
      return;
    }
    if (this.m.b() == com.mixpanel.android.a.b.b.a)
    {
      a(1000, true);
      return;
    }
    if (this.m.b() == com.mixpanel.android.a.b.b.b)
    {
      if (this.n == c.b)
      {
        a(1006, true);
        return;
      }
      a(1000, true);
      return;
    }
    a(1006, true);
  }
  
  public void b(int paramInt, String paramString)
  {
    a(paramInt, paramString, false);
  }
  
  /* Error */
  protected void b(int paramInt, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 92	com/mixpanel/android/a/e:i	Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifeq +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: iload_1
    //   18: invokestatic 566	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: putfield 115	com/mixpanel/android/a/e:s	Ljava/lang/Integer;
    //   24: aload_0
    //   25: aload_2
    //   26: putfield 113	com/mixpanel/android/a/e:r	Ljava/lang/String;
    //   29: aload_0
    //   30: iload_3
    //   31: invokestatic 569	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   34: putfield 117	com/mixpanel/android/a/e:t	Ljava/lang/Boolean;
    //   37: aload_0
    //   38: iconst_1
    //   39: putfield 92	com/mixpanel/android/a/e:i	Z
    //   42: aload_0
    //   43: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   46: aload_0
    //   47: invokeinterface 463 2 0
    //   52: aload_0
    //   53: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   56: aload_0
    //   57: iload_1
    //   58: aload_2
    //   59: iload_3
    //   60: invokeinterface 571 5 0
    //   65: aload_0
    //   66: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   69: ifnull +10 -> 79
    //   72: aload_0
    //   73: getfield 99	com/mixpanel/android/a/e:m	Lcom/mixpanel/android/a/b/a;
    //   76: invokevirtual 497	com/mixpanel/android/a/b/a:a	()V
    //   79: aload_0
    //   80: aconst_null
    //   81: putfield 111	com/mixpanel/android/a/e:q	Lcom/mixpanel/android/a/e/a;
    //   84: goto -71 -> 13
    //   87: astore_2
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_2
    //   91: athrow
    //   92: astore_2
    //   93: aload_0
    //   94: getfield 141	com/mixpanel/android/a/e:k	Lcom/mixpanel/android/a/f;
    //   97: aload_0
    //   98: aload_2
    //   99: invokeinterface 191 3 0
    //   104: goto -39 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	e
    //   0	107	1	paramInt	int
    //   0	107	2	paramString	String
    //   0	107	3	paramBoolean	boolean
    //   6	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	8	87	finally
    //   16	52	87	finally
    //   52	65	87	finally
    //   65	79	87	finally
    //   79	84	87	finally
    //   93	104	87	finally
    //   52	65	92	java/lang/RuntimeException
  }
  
  public boolean c()
  {
    if ((h) || (this.j != b.c) || (!this.i))
    {
      if (this.j == b.c) {
        return true;
      }
    }
    else {
      throw new AssertionError();
    }
    return false;
  }
  
  public boolean d()
  {
    return this.j == b.d;
  }
  
  public boolean e()
  {
    return this.i;
  }
  
  public boolean f()
  {
    return this.j == b.e;
  }
  
  public int g()
  {
    return this.j;
  }
  
  public int hashCode()
  {
    return super.hashCode();
  }
  
  public String toString()
  {
    return super.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */