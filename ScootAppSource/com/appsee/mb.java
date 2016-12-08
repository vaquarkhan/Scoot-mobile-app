package com.appsee;

import android.os.Handler;
import android.os.Looper;

class mb
{
  private Object A = new Object();
  private boolean B = false;
  private Handler G = new Handler(Looper.getMainLooper());
  private Runnable l = null;
  
  public mb(e parame, int paramInt)
  {
    this.l = new db(this, parame, paramInt);
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
      arrayOfChar[i] = ((char)(j ^ 0x7));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x44));
    }
    return new String(arrayOfChar);
  }
  
  /* Error */
  public void C()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/appsee/mb:A	Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_1
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 34	com/appsee/mb:B	Z
    //   13: ifeq +19 -> 32
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield 34	com/appsee/mb:B	Z
    //   21: aload_0
    //   22: getfield 30	com/appsee/mb:G	Landroid/os/Handler;
    //   25: aload_0
    //   26: getfield 32	com/appsee/mb:l	Ljava/lang/Runnable;
    //   29: invokevirtual 64	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   32: aload_1
    //   33: monitorexit
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_2
    //   38: aload_1
    //   39: monitorexit
    //   40: aload_2
    //   41: athrow
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	mb
    //   42	4	1	localObject2	Object
    //   37	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   9	32	37	finally
    //   32	34	37	finally
    //   38	40	37	finally
    //   2	9	42	finally
    //   40	42	42	finally
  }
  
  /* Error */
  public void H()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/appsee/mb:A	Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_1
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 34	com/appsee/mb:B	Z
    //   13: ifne +20 -> 33
    //   16: aload_0
    //   17: iconst_1
    //   18: putfield 34	com/appsee/mb:B	Z
    //   21: aload_0
    //   22: getfield 30	com/appsee/mb:G	Landroid/os/Handler;
    //   25: aload_0
    //   26: getfield 32	com/appsee/mb:l	Ljava/lang/Runnable;
    //   29: invokevirtual 69	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   32: pop
    //   33: aload_1
    //   34: monitorexit
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: astore_2
    //   39: aload_1
    //   40: monitorexit
    //   41: aload_2
    //   42: athrow
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	mb
    //   43	4	1	localObject2	Object
    //   38	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   9	33	38	finally
    //   33	35	38	finally
    //   39	41	38	finally
    //   2	9	43	finally
    //   41	43	43	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */