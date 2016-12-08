package com.mixpanel.android.mpmetrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class bl
{
  private final Map<String, bn> a = new HashMap();
  private final List<bm> b = new ArrayList();
  
  public Map<String, bn> a()
  {
    try
    {
      HashMap localHashMap = new HashMap(this.a);
      return localHashMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(bm parambm)
  {
    if (parambm == null) {
      try
      {
        throw new NullPointerException("listener cannot be null");
      }
      finally {}
    }
    this.b.add(parambm);
  }
  
  /* Error */
  public void a(String paramString, Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 19	com/mixpanel/android/mpmetrics/bl:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 51 2 0
    //   12: ifne +36 -> 48
    //   15: ldc 53
    //   17: new 55	java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   24: ldc 58
    //   26: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: aload_1
    //   30: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: ldc 64
    //   35: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: invokestatic 74	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   44: pop
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: aload_0
    //   49: getfield 19	com/mixpanel/android/mpmetrics/bl:a	Ljava/util/Map;
    //   52: aload_1
    //   53: invokeinterface 78 2 0
    //   58: checkcast 80	com/mixpanel/android/mpmetrics/bn
    //   61: aload_2
    //   62: invokevirtual 83	com/mixpanel/android/mpmetrics/bn:a	(Ljava/lang/Object;)Lcom/mixpanel/android/mpmetrics/bn;
    //   65: astore_2
    //   66: aload_0
    //   67: getfield 19	com/mixpanel/android/mpmetrics/bl:a	Ljava/util/Map;
    //   70: aload_1
    //   71: aload_2
    //   72: invokeinterface 87 3 0
    //   77: pop
    //   78: goto -33 -> 45
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	bl
    //   0	86	1	paramString	String
    //   0	86	2	paramObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	45	81	finally
    //   48	78	81	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */