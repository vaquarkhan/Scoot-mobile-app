package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bx
  extends Animation
{
  bx(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwipeRefreshLayout.a(this.a, paramFloat);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */