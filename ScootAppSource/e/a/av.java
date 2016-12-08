package e.a;

import java.nio.ByteBuffer;

public class av
  extends aq
{
  private String d;
  private String e;
  private String f;
  private int g;
  private int h;
  private String i;
  
  public av()
  {
    super(new aw(a()));
  }
  
  public av(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    super(new aw("hdlr"));
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = "";
  }
  
  public static String a()
  {
    return "hdlr";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.put(az.a(this.d));
    paramByteBuffer.put(az.a(this.e));
    paramByteBuffer.put(az.a(this.f));
    paramByteBuffer.putInt(this.g);
    paramByteBuffer.putInt(this.h);
    if (this.i != null) {
      paramByteBuffer.put(az.a(this.i));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */