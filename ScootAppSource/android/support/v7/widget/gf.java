package android.support.v7.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class gf
  implements Animation.AnimationListener
{
  gf(SwitchCompat paramSwitchCompat, boolean paramBoolean) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (SwitchCompat.a(this.b) == paramAnimation)
    {
      paramAnimation = this.b;
      if (!this.a) {
        break label40;
      }
    }
    label40:
    for (float f = 1.0F;; f = 0.0F)
    {
      SwitchCompat.a(paramAnimation, f);
      SwitchCompat.a(this.b, null);
      return;
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\gf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */