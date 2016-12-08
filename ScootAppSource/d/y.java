package d;

import java.io.IOException;
import java.io.InputStream;

final class y
  extends InputStream
{
  y(x paramx) {}
  
  public int available()
  {
    if (x.a(this.a)) {
      throw new IOException("closed");
    }
    return (int)Math.min(this.a.a.b, 2147483647L);
  }
  
  public void close()
  {
    this.a.close();
  }
  
  public int read()
  {
    if (x.a(this.a)) {
      throw new IOException("closed");
    }
    if ((this.a.a.b == 0L) && (this.a.b.read(this.a.a, 2048L) == -1L)) {
      return -1;
    }
    return this.a.a.i() & 0xFF;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (x.a(this.a)) {
      throw new IOException("closed");
    }
    ag.a(paramArrayOfByte.length, paramInt1, paramInt2);
    if ((this.a.a.b == 0L) && (this.a.b.read(this.a.a, 2048L) == -1L)) {
      return -1;
    }
    return this.a.a.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public String toString()
  {
    return this.a + ".inputStream()";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */