package com.appsee;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.lang.ref.WeakReference;

class l
  extends TouchDelegate
{
  private TouchDelegate A;
  private WeakReference<View> G;
  
  public l(q paramq, View paramView) {}
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    ei.C(new n(this, paramMotionEvent));
    if (this.A != null) {
      return this.A.onTouchEvent(paramMotionEvent);
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */