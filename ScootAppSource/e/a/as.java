package e.a;

import java.nio.ByteBuffer;

public class as
  extends aq
{
  private short d;
  private short e;
  private short f;
  private short g;
  private short h;
  
  public as()
  {
    this(new aw(a()));
  }
  
  public as(aw paramaw)
  {
    super(paramaw);
  }
  
  public static String a()
  {
    return "gmin";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putShort(this.d);
    paramByteBuffer.putShort(this.e);
    paramByteBuffer.putShort(this.f);
    paramByteBuffer.putShort(this.g);
    paramByteBuffer.putShort(this.h);
    paramByteBuffer.putShort((short)0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */