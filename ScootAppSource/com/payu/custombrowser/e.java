package com.payu.custombrowser;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;

final class e
  implements View.OnTouchListener
{
  float a;
  boolean b = true;
  int c = 0;
  
  e(a parama) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!a.u(this.d))
    {
      a.c(this.d);
      if (this.b) {}
    }
    else
    {
      return false;
    }
    int i = paramMotionEvent.getActionMasked();
    if (a.d(this.d).getVisibility() == 0)
    {
      a.d(this.d).setClickable(false);
      a.d(this.d).setOnTouchListener(null);
      paramMotionEvent = new TranslateAnimation(0.0F, 0.0F, this.c, 0.0F);
      paramMotionEvent.setDuration(500L);
      paramMotionEvent.setFillBefore(true);
      paramView.startAnimation(paramMotionEvent);
      a.t(this.d).setVisibility(0);
      this.b = false;
      new Handler().postDelayed(new f(this), 20L);
      new Handler().postDelayed(new g(this), 500L);
    }
    for (;;)
    {
      return true;
      switch (i)
      {
      case 2: 
      case 3: 
      default: 
        break;
      case 0: 
        this.a = paramMotionEvent.getY();
        break;
      case 1: 
        float f = paramMotionEvent.getY();
        if ((this.a < f) && (a.t(this.d).getVisibility() == 0) && (f - this.a > 0.0F))
        {
          this.c = paramView.getHeight();
          paramMotionEvent = new TranslateAnimation(0.0F, 0.0F, 0.0F, paramView.getHeight() - 30);
          paramMotionEvent.setDuration(500L);
          paramMotionEvent.setFillBefore(false);
          paramMotionEvent.setFillEnabled(true);
          paramMotionEvent.setZAdjustment(1);
          paramView.startAnimation(paramMotionEvent);
          if (a.f(this.d) != null) {
            a.f(this.d).setVisibility(8);
          }
          this.b = false;
          this.b = true;
          new Handler().postDelayed(new h(this), 400L);
        }
        break;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */