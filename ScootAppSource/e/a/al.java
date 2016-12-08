package e.a;

import java.nio.ByteBuffer;

public class al
  extends l
{
  private int a;
  private int c;
  
  public al()
  {
    super(new aw(a()));
  }
  
  public static String a()
  {
    return "fiel";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)this.a);
    paramByteBuffer.put((byte)this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */