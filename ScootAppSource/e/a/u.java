package e.a;

import java.nio.ByteBuffer;

public class u
  extends l
{
  private int a;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  
  public u()
  {
    super(new aw(a()));
  }
  
  public static String a()
  {
    return "clap";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.i);
    paramByteBuffer.putInt(this.h);
    paramByteBuffer.putInt(this.g);
    paramByteBuffer.putInt(this.f);
    paramByteBuffer.putInt(this.e);
    paramByteBuffer.putInt(this.d);
    paramByteBuffer.putInt(this.c);
    paramByteBuffer.putInt(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */