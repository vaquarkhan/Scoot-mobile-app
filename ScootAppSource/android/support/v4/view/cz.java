package android.support.v4.view;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class cz
  implements View.OnApplyWindowInsetsListener
{
  cz(bs parambs) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramWindowInsets = new fi(paramWindowInsets);
    return ((fi)this.a.a(paramView, paramWindowInsets)).f();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */