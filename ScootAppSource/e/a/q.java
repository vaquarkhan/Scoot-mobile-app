package e.a;

import java.nio.ByteBuffer;

public class q
  extends aq
{
  private int d;
  private int e;
  private r[] f;
  
  public q()
  {
    super(new aw(a()));
  }
  
  public static String a()
  {
    return "chan";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(this.d);
    paramByteBuffer.putInt(this.e);
    paramByteBuffer.putInt(this.f.length);
    r[] arrayOfr = this.f;
    int j = arrayOfr.length;
    int i = 0;
    while (i < j)
    {
      r localr = arrayOfr[i];
      paramByteBuffer.putInt(localr.a());
      paramByteBuffer.putInt(localr.b());
      paramByteBuffer.putFloat(localr.c()[0]);
      paramByteBuffer.putFloat(localr.c()[1]);
      paramByteBuffer.putFloat(localr.c()[2]);
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */