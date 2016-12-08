package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

final class du
  implements bs
{
  private final Rect b = new Rect();
  
  du(ViewPager paramViewPager) {}
  
  public fh a(View paramView, fh paramfh)
  {
    paramView = cb.a(paramView, paramfh);
    if (paramView.e()) {
      return paramView;
    }
    paramfh = this.b;
    paramfh.left = paramView.a();
    paramfh.top = paramView.b();
    paramfh.right = paramView.c();
    paramfh.bottom = paramView.d();
    int i = 0;
    int j = this.a.getChildCount();
    while (i < j)
    {
      fh localfh = cb.b(this.a.getChildAt(i), paramView);
      paramfh.left = Math.min(localfh.a(), paramfh.left);
      paramfh.top = Math.min(localfh.b(), paramfh.top);
      paramfh.right = Math.min(localfh.c(), paramfh.right);
      paramfh.bottom = Math.min(localfh.d(), paramfh.bottom);
      i += 1;
    }
    return paramView.a(paramfh.left, paramfh.top, paramfh.right, paramfh.bottom);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */