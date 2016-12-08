package e.a;

import java.nio.ByteBuffer;

public class y
  extends l
{
  private short a;
  private short c;
  private short d;
  private final String e = "nclc";
  
  public y()
  {
    super(new aw(a()));
  }
  
  public static String a()
  {
    return "colr";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(az.a("nclc"));
    paramByteBuffer.putShort(this.a);
    paramByteBuffer.putShort(this.c);
    paramByteBuffer.putShort(this.d);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */