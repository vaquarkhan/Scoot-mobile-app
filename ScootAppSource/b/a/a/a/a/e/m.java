package b.a.a.a.a.e;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public final class m
  extends BufferedOutputStream
{
  private final CharsetEncoder a;
  
  public m(OutputStream paramOutputStream, String paramString, int paramInt)
  {
    super(paramOutputStream, paramInt);
    this.a = Charset.forName(e.e(paramString)).newEncoder();
  }
  
  public m a(String paramString)
  {
    paramString = this.a.encode(CharBuffer.wrap(paramString));
    super.write(paramString.array(), 0, paramString.limit());
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\e\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */