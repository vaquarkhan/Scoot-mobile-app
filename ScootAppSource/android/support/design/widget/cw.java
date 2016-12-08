package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class cw<V extends View>
  extends r<V>
{
  private cx a;
  private int b = 0;
  private int c = 0;
  
  public cw() {}
  
  public cw(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean a(int paramInt)
  {
    if (this.a != null) {
      return this.a.a(paramInt);
    }
    this.b = paramInt;
    return false;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    b(paramCoordinatorLayout, paramV, paramInt);
    if (this.a == null) {
      this.a = new cx(paramV);
    }
    this.a.a();
    if (this.b != 0)
    {
      this.a.a(this.b);
      this.b = 0;
    }
    if (this.c != 0)
    {
      this.a.b(this.c);
      this.c = 0;
    }
    return true;
  }
  
  public int b()
  {
    if (this.a != null) {
      return this.a.b();
    }
    return 0;
  }
  
  protected void b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    paramCoordinatorLayout.a(paramV, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */