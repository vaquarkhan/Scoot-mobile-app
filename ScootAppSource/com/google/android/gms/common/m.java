package com.google.android.gms.common;

import java.util.Arrays;

final class m
  extends l
{
  private final byte[] a;
  
  m(byte[] paramArrayOfByte)
  {
    super(Arrays.copyOfRange(paramArrayOfByte, 0, 25));
    this.a = paramArrayOfByte;
  }
  
  byte[] c()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */