package com.mixpanel.android.mpmetrics;

import android.view.animation.Interpolator;

final class v
  implements Interpolator
{
  public v(q paramq) {}
  
  public float getInterpolation(float paramFloat)
  {
    return (float)-(Math.pow(2.718281828459045D, -8.0F * paramFloat) * Math.cos(12.0F * paramFloat)) + 1.0F;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */