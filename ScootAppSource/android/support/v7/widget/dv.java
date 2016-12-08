package android.support.v7.widget;

import android.view.View;

final class dv
  extends du
{
  dv(en paramen)
  {
    super(paramen, null);
  }
  
  public int a(View paramView)
  {
    ep localep = (ep)paramView.getLayoutParams();
    return this.a.h(paramView) - localep.leftMargin;
  }
  
  public void a(int paramInt)
  {
    this.a.i(paramInt);
  }
  
  public int b(View paramView)
  {
    ep localep = (ep)paramView.getLayoutParams();
    int i = this.a.j(paramView);
    return localep.rightMargin + i;
  }
  
  public int c()
  {
    return this.a.y();
  }
  
  public int c(View paramView)
  {
    ep localep = (ep)paramView.getLayoutParams();
    int i = this.a.f(paramView);
    int j = localep.leftMargin;
    return localep.rightMargin + (i + j);
  }
  
  public int d()
  {
    return this.a.w() - this.a.A();
  }
  
  public int d(View paramView)
  {
    ep localep = (ep)paramView.getLayoutParams();
    int i = this.a.g(paramView);
    int j = localep.topMargin;
    return localep.bottomMargin + (i + j);
  }
  
  public int e()
  {
    return this.a.w();
  }
  
  public int f()
  {
    return this.a.w() - this.a.y() - this.a.A();
  }
  
  public int g()
  {
    return this.a.A();
  }
  
  public int h()
  {
    return this.a.u();
  }
  
  public int i()
  {
    return this.a.v();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */