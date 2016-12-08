package com.google.android.gms.b;

public final class p
{
  public static final int[] a = new int[0];
  public static final long[] b = new long[0];
  public static final float[] c = new float[0];
  public static final double[] d = new double[0];
  public static final boolean[] e = new boolean[0];
  public static final String[] f = new String[0];
  public static final byte[][] g = new byte[0][];
  public static final byte[] h = new byte[0];
  
  static int a(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static final int a(d paramd, int paramInt)
  {
    int i = 1;
    int j = paramd.k();
    paramd.b(paramInt);
    while (paramd.a() == paramInt)
    {
      paramd.b(paramInt);
      i += 1;
    }
    paramd.e(j);
    return i;
  }
  
  public static int b(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */