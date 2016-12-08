package e.a;

import java.nio.ByteBuffer;

public class ct
  extends aq
{
  private short d;
  
  public ct()
  {
    super(new aw(a()));
  }
  
  public static String a()
  {
    return "smhd";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putShort(this.d);
    paramByteBuffer.putShort((short)0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */