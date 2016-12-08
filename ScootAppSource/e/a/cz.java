package e.a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class cz
  extends ap
{
  private cv n;
  private cv o;
  private int p;
  private long q;
  private long r;
  private int s;
  private List<ag> t;
  private List<bs> u;
  
  private int a(cv paramcv)
  {
    return paramcv.a() * 3600 + paramcv.b() * 60 + paramcv.c();
  }
  
  private int a(cv paramcv, int paramInt)
  {
    int i = a(paramcv) * paramInt + paramcv.d();
    paramInt = i;
    if (paramcv.e())
    {
      long l1 = i / 18000;
      long l2 = i % 18000;
      paramInt = (int)(i - (l1 * 18L + (l2 - 2L) / 1800L * 2L));
    }
    return paramInt;
  }
  
  private boolean a(cv paramcv1, cv paramcv2)
  {
    if ((paramcv1 == null) && (paramcv2 != null)) {}
    do
    {
      return true;
      if (paramcv1 == null) {
        break;
      }
    } while ((paramcv2 == null) || (paramcv1.e() != paramcv2.e()));
    return b(paramcv1, paramcv2);
    return false;
  }
  
  private List<bs> b(List<bs> paramList)
  {
    paramList = new ArrayList(paramList);
    Collections.sort(paramList, new da(this));
    return paramList;
  }
  
  private void b(bs parambs)
  {
    cv localcv = parambs.e();
    boolean bool = a(this.n, localcv);
    this.n = localcv;
    if (bool)
    {
      f();
      this.o = localcv;
      if (!localcv.e()) {
        break label100;
      }
    }
    label100:
    for (int i = 30;; i = -1)
    {
      this.p = i;
      this.r += this.q;
      this.q = 0L;
      this.s = 0;
      this.q += parambs.d();
      this.s += 1;
      return;
    }
  }
  
  private boolean b(cv paramcv1, cv paramcv2)
  {
    boolean bool = false;
    int i = a(paramcv2);
    int j = i - a(paramcv1);
    if (j == 0)
    {
      j = paramcv2.d() - paramcv1.d();
      i = j;
      if (this.p != -1) {
        i = (j + this.p) % this.p;
      }
      if (i == 1) {}
    }
    do
    {
      do
      {
        return true;
        return false;
      } while (j != 1);
      if (this.p != -1) {
        break;
      }
    } while (paramcv2.d() != 0);
    this.p = (paramcv1.d() + 1);
    return false;
    if ((paramcv2.e()) && (i % 60 == 0) && (i % 600 != 0)) {}
    for (i = 2;; i = 0)
    {
      if ((paramcv2.d() != i) || (paramcv1.d() != this.p - 1)) {
        bool = true;
      }
      return bool;
    }
  }
  
  private void e()
  {
    if (this.u.size() > 0)
    {
      Iterator localIterator = b(this.u).iterator();
      while (localIterator.hasNext()) {
        b((bs)localIterator.next());
      }
      this.u.clear();
    }
  }
  
  private void f()
  {
    if (this.q > 0L)
    {
      if (this.o == null) {
        break label190;
      }
      if (this.p == -1) {
        this.p = (this.n.d() + 1);
      }
      if (!this.o.e()) {
        break label185;
      }
    }
    label185:
    for (int i = 1;; i = 0)
    {
      Object localObject = new dc(i, this.c, (int)(this.q / this.s), this.p);
      this.l.add(localObject);
      localObject = ByteBuffer.allocate(4);
      ((ByteBuffer)localObject).putInt(a(this.o, this.p));
      ((ByteBuffer)localObject).flip();
      a(new be((ByteBuffer)localObject, this.r, this.c, this.q, 0L, true, null, this.r, this.l.size() - 1));
      this.t.add(new ag(this.q, this.r, 1.0F));
      return;
    }
    label190:
    this.t.add(new ag(this.q, -1L, 1.0F));
  }
  
  protected l a(bm parambm)
  {
    e();
    f();
    if (this.l.size() == 0) {
      return null;
    }
    if (this.m != null) {}
    for (this.m = dk.a(new bz(1, 1), this.t, this.m);; this.m = this.t) {
      return super.a(parambm);
    }
  }
  
  public void a(bs parambs)
  {
    if (parambs.g()) {
      e();
    }
    this.u.add(new bs(parambs, (ByteBuffer)null));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */