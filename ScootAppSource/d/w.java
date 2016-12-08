package d;

import java.io.IOException;
import java.io.OutputStream;

final class w
  extends OutputStream
{
  w(v paramv) {}
  
  public void close()
  {
    this.a.close();
  }
  
  public void flush()
  {
    if (!v.a(this.a)) {
      this.a.flush();
    }
  }
  
  public String toString()
  {
    return this.a + ".outputStream()";
  }
  
  public void write(int paramInt)
  {
    if (v.a(this.a)) {
      throw new IOException("closed");
    }
    this.a.a.b((byte)paramInt);
    this.a.w();
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (v.a(this.a)) {
      throw new IOException("closed");
    }
    this.a.a.b(paramArrayOfByte, paramInt1, paramInt2);
    this.a.w();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */