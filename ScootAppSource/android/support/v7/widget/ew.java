package android.support.v7.widget;

import android.support.v4.view.cb;

final class ew
  extends ef
{
  private ew(RecyclerView paramRecyclerView) {}
  
  public void a()
  {
    this.a.a(null);
    if (RecyclerView.f(this.a).b())
    {
      fa.a(this.a.h, true);
      RecyclerView.l(this.a);
    }
    for (;;)
    {
      if (!this.a.c.d()) {
        this.a.requestLayout();
      }
      return;
      fa.a(this.a.h, true);
      RecyclerView.l(this.a);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.a(null);
    if (this.a.c.b(paramInt1, paramInt2)) {
      b();
    }
  }
  
  void b()
  {
    if ((RecyclerView.m(this.a)) && (RecyclerView.n(this.a)) && (RecyclerView.o(this.a)))
    {
      cb.a(this.a, RecyclerView.p(this.a));
      return;
    }
    RecyclerView.c(this.a, true);
    this.a.requestLayout();
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.a.a(null);
    if (this.a.c.c(paramInt1, paramInt2)) {
      b();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */