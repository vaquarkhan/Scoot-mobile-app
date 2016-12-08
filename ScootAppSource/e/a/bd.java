package e.a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class bd
{
  cm a;
  private List<b> b = new ArrayList();
  private long c;
  private int d = 1;
  
  public bd(cm paramcm, an paraman)
  {
    this.a = paramcm;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1024);
    paraman.b(localByteBuffer);
    new aw("wide", 8L).a(localByteBuffer);
    new aw("mdat", 1L).a(localByteBuffer);
    this.c = localByteBuffer.position();
    localByteBuffer.putLong(0L);
    localByteBuffer.flip();
    paramcm.write(localByteBuffer);
  }
  
  public bd(cm paramcm, n paramn)
  {
    this(paramcm, paramn.a());
  }
  
  private bm a(br parambr)
  {
    int i = ((b)this.b.get(0)).b();
    long l1 = ((b)this.b.get(0)).a();
    parambr = c();
    if (parambr != null)
    {
      i = parambr.b();
      l1 = parambr.a();
    }
    long l2 = new Date().getTime();
    long l3 = new Date().getTime();
    int j = this.d;
    return new bm(i, l1, 1.0F, 1.0F, l2, l3, new int[] { 65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824 }, j);
  }
  
  public static dp a(String paramString1, cp paramcp, String paramString2)
  {
    paramString1 = new aw(paramString1);
    short s1 = (short)paramcp.a();
    short s2 = (short)paramcp.b();
    if (paramString2 != null) {}
    for (;;)
    {
      return new dp(paramString1, (short)0, (short)0, "jcod", 0, 768, s1, s2, 72L, 72L, (short)1, paramString2, (short)24, (short)1, (short)-1);
      paramString2 = "jcodec";
    }
  }
  
  public ap a(dg paramdg, int paramInt)
  {
    cm localcm = this.a;
    int i = this.d;
    this.d = (i + 1);
    paramdg = new ap(localcm, i, paramdg, paramInt);
    this.b.add(paramdg);
    return paramdg;
  }
  
  public void a()
  {
    a(b());
  }
  
  public void a(bl parambl)
  {
    long l1 = this.a.a();
    long l2 = this.c;
    bf.a(this.a, parambl);
    this.a.a(this.c);
    bp.a(this.a, l1 - l2 + 8L);
  }
  
  public bl b()
  {
    bl localbl = new bl();
    bm localbm = a(localbl);
    localbl.a(localbm);
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      l locall = ((b)localIterator.next()).a(localbm);
      if (locall != null) {
        localbl.a(locall);
      }
    }
    return localbl;
  }
  
  public b c()
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.c()) {
        return localb;
      }
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */