package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class ax
  implements Animation.AnimationListener
{
  ax(av paramav, az paramaz) {}
  
  public void onAnimationEnd(Animation paramAnimation) {}
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    this.a.l();
    this.a.b();
    this.a.b(this.a.i());
    if (this.b.a)
    {
      this.b.a = false;
      paramAnimation.setDuration(1332L);
      this.a.a(false);
      return;
    }
    av.a(this.b, (av.a(this.b) + 1.0F) % 5.0F);
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    av.a(this.b, 0.0F);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */