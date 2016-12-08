package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.cb;
import android.view.View;
import java.util.List;

public class FloatingActionButton$Behavior
  extends r<FloatingActionButton>
{
  private static final boolean a;
  private cf b;
  private float c;
  private Rect d;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  private float a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton)
  {
    float f = 0.0F;
    List localList = paramCoordinatorLayout.d(paramFloatingActionButton);
    int j = localList.size();
    int i = 0;
    if (i < j)
    {
      View localView = (View)localList.get(i);
      if ((!(localView instanceof Snackbar.SnackbarLayout)) || (!paramCoordinatorLayout.a(paramFloatingActionButton, localView))) {
        break label88;
      }
      f = Math.min(f, cb.p(localView) - localView.getHeight());
    }
    label88:
    for (;;)
    {
      i += 1;
      break;
      return f;
    }
  }
  
  private boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, FloatingActionButton paramFloatingActionButton)
  {
    if (((u)paramFloatingActionButton.getLayoutParams()).a() != paramAppBarLayout.getId()) {
      return false;
    }
    if (paramFloatingActionButton.getUserSetVisibility() != 0) {
      return false;
    }
    if (this.d == null) {
      this.d = new Rect();
    }
    Rect localRect = this.d;
    cq.b(paramCoordinatorLayout, paramAppBarLayout, localRect);
    if (localRect.bottom <= paramAppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
      FloatingActionButton.a(paramFloatingActionButton, null, false);
    }
    for (;;)
    {
      return true;
      FloatingActionButton.b(paramFloatingActionButton, null, false);
    }
  }
  
  private void b(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton)
  {
    int j = 0;
    Rect localRect = FloatingActionButton.a(paramFloatingActionButton);
    u localu;
    int i;
    if ((localRect != null) && (localRect.centerX() > 0) && (localRect.centerY() > 0))
    {
      localu = (u)paramFloatingActionButton.getLayoutParams();
      if (paramFloatingActionButton.getRight() < paramCoordinatorLayout.getWidth() - localu.rightMargin) {
        break label98;
      }
      i = localRect.right;
    }
    for (;;)
    {
      if (paramFloatingActionButton.getBottom() >= paramCoordinatorLayout.getBottom() - localu.bottomMargin) {
        j = localRect.bottom;
      }
      for (;;)
      {
        paramFloatingActionButton.offsetTopAndBottom(j);
        paramFloatingActionButton.offsetLeftAndRight(i);
        return;
        label98:
        if (paramFloatingActionButton.getLeft() > localu.leftMargin) {
          break label143;
        }
        i = -localRect.left;
        break;
        if (paramFloatingActionButton.getTop() <= localu.topMargin) {
          j = -localRect.top;
        }
      }
      label143:
      i = 0;
    }
  }
  
  private void d(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
  {
    float f1 = a(paramCoordinatorLayout, paramFloatingActionButton);
    if (this.c == f1) {
      return;
    }
    float f2 = cb.p(paramFloatingActionButton);
    if ((this.b != null) && (this.b.b())) {
      this.b.e();
    }
    if ((paramFloatingActionButton.isShown()) && (Math.abs(f2 - f1) > paramFloatingActionButton.getHeight() * 0.667F))
    {
      if (this.b == null)
      {
        this.b = cy.a();
        this.b.a(a.b);
        this.b.a(new ac(this, paramFloatingActionButton));
      }
      this.b.a(f2, f1);
      this.b.a();
    }
    for (;;)
    {
      this.c = f1;
      return;
      cb.b(paramFloatingActionButton, f1);
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, int paramInt)
  {
    List localList = paramCoordinatorLayout.d(paramFloatingActionButton);
    int j = localList.size();
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        View localView = (View)localList.get(i);
        if ((!(localView instanceof AppBarLayout)) || (!a(paramCoordinatorLayout, (AppBarLayout)localView, paramFloatingActionButton))) {}
      }
      else
      {
        paramCoordinatorLayout.a(paramFloatingActionButton, paramInt);
        b(paramCoordinatorLayout, paramFloatingActionButton);
        return true;
      }
      i += 1;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
  {
    return (a) && ((paramView instanceof Snackbar.SnackbarLayout));
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
  {
    if ((paramView instanceof Snackbar.SnackbarLayout)) {
      d(paramCoordinatorLayout, paramFloatingActionButton, paramView);
    }
    for (;;)
    {
      return false;
      if ((paramView instanceof AppBarLayout)) {
        a(paramCoordinatorLayout, (AppBarLayout)paramView, paramFloatingActionButton);
      }
    }
  }
  
  public void c(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
  {
    if ((paramView instanceof Snackbar.SnackbarLayout)) {
      d(paramCoordinatorLayout, paramFloatingActionButton, paramView);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\FloatingActionButton$Behavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */