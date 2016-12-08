package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

final class aw
  extends Animation
{
  aw(av paramav, az paramaz) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.b.a)
    {
      av.a(this.b, paramFloat, this.a);
      return;
    }
    float f1 = av.a(this.b, this.a);
    float f2 = this.a.g();
    float f4 = this.a.f();
    float f3 = this.a.k();
    av.b(this.b, paramFloat, this.a);
    if (paramFloat <= 0.5F)
    {
      float f5 = paramFloat / 0.5F;
      f5 = av.a().getInterpolation(f5);
      this.a.b(f4 + f5 * (0.8F - f1));
    }
    if (paramFloat > 0.5F)
    {
      f4 = (paramFloat - 0.5F) / 0.5F;
      f4 = av.a().getInterpolation(f4);
      this.a.c((0.8F - f1) * f4 + f2);
    }
    this.a.d(0.25F * paramFloat + f3);
    f1 = av.a(this.b) / 5.0F;
    this.b.c(216.0F * paramFloat + 1080.0F * f1);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */