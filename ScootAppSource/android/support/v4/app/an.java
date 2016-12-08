package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class an
  implements Animation.AnimationListener
{
  private Animation.AnimationListener a = null;
  private boolean b = false;
  private View c = null;
  
  public an(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null)) {
      return;
    }
    this.c = paramView;
  }
  
  public an(View paramView, Animation paramAnimation, Animation.AnimationListener paramAnimationListener)
  {
    if ((paramView == null) || (paramAnimation == null)) {
      return;
    }
    this.a = paramAnimationListener;
    this.c = paramView;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if ((this.c != null) && (this.b)) {
      this.c.post(new ap(this));
    }
    if (this.a != null) {
      this.a.onAnimationEnd(paramAnimation);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    if (this.a != null) {
      this.a.onAnimationRepeat(paramAnimation);
    }
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    if (this.c != null)
    {
      this.b = aj.a(this.c, paramAnimation);
      if (this.b) {
        this.c.post(new ao(this));
      }
    }
    if (this.a != null) {
      this.a.onAnimationStart(paramAnimation);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */