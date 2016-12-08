package e.a;

import java.nio.ByteBuffer;
import java.util.List;

public class ad
  extends br
{
  private static final ae a = new ae();
  
  public ad()
  {
    this(new aw(a()));
  }
  
  private ad(aw paramaw)
  {
    super(paramaw);
    this.d = a;
  }
  
  public static String a()
  {
    return "dref";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(0);
    paramByteBuffer.putInt(this.c.size());
    super.a(paramByteBuffer);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */