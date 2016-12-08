package com.twitter.sdk.android.core.internal.scribe;

import b.a.a.a.a.b.ag;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

final class k
  implements ag
{
  k(ScribeFilesSender paramScribeFilesSender, boolean[] paramArrayOfBoolean, ByteArrayOutputStream paramByteArrayOutputStream) {}
  
  public void a(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramInputStream.read(arrayOfByte);
    if (this.a[0] != 0) {
      this.b.write(ScribeFilesSender.b());
    }
    for (;;)
    {
      this.b.write(arrayOfByte);
      return;
      this.a[0] = true;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */