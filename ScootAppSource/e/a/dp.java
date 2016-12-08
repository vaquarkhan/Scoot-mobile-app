package e.a;

import java.nio.ByteBuffer;

public class dp
  extends cg
{
  private static final dq a = new dq();
  private short e;
  private short f;
  private String g;
  private int h;
  private int i;
  private short j;
  private short k;
  private float l;
  private float m;
  private short n;
  private String o;
  private short p;
  private short q;
  
  public dp(aw paramaw, short paramShort1, short paramShort2, String paramString1, int paramInt1, int paramInt2, short paramShort3, short paramShort4, long paramLong1, long paramLong2, short paramShort5, String paramString2, short paramShort6, short paramShort7, short paramShort8)
  {
    super(paramaw, paramShort7);
    this.d = a;
    this.e = paramShort1;
    this.f = paramShort2;
    this.g = paramString1;
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramShort3;
    this.k = paramShort4;
    this.l = ((float)paramLong1);
    this.m = ((float)paramLong2);
    this.n = paramShort5;
    this.o = paramString2;
    this.p = paramShort6;
    this.q = paramShort8;
  }
  
  public int a()
  {
    return this.j;
  }
  
  public void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(this.b.b() + ": {\n");
    paramStringBuilder.append("entry: ");
    de.a(this, paramStringBuilder, new String[] { "version", "revision", "vendor", "temporalQual", "spacialQual", "width", "height", "hRes", "vRes", "frameCount", "compressorName", "depth", "clrTbl" });
    paramStringBuilder.append(",\nexts: [\n");
    b(paramStringBuilder);
    paramStringBuilder.append("\n]\n");
    paramStringBuilder.append("}\n");
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putShort(this.e);
    paramByteBuffer.putShort(this.f);
    paramByteBuffer.put(az.a(this.g), 0, 4);
    paramByteBuffer.putInt(this.h);
    paramByteBuffer.putInt(this.i);
    paramByteBuffer.putShort(this.j);
    paramByteBuffer.putShort(this.k);
    paramByteBuffer.putInt((int)(this.l * 65536.0F));
    paramByteBuffer.putInt((int)(this.m * 65536.0F));
    paramByteBuffer.putInt(0);
    paramByteBuffer.putShort(this.n);
    bp.a(paramByteBuffer, this.o, 31);
    paramByteBuffer.putShort(this.p);
    paramByteBuffer.putShort(this.q);
    c(paramByteBuffer);
  }
  
  public int c()
  {
    return this.k;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */