package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class an
  extends AnimatorListenerAdapter
{
  an(al paramal, boolean paramBoolean, aq paramaq) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (this.b != null) {
      this.b.a();
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.c.k.a(0, this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */