package com.appsee;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;

class bd
{
  private Bitmap A;
  private Canvas B;
  private boolean G = false;
  private boolean l = false;
  
  public bd(int paramInt1, int paramInt2)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    this.A = localBitmap;
    this.B = new Canvas(localBitmap);
  }
  
  public Bitmap C()
  {
    try
    {
      Bitmap localBitmap = this.A;
      return localBitmap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public Canvas C()
  {
    try
    {
      Canvas localCanvas = this.B;
      return localCanvas;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void C()
  {
    try
    {
      this.l = false;
      if (this.G) {
        a();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean C()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 20	com/appsee/bd:l	Z
    //   8: ifne +12 -> 20
    //   11: aload_0
    //   12: getfield 18	com/appsee/bd:G	Z
    //   15: istore_2
    //   16: iload_2
    //   17: ifeq +9 -> 26
    //   20: iconst_0
    //   21: istore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_1
    //   25: ireturn
    //   26: aload_0
    //   27: iconst_1
    //   28: putfield 20	com/appsee/bd:l	Z
    //   31: goto -9 -> 22
    //   34: astore_3
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_3
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	bd
    //   1	24	1	bool1	boolean
    //   15	2	2	bool2	boolean
    //   34	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	16	34	finally
    //   26	31	34	finally
  }
  
  public void H()
  {
    try
    {
      if (this.l) {
        throw new RuntimeException(sc.C(" |\004o\007{B`\021)\003e\020l\003m\033)\016f\001b\007mC"));
      }
    }
    finally {}
    if (this.G) {
      throw new RuntimeException(bc.C("6)\022:\021.T?\0252\0323\000|\0269T0\033?\0379\020|\0269\027=\001/\021|\035(\007|\0250\0069\0258\r|\0269\0212T?\0309\0252\0218"));
    }
    this.l = true;
  }
  
  public void K()
  {
    try
    {
      this.G = true;
      if (!this.l) {
        a();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */