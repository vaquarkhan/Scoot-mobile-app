package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;

final class cg
  implements s, t
{
  private cg(bx parambx) {}
  
  public void a(Bundle paramBundle)
  {
    bx.f(this.a).a(new ce(this.a));
  }
  
  /* Error */
  public void a(com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	com/google/android/gms/b/cg:a	Lcom/google/android/gms/b/bx;
    //   4: invokestatic 41	com/google/android/gms/b/bx:c	(Lcom/google/android/gms/b/bx;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 46 1 0
    //   12: aload_0
    //   13: getfield 14	com/google/android/gms/b/cg:a	Lcom/google/android/gms/b/bx;
    //   16: aload_1
    //   17: invokestatic 50	com/google/android/gms/b/bx:b	(Lcom/google/android/gms/b/bx;Lcom/google/android/gms/common/ConnectionResult;)Z
    //   20: ifeq +30 -> 50
    //   23: aload_0
    //   24: getfield 14	com/google/android/gms/b/cg:a	Lcom/google/android/gms/b/bx;
    //   27: invokestatic 53	com/google/android/gms/b/bx:i	(Lcom/google/android/gms/b/bx;)V
    //   30: aload_0
    //   31: getfield 14	com/google/android/gms/b/cg:a	Lcom/google/android/gms/b/bx;
    //   34: invokestatic 56	com/google/android/gms/b/bx:j	(Lcom/google/android/gms/b/bx;)V
    //   37: aload_0
    //   38: getfield 14	com/google/android/gms/b/cg:a	Lcom/google/android/gms/b/bx;
    //   41: invokestatic 41	com/google/android/gms/b/bx:c	(Lcom/google/android/gms/b/bx;)Ljava/util/concurrent/locks/Lock;
    //   44: invokeinterface 59 1 0
    //   49: return
    //   50: aload_0
    //   51: getfield 14	com/google/android/gms/b/cg:a	Lcom/google/android/gms/b/bx;
    //   54: aload_1
    //   55: invokestatic 62	com/google/android/gms/b/bx:a	(Lcom/google/android/gms/b/bx;Lcom/google/android/gms/common/ConnectionResult;)V
    //   58: goto -21 -> 37
    //   61: astore_1
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/b/cg:a	Lcom/google/android/gms/b/bx;
    //   66: invokestatic 41	com/google/android/gms/b/bx:c	(Lcom/google/android/gms/b/bx;)Ljava/util/concurrent/locks/Lock;
    //   69: invokeinterface 59 1 0
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	cg
    //   0	76	1	paramConnectionResult	com.google.android.gms.common.ConnectionResult
    // Exception table:
    //   from	to	target	type
    //   12	37	61	finally
    //   50	58	61	finally
  }
  
  public void c_(int paramInt) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */