package e.a;

import java.nio.ByteBuffer;

public class ch
  extends aq
{
  private int d;
  private int e;
  private int[] f;
  
  public ch()
  {
    super(new aw(a()));
  }
  
  public ch(int[] paramArrayOfInt)
  {
    this();
    this.f = paramArrayOfInt;
  }
  
  public static String a()
  {
    return "stsz";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(this.d);
    if (this.d == 0)
    {
      paramByteBuffer.putInt(this.f.length);
      int[] arrayOfInt = this.f;
      int j = arrayOfInt.length;
      int i = 0;
      while (i < j)
      {
        paramByteBuffer.putInt((int)arrayOfInt[i]);
        i += 1;
      }
    }
    paramByteBuffer.putInt(this.e);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */