package com.sagar.taxiapp.b;

import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

final class au
  extends GestureDetector.SimpleOnGestureListener
{
  private au(v paramv) {}
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    View localView = v.J(this.a).a(paramMotionEvent.getX(), paramMotionEvent.getY());
    this.a.onClick(localView);
    super.onLongPress(paramMotionEvent);
  }
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    View localView = v.J(this.a).a(paramMotionEvent.getX(), paramMotionEvent.getY());
    this.a.onClick(localView);
    return super.onSingleTapConfirmed(paramMotionEvent);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */