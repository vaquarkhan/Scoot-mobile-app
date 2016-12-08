package e.a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public class ap
  extends b
{
  private boolean A = true;
  private cz B;
  private cm C;
  private List<cx> n = new ArrayList();
  private long o = 0L;
  private long p = -1L;
  private bc q = new bc();
  private ax r = new ax();
  private ax s = new ax();
  private List<ab> t = new ArrayList();
  private int u = 0;
  private int v = 0;
  private long w = 0L;
  private int x = -1;
  private long y;
  private int z;
  
  public ap(cm paramcm, int paramInt1, dg paramdg, int paramInt2)
  {
    super(paramInt1, paramdg, paramInt2);
    this.C = paramcm;
    a(new bz(1, 1), di.a);
  }
  
  public static int a(List<ab> paramList)
  {
    paramList = paramList.iterator();
    int i = Integer.MAX_VALUE;
    if (paramList.hasNext())
    {
      ab localab = (ab)paramList.next();
      if (localab.a() >= i) {
        break label47;
      }
      i = localab.a();
    }
    label47:
    for (;;)
    {
      break;
      return i;
    }
  }
  
  private void b(int paramInt)
  {
    boolean bool;
    if ((this.e == di.a) || (this.e == di.b))
    {
      bool = true;
      Assert.assertTrue(bool);
      if ((this.e != di.a) || (this.g.size() * this.d.b() != this.d.a())) {
        break label74;
      }
      a(paramInt);
    }
    label74:
    while ((this.e != di.b) || (this.f <= 0L) || (this.f * this.d.b() < this.d.a() * this.c))
    {
      return;
      bool = false;
      break;
    }
    a(paramInt);
  }
  
  private void b(be parambe)
  {
    if (this.B != null) {
      this.B.a(parambe);
    }
  }
  
  private void b(br parambr)
  {
    Object localObject1;
    Object localObject2;
    if (this.t.size() > 0)
    {
      this.t.add(new ab(this.v, this.u));
      int i = a(this.t);
      if (i > 0)
      {
        localObject1 = this.t.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (ab)((Iterator)localObject1).next();
          ((ab)localObject2).b -= i;
        }
      }
      localObject1 = (ab)this.t.get(0);
      if (((ab)localObject1).a() > 0)
      {
        if (this.m != null) {
          break label188;
        }
        this.m = new ArrayList();
        this.m.add(new ag(this.y, ((ab)localObject1).a(), 1.0F));
      }
    }
    for (;;)
    {
      parambr.a(new aa((ab[])this.t.toArray(new ab[0])));
      return;
      label188:
      localObject2 = this.m.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ag localag = (ag)((Iterator)localObject2).next();
        localag.a(localag.b() + ((ab)localObject1).a());
      }
    }
  }
  
  public long a()
  {
    return this.y;
  }
  
  protected l a(bm parambm)
  {
    if (this.k) {
      throw new IllegalStateException("The muxer track has finished muxing");
    }
    a(this.x);
    if (this.o > 0L) {
      this.n.add(new cx((int)this.o, (int)this.p));
    }
    this.k = true;
    dh localdh = new dh();
    Object localObject = d();
    parambm = new df(this.a, parambm.b() * this.y / this.c, ((cp)localObject).a(), ((cp)localObject).b(), new Date().getTime(), new Date().getTime(), 1.0F, (short)0, 0L, new int[] { 65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824 });
    parambm.b(15);
    localdh.a(parambm);
    a(localdh);
    localObject = new bi();
    localdh.a((l)localObject);
    ((bi)localObject).a(new bj(this.c, this.y, 0, new Date().getTime(), new Date().getTime(), 0));
    ((bi)localObject).a(new av("mhlr", this.b.a(), "appl", 0, 0));
    parambm = new bk();
    ((bi)localObject).a(parambm);
    a(parambm, this.b);
    parambm.a(new av("dhlr", "url ", "appl", 0, 0));
    a(parambm);
    localObject = new br(new aw("stbl"));
    parambm.a((l)localObject);
    b((br)localObject);
    b(localdh);
    c(localdh);
    ((br)localObject).a(new ce((cg[])this.l.toArray(new cg[0])));
    ((br)localObject).a(new ci((cj[])this.h.toArray(new cj[0])));
    ((br)localObject).a(new ch(this.r.a()));
    ((br)localObject).a(new cw((cx[])this.n.toArray(new cx[0])));
    ((br)localObject).a(new s(this.q.a()));
    if ((!this.A) && (this.s.b() > 0)) {
      ((br)localObject).a(new cu(this.s.a()));
    }
    return localdh;
  }
  
  void a(int paramInt)
  {
    if (this.g.size() == 0) {
      return;
    }
    this.q.a(this.C.a());
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      ByteBuffer localByteBuffer = (ByteBuffer)localIterator.next();
      this.r.a(localByteBuffer.remaining());
      this.C.write(localByteBuffer);
    }
    if ((this.i == -1) || (this.i != this.g.size())) {
      this.h.add(new cj(this.j + 1, this.g.size(), paramInt));
    }
    this.i = this.g.size();
    this.j += 1;
    this.f = 0L;
    this.g.clear();
  }
  
  public void a(be parambe)
  {
    if (this.k) {
      throw new IllegalStateException("The muxer track has finished muxing");
    }
    int i = parambe.a() + 1;
    int j = (int)(parambe.c() - this.w);
    if (j != this.u)
    {
      if (this.v > 0) {
        this.t.add(new ab(this.v, this.u));
      }
      this.u = j;
      this.v = 0;
    }
    this.v += 1;
    this.w += parambe.d();
    if ((this.x != -1) && (this.x != i))
    {
      a(this.x);
      this.i = -1;
    }
    this.g.add(parambe.b());
    if (parambe.g()) {
      this.s.a(this.z + 1);
    }
    for (;;)
    {
      this.z += 1;
      this.f += parambe.d();
      if ((this.p != -1L) && (parambe.d() != this.p))
      {
        this.n.add(new cx((int)this.o, (int)this.p));
        this.o = 0L;
      }
      this.p = parambe.d();
      this.o += 1L;
      this.y += parambe.d();
      b(i);
      b(parambe);
      this.x = i;
      return;
      this.A = false;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */