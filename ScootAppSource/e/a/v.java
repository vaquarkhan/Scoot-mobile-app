package e.a;

import java.nio.ByteBuffer;

public class v
  extends aq
{
  private float d;
  private float e;
  
  public v()
  {
    super(new aw(a()));
  }
  
  public v(int paramInt1, int paramInt2)
  {
    this();
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public v(aw paramaw)
  {
    super(paramaw);
  }
  
  public v(aw paramaw, int paramInt1, int paramInt2)
  {
    super(paramaw);
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public static String a()
  {
    return "clef";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt((int)(this.d * 65536.0F));
    paramByteBuffer.putInt((int)(this.e * 65536.0F));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */