package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class bw
  implements Animation.AnimationListener
{
  bw(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (SwipeRefreshLayout.a(this.a))
    {
      SwipeRefreshLayout.b(this.a).setAlpha(255);
      SwipeRefreshLayout.b(this.a).start();
      if ((SwipeRefreshLayout.c(this.a)) && (SwipeRefreshLayout.d(this.a) != null)) {
        SwipeRefreshLayout.d(this.a).l_();
      }
      SwipeRefreshLayout.a(this.a, SwipeRefreshLayout.e(this.a).getTop());
      return;
    }
    SwipeRefreshLayout.f(this.a);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */