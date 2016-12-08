package com.appsee;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class j
  implements View.OnTouchListener
{
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    ei.C(new v(this, paramMotionEvent));
    if (q.C(this.l) != null) {
      return q.C(this.l).onTouch(paramView, paramMotionEvent);
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */