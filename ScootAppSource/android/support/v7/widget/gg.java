package android.support.v7.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class gg
  extends Animation
{
  final float a;
  final float b;
  final float c;
  
  private gg(SwitchCompat paramSwitchCompat, float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = (paramFloat2 - paramFloat1);
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwitchCompat.a(this.d, this.a + this.c * paramFloat);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\gg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */