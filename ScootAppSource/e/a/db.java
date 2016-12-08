package e.a;

import java.nio.ByteBuffer;

public class db
  extends aq
{
  private short d;
  private short e;
  private short f;
  private short[] g = new short[3];
  private short[] h = new short[3];
  private String i;
  
  public db(aw paramaw)
  {
    super(paramaw);
  }
  
  public db(short paramShort1, short paramShort2, short paramShort3, short[] paramArrayOfShort1, short[] paramArrayOfShort2, String paramString)
  {
    this(new aw(a()));
    this.d = paramShort1;
    this.e = paramShort2;
    this.f = paramShort3;
    this.i = paramString;
  }
  
  public static String a()
  {
    return "tcmi";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putShort(this.d);
    paramByteBuffer.putShort(this.e);
    paramByteBuffer.putShort(this.f);
    paramByteBuffer.putShort((short)0);
    paramByteBuffer.putShort(this.g[0]);
    paramByteBuffer.putShort(this.g[1]);
    paramByteBuffer.putShort(this.g[2]);
    paramByteBuffer.putShort(this.h[0]);
    paramByteBuffer.putShort(this.h[1]);
    paramByteBuffer.putShort(this.h[2]);
    bp.a(paramByteBuffer, this.i);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */