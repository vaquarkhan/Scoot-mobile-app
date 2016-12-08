package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

final class do
  implements View.OnTouchListener
{
  private do(dd paramdd) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (dd.b(this.a) != null) && (dd.b(this.a).isShowing()) && (j >= 0) && (j < dd.b(this.a).getWidth()) && (k >= 0) && (k < dd.b(this.a).getHeight())) {
      dd.d(this.a).postDelayed(dd.c(this.a), 250L);
    }
    for (;;)
    {
      return false;
      if (i == 1) {
        dd.d(this.a).removeCallbacks(dd.c(this.a));
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */