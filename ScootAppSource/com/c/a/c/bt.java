package com.c.a.c;

import b.a.a.a.a.b.ag;
import java.io.InputStream;

final class bt
  implements ag
{
  bt(bs parambs, byte[] paramArrayOfByte, int[] paramArrayOfInt) {}
  
  public void a(InputStream paramInputStream, int paramInt)
  {
    try
    {
      paramInputStream.read(this.a, this.b[0], paramInt);
      int[] arrayOfInt = this.b;
      arrayOfInt[0] += paramInt;
      return;
    }
    finally
    {
      paramInputStream.close();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */