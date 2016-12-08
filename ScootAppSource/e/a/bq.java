package e.a;

import java.nio.ByteBuffer;

public class bq
  extends l
{
  private String a;
  
  public bq()
  {
    super(new aw(a()));
  }
  
  public bq(String paramString)
  {
    this();
    this.a = paramString;
  }
  
  public static String a()
  {
    return "name";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(az.a(this.a));
    paramByteBuffer.putInt(0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */