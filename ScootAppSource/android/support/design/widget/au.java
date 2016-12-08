package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.cb;
import android.support.v4.view.v;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

abstract class au
  extends cw<View>
{
  private final Rect a = new Rect();
  private final Rect b = new Rect();
  private int c = 0;
  private int d;
  
  public au() {}
  
  public au(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private static int c(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0) {
      i = 8388659;
    }
    return i;
  }
  
  float a(View paramView)
  {
    return 1.0F;
  }
  
  final int a()
  {
    return this.c;
  }
  
  abstract View a(List<View> paramList);
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = paramView.getLayoutParams().height;
    if ((j == -1) || (j == -2))
    {
      View localView = a(paramCoordinatorLayout.d(paramView));
      if (localView != null)
      {
        if ((cb.x(localView)) && (!cb.x(paramView)))
        {
          cb.a(paramView, true);
          if (cb.x(paramView))
          {
            paramView.requestLayout();
            return true;
          }
        }
        if (cb.F(localView))
        {
          int i = View.MeasureSpec.getSize(paramInt3);
          paramInt3 = i;
          if (i == 0) {
            paramInt3 = paramCoordinatorLayout.getHeight();
          }
          int k = localView.getMeasuredHeight();
          int m = b(localView);
          if (j == -1) {}
          for (i = 1073741824;; i = Integer.MIN_VALUE)
          {
            paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(m + (paramInt3 - k), i), paramInt4);
            return true;
          }
        }
      }
    }
    return false;
  }
  
  int b(View paramView)
  {
    return paramView.getMeasuredHeight();
  }
  
  public final void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  protected void b(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    View localView = a(paramCoordinatorLayout.d(paramView));
    if (localView != null)
    {
      u localu = (u)paramView.getLayoutParams();
      Rect localRect = this.a;
      localRect.set(paramCoordinatorLayout.getPaddingLeft() + localu.leftMargin, localView.getBottom() + localu.topMargin, paramCoordinatorLayout.getWidth() - paramCoordinatorLayout.getPaddingRight() - localu.rightMargin, paramCoordinatorLayout.getHeight() + localView.getBottom() - paramCoordinatorLayout.getPaddingBottom() - localu.bottomMargin);
      paramCoordinatorLayout = this.b;
      v.a(c(localu.c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect, paramCoordinatorLayout, paramInt);
      paramInt = c(localView);
      paramView.layout(paramCoordinatorLayout.left, paramCoordinatorLayout.top - paramInt, paramCoordinatorLayout.right, paramCoordinatorLayout.bottom - paramInt);
      this.c = (paramCoordinatorLayout.top - localView.getBottom());
      return;
    }
    super.b(paramCoordinatorLayout, paramView, paramInt);
    this.c = 0;
  }
  
  final int c(View paramView)
  {
    if (this.d == 0) {
      return 0;
    }
    return av.a(Math.round(a(paramView) * this.d), 0, this.d);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */