package e.a;

import java.nio.ByteBuffer;

public class bm
  extends aq
{
  private int d;
  private long e;
  private float f;
  private float g;
  private long h;
  private long i;
  private int[] j;
  private int k;
  
  public bm()
  {
    super(new aw(a()));
  }
  
  public bm(int paramInt1, long paramLong1, float paramFloat1, float paramFloat2, long paramLong2, long paramLong3, int[] paramArrayOfInt, int paramInt2)
  {
    super(new aw(a()));
    this.d = paramInt1;
    this.e = paramLong1;
    this.f = paramFloat1;
    this.g = paramFloat2;
    this.h = paramLong2;
    this.i = paramLong3;
    this.j = paramArrayOfInt;
    this.k = paramInt2;
  }
  
  public static String a()
  {
    return "mvhd";
  }
  
  private void a(ByteBuffer paramByteBuffer, float paramFloat)
  {
    paramByteBuffer.putShort((short)(int)(paramFloat * 256.0D));
  }
  
  private void b(ByteBuffer paramByteBuffer, float paramFloat)
  {
    paramByteBuffer.putInt((int)(paramFloat * 65536.0D));
  }
  
  private void c(ByteBuffer paramByteBuffer)
  {
    int m = 0;
    while (m < Math.min(9, this.j.length))
    {
      paramByteBuffer.putInt(this.j[m]);
      m += 1;
    }
    m = Math.min(9, this.j.length);
    while (m < 9)
    {
      paramByteBuffer.putInt(0);
      m += 1;
    }
  }
  
  protected void a(StringBuilder paramStringBuilder)
  {
    super.a(paramStringBuilder);
    paramStringBuilder.append(": ");
    de.a(this, paramStringBuilder, new String[] { "timescale", "duration", "rate", "volume", "created", "modified", "nextTrackId" });
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(cy.a(this.h));
    paramByteBuffer.putInt(cy.a(this.i));
    paramByteBuffer.putInt(this.d);
    paramByteBuffer.putInt((int)this.e);
    b(paramByteBuffer, this.f);
    a(paramByteBuffer, this.g);
    paramByteBuffer.put(new byte[10]);
    c(paramByteBuffer);
    paramByteBuffer.put(new byte[24]);
    paramByteBuffer.putInt(this.k);
  }
  
  public int b()
  {
    return this.d;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */