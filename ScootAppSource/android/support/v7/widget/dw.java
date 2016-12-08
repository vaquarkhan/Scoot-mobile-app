package android.support.v7.widget;

import android.view.View;

final class dw
  extends du
{
  dw(en paramen)
  {
    super(paramen, null);
  }
  
  public int a(View paramView)
  {
    ep localep = (ep)paramView.getLayoutParams();
    return this.a.i(paramView) - localep.topMargin;
  }
  
  public void a(int paramInt)
  {
    this.a.j(paramInt);
  }
  
  public int b(View paramView)
  {
    ep localep = (ep)paramView.getLayoutParams();
    int i = this.a.k(paramView);
    return localep.bottomMargin + i;
  }
  
  public int c()
  {
    return this.a.z();
  }
  
  public int c(View paramView)
  {
    ep localep = (ep)paramView.getLayoutParams();
    int i = this.a.g(paramView);
    int j = localep.topMargin;
    return localep.bottomMargin + (i + j);
  }
  
  public int d()
  {
    return this.a.x() - this.a.B();
  }
  
  public int d(View paramView)
  {
    ep localep = (ep)paramView.getLayoutParams();
    int i = this.a.f(paramView);
    int j = localep.leftMargin;
    return localep.rightMargin + (i + j);
  }
  
  public int e()
  {
    return this.a.x();
  }
  
  public int f()
  {
    return this.a.x() - this.a.z() - this.a.B();
  }
  
  public int g()
  {
    return this.a.B();
  }
  
  public int h()
  {
    return this.a.v();
  }
  
  public int i()
  {
    return this.a.u();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */