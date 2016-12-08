package e.a;

import java.nio.ByteBuffer;

public class aq
  extends l
{
  protected byte a;
  protected int c;
  
  public aq(aw paramaw)
  {
    super(paramaw);
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.a << 24 | this.c & 0xFFFFFF);
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */