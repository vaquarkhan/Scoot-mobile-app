package com.appsee;

class qi
{
  private long A;
  private String B;
  private int G;
  private double l;
  
  public qi(String paramString)
  {
    this.B = paramString;
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
      arrayOfChar[i] = ((char)(j ^ 0x54));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x6E));
    }
    return new String(arrayOfChar);
  }
  
  public int C()
  {
    if (this.G == 0) {
      return -1;
    }
    return (int)(this.l / this.G);
  }
  
  public void C()
  {
    vd.C(1, lb.C("%\000%\036>M;\026>Z2\036&\036>Z;Sh"), new Object[] { this.B, Integer.valueOf(this.G), Integer.valueOf(C()) });
  }
  
  public void H()
  {
    if (this.A == 0L) {
      return;
    }
    long l1 = (System.nanoTime() - this.A) / 1000000L;
    this.A = 0L;
    double d = this.l;
    this.l = (l1 + d);
    this.G += 1;
  }
  
  public void K()
  {
    this.A = System.nanoTime();
  }
  
  public void a()
  {
    this.G = 0;
    this.l = 0;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */