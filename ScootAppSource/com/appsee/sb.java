package com.appsee;

import android.graphics.Paint;
import java.io.File;
import java.util.EnumSet;

class sb
{
  public static final String A = "TEST-";
  private static sb M;
  private final int[] B = { 65280, -16776961, -16711936, -65536 };
  private boolean G;
  private final int[] l = { -65536, -16711936, -16776961, 65280 };
  
  public static sb C()
  {
    try
    {
      if (M == null) {
        M = new sb();
      }
      sb localsb = M;
      return localsb;
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
      arrayOfChar[i] = ((char)(j ^ 0x43));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x6E));
    }
    return new String(arrayOfChar);
  }
  
  public static boolean C(String paramString)
  {
    return paramString.startsWith("TEST-");
  }
  
  public void C()
  {
    if (this.G) {
      return;
    }
    this.G = true;
    File localFile = hp.H(String.format(bc.C("y\007y\007rQ/"), new Object[] { "TEST-", ye.C().a(), "mp4" }));
    for (;;)
    {
      int k;
      try
      {
        localDimension = new Dimension(ye.C().A(), ye.C().C());
        i = ye.C().a();
        k = (int)ye.C().a();
        l2 = wn.C();
        vd.C(1, wc.C("u\006S\025B\035X\023\026\000S\007BT@\035R\021YN\026\007_\016ST\013T\023\020NQRTP\006W\031S\006W\000ST\013T\023\020\026TF\025B\034\026I\026QE"), new Object[] { Integer.valueOf(localDimension.getWidth()), Integer.valueOf(localDimension.getHeight()), Integer.valueOf(k), localFile.getAbsolutePath() });
        localxb = new xb();
        localxb.C(localDimension.getWidth(), localDimension.getHeight(), i * 1024, k, localFile.getAbsolutePath(), ye.C().C().contains(xo.M));
        localbd = new bd(localDimension.getWidth(), localDimension.getHeight());
        localPaint = new Paint();
        localPaint.setStrokeWidth(0.0F);
        C(localbd, localDimension, localPaint, this.B);
        i = 0;
        l1 = 0L;
        j = 0;
      }
      catch (Exception localException)
      {
        Dimension localDimension;
        long l2;
        xb localxb;
        bd localbd;
        Paint localPaint;
        long l1;
        int m;
        ue.C(localException, wc.C("1D\006Y\006\026\035XTU\006S\025B\035X\023\026\000S\007BT@\035R\021Y"));
        hp.C(localFile);
        return;
      }
      finally
      {
        this.G = false;
      }
      C(localbd, localDimension, localPaint, this.l);
      if (j == k * 2) {
        C(localbd, localDimension, localPaint, this.B);
      }
      vd.C(1, bc.C("#.\035(\0352\023|\0009\007(T:\006=\0319N|Q8X| 5\0319N|Q8"), new Object[] { Integer.valueOf(j), Long.valueOf(l1) });
      localxb.C(localbd, l1);
      m = 1000000 / k;
      int i = j + 1;
      l1 = m + l1;
      int j = i;
      break label423;
      vd.H(1, wc.C("p\035X\035E\034_\032QTB\021E\000\026\002_\020S\033\030Z\030"));
      localxb.H();
      vd.C(1, bc.C("25\0325\0074\0218T?\006=\021(\0352\023|\0009\007(T*\0358\0213T5\032|Q8T1\0350\035/\021?\0332\020/"), new Object[] { Long.valueOf(wn.C() - l2) });
      localbd.K();
      this.G = false;
      return;
      label423:
      if (i <= k * 4) {
        if (j != k) {
          if (j != k * 3) {}
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\sb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */