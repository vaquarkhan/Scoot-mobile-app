package e.a;

import java.nio.ByteBuffer;

public class bw
  extends l
{
  private int a;
  private int c;
  
  public bw()
  {
    super(new aw(b()));
  }
  
  public static String b()
  {
    return "pasp";
  }
  
  public bz a()
  {
    return new bz(this.a, this.c);
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.a);
    paramByteBuffer.putInt(this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */