package e.a;

import java.nio.ByteBuffer;

public class cg
  extends br
{
  private short a;
  
  public cg(aw paramaw)
  {
    super(paramaw);
  }
  
  public cg(aw paramaw, short paramShort)
  {
    super(paramaw);
    this.a = paramShort;
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(new byte[] { 0, 0, 0, 0, 0, 0 });
    paramByteBuffer.putShort(this.a);
  }
  
  protected void c(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */