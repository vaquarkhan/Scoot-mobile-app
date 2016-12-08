package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class cd
  extends Animation
{
  cd(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = SwipeRefreshLayout.j(this.a);
    float f2 = -SwipeRefreshLayout.j(this.a);
    SwipeRefreshLayout.a(this.a, f1 + f2 * paramFloat);
    SwipeRefreshLayout.b(this.a, paramFloat);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */