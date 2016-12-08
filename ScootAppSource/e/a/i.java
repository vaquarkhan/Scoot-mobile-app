package e.a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i
  extends l
{
  private int a;
  private int c;
  private int d;
  private List<ByteBuffer> e = new ArrayList();
  private List<ByteBuffer> f = new ArrayList();
  
  public i()
  {
    super(new aw(a()));
  }
  
  public i(int paramInt1, int paramInt2, int paramInt3, List<ByteBuffer> paramList1, List<ByteBuffer> paramList2)
  {
    this();
    this.a = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public static String a()
  {
    return "avcC";
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)1);
    paramByteBuffer.put((byte)this.a);
    paramByteBuffer.put((byte)this.c);
    paramByteBuffer.put((byte)this.d);
    paramByteBuffer.put((byte)-1);
    paramByteBuffer.put((byte)(this.e.size() | 0xE0));
    Iterator localIterator = this.e.iterator();
    ByteBuffer localByteBuffer;
    while (localIterator.hasNext())
    {
      localByteBuffer = (ByteBuffer)localIterator.next();
      paramByteBuffer.putShort((short)(localByteBuffer.remaining() + 1));
      paramByteBuffer.put((byte)103);
      bp.a(paramByteBuffer, localByteBuffer);
    }
    paramByteBuffer.put((byte)this.f.size());
    localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      localByteBuffer = (ByteBuffer)localIterator.next();
      paramByteBuffer.putShort((short)(byte)(localByteBuffer.remaining() + 1));
      paramByteBuffer.put((byte)104);
      bp.a(paramByteBuffer, localByteBuffer);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */