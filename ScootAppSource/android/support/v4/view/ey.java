package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;

final class ey
{
  public static long a(View paramView)
  {
    return paramView.animate().getDuration();
  }
  
  public static void a(View paramView, float paramFloat)
  {
    paramView.animate().alpha(paramFloat);
  }
  
  public static void a(View paramView, long paramLong)
  {
    paramView.animate().setDuration(paramLong);
  }
  
  public static void a(View paramView, fe paramfe)
  {
    if (paramfe != null)
    {
      paramView.animate().setListener(new ez(paramfe, paramView));
      return;
    }
    paramView.animate().setListener(null);
  }
  
  public static void a(View paramView, Interpolator paramInterpolator)
  {
    paramView.animate().setInterpolator(paramInterpolator);
  }
  
  public static void b(View paramView)
  {
    paramView.animate().cancel();
  }
  
  public static void b(View paramView, float paramFloat)
  {
    paramView.animate().translationX(paramFloat);
  }
  
  public static void b(View paramView, long paramLong)
  {
    paramView.animate().setStartDelay(paramLong);
  }
  
  public static void c(View paramView)
  {
    paramView.animate().start();
  }
  
  public static void c(View paramView, float paramFloat)
  {
    paramView.animate().translationY(paramFloat);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */