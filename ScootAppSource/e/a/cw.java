package e.a;

import java.nio.ByteBuffer;

public class cw
  extends aq
{
  private cx[] d;
  
  public cw()
  {
    super(new aw(a()));
  }
  
  public cw(cx[] paramArrayOfcx)
  {
    super(new aw(a()));
    this.d = paramArrayOfcx;
  }
  
  public static String a()
  {
    return "stts";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(this.d.length);
    cx[] arrayOfcx = this.d;
    int j = arrayOfcx.length;
    int i = 0;
    while (i < j)
    {
      cx localcx = arrayOfcx[i];
      paramByteBuffer.putInt(localcx.a());
      paramByteBuffer.putInt(localcx.b());
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */