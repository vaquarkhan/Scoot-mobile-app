package e.a;

import java.nio.ByteBuffer;

public class do
  extends aq
{
  int d;
  int e;
  int f;
  int g;
  
  public do()
  {
    super(new aw(a()));
  }
  
  public do(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(new aw(a()));
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramInt4;
  }
  
  public static String a()
  {
    return "vmhd";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putShort((short)this.d);
    paramByteBuffer.putShort((short)this.e);
    paramByteBuffer.putShort((short)this.f);
    paramByteBuffer.putShort((short)this.g);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */