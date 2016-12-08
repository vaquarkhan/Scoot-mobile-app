package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;

final class am
  extends an
{
  am(aj paramaj, View paramView, Animation paramAnimation, Fragment paramFragment)
  {
    super(paramView, paramAnimation);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    super.onAnimationEnd(paramAnimation);
    if (this.a.l != null)
    {
      this.a.l = null;
      this.b.a(this.a, this.a.m, 0, 0, false);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */