package com.sagar.taxiapp.b;

import android.support.v4.b.c;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;

final class ac
  implements Animation.AnimationListener
{
  ac(v paramv, TextView paramTextView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.a.setHintTextColor(c.c(this.b.l(), 2131689629));
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this.a.setHintTextColor(c.c(this.b.l(), 2131689677));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */