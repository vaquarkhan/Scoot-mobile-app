package e.a;

import java.nio.ByteBuffer;

public class w
  extends l
{
  private short a;
  private short c;
  private short d;
  private short e;
  private short f;
  
  public w()
  {
    super(new aw(a()));
  }
  
  public static String a()
  {
    return "crgn";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.a);
    paramByteBuffer.putShort(this.c);
    paramByteBuffer.putShort(this.d);
    paramByteBuffer.putShort(this.e);
    paramByteBuffer.putShort(this.f);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */