package e.a;

import java.nio.ByteBuffer;

public class bb
  extends l
{
  private int a;
  private int c;
  private int d;
  private int e;
  
  public bb()
  {
    super(new aw(a()));
  }
  
  public static String a()
  {
    return "load";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.a);
    paramByteBuffer.putInt(this.c);
    paramByteBuffer.putInt(this.d);
    paramByteBuffer.putInt(this.e);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */