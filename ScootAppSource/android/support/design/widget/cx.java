package android.support.design.widget;

import android.support.v4.view.cb;
import android.view.View;

final class cx
{
  private final View a;
  private int b;
  private int c;
  private int d;
  private int e;
  
  public cx(View paramView)
  {
    this.a = paramView;
  }
  
  private void c()
  {
    cb.e(this.a, this.d - (this.a.getTop() - this.b));
    cb.f(this.a, this.e - (this.a.getLeft() - this.c));
  }
  
  public void a()
  {
    this.b = this.a.getTop();
    this.c = this.a.getLeft();
    c();
  }
  
  public boolean a(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      c();
      return true;
    }
    return false;
  }
  
  public int b()
  {
    return this.d;
  }
  
  public boolean b(int paramInt)
  {
    if (this.e != paramInt)
    {
      this.e = paramInt;
      c();
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */