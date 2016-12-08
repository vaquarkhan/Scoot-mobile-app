package b.a.a.a.a.b;

import android.util.Log;

public final class aj
{
  private final String a;
  private final String b;
  private final boolean c;
  private long d;
  private long e;
  
  public aj(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
    if (!Log.isLoggable(paramString2, 2)) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      return;
    }
  }
  
  private void c()
  {
    Log.v(this.b, this.a + ": " + this.e + "ms");
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	b/a/a/a/a/b/aj:c	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokestatic 60	android/os/SystemClock:elapsedRealtime	()J
    //   18: putfield 62	b/a/a/a/a/b/aj:d	J
    //   21: aload_0
    //   22: lconst_0
    //   23: putfield 41	b/a/a/a/a/b/aj:e	J
    //   26: goto -15 -> 11
    //   29: astore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_2
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	aj
    //   6	2	1	bool	boolean
    //   29	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	29	finally
    //   14	26	29	finally
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	b/a/a/a/a/b/aj:c	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 41	b/a/a/a/a/b/aj:e	J
    //   18: lconst_0
    //   19: lcmp
    //   20: ifne -9 -> 11
    //   23: aload_0
    //   24: invokestatic 60	android/os/SystemClock:elapsedRealtime	()J
    //   27: aload_0
    //   28: getfield 62	b/a/a/a/a/b/aj:d	J
    //   31: lsub
    //   32: putfield 41	b/a/a/a/a/b/aj:e	J
    //   35: aload_0
    //   36: invokespecial 64	b/a/a/a/a/b/aj:c	()V
    //   39: goto -28 -> 11
    //   42: astore_2
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_2
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	aj
    //   6	2	1	bool	boolean
    //   42	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	42	finally
    //   14	39	42	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */