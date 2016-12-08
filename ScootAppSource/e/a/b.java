package e.a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class b
{
  protected int a;
  protected dg b;
  protected int c;
  protected bz d;
  protected int e;
  protected long f;
  protected List<ByteBuffer> g = new ArrayList();
  protected List<cj> h = new ArrayList();
  protected int i = -1;
  protected int j = 0;
  protected boolean k;
  protected List<cg> l = new ArrayList();
  protected List<ag> m;
  private String n;
  
  public b(int paramInt1, dg paramdg, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramdg;
    this.c = paramInt2;
  }
  
  public abstract long a();
  
  protected abstract l a(bm parambm);
  
  protected void a(bk parambk, dg paramdg)
  {
    switch (c.a[paramdg.ordinal()])
    {
    default: 
      throw new IllegalStateException("Handler " + paramdg.a() + " not supported");
    case 1: 
      paramdg = new do(0, 0, 0, 0);
      paramdg.b(1);
      parambk.a(paramdg);
      return;
    case 2: 
      paramdg = new ct();
      paramdg.b(1);
      parambk.a(paramdg);
      return;
    }
    paramdg = new br(new aw("gmhd"));
    paramdg.a(new as());
    br localbr = new br(new aw("tmcd"));
    paramdg.a(localbr);
    localbr.a(new db((short)0, (short)0, (short)12, new short[] { 0, 0, 0 }, new short[] { 255, 255, 255 }, "Lucida Grande"));
    parambk.a(paramdg);
  }
  
  protected void a(br parambr)
  {
    ac localac = new ac();
    parambr.a(localac);
    parambr = new ad();
    localac.a(parambr);
    parambr.a(new ba(new aw("alis", 0L), ByteBuffer.wrap(new byte[] { 0, 0, 0, 1 })));
  }
  
  public void a(bz parambz, int paramInt)
  {
    this.d = parambz;
    this.e = paramInt;
  }
  
  public void a(cg paramcg)
  {
    if (this.k) {
      throw new IllegalStateException("The muxer track has finished muxing");
    }
    this.l.add(paramcg);
  }
  
  public void a(dh paramdh)
  {
    cp localcp = d();
    if (this.b == dg.a)
    {
      br localbr = new br(new aw("tapt"));
      localbr.a(new v(localcp.a(), localcp.b()));
      localbr.a(new by(localcp.a(), localcp.b()));
      localbr.a(new ai(localcp.a(), localcp.b()));
      paramdh.a(localbr);
    }
  }
  
  public int b()
  {
    return this.c;
  }
  
  protected void b(dh paramdh)
  {
    if (this.m != null)
    {
      br localbr = new br(new aw("edts"));
      localbr.a(new ah(this.m));
      paramdh.a(localbr);
    }
  }
  
  protected void c(dh paramdh)
  {
    if (this.n != null)
    {
      br localbr = new br(new aw("udta"));
      localbr.a(new bq(this.n));
      paramdh.a(localbr);
    }
  }
  
  public boolean c()
  {
    return this.b == dg.a;
  }
  
  public cp d()
  {
    int i2 = 0;
    dp localdp;
    Object localObject;
    if ((this.l.get(0) instanceof dp))
    {
      localdp = (dp)this.l.get(0);
      localObject = (bw)l.a(localdp, bw.class, new String[] { bw.b() });
      if (localObject != null)
      {
        localObject = ((bw)localObject).a();
        i2 = ((bz)localObject).a() * localdp.a() / ((bz)localObject).b();
      }
    }
    for (int i1 = localdp.c();; i1 = 0)
    {
      return new cp(i2, i1);
      localObject = new bz(1, 1);
      break;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */