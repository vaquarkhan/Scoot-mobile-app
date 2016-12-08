package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

final class cs
{
  public static float a(View paramView)
  {
    return paramView.getAlpha();
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return View.combineMeasuredStates(paramInt1, paramInt2);
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
  }
  
  static long a()
  {
    return ValueAnimator.getFrameDelay();
  }
  
  public static void a(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }
  
  static void a(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    j(paramView);
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      j((View)paramView);
    }
  }
  
  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    paramView.setSaveFromParentEnabled(paramBoolean);
  }
  
  public static int b(View paramView)
  {
    return paramView.getLayerType();
  }
  
  public static void b(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }
  
  static void b(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
    j(paramView);
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      j((View)paramView);
    }
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    paramView.setActivated(paramBoolean);
  }
  
  public static int c(View paramView)
  {
    return paramView.getMeasuredWidthAndState();
  }
  
  public static void c(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }
  
  public static int d(View paramView)
  {
    return paramView.getMeasuredHeightAndState();
  }
  
  public static void d(View paramView, float paramFloat)
  {
    paramView.setRotation(paramFloat);
  }
  
  public static int e(View paramView)
  {
    return paramView.getMeasuredState();
  }
  
  public static void e(View paramView, float paramFloat)
  {
    paramView.setRotationX(paramFloat);
  }
  
  public static float f(View paramView)
  {
    return paramView.getTranslationX();
  }
  
  public static void f(View paramView, float paramFloat)
  {
    paramView.setRotationY(paramFloat);
  }
  
  public static float g(View paramView)
  {
    return paramView.getTranslationY();
  }
  
  public static void g(View paramView, float paramFloat)
  {
    paramView.setScaleX(paramFloat);
  }
  
  public static float h(View paramView)
  {
    return paramView.getScaleX();
  }
  
  public static void h(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }
  
  public static void i(View paramView)
  {
    paramView.jumpDrawablesToCurrentState();
  }
  
  public static void i(View paramView, float paramFloat)
  {
    paramView.setPivotX(paramFloat);
  }
  
  private static void j(View paramView)
  {
    float f = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f);
    paramView.setTranslationY(f);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */