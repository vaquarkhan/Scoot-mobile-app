package e.a;

import java.nio.ByteBuffer;

public class ci
  extends aq
{
  private cj[] d;
  
  public ci()
  {
    super(new aw(a()));
  }
  
  public ci(cj[] paramArrayOfcj)
  {
    super(new aw(a()));
    this.d = paramArrayOfcj;
  }
  
  public static String a()
  {
    return "stsc";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(this.d.length);
    cj[] arrayOfcj = this.d;
    int j = arrayOfcj.length;
    int i = 0;
    while (i < j)
    {
      cj localcj = arrayOfcj[i];
      paramByteBuffer.putInt((int)localcj.a());
      paramByteBuffer.putInt(localcj.b());
      paramByteBuffer.putInt(localcj.c());
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */