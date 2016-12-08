package d;

import java.io.OutputStream;

final class g
  extends OutputStream
{
  g(f paramf) {}
  
  public void close() {}
  
  public void flush() {}
  
  public String toString()
  {
    return this + ".outputStream()";
  }
  
  public void write(int paramInt)
  {
    this.a.b((byte)paramInt);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.b(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */