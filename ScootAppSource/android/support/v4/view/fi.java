package android.support.v4.view;

import android.view.WindowInsets;

final class fi
  extends fh
{
  private final WindowInsets a;
  
  fi(WindowInsets paramWindowInsets)
  {
    this.a = paramWindowInsets;
  }
  
  public int a()
  {
    return this.a.getSystemWindowInsetLeft();
  }
  
  public fh a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new fi(this.a.replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public int b()
  {
    return this.a.getSystemWindowInsetTop();
  }
  
  public int c()
  {
    return this.a.getSystemWindowInsetRight();
  }
  
  public int d()
  {
    return this.a.getSystemWindowInsetBottom();
  }
  
  public boolean e()
  {
    return this.a.isConsumed();
  }
  
  WindowInsets f()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */