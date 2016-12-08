package com.facebook.b;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class be
  implements View.OnTouchListener
{
  be(ba paramba) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!paramView.hasFocus()) {
      paramView.requestFocus();
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */