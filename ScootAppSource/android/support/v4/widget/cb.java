package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class cb
  extends Animation
{
  cb(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (!SwipeRefreshLayout.h(this.a)) {}
    for (int i = (int)(SwipeRefreshLayout.i(this.a) - Math.abs(this.a.b));; i = (int)SwipeRefreshLayout.i(this.a))
    {
      int j = this.a.a;
      i = (int)((i - this.a.a) * paramFloat);
      int k = SwipeRefreshLayout.e(this.a).getTop();
      SwipeRefreshLayout.a(this.a, i + j - k, false);
      SwipeRefreshLayout.b(this.a).a(1.0F - paramFloat);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */