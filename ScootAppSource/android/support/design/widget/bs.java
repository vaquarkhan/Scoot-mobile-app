package android.support.design.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class bs
  implements Animation.AnimationListener
{
  bs(br parambr) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (br.a(this.a) == paramAnimation) {
      br.a(this.a, null);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */