package com.twitter.sdk.android.core.internal;

import java.util.Calendar;
import java.util.TimeZone;

public final class i
{
  public boolean a;
  public long b;
  private final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
  
  private boolean a(long paramLong1, long paramLong2)
  {
    this.c.setTimeInMillis(paramLong1);
    int i = this.c.get(6);
    int j = this.c.get(1);
    this.c.setTimeInMillis(paramLong2);
    int k = this.c.get(6);
    int m = this.c.get(1);
    return (i == k) && (j == m);
  }
  
  /* Error */
  public boolean a(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: aload_0
    //   4: monitorenter
    //   5: lload_1
    //   6: aload_0
    //   7: getfield 43	com/twitter/sdk/android/core/internal/i:b	J
    //   10: lsub
    //   11: ldc2_w 44
    //   14: lcmp
    //   15: ifle +46 -> 61
    //   18: iconst_1
    //   19: istore_3
    //   20: aload_0
    //   21: lload_1
    //   22: aload_0
    //   23: getfield 43	com/twitter/sdk/android/core/internal/i:b	J
    //   26: invokespecial 47	com/twitter/sdk/android/core/internal/i:a	(JJ)Z
    //   29: ifne +37 -> 66
    //   32: iconst_1
    //   33: istore 4
    //   35: aload_0
    //   36: getfield 49	com/twitter/sdk/android/core/internal/i:a	Z
    //   39: ifne +33 -> 72
    //   42: iload_3
    //   43: ifne +8 -> 51
    //   46: iload 4
    //   48: ifeq +24 -> 72
    //   51: aload_0
    //   52: iconst_1
    //   53: putfield 49	com/twitter/sdk/android/core/internal/i:a	Z
    //   56: aload_0
    //   57: monitorexit
    //   58: iload 5
    //   60: ireturn
    //   61: iconst_0
    //   62: istore_3
    //   63: goto -43 -> 20
    //   66: iconst_0
    //   67: istore 4
    //   69: goto -34 -> 35
    //   72: iconst_0
    //   73: istore 5
    //   75: goto -19 -> 56
    //   78: astore 6
    //   80: aload_0
    //   81: monitorexit
    //   82: aload 6
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	i
    //   0	85	1	paramLong	long
    //   19	44	3	i	int
    //   33	35	4	j	int
    //   1	73	5	bool	boolean
    //   78	5	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	18	78	finally
    //   20	32	78	finally
    //   35	42	78	finally
    //   51	56	78	finally
  }
  
  public void b(long paramLong)
  {
    try
    {
      this.a = false;
      this.b = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */