package com.appsee;

import java.io.File;
import java.util.List;

class qc
{
  private static qc B;
  private boolean A;
  private boolean G;
  private hc M;
  private List<File> l;
  
  public static qc C()
  {
    try
    {
      if (B == null) {
        B = new qc();
      }
      qc localqc = B;
      return localqc;
    }
    finally {}
  }
  
  public static String C(String paramString)
  {
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int j = i - 1;
    for (i = j; j >= 0; i = j)
    {
      j = paramString.charAt(i);
      int k = i - 1;
      arrayOfChar[i] = ((char)(j ^ 0x54));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x7));
    }
    return new String(arrayOfChar);
  }
  
  /* Error */
  public void A()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	com/appsee/qc:G	Z
    //   4: ifeq +13 -> 17
    //   7: ldc_w 478
    //   10: invokestatic 124	com/appsee/zb:C	(Ljava/lang/String;)Ljava/lang/String;
    //   13: invokestatic 480	com/appsee/ue:C	(Ljava/lang/String;)V
    //   16: return
    //   17: invokestatic 62	com/appsee/ye:C	()Lcom/appsee/ye;
    //   20: invokevirtual 482	com/appsee/ye:C	()Ljava/lang/String;
    //   23: astore_2
    //   24: aload_0
    //   25: getfield 35	com/appsee/qc:M	Lcom/appsee/hc;
    //   28: astore_1
    //   29: aload_1
    //   30: monitorenter
    //   31: aload_0
    //   32: getfield 35	com/appsee/qc:M	Lcom/appsee/hc;
    //   35: aload_2
    //   36: invokevirtual 485	com/appsee/hc:H	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   39: astore_2
    //   40: invokestatic 487	com/appsee/gb:J	()V
    //   43: invokestatic 489	com/appsee/gb:a	()V
    //   46: iconst_1
    //   47: ldc_w 491
    //   50: invokestatic 81	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   53: iconst_1
    //   54: anewarray 4	java/lang/Object
    //   57: dup
    //   58: iconst_0
    //   59: aload_2
    //   60: invokevirtual 492	org/json/JSONObject:toString	()Ljava/lang/String;
    //   63: aastore
    //   64: invokestatic 86	com/appsee/vd:C	(ILjava/lang/String;[Ljava/lang/Object;)V
    //   67: invokestatic 62	com/appsee/ye:C	()Lcom/appsee/ye;
    //   70: aload_2
    //   71: invokevirtual 495	com/appsee/ye:C	(Lorg/json/JSONObject;)V
    //   74: aload_1
    //   75: monitorexit
    //   76: invokestatic 500	com/appsee/fd:C	()Lcom/appsee/fd;
    //   79: invokevirtual 501	com/appsee/fd:J	()V
    //   82: return
    //   83: astore_1
    //   84: aload_1
    //   85: ldc_w 503
    //   88: invokestatic 124	com/appsee/zb:C	(Ljava/lang/String;)Ljava/lang/String;
    //   91: iconst_0
    //   92: invokestatic 278	com/appsee/ue:C	(Ljava/lang/Throwable;Ljava/lang/String;Z)V
    //   95: invokestatic 500	com/appsee/fd:C	()Lcom/appsee/fd;
    //   98: invokevirtual 505	com/appsee/fd:M	()V
    //   101: invokestatic 507	com/appsee/gb:K	()V
    //   104: return
    //   105: astore_2
    //   106: aload_1
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	qc
    //   83	24	1	localException	Exception
    //   23	48	2	localObject1	Object
    //   105	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   24	31	83	java/lang/Exception
    //   76	82	83	java/lang/Exception
    //   108	110	83	java/lang/Exception
    //   31	76	105	finally
    //   106	108	105	finally
  }
  
  public void H()
  {
    if (this.G)
    {
      vd.H(1, kl.C("\006_5V&W>\0232C+\\&W.] "));
      return;
    }
    this.G = true;
    this.A = false;
    C();
    K();
  }
  
  public void a()
  {
    vd.H(1, kl.C("\024G(C7Z)TgF7_(R#"));
    if (!this.G)
    {
      vd.H(1, zb.C("R@<AyJx\017h@<\\h@l"));
      return;
    }
    synchronized (this.l)
    {
      this.l.clear();
      this.A = true;
      this.M.C();
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\qc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */