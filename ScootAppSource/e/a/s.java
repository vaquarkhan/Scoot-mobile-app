package e.a;

import java.nio.ByteBuffer;

public class s
  extends aq
{
  private long[] d;
  
  public s()
  {
    super(new aw(a(), 0L));
  }
  
  public s(long[] paramArrayOfLong)
  {
    this();
    this.d = paramArrayOfLong;
  }
  
  public static String a()
  {
    return "co64";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(this.d.length);
    long[] arrayOfLong = this.d;
    int j = arrayOfLong.length;
    int i = 0;
    while (i < j)
    {
      paramByteBuffer.putLong(arrayOfLong[i]);
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */