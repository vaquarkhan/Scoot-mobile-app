package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class by
  extends Animation
{
  by(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwipeRefreshLayout.a(this.a, 1.0F - paramFloat);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */