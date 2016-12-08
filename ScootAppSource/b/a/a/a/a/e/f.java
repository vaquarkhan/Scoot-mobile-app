package b.a.a.a.a.e;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

final class f
  extends h<e>
{
  f(e parame, Closeable paramCloseable, boolean paramBoolean, InputStream paramInputStream, OutputStream paramOutputStream)
  {
    super(paramCloseable, paramBoolean);
  }
  
  public e a()
  {
    byte[] arrayOfByte = new byte[e.a(this.c)];
    for (;;)
    {
      int i = this.a.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      this.b.write(arrayOfByte, 0, i);
    }
    return this.c;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */