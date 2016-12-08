package com.scootapp.taxiapp.utils;

public abstract class b
{
  public static boolean a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length < 1) {
      return false;
    }
    int j = paramArrayOfInt.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label31;
      }
      if (paramArrayOfInt[i] != 0) {
        break;
      }
      i += 1;
    }
    label31:
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\taxiapp\utils\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */