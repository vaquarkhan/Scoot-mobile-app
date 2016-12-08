package com.appsee;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class AppseeNativeExtensions
{
  private static final List<String> A = new ArrayList();
  private static final int B = 1024;
  private static boolean G = false;
  private static boolean M;
  private static boolean l = false;
  
  static
  {
    M = false;
  }
  
  public static String C(int paramInt1, int paramInt2, int paramInt3)
  {
    if (!M) {
      return null;
    }
    return createAndAttachEglImage(paramInt1, paramInt2, paramInt3);
  }
  
  public static String C(Bitmap paramBitmap, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!M) {
      return null;
    }
    return copyEglImageBufferToBitmap(paramBitmap, paramBoolean1, paramBoolean2);
  }
  
  public static String C(boolean paramBoolean)
  {
    if (!M) {
      return null;
    }
    return changeEGLSwapBehavior(paramBoolean);
  }
  
  public static void C()
  {
    if (!G) {
      return;
    }
    ei.H(new if());
  }
  
  public static void C(int paramInt1, int paramInt2, Bitmap paramBitmap, long paramLong, boolean paramBoolean)
  {
    if (!l) {
      return;
    }
    convertAndEncode(paramInt1, paramInt2, paramBitmap, paramLong, paramBoolean);
  }
  
  public static void C(int paramInt1, int paramInt2, Bitmap paramBitmap, ByteBuffer paramByteBuffer, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (!G) {
      return;
    }
    convertToYuv(paramInt1, paramInt2, paramBitmap, paramByteBuffer, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public static boolean C()
  {
    if (!l) {
      return false;
    }
    return finishEncoding();
  }
  
  public static boolean C(u paramu)
  {
    switch (xk.l[paramu.ordinal()])
    {
    default: 
      return true;
    case 1: 
      return a();
    }
    return A();
  }
  
  public static boolean C(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String[] paramArrayOfString, int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (!l) {
      return false;
    }
    return initEncoder(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfString, paramArrayOfInt, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public static String H()
  {
    if (!M) {
      return null;
    }
    return disposeEglImage();
  }
  
  public static boolean H()
  {
    bool = true;
    try
    {
      if (!M)
      {
        if (Build.VERSION.SDK_INT < 21) {}
        for (String str = sc.C("#y\022z\007l'n\016@\017h\005l5{\003y\022l\020");; str = bc.C("5,\004/\02191;\030\025\031=\0239#.\025,\0049\006qFm"))
        {
          C(str);
          M = true;
          return true;
        }
      }
      return bool;
    }
    catch (Throwable localThrowable)
    {
      ue.C(new Exception(localThrowable), sc.C("L\020{\r{Be\rh\006`\fnBg\003}\013\007)\007n\016)\013d\003n\007)\025{\003y\022l\020"));
      bool = false;
    }
  }
  
  public static void a()
  {
    if (!G) {
      return;
    }
    ei.H(new xh());
  }
  
  public static boolean a()
  {
    try
    {
      if (!G)
      {
        K();
        if ((!C(sc.C("\003{\017"))) && (!C(bc.C("\0315\004/"))) && (!C(sc.C("1T"))))
        {
          vd.C(1, bc.C("'7\035,\0045\032;T0\033=\0205\032;T=\004,\0079\021|\032=\0005\0029T9\f(\0212\0075\0332T0\035>T8\0019T(\033|\0352\002=\0305\020|7\f!|5\036=|\025.\0274\035(\021?\000)\0069"));
          return false;
        }
        C(sc.C("H\022y\021l\007G\003}\013\007L\032}\007g\021`\rg\021"));
        G = true;
        C();
      }
      return true;
    }
    catch (Throwable localThrowable)
    {
      ue.C(new Exception(localThrowable), bc.C("\031\006.\033.T0\033=\0205\032;T=\004,\0079\021{\007|\032=\0005\0029T9\f(\0212\007(\0353\032/"));
    }
    return false;
  }
  
  public static native void crashNative();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\AppseeNativeExtensions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */