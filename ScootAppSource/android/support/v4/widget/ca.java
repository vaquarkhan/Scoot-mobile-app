package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class ca
  implements Animation.AnimationListener
{
  ca(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (!SwipeRefreshLayout.g(this.a)) {
      SwipeRefreshLayout.a(this.a, null);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */