package e.a;

import java.nio.ByteBuffer;

public class dc
  extends cg
{
  private static final dd a = new dd();
  private int e;
  private int f;
  private int g;
  private byte h;
  
  public dc()
  {
    super(new aw("tmcd"));
    this.d = a;
  }
  
  public dc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(new aw("tmcd"));
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = ((byte)paramInt4);
  }
  
  public void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(this.b.b() + ": {\n");
    paramStringBuilder.append("entry: ");
    de.a(this, paramStringBuilder, new String[] { "flags", "timescale", "frameDuration", "numFrames" });
    paramStringBuilder.append(",\nexts: [\n");
    b(paramStringBuilder);
    paramStringBuilder.append("\n]\n");
    paramStringBuilder.append("}\n");
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(0);
    paramByteBuffer.putInt(this.e);
    paramByteBuffer.putInt(this.f);
    paramByteBuffer.putInt(this.g);
    paramByteBuffer.put(this.h);
    paramByteBuffer.put((byte)-49);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */