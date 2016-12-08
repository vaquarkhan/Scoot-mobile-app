package e.a;

import java.nio.ByteBuffer;

public class bj
  extends aq
{
  private long d;
  private long e;
  private int f;
  private long g;
  private int h;
  private int i;
  
  public bj()
  {
    super(new aw(a()));
  }
  
  public bj(int paramInt1, long paramLong1, int paramInt2, long paramLong2, long paramLong3, int paramInt3)
  {
    super(new aw(a()));
    this.f = paramInt1;
    this.g = paramLong1;
    this.h = paramInt2;
    this.d = paramLong2;
    this.e = paramLong3;
    this.i = paramInt3;
  }
  
  public static String a()
  {
    return "mdhd";
  }
  
  protected void a(StringBuilder paramStringBuilder)
  {
    super.a(paramStringBuilder);
    paramStringBuilder.append(": ");
    de.a(this, paramStringBuilder, new String[] { "created", "modified", "timescale", "duration", "language", "quality" });
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(cy.a(this.d));
    paramByteBuffer.putInt(cy.a(this.e));
    paramByteBuffer.putInt(this.f);
    paramByteBuffer.putInt((int)this.g);
    paramByteBuffer.putShort((short)this.h);
    paramByteBuffer.putShort((short)this.i);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */