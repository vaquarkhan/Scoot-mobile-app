package android.support.v7.widget;

import android.support.v4.a.a;
import android.support.v4.view.cb;
import android.support.v4.view.en;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ce
  extends fw
{
  private ArrayList<fd> b = new ArrayList();
  private ArrayList<fd> c = new ArrayList();
  private ArrayList<co> d = new ArrayList();
  private ArrayList<cn> e = new ArrayList();
  private ArrayList<ArrayList<fd>> f = new ArrayList();
  private ArrayList<ArrayList<co>> g = new ArrayList();
  private ArrayList<ArrayList<cn>> h = new ArrayList();
  private ArrayList<fd> i = new ArrayList();
  private ArrayList<fd> j = new ArrayList();
  private ArrayList<fd> k = new ArrayList();
  private ArrayList<fd> l = new ArrayList();
  
  private void a(cn paramcn)
  {
    View localView = null;
    Object localObject = paramcn.a;
    if (localObject == null) {}
    for (localObject = null;; localObject = ((fd)localObject).a)
    {
      fd localfd = paramcn.b;
      if (localfd != null) {
        localView = localfd.a;
      }
      if (localObject != null)
      {
        localObject = cb.s((View)localObject).a(g());
        this.l.add(paramcn.a);
        ((en)localObject).b(paramcn.e - paramcn.c);
        ((en)localObject).c(paramcn.f - paramcn.d);
        ((en)localObject).a(0.0F).a(new cl(this, paramcn, (en)localObject)).c();
      }
      if (localView != null)
      {
        localObject = cb.s(localView);
        this.l.add(paramcn.b);
        ((en)localObject).b(0.0F).c(0.0F).a(g()).a(1.0F).a(new cm(this, paramcn, (en)localObject, localView)).c();
      }
      return;
    }
  }
  
  private void a(List<cn> paramList, fd paramfd)
  {
    int m = paramList.size() - 1;
    while (m >= 0)
    {
      cn localcn = (cn)paramList.get(m);
      if ((a(localcn, paramfd)) && (localcn.a == null) && (localcn.b == null)) {
        paramList.remove(localcn);
      }
      m -= 1;
    }
  }
  
  private boolean a(cn paramcn, fd paramfd)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramcn.b == paramfd) {
      paramcn.b = null;
    }
    for (;;)
    {
      cb.c(paramfd.a, 1.0F);
      cb.a(paramfd.a, 0.0F);
      cb.b(paramfd.a, 0.0F);
      a(paramfd, bool1);
      bool1 = true;
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramcn.a != paramfd);
      paramcn.a = null;
      bool1 = true;
    }
  }
  
  private void b(cn paramcn)
  {
    if (paramcn.a != null) {
      a(paramcn, paramcn.a);
    }
    if (paramcn.b != null) {
      a(paramcn, paramcn.b);
    }
  }
  
  private void b(fd paramfd, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = paramfd.a;
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (paramInt1 != 0) {
      cb.s((View)localObject).b(0.0F);
    }
    if (paramInt2 != 0) {
      cb.s((View)localObject).c(0.0F);
    }
    localObject = cb.s((View)localObject);
    this.j.add(paramfd);
    ((en)localObject).a(d()).a(new ck(this, paramfd, paramInt1, paramInt2, (en)localObject)).c();
  }
  
  private void j()
  {
    if (!b()) {
      h();
    }
  }
  
  private void t(fd paramfd)
  {
    en localen = cb.s(paramfd.a);
    this.k.add(paramfd);
    localen.a(f()).a(0.0F).a(new ci(this, paramfd, localen)).c();
  }
  
  private void u(fd paramfd)
  {
    en localen = cb.s(paramfd.a);
    this.i.add(paramfd);
    localen.a(1.0F).a(e()).a(new cj(this, paramfd, localen)).c();
  }
  
  private void v(fd paramfd)
  {
    a.a(paramfd.a);
    c(paramfd);
  }
  
  public void a()
  {
    int m;
    int n;
    label24:
    int i1;
    if (!this.b.isEmpty())
    {
      m = 1;
      if (this.d.isEmpty()) {
        break label72;
      }
      n = 1;
      if (this.e.isEmpty()) {
        break label77;
      }
      i1 = 1;
      label36:
      if (this.c.isEmpty()) {
        break label82;
      }
    }
    label72:
    label77:
    label82:
    for (int i2 = 1;; i2 = 0)
    {
      if ((m != 0) || (n != 0) || (i2 != 0) || (i1 != 0)) {
        break label88;
      }
      return;
      m = 0;
      break;
      n = 0;
      break label24;
      i1 = 0;
      break label36;
    }
    label88:
    Object localObject1 = this.b.iterator();
    while (((Iterator)localObject1).hasNext()) {
      t((fd)((Iterator)localObject1).next());
    }
    this.b.clear();
    Object localObject2;
    label211:
    label291:
    long l1;
    label366:
    long l2;
    if (n != 0)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.d);
      this.g.add(localObject1);
      this.d.clear();
      localObject2 = new cf(this, (ArrayList)localObject1);
      if (m != 0) {
        cb.a(((co)((ArrayList)localObject1).get(0)).a.a, (Runnable)localObject2, f());
      }
    }
    else
    {
      if (i1 != 0)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.e);
        this.h.add(localObject1);
        this.e.clear();
        localObject2 = new cg(this, (ArrayList)localObject1);
        if (m == 0) {
          break label428;
        }
        cb.a(((cn)((ArrayList)localObject1).get(0)).a.a, (Runnable)localObject2, f());
      }
      if (i2 == 0) {
        break label436;
      }
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.c);
      this.f.add(localObject1);
      this.c.clear();
      localObject2 = new ch(this, (ArrayList)localObject1);
      if ((m == 0) && (n == 0) && (i1 == 0)) {
        break label456;
      }
      if (m == 0) {
        break label438;
      }
      l1 = f();
      if (n == 0) {
        break label444;
      }
      l2 = d();
      label376:
      if (i1 == 0) {
        break label450;
      }
    }
    label428:
    label436:
    label438:
    label444:
    label450:
    for (long l3 = g();; l3 = 0L)
    {
      l2 = Math.max(l2, l3);
      cb.a(((fd)((ArrayList)localObject1).get(0)).a, (Runnable)localObject2, l1 + l2);
      return;
      ((Runnable)localObject2).run();
      break label211;
      ((Runnable)localObject2).run();
      break label291;
      break;
      l1 = 0L;
      break label366;
      l2 = 0L;
      break label376;
    }
    label456:
    ((Runnable)localObject2).run();
  }
  
  void a(List<fd> paramList)
  {
    int m = paramList.size() - 1;
    while (m >= 0)
    {
      cb.s(((fd)paramList.get(m)).a).b();
      m -= 1;
    }
  }
  
  public boolean a(fd paramfd)
  {
    v(paramfd);
    this.b.add(paramfd);
    return true;
  }
  
  public boolean a(fd paramfd, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramfd.a;
    paramInt1 = (int)(paramInt1 + cb.o(paramfd.a));
    paramInt2 = (int)(paramInt2 + cb.p(paramfd.a));
    v(paramfd);
    int m = paramInt3 - paramInt1;
    int n = paramInt4 - paramInt2;
    if ((m == 0) && (n == 0))
    {
      i(paramfd);
      return false;
    }
    if (m != 0) {
      cb.a(localView, -m);
    }
    if (n != 0) {
      cb.b(localView, -n);
    }
    this.d.add(new co(paramfd, paramInt1, paramInt2, paramInt3, paramInt4, null));
    return true;
  }
  
  public boolean a(fd paramfd1, fd paramfd2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramfd1 == paramfd2) {
      return a(paramfd1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    float f1 = cb.o(paramfd1.a);
    float f2 = cb.p(paramfd1.a);
    float f3 = cb.f(paramfd1.a);
    v(paramfd1);
    int m = (int)(paramInt3 - paramInt1 - f1);
    int n = (int)(paramInt4 - paramInt2 - f2);
    cb.a(paramfd1.a, f1);
    cb.b(paramfd1.a, f2);
    cb.c(paramfd1.a, f3);
    if (paramfd2 != null)
    {
      v(paramfd2);
      cb.a(paramfd2.a, -m);
      cb.b(paramfd2.a, -n);
      cb.c(paramfd2.a, 0.0F);
    }
    this.e.add(new cn(paramfd1, paramfd2, paramInt1, paramInt2, paramInt3, paramInt4, null));
    return true;
  }
  
  public boolean a(fd paramfd, List<Object> paramList)
  {
    return (!paramList.isEmpty()) || (super.a(paramfd, paramList));
  }
  
  public boolean b()
  {
    return (!this.c.isEmpty()) || (!this.e.isEmpty()) || (!this.d.isEmpty()) || (!this.b.isEmpty()) || (!this.j.isEmpty()) || (!this.k.isEmpty()) || (!this.i.isEmpty()) || (!this.l.isEmpty()) || (!this.g.isEmpty()) || (!this.f.isEmpty()) || (!this.h.isEmpty());
  }
  
  public boolean b(fd paramfd)
  {
    v(paramfd);
    cb.c(paramfd.a, 0.0F);
    this.c.add(paramfd);
    return true;
  }
  
  public void c()
  {
    int m = this.d.size() - 1;
    Object localObject1;
    Object localObject2;
    while (m >= 0)
    {
      localObject1 = (co)this.d.get(m);
      localObject2 = ((co)localObject1).a.a;
      cb.b((View)localObject2, 0.0F);
      cb.a((View)localObject2, 0.0F);
      i(((co)localObject1).a);
      this.d.remove(m);
      m -= 1;
    }
    m = this.b.size() - 1;
    while (m >= 0)
    {
      h((fd)this.b.get(m));
      this.b.remove(m);
      m -= 1;
    }
    m = this.c.size() - 1;
    while (m >= 0)
    {
      localObject1 = (fd)this.c.get(m);
      cb.c(((fd)localObject1).a, 1.0F);
      j((fd)localObject1);
      this.c.remove(m);
      m -= 1;
    }
    m = this.e.size() - 1;
    while (m >= 0)
    {
      b((cn)this.e.get(m));
      m -= 1;
    }
    this.e.clear();
    if (!b()) {
      return;
    }
    m = this.g.size() - 1;
    int n;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.g.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        localObject2 = (co)((ArrayList)localObject1).get(n);
        View localView = ((co)localObject2).a.a;
        cb.b(localView, 0.0F);
        cb.a(localView, 0.0F);
        i(((co)localObject2).a);
        ((ArrayList)localObject1).remove(n);
        if (((ArrayList)localObject1).isEmpty()) {
          this.g.remove(localObject1);
        }
        n -= 1;
      }
      m -= 1;
    }
    m = this.f.size() - 1;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.f.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        localObject2 = (fd)((ArrayList)localObject1).get(n);
        cb.c(((fd)localObject2).a, 1.0F);
        j((fd)localObject2);
        ((ArrayList)localObject1).remove(n);
        if (((ArrayList)localObject1).isEmpty()) {
          this.f.remove(localObject1);
        }
        n -= 1;
      }
      m -= 1;
    }
    m = this.h.size() - 1;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.h.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        b((cn)((ArrayList)localObject1).get(n));
        if (((ArrayList)localObject1).isEmpty()) {
          this.h.remove(localObject1);
        }
        n -= 1;
      }
      m -= 1;
    }
    a(this.k);
    a(this.j);
    a(this.i);
    a(this.l);
    h();
  }
  
  public void c(fd paramfd)
  {
    View localView = paramfd.a;
    cb.s(localView).b();
    int m = this.d.size() - 1;
    while (m >= 0)
    {
      if (((co)this.d.get(m)).a == paramfd)
      {
        cb.b(localView, 0.0F);
        cb.a(localView, 0.0F);
        i(paramfd);
        this.d.remove(m);
      }
      m -= 1;
    }
    a(this.e, paramfd);
    if (this.b.remove(paramfd))
    {
      cb.c(localView, 1.0F);
      h(paramfd);
    }
    if (this.c.remove(paramfd))
    {
      cb.c(localView, 1.0F);
      j(paramfd);
    }
    m = this.h.size() - 1;
    ArrayList localArrayList;
    while (m >= 0)
    {
      localArrayList = (ArrayList)this.h.get(m);
      a(localArrayList, paramfd);
      if (localArrayList.isEmpty()) {
        this.h.remove(m);
      }
      m -= 1;
    }
    m = this.g.size() - 1;
    if (m >= 0)
    {
      localArrayList = (ArrayList)this.g.get(m);
      int n = localArrayList.size() - 1;
      for (;;)
      {
        if (n >= 0)
        {
          if (((co)localArrayList.get(n)).a != paramfd) {
            break label293;
          }
          cb.b(localView, 0.0F);
          cb.a(localView, 0.0F);
          i(paramfd);
          localArrayList.remove(n);
          if (localArrayList.isEmpty()) {
            this.g.remove(m);
          }
        }
        m -= 1;
        break;
        label293:
        n -= 1;
      }
    }
    m = this.f.size() - 1;
    while (m >= 0)
    {
      localArrayList = (ArrayList)this.f.get(m);
      if (localArrayList.remove(paramfd))
      {
        cb.c(localView, 1.0F);
        j(paramfd);
        if (localArrayList.isEmpty()) {
          this.f.remove(m);
        }
      }
      m -= 1;
    }
    if ((!this.k.remove(paramfd)) || ((!this.i.remove(paramfd)) || ((!this.l.remove(paramfd)) || (this.j.remove(paramfd))))) {}
    j();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */