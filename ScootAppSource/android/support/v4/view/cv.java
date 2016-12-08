package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

final class cv
{
  public static void a(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  public static boolean a(View paramView)
  {
    return paramView.hasTransientState();
  }
  
  public static boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return paramView.performAccessibilityAction(paramInt, paramBundle);
  }
  
  public static void b(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public static int c(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  public static ViewParent d(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
  
  public static int e(View paramView)
  {
    return paramView.getMinimumWidth();
  }
  
  public static int f(View paramView)
  {
    return paramView.getMinimumHeight();
  }
  
  public static void g(View paramView)
  {
    paramView.requestFitSystemWindows();
  }
  
  public static boolean h(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
  
  public static boolean i(View paramView)
  {
    return paramView.hasOverlappingRendering();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */