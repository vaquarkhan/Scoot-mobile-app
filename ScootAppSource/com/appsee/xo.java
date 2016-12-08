package com.appsee;

import java.util.EnumSet;

 enum xo
{
  private final long G;
  
  static
  {
    A = new xo(sc.C("2[+G6V4@1\\#E=]0L'V6F=O+E'"), 1, 2L);
    M = new xo(mb.C("K\013@\033W\001U\033A\026F\tB"), 2, 4L);
  }
  
  public static EnumSet<xo> C(long paramLong)
  {
    EnumSet localEnumSet = EnumSet.noneOf(xo.class);
    xo[] arrayOfxo = values();
    int k = arrayOfxo.length;
    int i = 0;
    for (int j = 0; i < k; j = i)
    {
      xo localxo = arrayOfxo[j];
      if ((localxo.G & paramLong) == localxo.G) {
        localEnumSet.add(localxo);
      }
      i = j + 1;
    }
    return localEnumSet;
  }
  
  public long C()
  {
    return this.G;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\xo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */