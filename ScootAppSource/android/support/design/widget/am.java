package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class am
  extends AnimatorListenerAdapter
{
  private boolean d;
  
  am(al paramal, boolean paramBoolean, aq paramaq) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    al.a(this.c, false);
    this.d = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    al.a(this.c, false);
    if (!this.d)
    {
      this.c.k.a(8, this.a);
      if (this.b != null) {
        this.b.b();
      }
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    al.a(this.c, true);
    this.d = false;
    this.c.k.a(0, this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */