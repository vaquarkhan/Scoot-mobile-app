package com.payu.magicretry.WaitingDots;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class d
  implements ValueAnimator.AnimatorUpdateListener
{
  d(DotsTextView paramDotsTextView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.a.invalidate();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\magicretry\WaitingDots\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */