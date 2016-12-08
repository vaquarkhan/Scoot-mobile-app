package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

final class cq
{
  private static final cs a = new ct(null);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new cu(null);
      return;
    }
  }
  
  static void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    a.a(paramViewGroup, paramView, paramRect);
  }
  
  static void b(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
    a(paramViewGroup, paramView, paramRect);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */