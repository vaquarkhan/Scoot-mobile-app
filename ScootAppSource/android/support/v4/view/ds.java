package android.support.v4.view;

import android.view.animation.Interpolator;

final class ds
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    paramFloat -= 1.0F;
    return paramFloat * (paramFloat * paramFloat * paramFloat * paramFloat) + 1.0F;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */