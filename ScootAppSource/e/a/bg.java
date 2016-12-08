package e.a;

import java.nio.ByteBuffer;

public final class bg
{
  private ByteBuffer a;
  private cr b;
  private ay<bu> c = new ay();
  private ay<cn> d = new ay();
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  
  public bg(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
    this.b = new cr();
    this.i = 0;
  }
  
  private int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.f > paramInt1) {}
    for (int j = this.e + paramInt2;; j = this.e)
    {
      paramInt2 = paramInt1;
      if (paramBoolean) {
        paramInt2 = 0;
      }
      this.f = paramInt2;
      this.e = j;
      return j + paramInt1;
    }
  }
  
  private int a(int paramInt, bn parambn, cq paramcq)
  {
    if (paramcq.a.a == 0) {
      return a(parambn, paramcq);
    }
    if (paramcq.a.a == 1) {
      return c(paramInt, parambn, paramcq);
    }
    return b(paramInt, parambn, paramcq);
  }
  
  private int a(bn parambn, cq paramcq)
  {
    int k = paramcq.o;
    int j = 1 << paramcq.a.h + 4;
    if ((k < this.h) && (this.h - k >= j / 2)) {
      j += this.g;
    }
    for (;;)
    {
      if (parambn.b != 0)
      {
        this.g = j;
        this.h = k;
      }
      return j + k;
      if ((k > this.h) && (k - this.h > j / 2)) {
        j = this.g - j;
      } else {
        j = this.g;
      }
    }
  }
  
  private bs a(ByteBuffer paramByteBuffer, bn parambn, cq paramcq)
  {
    int j = 1 << paramcq.a.g + 4;
    if (b(paramcq, j)) {
      a(paramcq, j);
    }
    int k = a(paramcq.l, j, a(paramcq.c));
    j = 0;
    if (parambn.a == bo.a) {
      j = a(k, parambn, paramcq);
    }
    long l1 = k;
    k = this.i;
    this.i = (k + 1);
    long l2 = k;
    if (parambn.a == bo.e) {}
    for (boolean bool = true;; bool = false) {
      return new bs(paramByteBuffer, l1, 1L, 1L, l2, bool, null, j);
    }
  }
  
  private cq a(ByteBuffer paramByteBuffer, bn parambn)
  {
    paramByteBuffer = new j(paramByteBuffer);
    cq localcq = this.b.a(paramByteBuffer);
    bu localbu = (bu)this.c.a(localcq.k);
    this.b.a(localcq, parambn, (cn)this.d.a(localbu.e), localbu, paramByteBuffer);
    return localcq;
  }
  
  private void a(cq paramcq, int paramInt)
  {
    this.f = ((this.f + 1) % paramInt);
  }
  
  private boolean a(bn parambn1, bn parambn2, cq paramcq1, cq paramcq2)
  {
    if (paramcq1.k != paramcq2.k) {}
    label171:
    label175:
    for (;;)
    {
      return false;
      if (paramcq1.l == paramcq2.l)
      {
        cn localcn = paramcq1.a;
        if (((localcn.a != 0) || (paramcq1.o == paramcq2.o)) && ((localcn.a != 1) || ((paramcq1.q[0] == paramcq2.q[0]) && (paramcq1.q[1] == paramcq2.q[1]))) && (((parambn1.b != 0) && (parambn2.b != 0)) || (parambn1.b == parambn2.b)))
        {
          int j;
          if (parambn1.a == bo.e)
          {
            j = 1;
            if (parambn2.a != bo.e) {
              break label171;
            }
          }
          for (int k = 1;; k = 0)
          {
            if ((j != k) || (paramcq1.n != paramcq2.n)) {
              break label175;
            }
            return true;
            j = 0;
            break;
          }
        }
      }
    }
  }
  
  private boolean a(ca paramca)
  {
    if (paramca == null) {}
    for (;;)
    {
      return false;
      paramca = paramca.a();
      int k = paramca.length;
      int j = 0;
      while (j < k)
      {
        if (paramca[j].a() == cb.e) {
          return true;
        }
        j += 1;
      }
    }
  }
  
  private int b(int paramInt, bn parambn, cq paramcq)
  {
    if (parambn.b == 0) {
      return paramInt * 2 - 1;
    }
    return paramInt * 2;
  }
  
  private boolean b(cq paramcq, int paramInt)
  {
    return (paramcq.l != this.f) && (paramcq.l != (this.f + 1) % paramInt);
  }
  
  private int c(int paramInt, bn parambn, cq paramcq)
  {
    if (paramcq.a.I == 0) {
      paramInt = 0;
    }
    int k = paramInt;
    if (parambn.b == 0)
    {
      k = paramInt;
      if (paramInt > 0) {
        k = paramInt - 1;
      }
    }
    int j = 0;
    paramInt = 0;
    while (j < paramcq.a.I)
    {
      paramInt += paramcq.a.F[j];
      j += 1;
    }
    if (k > 0)
    {
      j = (k - 1) / paramcq.a.I;
      int n = paramcq.a.I;
      paramInt = j * paramInt;
      int m = 0;
      for (;;)
      {
        j = paramInt;
        if (m > (k - 1) % n) {
          break;
        }
        j = paramcq.a.F[m];
        m += 1;
        paramInt = j + paramInt;
      }
    }
    j = 0;
    paramInt = j;
    if (parambn.b == 0) {
      paramInt = j + paramcq.a.v;
    }
    return paramcq.q[0] + paramInt;
  }
  
  public bs a()
  {
    ByteBuffer localByteBuffer = this.a.duplicate();
    Object localObject2 = null;
    Object localObject1 = null;
    this.a.mark();
    Object localObject4 = at.a(this.a);
    if (localObject4 == null) {}
    Object localObject3;
    for (;;)
    {
      localByteBuffer.limit(this.a.position());
      if (localObject2 != null) {
        break label190;
      }
      return null;
      localObject3 = bn.a((ByteBuffer)localObject4);
      if ((((bn)localObject3).a != bo.e) && (((bn)localObject3).a != bo.a)) {
        break label128;
      }
      localObject4 = a((ByteBuffer)localObject4, (bn)localObject3);
      if ((localObject1 == null) || (localObject2 == null) || (a((bn)localObject1, (bn)localObject3, (cq)localObject2, (cq)localObject4))) {
        break;
      }
      this.a.reset();
    }
    localObject2 = localObject4;
    localObject1 = localObject3;
    for (;;)
    {
      break;
      label128:
      if (((bn)localObject3).a == bo.h)
      {
        localObject3 = bu.a((ByteBuffer)localObject4);
        this.c.a(((bu)localObject3).d, localObject3);
      }
      else if (((bn)localObject3).a == bo.g)
      {
        localObject3 = cn.a((ByteBuffer)localObject4);
        this.d.a(((cn)localObject3).t, localObject3);
      }
    }
    label190:
    return a(localByteBuffer, (bn)localObject1, (cq)localObject2);
  }
  
  public cn[] b()
  {
    return (cn[])this.d.a(new cn[0]);
  }
  
  public bu[] c()
  {
    return (bu[])this.c.a(new bu[0]);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */