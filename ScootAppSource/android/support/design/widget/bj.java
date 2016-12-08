package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

final class bj
  extends SwipeDismissBehavior<Snackbar.SnackbarLayout>
{
  bj(Snackbar paramSnackbar) {}
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, Snackbar.SnackbarLayout paramSnackbarLayout, MotionEvent paramMotionEvent)
  {
    if (paramCoordinatorLayout.a(paramSnackbarLayout, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
      switch (paramMotionEvent.getActionMasked())
      {
      }
    }
    for (;;)
    {
      return super.a(paramCoordinatorLayout, paramSnackbarLayout, paramMotionEvent);
      bn.a().c(Snackbar.a(this.a));
      continue;
      bn.a().d(Snackbar.a(this.a));
    }
  }
  
  public boolean a(View paramView)
  {
    return paramView instanceof Snackbar.SnackbarLayout;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */