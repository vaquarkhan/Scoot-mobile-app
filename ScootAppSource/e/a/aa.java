package e.a;

import java.nio.ByteBuffer;

public class aa
  extends aq
{
  private ab[] d;
  
  public aa()
  {
    super(new aw(a()));
  }
  
  public aa(ab[] paramArrayOfab)
  {
    super(new aw(a()));
    this.d = paramArrayOfab;
  }
  
  public static String a()
  {
    return "ctts";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(this.d.length);
    int i = 0;
    while (i < this.d.length)
    {
      paramByteBuffer.putInt(this.d[i].a);
      paramByteBuffer.putInt(this.d[i].b);
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */