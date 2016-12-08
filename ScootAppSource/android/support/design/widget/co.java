package android.support.design.widget;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

final class co
  extends cj
{
  final ValueAnimator a = new ValueAnimator();
  
  public void a()
  {
    this.a.start();
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.a.setFloatValues(new float[] { paramFloat1, paramFloat2 });
  }
  
  public void a(int paramInt)
  {
    this.a.setDuration(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.setIntValues(new int[] { paramInt1, paramInt2 });
  }
  
  public void a(cl paramcl)
  {
    this.a.addUpdateListener(new cp(this, paramcl));
  }
  
  public void a(Interpolator paramInterpolator)
  {
    this.a.setInterpolator(paramInterpolator);
  }
  
  public boolean b()
  {
    return this.a.isRunning();
  }
  
  public int c()
  {
    return ((Integer)this.a.getAnimatedValue()).intValue();
  }
  
  public float d()
  {
    return ((Float)this.a.getAnimatedValue()).floatValue();
  }
  
  public void e()
  {
    this.a.cancel();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */