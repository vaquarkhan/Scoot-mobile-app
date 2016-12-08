package b.a.a.a.a.b;

import java.io.InputStream;
import java.io.RandomAccessFile;

final class af
  extends InputStream
{
  private int b;
  private int c;
  
  private af(ac paramac, ae paramae)
  {
    this.b = ac.a(paramac, paramae.b + 4);
    this.c = paramae.c;
  }
  
  public int read()
  {
    if (this.c == 0) {
      return -1;
    }
    ac.a(this.a).seek(this.b);
    int i = ac.a(this.a).read();
    this.b = ac.a(this.a, this.b + 1);
    this.c -= 1;
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ac.a(paramArrayOfByte, "buffer");
    if (((paramInt1 | paramInt2) < 0) || (paramInt2 > paramArrayOfByte.length - paramInt1)) {
      throw new ArrayIndexOutOfBoundsException();
    }
    if (this.c > 0)
    {
      int i = paramInt2;
      if (paramInt2 > this.c) {
        i = this.c;
      }
      ac.a(this.a, this.b, paramArrayOfByte, paramInt1, i);
      this.b = ac.a(this.a, this.b + i);
      this.c -= i;
      return i;
    }
    return -1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */