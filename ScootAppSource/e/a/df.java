package e.a;

import java.nio.ByteBuffer;

public class df
  extends aq
{
  private int d;
  private long e;
  private float f;
  private float g;
  private long h;
  private long i;
  private float j;
  private short k;
  private long l;
  private int[] m;
  
  public df()
  {
    super(new aw(a()));
  }
  
  public df(int paramInt, long paramLong1, float paramFloat1, float paramFloat2, long paramLong2, long paramLong3, float paramFloat3, short paramShort, long paramLong4, int[] paramArrayOfInt)
  {
    super(new aw(a()));
    this.d = paramInt;
    this.e = paramLong1;
    this.f = paramFloat1;
    this.g = paramFloat2;
    this.h = paramLong2;
    this.i = paramLong3;
    this.j = paramFloat3;
    this.k = paramShort;
    this.l = paramLong4;
    this.m = paramArrayOfInt;
  }
  
  public static String a()
  {
    return "tkhd";
  }
  
  private void c(ByteBuffer paramByteBuffer)
  {
    int n = 0;
    while (n < 9)
    {
      paramByteBuffer.putInt(this.m[n]);
      n += 1;
    }
  }
  
  private void d(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort((short)(int)(this.j * 256.0D));
  }
  
  protected void a(StringBuilder paramStringBuilder)
  {
    super.a(paramStringBuilder);
    paramStringBuilder.append(": ");
    de.a(this, paramStringBuilder, new String[] { "trackId", "duration", "width", "height", "created", "modified", "volume", "layer", "altGroup" });
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(cy.a(this.h));
    paramByteBuffer.putInt(cy.a(this.i));
    paramByteBuffer.putInt(this.d);
    paramByteBuffer.putInt(0);
    paramByteBuffer.putInt((int)this.e);
    paramByteBuffer.putInt(0);
    paramByteBuffer.putInt(0);
    paramByteBuffer.putShort(this.k);
    paramByteBuffer.putShort((short)(int)this.l);
    d(paramByteBuffer);
    paramByteBuffer.putShort((short)0);
    c(paramByteBuffer);
    paramByteBuffer.putInt((int)(this.f * 65536.0F));
    paramByteBuffer.putInt((int)(this.g * 65536.0F));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */