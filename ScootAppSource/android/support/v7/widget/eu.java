package android.support.v7.widget;

import android.support.v4.view.cb;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eu
{
  final ArrayList<fd> a = new ArrayList();
  final ArrayList<fd> b = new ArrayList();
  private ArrayList<fd> d = null;
  private final List<fd> e = Collections.unmodifiableList(this.a);
  private int f = 2;
  private et g;
  private fb h;
  
  public eu(RecyclerView paramRecyclerView) {}
  
  private void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i = paramViewGroup.getChildCount() - 1;
    while (i >= 0)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup)) {
        a((ViewGroup)localView, true);
      }
      i -= 1;
    }
    if (!paramBoolean) {
      return;
    }
    if (paramViewGroup.getVisibility() == 4)
    {
      paramViewGroup.setVisibility(0);
      paramViewGroup.setVisibility(4);
      return;
    }
    i = paramViewGroup.getVisibility();
    paramViewGroup.setVisibility(4);
    paramViewGroup.setVisibility(i);
  }
  
  private void d(View paramView)
  {
    if (this.c.i())
    {
      if (cb.e(paramView) == 0) {
        cb.c(paramView, 1);
      }
      if (!cb.b(paramView)) {
        cb.a(paramView, RecyclerView.q(this.c).b());
      }
    }
  }
  
  private void f(fd paramfd)
  {
    if ((paramfd.a instanceof ViewGroup)) {
      a((ViewGroup)paramfd.a, false);
    }
  }
  
  fd a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j = 0;
    int k = this.a.size();
    int i = 0;
    Object localObject;
    fd localfd;
    for (;;)
    {
      if (i < k)
      {
        localObject = (fd)this.a.get(i);
        if ((((fd)localObject).k()) || (((fd)localObject).d() != paramInt1) || (((fd)localObject).n()) || ((!fa.f(this.c.h)) && (((fd)localObject).q()))) {
          break label251;
        }
        if ((paramInt2 != -1) && (((fd)localObject).h() != paramInt2)) {
          Log.e("RecyclerView", "Scrap view for position " + paramInt1 + " isn't dirty but has" + " wrong view type! (found " + ((fd)localObject).h() + " but expected " + paramInt2 + ")");
        }
      }
      else
      {
        if (paramBoolean) {
          break label288;
        }
        localObject = this.c.d.a(paramInt1, paramInt2);
        if (localObject == null) {
          break label288;
        }
        localfd = RecyclerView.c((View)localObject);
        this.c.d.e((View)localObject);
        paramInt1 = this.c.d.b((View)localObject);
        if (paramInt1 != -1) {
          break;
        }
        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + localfd);
      }
      ((fd)localObject).b(32);
      return (fd)localObject;
      label251:
      i += 1;
    }
    this.c.d.d(paramInt1);
    c((View)localObject);
    localfd.b(8224);
    return localfd;
    label288:
    i = this.b.size();
    paramInt2 = j;
    for (;;)
    {
      if (paramInt2 >= i) {
        break label363;
      }
      localfd = (fd)this.b.get(paramInt2);
      if ((!localfd.n()) && (localfd.d() == paramInt1))
      {
        localObject = localfd;
        if (paramBoolean) {
          break;
        }
        this.b.remove(paramInt2);
        return localfd;
      }
      paramInt2 += 1;
    }
    label363:
    return null;
  }
  
  fd a(long paramLong, int paramInt, boolean paramBoolean)
  {
    int i = this.a.size() - 1;
    fd localfd2;
    fd localfd1;
    while (i >= 0)
    {
      localfd2 = (fd)this.a.get(i);
      if ((localfd2.g() == paramLong) && (!localfd2.k()))
      {
        if (paramInt == localfd2.h())
        {
          localfd2.b(32);
          localfd1 = localfd2;
          if (localfd2.q())
          {
            localfd1 = localfd2;
            if (!this.c.h.a())
            {
              localfd2.a(2, 14);
              localfd1 = localfd2;
            }
          }
          return localfd1;
        }
        if (!paramBoolean)
        {
          this.a.remove(i);
          this.c.removeDetachedView(localfd2.a, false);
          b(localfd2.a);
        }
      }
      i -= 1;
    }
    i = this.b.size() - 1;
    for (;;)
    {
      if (i < 0) {
        break label245;
      }
      localfd2 = (fd)this.b.get(i);
      if (localfd2.g() == paramLong)
      {
        if (paramInt == localfd2.h())
        {
          localfd1 = localfd2;
          if (paramBoolean) {
            break;
          }
          this.b.remove(i);
          return localfd2;
        }
        if (!paramBoolean) {
          d(i);
        }
      }
      i -= 1;
    }
    label245:
    return null;
  }
  
  View a(int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    if ((paramInt < 0) || (paramInt >= this.c.h.e())) {
      throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + this.c.h.e());
    }
    Object localObject2;
    int i;
    if (this.c.h.a())
    {
      localObject2 = f(paramInt);
      if (localObject2 != null) {
        i = 1;
      }
    }
    for (;;)
    {
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = a(paramInt, -1, paramBoolean);
        localObject1 = localObject2;
        if (localObject2 != null) {
          if (!a((fd)localObject2)) {
            if (!paramBoolean)
            {
              ((fd)localObject2).b(4);
              if (((fd)localObject2).i())
              {
                this.c.removeDetachedView(((fd)localObject2).a, false);
                ((fd)localObject2).j();
                label174:
                b((fd)localObject2);
              }
            }
            else
            {
              localObject1 = null;
            }
          }
        }
      }
      for (;;)
      {
        Object localObject3 = localObject1;
        int k = i;
        int j;
        if (localObject1 == null)
        {
          k = this.c.c.b(paramInt);
          if ((k < 0) || (k >= RecyclerView.f(this.c).a()))
          {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + k + ")." + "state:" + this.c.h.e());
            i = 0;
            break;
            if (!((fd)localObject2).k()) {
              break label174;
            }
            ((fd)localObject2).l();
            break label174;
            i = 1;
            localObject1 = localObject2;
            continue;
          }
          int m = RecyclerView.f(this.c).a(k);
          localObject2 = localObject1;
          j = i;
          if (RecyclerView.f(this.c).b())
          {
            localObject1 = a(RecyclerView.f(this.c).b(k), m, paramBoolean);
            localObject2 = localObject1;
            j = i;
            if (localObject1 != null)
            {
              ((fd)localObject1).b = k;
              j = 1;
              localObject2 = localObject1;
            }
          }
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = localObject2;
            if (this.h != null)
            {
              localObject3 = this.h.a(this, paramInt, m);
              localObject1 = localObject2;
              if (localObject3 != null)
              {
                localObject2 = this.c.a((View)localObject3);
                if (localObject2 == null) {
                  throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                }
                localObject1 = localObject2;
                if (((fd)localObject2).c()) {
                  throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                }
              }
            }
          }
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject1 = f().a(m);
            localObject2 = localObject1;
            if (localObject1 != null)
            {
              ((fd)localObject1).v();
              localObject2 = localObject1;
              if (RecyclerView.r())
              {
                f((fd)localObject1);
                localObject2 = localObject1;
              }
            }
          }
          localObject3 = localObject2;
          k = j;
          if (localObject2 == null) {
            localObject2 = RecyclerView.f(this.c).b(this.c, m);
          }
        }
        for (i = j;; i = k)
        {
          if ((i != 0) && (!this.c.h.a()) && (((fd)localObject2).a(8192)))
          {
            ((fd)localObject2).a(0, 8192);
            if (fa.c(this.c.h))
            {
              j = eh.d((fd)localObject2);
              localObject1 = this.c.g.a(this.c.h, (fd)localObject2, j | 0x1000, ((fd)localObject2).u());
              RecyclerView.a(this.c, (fd)localObject2, (ek)localObject1);
            }
          }
          if ((this.c.h.a()) && (((fd)localObject2).p()))
          {
            ((fd)localObject2).f = paramInt;
            paramInt = 0;
          }
          for (;;)
          {
            localObject1 = ((fd)localObject2).a.getLayoutParams();
            if (localObject1 == null)
            {
              localObject1 = (ep)this.c.generateDefaultLayoutParams();
              ((fd)localObject2).a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
              label749:
              ((ep)localObject1).a = ((fd)localObject2);
              if ((i == 0) || (paramInt == 0)) {
                break label921;
              }
            }
            label921:
            for (paramBoolean = bool;; paramBoolean = false)
            {
              ((ep)localObject1).d = paramBoolean;
              return ((fd)localObject2).a;
              if ((((fd)localObject2).p()) && (!((fd)localObject2).o()) && (!((fd)localObject2).n())) {
                break label926;
              }
              j = this.c.c.b(paramInt);
              ((fd)localObject2).k = this.c;
              RecyclerView.f(this.c).b((fd)localObject2, j);
              d(((fd)localObject2).a);
              if (this.c.h.a()) {
                ((fd)localObject2).f = paramInt;
              }
              paramInt = 1;
              break;
              if (!this.c.checkLayoutParams((ViewGroup.LayoutParams)localObject1))
              {
                localObject1 = (ep)this.c.generateLayoutParams((ViewGroup.LayoutParams)localObject1);
                ((fd)localObject2).a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                break label749;
              }
              localObject1 = (ep)localObject1;
              break label749;
            }
            label926:
            paramInt = 0;
          }
          localObject2 = localObject3;
        }
      }
      localObject2 = null;
      i = 0;
    }
  }
  
  public void a()
  {
    this.a.clear();
    c();
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
    int i = this.b.size() - 1;
    while ((i >= 0) && (this.b.size() > paramInt))
    {
      d(i);
      i -= 1;
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int k;
    int m;
    label25:
    fd localfd;
    if (paramInt1 < paramInt2)
    {
      i = -1;
      j = paramInt2;
      k = paramInt1;
      int n = this.b.size();
      m = 0;
      if (m >= n) {
        return;
      }
      localfd = (fd)this.b.get(m);
      if ((localfd != null) && (localfd.b >= k) && (localfd.b <= j)) {
        break label91;
      }
    }
    for (;;)
    {
      m += 1;
      break label25;
      i = 1;
      j = paramInt1;
      k = paramInt2;
      break;
      label91:
      if (localfd.b == paramInt1) {
        localfd.a(paramInt2 - paramInt1, false);
      } else {
        localfd.a(i, false);
      }
    }
  }
  
  void a(ed paramed1, ed paramed2, boolean paramBoolean)
  {
    a();
    f().a(paramed1, paramed2, paramBoolean);
  }
  
  void a(et paramet)
  {
    if (this.g != null) {
      this.g.b();
    }
    this.g = paramet;
    if (paramet != null) {
      this.g.a(this.c.getAdapter());
    }
  }
  
  void a(fb paramfb)
  {
    this.h = paramfb;
  }
  
  public void a(View paramView)
  {
    fd localfd = RecyclerView.c(paramView);
    if (localfd.r()) {
      this.c.removeDetachedView(paramView, false);
    }
    if (localfd.i()) {
      localfd.j();
    }
    for (;;)
    {
      b(localfd);
      return;
      if (localfd.k()) {
        localfd.l();
      }
    }
  }
  
  boolean a(fd paramfd)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramfd.q()) {
      bool1 = this.c.h.a();
    }
    do
    {
      do
      {
        return bool1;
        if ((paramfd.b < 0) || (paramfd.b >= RecyclerView.f(this.c).a())) {
          throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + paramfd);
        }
        if ((!this.c.h.a()) && (RecyclerView.f(this.c).a(paramfd.b) != paramfd.h())) {
          return false;
        }
        bool1 = bool2;
      } while (!RecyclerView.f(this.c).b());
      bool1 = bool2;
    } while (paramfd.g() == RecyclerView.f(this.c).b(paramfd.b));
    return false;
  }
  
  public int b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c.h.e())) {
      throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State " + "item count is " + this.c.h.e());
    }
    if (!this.c.h.a()) {
      return paramInt;
    }
    return this.c.c.b(paramInt);
  }
  
  public List<fd> b()
  {
    return this.e;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      fd localfd = (fd)this.b.get(i);
      if ((localfd != null) && (localfd.b >= paramInt1)) {
        localfd.a(paramInt2, true);
      }
      i += 1;
    }
  }
  
  void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = this.b.size() - 1;
    if (i >= 0)
    {
      fd localfd = (fd)this.b.get(i);
      if (localfd != null)
      {
        if (localfd.b < paramInt1 + paramInt2) {
          break label63;
        }
        localfd.a(-paramInt2, paramBoolean);
      }
      for (;;)
      {
        i -= 1;
        break;
        label63:
        if (localfd.b >= paramInt1)
        {
          localfd.b(8);
          d(i);
        }
      }
    }
  }
  
  void b(fd paramfd)
  {
    boolean bool = true;
    int j = 0;
    if ((paramfd.i()) || (paramfd.a.getParent() != null))
    {
      StringBuilder localStringBuilder = new StringBuilder().append("Scrapped or attached views may not be recycled. isScrap:").append(paramfd.i()).append(" isAttached:");
      if (paramfd.a.getParent() != null) {}
      for (;;)
      {
        throw new IllegalArgumentException(bool);
        bool = false;
      }
    }
    if (paramfd.r()) {
      throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + paramfd);
    }
    if (paramfd.c()) {
      throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
    }
    bool = fd.c(paramfd);
    int i;
    if ((RecyclerView.f(this.c) != null) && (bool) && (RecyclerView.f(this.c).b(paramfd)))
    {
      i = 1;
      if ((i == 0) && (!paramfd.w())) {
        break label292;
      }
      if (paramfd.a(14)) {
        break label287;
      }
      i = this.b.size();
      if ((i == this.f) && (i > 0)) {
        d(0);
      }
      if (i >= this.f) {
        break label287;
      }
      this.b.add(paramfd);
      i = 1;
      label238:
      if (i != 0) {
        break label284;
      }
      c(paramfd);
      j = 1;
    }
    for (;;)
    {
      this.c.e.g(paramfd);
      if ((i == 0) && (j == 0) && (bool)) {
        paramfd.k = null;
      }
      return;
      i = 0;
      break;
      label284:
      continue;
      label287:
      i = 0;
      break label238;
      label292:
      i = 0;
    }
  }
  
  void b(View paramView)
  {
    paramView = RecyclerView.c(paramView);
    fd.a(paramView, null);
    fd.a(paramView, false);
    paramView.l();
    b(paramView);
  }
  
  public View c(int paramInt)
  {
    return a(paramInt, false);
  }
  
  void c()
  {
    int i = this.b.size() - 1;
    while (i >= 0)
    {
      d(i);
      i -= 1;
    }
    this.b.clear();
  }
  
  void c(int paramInt1, int paramInt2)
  {
    int i = this.b.size() - 1;
    if (i >= 0)
    {
      fd localfd = (fd)this.b.get(i);
      if (localfd == null) {}
      for (;;)
      {
        i -= 1;
        break;
        int j = localfd.d();
        if ((j >= paramInt1) && (j < paramInt1 + paramInt2))
        {
          localfd.b(2);
          d(i);
        }
      }
    }
  }
  
  void c(fd paramfd)
  {
    cb.a(paramfd.a, null);
    e(paramfd);
    paramfd.k = null;
    f().a(paramfd);
  }
  
  void c(View paramView)
  {
    paramView = RecyclerView.c(paramView);
    if ((paramView.a(12)) || (!paramView.x()) || (RecyclerView.a(this.c, paramView)))
    {
      if ((paramView.n()) && (!paramView.q()) && (!RecyclerView.f(this.c).b())) {
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
      }
      paramView.a(this, false);
      this.a.add(paramView);
      return;
    }
    if (this.d == null) {
      this.d = new ArrayList();
    }
    paramView.a(this, true);
    this.d.add(paramView);
  }
  
  int d()
  {
    return this.a.size();
  }
  
  void d(int paramInt)
  {
    c((fd)this.b.get(paramInt));
    this.b.remove(paramInt);
  }
  
  void d(fd paramfd)
  {
    if (fd.d(paramfd)) {
      this.d.remove(paramfd);
    }
    for (;;)
    {
      fd.a(paramfd, null);
      fd.a(paramfd, false);
      paramfd.l();
      return;
      this.a.remove(paramfd);
    }
  }
  
  View e(int paramInt)
  {
    return ((fd)this.a.get(paramInt)).a;
  }
  
  void e()
  {
    this.a.clear();
    if (this.d != null) {
      this.d.clear();
    }
  }
  
  void e(fd paramfd)
  {
    if (RecyclerView.r(this.c) != null) {
      RecyclerView.r(this.c).a(paramfd);
    }
    if (RecyclerView.f(this.c) != null) {
      RecyclerView.f(this.c).a(paramfd);
    }
    if (this.c.h != null) {
      this.c.e.g(paramfd);
    }
  }
  
  et f()
  {
    if (this.g == null) {
      this.g = new et();
    }
    return this.g;
  }
  
  fd f(int paramInt)
  {
    int j = 0;
    int k;
    if (this.d != null)
    {
      k = this.d.size();
      if (k != 0) {}
    }
    else
    {
      return null;
    }
    int i = 0;
    fd localfd;
    while (i < k)
    {
      localfd = (fd)this.d.get(i);
      if ((!localfd.k()) && (localfd.d() == paramInt))
      {
        localfd.b(32);
        return localfd;
      }
      i += 1;
    }
    if (RecyclerView.f(this.c).b())
    {
      paramInt = this.c.c.b(paramInt);
      if ((paramInt > 0) && (paramInt < RecyclerView.f(this.c).a()))
      {
        long l = RecyclerView.f(this.c).b(paramInt);
        paramInt = j;
        while (paramInt < k)
        {
          localfd = (fd)this.d.get(paramInt);
          if ((!localfd.k()) && (localfd.g() == l))
          {
            localfd.b(32);
            return localfd;
          }
          paramInt += 1;
        }
      }
    }
    return null;
  }
  
  void g()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      fd localfd = (fd)this.b.get(i);
      if (localfd != null) {
        localfd.b(512);
      }
      i += 1;
    }
  }
  
  void h()
  {
    int j;
    int i;
    if ((RecyclerView.f(this.c) != null) && (RecyclerView.f(this.c).b()))
    {
      j = this.b.size();
      i = 0;
    }
    while (i < j)
    {
      fd localfd = (fd)this.b.get(i);
      if (localfd != null)
      {
        localfd.b(6);
        localfd.a(null);
      }
      i += 1;
      continue;
      c();
    }
  }
  
  void i()
  {
    int j = 0;
    int k = this.b.size();
    int i = 0;
    while (i < k)
    {
      ((fd)this.b.get(i)).a();
      i += 1;
    }
    k = this.a.size();
    i = 0;
    while (i < k)
    {
      ((fd)this.a.get(i)).a();
      i += 1;
    }
    if (this.d != null)
    {
      k = this.d.size();
      i = j;
      while (i < k)
      {
        ((fd)this.d.get(i)).a();
        i += 1;
      }
    }
  }
  
  void j()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      ep localep = (ep)((fd)this.b.get(i)).a.getLayoutParams();
      if (localep != null) {
        localep.c = true;
      }
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\eu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */