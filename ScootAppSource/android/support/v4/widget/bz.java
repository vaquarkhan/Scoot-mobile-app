package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bz
  extends Animation
{
  bz(SwipeRefreshLayout paramSwipeRefreshLayout, int paramInt1, int paramInt2) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwipeRefreshLayout.b(this.c).setAlpha((int)(this.a + (this.b - this.a) * paramFloat));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */