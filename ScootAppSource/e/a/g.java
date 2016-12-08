package e.a;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class g
  extends cg
{
  public static Set<String> a;
  private static final h e = new h();
  private short f;
  private short g;
  private float h;
  private short i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private short q;
  private int r;
  
  static
  {
    a = new HashSet();
    a.add("raw ");
    a.add("twos");
    a.add("sowt");
    a.add("fl32");
    a.add("fl64");
    a.add("in24");
    a.add("in32");
    a.add("lpcm");
  }
  
  public void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(this.b.b() + ": {\n");
    paramStringBuilder.append("entry: ");
    de.a(this, paramStringBuilder, new String[] { "channelCount", "sampleSize", "sampleRat", "revision", "vendor", "compressionId", "pktSize", "samplesPerPkt", "bytesPerPkt", "bytesPerFrame", "bytesPerSample", "version", "lpcmFlags" });
    paramStringBuilder.append(",\nexts: [\n");
    b(paramStringBuilder);
    paramStringBuilder.append("\n]\n");
    paramStringBuilder.append("}\n");
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putShort(this.q);
    paramByteBuffer.putShort(this.i);
    paramByteBuffer.putInt(this.j);
    if (this.q < 2)
    {
      paramByteBuffer.putShort(this.f);
      if (this.q == 0)
      {
        paramByteBuffer.putShort(this.g);
        paramByteBuffer.putShort((short)this.k);
        paramByteBuffer.putShort((short)this.l);
        paramByteBuffer.putInt((int)Math.round(this.h * 65536.0D));
        if (this.q == 1)
        {
          paramByteBuffer.putInt(this.m);
          paramByteBuffer.putInt(this.n);
          paramByteBuffer.putInt(this.o);
          paramByteBuffer.putInt(this.p);
          c(paramByteBuffer);
        }
      }
    }
    while (this.q != 2) {
      for (;;)
      {
        return;
        paramByteBuffer.putShort((short)16);
      }
    }
    paramByteBuffer.putShort((short)3);
    paramByteBuffer.putShort((short)16);
    paramByteBuffer.putShort((short)-2);
    paramByteBuffer.putShort((short)0);
    paramByteBuffer.putInt(65536);
    paramByteBuffer.putInt(72);
    paramByteBuffer.putLong(Double.doubleToLongBits(this.h));
    paramByteBuffer.putInt(this.f);
    paramByteBuffer.putInt(2130706432);
    paramByteBuffer.putInt(this.g);
    paramByteBuffer.putInt(this.r);
    paramByteBuffer.putInt(this.o);
    paramByteBuffer.putInt(this.m);
    c(paramByteBuffer);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */