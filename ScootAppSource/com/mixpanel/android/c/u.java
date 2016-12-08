package com.mixpanel.android.c;

import com.mixpanel.android.a.c.f;
import com.mixpanel.android.a.c.g;
import com.mixpanel.android.a.d.e;
import java.io.OutputStream;
import java.nio.ByteBuffer;

final class u
  extends OutputStream
{
  private u(p paramp) {}
  
  public void close()
  {
    try
    {
      p.c(this.a).a(e.b, p.c(), true);
      return;
    }
    catch (g localg)
    {
      throw new t(this.a, localg);
    }
    catch (f localf)
    {
      throw new t(this.a, localf);
    }
  }
  
  public void write(int paramInt)
  {
    write(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2);
    try
    {
      p.c(this.a).a(e.b, paramArrayOfByte, false);
      return;
    }
    catch (g paramArrayOfByte)
    {
      throw new t(this.a, paramArrayOfByte);
    }
    catch (f paramArrayOfByte)
    {
      throw new t(this.a, paramArrayOfByte);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */