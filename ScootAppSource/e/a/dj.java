package e.a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class dj
  extends aq
{
  private String d;
  
  public static String a()
  {
    return "url ";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    Charset localCharset = Charset.forName("utf-8");
    if (this.d != null)
    {
      bp.a(paramByteBuffer, ByteBuffer.wrap(this.d.getBytes(localCharset)));
      paramByteBuffer.put((byte)0);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */