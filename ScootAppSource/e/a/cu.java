package e.a;

import java.nio.ByteBuffer;

public class cu
  extends aq
{
  private int[] d;
  
  public cu()
  {
    super(new aw(a()));
  }
  
  public cu(int[] paramArrayOfInt)
  {
    this();
    this.d = paramArrayOfInt;
  }
  
  public static String a()
  {
    return "stss";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(this.d.length);
    int i = 0;
    while (i < this.d.length)
    {
      paramByteBuffer.putInt(this.d[i]);
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */