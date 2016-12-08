package com.google.android.gms.b;

import android.util.SparseArray;
import com.google.android.gms.common.api.ae;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicBoolean;

final class cx
  extends Thread
{
  private final ReferenceQueue<ae<?>> a;
  private final SparseArray<cw> b;
  private final AtomicBoolean c = new AtomicBoolean();
  
  public cx(ReferenceQueue<ae<?>> paramReferenceQueue, SparseArray<cw> paramSparseArray)
  {
    super("GoogleApiCleanup");
    this.a = paramReferenceQueue;
    this.b = paramSparseArray;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	com/google/android/gms/b/cx:c	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   4: iconst_1
    //   5: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   8: bipush 10
    //   10: invokestatic 47	android/os/Process:setThreadPriority	(I)V
    //   13: aload_0
    //   14: getfield 26	com/google/android/gms/b/cx:c	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   17: invokevirtual 51	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   20: ifeq +42 -> 62
    //   23: aload_0
    //   24: getfield 28	com/google/android/gms/b/cx:a	Ljava/lang/ref/ReferenceQueue;
    //   27: invokevirtual 57	java/lang/ref/ReferenceQueue:remove	()Ljava/lang/ref/Reference;
    //   30: checkcast 59	com/google/android/gms/b/cw
    //   33: astore_1
    //   34: aload_0
    //   35: getfield 30	com/google/android/gms/b/cx:b	Landroid/util/SparseArray;
    //   38: aload_1
    //   39: invokestatic 62	com/google/android/gms/b/cw:a	(Lcom/google/android/gms/b/cw;)I
    //   42: invokevirtual 66	android/util/SparseArray:remove	(I)V
    //   45: aload_1
    //   46: invokevirtual 68	com/google/android/gms/b/cw:a	()V
    //   49: goto -36 -> 13
    //   52: astore_1
    //   53: aload_0
    //   54: getfield 26	com/google/android/gms/b/cx:c	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   57: iconst_0
    //   58: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   61: return
    //   62: aload_0
    //   63: getfield 26	com/google/android/gms/b/cx:c	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   66: iconst_0
    //   67: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   70: return
    //   71: astore_1
    //   72: aload_0
    //   73: getfield 26	com/google/android/gms/b/cx:c	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   76: iconst_0
    //   77: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   80: aload_1
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	cx
    //   33	13	1	localcw	cw
    //   52	1	1	localInterruptedException	InterruptedException
    //   71	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	49	52	java/lang/InterruptedException
    //   13	49	71	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */