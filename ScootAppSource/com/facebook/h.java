package com.facebook;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class h
  implements aq
{
  h(d paramd, AccessToken paramAccessToken, AtomicBoolean paramAtomicBoolean, i parami, Set paramSet1, Set paramSet2) {}
  
  /* Error */
  public void a(ap paramap)
  {
    // Byte code:
    //   0: invokestatic 41	com/facebook/d:a	()Lcom/facebook/d;
    //   3: invokevirtual 44	com/facebook/d:b	()Lcom/facebook/AccessToken;
    //   6: ifnull +22 -> 28
    //   9: invokestatic 41	com/facebook/d:a	()Lcom/facebook/d;
    //   12: invokevirtual 44	com/facebook/d:b	()Lcom/facebook/AccessToken;
    //   15: invokevirtual 50	com/facebook/AccessToken:i	()Ljava/lang/String;
    //   18: aload_0
    //   19: getfield 23	com/facebook/h:a	Lcom/facebook/AccessToken;
    //   22: invokevirtual 50	com/facebook/AccessToken:i	()Ljava/lang/String;
    //   25: if_acmpeq +4 -> 29
    //   28: return
    //   29: aload_0
    //   30: getfield 25	com/facebook/h:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   33: invokevirtual 56	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   36: ifne +37 -> 73
    //   39: aload_0
    //   40: getfield 27	com/facebook/h:c	Lcom/facebook/i;
    //   43: getfield 61	com/facebook/i:a	Ljava/lang/String;
    //   46: ifnonnull +27 -> 73
    //   49: aload_0
    //   50: getfield 27	com/facebook/h:c	Lcom/facebook/i;
    //   53: getfield 64	com/facebook/i:b	I
    //   56: istore_2
    //   57: iload_2
    //   58: ifne +15 -> 73
    //   61: aload_0
    //   62: getfield 21	com/facebook/h:f	Lcom/facebook/d;
    //   65: invokestatic 67	com/facebook/d:b	(Lcom/facebook/d;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   68: iconst_0
    //   69: invokevirtual 71	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   72: return
    //   73: aload_0
    //   74: getfield 27	com/facebook/h:c	Lcom/facebook/i;
    //   77: getfield 61	com/facebook/i:a	Ljava/lang/String;
    //   80: ifnull +146 -> 226
    //   83: aload_0
    //   84: getfield 27	com/facebook/h:c	Lcom/facebook/i;
    //   87: getfield 61	com/facebook/i:a	Ljava/lang/String;
    //   90: astore_1
    //   91: aload_0
    //   92: getfield 23	com/facebook/h:a	Lcom/facebook/AccessToken;
    //   95: invokevirtual 74	com/facebook/AccessToken:h	()Ljava/lang/String;
    //   98: astore 6
    //   100: aload_0
    //   101: getfield 23	com/facebook/h:a	Lcom/facebook/AccessToken;
    //   104: invokevirtual 50	com/facebook/AccessToken:i	()Ljava/lang/String;
    //   107: astore 7
    //   109: aload_0
    //   110: getfield 25	com/facebook/h:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   113: invokevirtual 56	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   116: ifeq +121 -> 237
    //   119: aload_0
    //   120: getfield 29	com/facebook/h:d	Ljava/util/Set;
    //   123: astore_3
    //   124: aload_0
    //   125: getfield 25	com/facebook/h:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   128: invokevirtual 56	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   131: ifeq +117 -> 248
    //   134: aload_0
    //   135: getfield 31	com/facebook/h:e	Ljava/util/Set;
    //   138: astore 4
    //   140: aload_0
    //   141: getfield 23	com/facebook/h:a	Lcom/facebook/AccessToken;
    //   144: invokevirtual 77	com/facebook/AccessToken:f	()Lcom/facebook/j;
    //   147: astore 8
    //   149: aload_0
    //   150: getfield 27	com/facebook/h:c	Lcom/facebook/i;
    //   153: getfield 64	com/facebook/i:b	I
    //   156: ifeq +104 -> 260
    //   159: new 79	java/util/Date
    //   162: dup
    //   163: aload_0
    //   164: getfield 27	com/facebook/h:c	Lcom/facebook/i;
    //   167: getfield 64	com/facebook/i:b	I
    //   170: i2l
    //   171: ldc2_w 80
    //   174: lmul
    //   175: invokespecial 84	java/util/Date:<init>	(J)V
    //   178: astore 5
    //   180: new 46	com/facebook/AccessToken
    //   183: dup
    //   184: aload_1
    //   185: aload 6
    //   187: aload 7
    //   189: aload_3
    //   190: aload 4
    //   192: aload 8
    //   194: aload 5
    //   196: new 79	java/util/Date
    //   199: dup
    //   200: invokespecial 85	java/util/Date:<init>	()V
    //   203: invokespecial 88	com/facebook/AccessToken:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/j;Ljava/util/Date;Ljava/util/Date;)V
    //   206: astore_1
    //   207: invokestatic 41	com/facebook/d:a	()Lcom/facebook/d;
    //   210: aload_1
    //   211: invokevirtual 91	com/facebook/d:a	(Lcom/facebook/AccessToken;)V
    //   214: aload_0
    //   215: getfield 21	com/facebook/h:f	Lcom/facebook/d;
    //   218: invokestatic 67	com/facebook/d:b	(Lcom/facebook/d;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   221: iconst_0
    //   222: invokevirtual 71	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   225: return
    //   226: aload_0
    //   227: getfield 23	com/facebook/h:a	Lcom/facebook/AccessToken;
    //   230: invokevirtual 93	com/facebook/AccessToken:b	()Ljava/lang/String;
    //   233: astore_1
    //   234: goto -143 -> 91
    //   237: aload_0
    //   238: getfield 23	com/facebook/h:a	Lcom/facebook/AccessToken;
    //   241: invokevirtual 96	com/facebook/AccessToken:d	()Ljava/util/Set;
    //   244: astore_3
    //   245: goto -121 -> 124
    //   248: aload_0
    //   249: getfield 23	com/facebook/h:a	Lcom/facebook/AccessToken;
    //   252: invokevirtual 98	com/facebook/AccessToken:e	()Ljava/util/Set;
    //   255: astore 4
    //   257: goto -117 -> 140
    //   260: aload_0
    //   261: getfield 23	com/facebook/h:a	Lcom/facebook/AccessToken;
    //   264: invokevirtual 101	com/facebook/AccessToken:c	()Ljava/util/Date;
    //   267: astore 5
    //   269: goto -89 -> 180
    //   272: astore_1
    //   273: aload_0
    //   274: getfield 21	com/facebook/h:f	Lcom/facebook/d;
    //   277: invokestatic 67	com/facebook/d:b	(Lcom/facebook/d;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   280: iconst_0
    //   281: invokevirtual 71	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   284: aload_1
    //   285: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	286	0	this	h
    //   0	286	1	paramap	ap
    //   56	2	2	i	int
    //   123	122	3	localSet1	Set
    //   138	118	4	localSet2	Set
    //   178	90	5	localDate	java.util.Date
    //   98	88	6	str1	String
    //   107	81	7	str2	String
    //   147	46	8	localj	j
    // Exception table:
    //   from	to	target	type
    //   29	57	272	finally
    //   73	91	272	finally
    //   91	124	272	finally
    //   124	140	272	finally
    //   140	180	272	finally
    //   180	214	272	finally
    //   226	234	272	finally
    //   237	245	272	finally
    //   248	257	272	finally
    //   260	269	272	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */