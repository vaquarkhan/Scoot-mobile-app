package android.support.design.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

final class ct
  implements cs
{
  public void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    paramViewGroup.offsetDescendantRectToMyCoords(paramView, paramRect);
    paramRect.offset(paramView.getScrollX(), paramView.getScrollY());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */