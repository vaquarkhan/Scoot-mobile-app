package e.a;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class d
  extends aq
{
  private static Set<Integer> w = new HashSet();
  private String d;
  private short e;
  private short f;
  private short g;
  private String h;
  private int i;
  private short j;
  private short k;
  private int l;
  private String m;
  private int n;
  private int o;
  private String p;
  private String q;
  private short r;
  private short s;
  private int t;
  private short u;
  private List<e> v;
  
  static
  {
    w.add(Integer.valueOf(14));
    w.add(Integer.valueOf(15));
  }
  
  public d()
  {
    super(new aw(a(), 0L));
  }
  
  public static String a()
  {
    return "alis";
  }
  
  public e a(int paramInt)
  {
    Iterator localIterator = this.v.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale.a == paramInt) {
        return locale;
      }
    }
    return null;
  }
  
  protected void a(StringBuilder paramStringBuilder)
  {
    super.a(paramStringBuilder);
    paramStringBuilder.append(": ");
    if (b())
    {
      paramStringBuilder.append("'self'");
      return;
    }
    paramStringBuilder.append("'" + c() + "'");
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    if ((this.c & 0x1) != 0) {
      return;
    }
    paramByteBuffer.put(az.a(this.d), 0, 4);
    paramByteBuffer.putShort(this.e);
    paramByteBuffer.putShort(this.f);
    paramByteBuffer.putShort(this.g);
    bp.a(paramByteBuffer, this.h, 27);
    paramByteBuffer.putInt(this.i);
    paramByteBuffer.putShort(this.j);
    paramByteBuffer.putShort(this.k);
    paramByteBuffer.putInt(this.l);
    bp.a(paramByteBuffer, this.m, 63);
    paramByteBuffer.putInt(this.n);
    paramByteBuffer.putInt(this.o);
    paramByteBuffer.put(az.a(this.p), 0, 4);
    paramByteBuffer.put(az.a(this.q), 0, 4);
    paramByteBuffer.putShort(this.r);
    paramByteBuffer.putShort(this.s);
    paramByteBuffer.putInt(this.t);
    paramByteBuffer.putShort(this.u);
    paramByteBuffer.put(new byte[10]);
    Iterator localIterator = this.v.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      paramByteBuffer.putShort(locale.a);
      paramByteBuffer.putShort((short)locale.b);
      paramByteBuffer.put(locale.c);
    }
    paramByteBuffer.putShort((short)-1);
    paramByteBuffer.putShort((short)0);
  }
  
  public boolean b()
  {
    return (this.c & 0x1) != 0;
  }
  
  public String c()
  {
    e locale = a(18);
    if (locale == null) {
      return null;
    }
    return "/" + locale.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */