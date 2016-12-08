package android.support.design.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class az
  implements Animation.AnimationListener
{
  az(Snackbar paramSnackbar, int paramInt) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    Snackbar.b(this.b, this.a);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */