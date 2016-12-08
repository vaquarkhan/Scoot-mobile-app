package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;

final class cp
{
  private static Field a;
  private static boolean b;
  private static Field c;
  private static boolean d;
  
  static ColorStateList a(View paramView)
  {
    if ((paramView instanceof bv)) {
      return ((bv)paramView).getSupportBackgroundTintList();
    }
    return null;
  }
  
  static void a(View paramView, int paramInt)
  {
    int i = paramView.getTop();
    paramView.offsetTopAndBottom(paramInt);
    if (paramInt != 0)
    {
      ViewParent localViewParent = paramView.getParent();
      if ((localViewParent instanceof View))
      {
        paramInt = Math.abs(paramInt);
        ((View)localViewParent).invalidate(paramView.getLeft(), i - paramInt, paramView.getRight(), i + paramView.getHeight() + paramInt);
      }
    }
    else
    {
      return;
    }
    paramView.invalidate();
  }
  
  static void a(View paramView, ColorStateList paramColorStateList)
  {
    if ((paramView instanceof bv)) {
      ((bv)paramView).setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  static void a(View paramView, PorterDuff.Mode paramMode)
  {
    if ((paramView instanceof bv)) {
      ((bv)paramView).setSupportBackgroundTintMode(paramMode);
    }
  }
  
  static PorterDuff.Mode b(View paramView)
  {
    if ((paramView instanceof bv)) {
      return ((bv)paramView).getSupportBackgroundTintMode();
    }
    return null;
  }
  
  static void b(View paramView, int paramInt)
  {
    int i = paramView.getLeft();
    paramView.offsetLeftAndRight(paramInt);
    if (paramInt != 0)
    {
      ViewParent localViewParent = paramView.getParent();
      if ((localViewParent instanceof View))
      {
        paramInt = Math.abs(paramInt);
        ((View)localViewParent).invalidate(i - paramInt, paramView.getTop(), i + paramView.getWidth() + paramInt, paramView.getBottom());
      }
    }
    else
    {
      return;
    }
    paramView.invalidate();
  }
  
  static boolean c(View paramView)
  {
    return (paramView.getWidth() > 0) && (paramView.getHeight() > 0);
  }
  
  static int d(View paramView)
  {
    if (!b) {}
    try
    {
      a = View.class.getDeclaredField("mMinWidth");
      a.setAccessible(true);
      b = true;
      if (a != null) {
        try
        {
          int i = ((Integer)a.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  static int e(View paramView)
  {
    if (!d) {}
    try
    {
      c = View.class.getDeclaredField("mMinHeight");
      c.setAccessible(true);
      d = true;
      if (c != null) {
        try
        {
          int i = ((Integer)c.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  static boolean f(View paramView)
  {
    return paramView.getWindowToken() != null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */