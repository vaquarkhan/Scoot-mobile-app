package android.support.design.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

abstract class ai
  extends Animation
{
  private float b;
  private float c;
  
  private ai(af paramaf) {}
  
  protected abstract float a();
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    this.a.a.b(this.b + this.c * paramFloat);
  }
  
  public void reset()
  {
    super.reset();
    this.b = this.a.a.a();
    this.c = (a() - this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */