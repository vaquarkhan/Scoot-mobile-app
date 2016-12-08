package com.facebook.b;

import android.content.Intent;
import com.facebook.k;
import java.util.HashMap;
import java.util.Map;

public final class r
  implements k
{
  private static Map<Integer, s> a = new HashMap();
  private Map<Integer, s> b = new HashMap();
  
  private static s a(Integer paramInteger)
  {
    try
    {
      paramInteger = (s)a.get(paramInteger);
      return paramInteger;
    }
    finally
    {
      paramInteger = finally;
      throw paramInteger;
    }
  }
  
  /* Error */
  public static void a(int paramInt, s params)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_1
    //   4: ldc 35
    //   6: invokestatic 40	com/facebook/b/az:a	(Ljava/lang/Object;Ljava/lang/String;)V
    //   9: getstatic 19	com/facebook/b/r:a	Ljava/util/Map;
    //   12: iload_0
    //   13: invokestatic 46	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   16: invokeinterface 50 2 0
    //   21: istore_2
    //   22: iload_2
    //   23: ifeq +7 -> 30
    //   26: ldc 2
    //   28: monitorexit
    //   29: return
    //   30: getstatic 19	com/facebook/b/r:a	Ljava/util/Map;
    //   33: iload_0
    //   34: invokestatic 46	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   37: aload_1
    //   38: invokeinterface 54 3 0
    //   43: pop
    //   44: goto -18 -> 26
    //   47: astore_1
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	paramInt	int
    //   0	53	1	params	s
    //   21	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	22	47	finally
    //   30	44	47	finally
  }
  
  private static boolean b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    s locals = a(Integer.valueOf(paramInt1));
    if (locals != null) {
      return locals.a(paramInt2, paramIntent);
    }
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    s locals = (s)this.b.get(Integer.valueOf(paramInt1));
    if (locals != null) {
      return locals.a(paramInt2, paramIntent);
    }
    return b(paramInt1, paramInt2, paramIntent);
  }
  
  public void b(int paramInt, s params)
  {
    az.a(params, "callback");
    this.b.put(Integer.valueOf(paramInt), params);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */