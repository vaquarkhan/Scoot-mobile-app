package e.a;

import java.nio.ByteBuffer;

public class t
  extends aq
{
  private long[] d;
  
  public t()
  {
    super(new aw(a()));
  }
  
  public static String a()
  {
    return "stco";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(this.d.length);
    long[] arrayOfLong = this.d;
    int j = arrayOfLong.length;
    int i = 0;
    while (i < j)
    {
      paramByteBuffer.putInt((int)arrayOfLong[i]);
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */