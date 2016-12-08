package e.a;

import java.nio.ByteBuffer;

public final class bn
{
  public bo a;
  public int b;
  
  public bn(bo parambo, int paramInt)
  {
    this.a = parambo;
    this.b = paramInt;
  }
  
  public static bn a(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get() & 0xFF;
    return new bn(bo.a(i & 0x1F), i >> 5 & 0x3);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */