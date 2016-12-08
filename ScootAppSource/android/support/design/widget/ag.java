package android.support.design.widget;

import android.view.animation.Animation;

final class ag
  extends b
{
  ag(af paramaf, boolean paramBoolean, aq paramaq) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    af.a(this.c, false);
    this.c.k.a(8, this.a);
    if (this.b != null) {
      this.b.b();
    }
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    af.a(this.c, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */