package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;

final class cy
{
  private static ThreadLocal<Rect> a;
  
  private static Rect a()
  {
    if (a == null) {
      a = new ThreadLocal();
    }
    Rect localRect2 = (Rect)a.get();
    Rect localRect1 = localRect2;
    if (localRect2 == null)
    {
      localRect1 = new Rect();
      a.set(localRect1);
    }
    localRect1.setEmpty();
    return localRect1;
  }
  
  public static fh a(View paramView, fh paramfh)
  {
    Object localObject = paramfh;
    if ((paramfh instanceof fi))
    {
      WindowInsets localWindowInsets = ((fi)paramfh).f();
      paramView = paramView.onApplyWindowInsets(localWindowInsets);
      localObject = paramfh;
      if (paramView != localWindowInsets) {
        localObject = new fi(paramView);
      }
    }
    return (fh)localObject;
  }
  
  public static void a(View paramView)
  {
    paramView.requestApplyInsets();
  }
  
  public static void a(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  static void a(View paramView, int paramInt)
  {
    Rect localRect = a();
    ViewParent localViewParent = paramView.getParent();
    int i;
    if ((localViewParent instanceof View))
    {
      View localView = (View)localViewParent;
      localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
      if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
        i = 1;
      }
    }
    for (;;)
    {
      cs.a(paramView, paramInt);
      if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
        ((View)localViewParent).invalidate(localRect);
      }
      return;
      i = 0;
      continue;
      i = 0;
    }
  }
  
  static void a(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
    if (Build.VERSION.SDK_INT == 21)
    {
      paramColorStateList = paramView.getBackground();
      if ((paramView.getBackgroundTintList() == null) || (paramView.getBackgroundTintMode() == null)) {
        break label64;
      }
    }
    label64:
    for (int i = 1;; i = 0)
    {
      if ((paramColorStateList != null) && (i != 0))
      {
        if (paramColorStateList.isStateful()) {
          paramColorStateList.setState(paramView.getDrawableState());
        }
        paramView.setBackground(paramColorStateList);
      }
      return;
    }
  }
  
  static void a(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
    if (Build.VERSION.SDK_INT == 21)
    {
      paramMode = paramView.getBackground();
      if ((paramView.getBackgroundTintList() == null) || (paramView.getBackgroundTintMode() == null)) {
        break label64;
      }
    }
    label64:
    for (int i = 1;; i = 0)
    {
      if ((paramMode != null) && (i != 0))
      {
        if (paramMode.isStateful()) {
          paramMode.setState(paramView.getDrawableState());
        }
        paramView.setBackground(paramMode);
      }
      return;
    }
  }
  
  public static void a(View paramView, bs parambs)
  {
    if (parambs == null)
    {
      paramView.setOnApplyWindowInsetsListener(null);
      return;
    }
    paramView.setOnApplyWindowInsetsListener(new cz(parambs));
  }
  
  public static float b(View paramView)
  {
    return paramView.getElevation();
  }
  
  public static fh b(View paramView, fh paramfh)
  {
    Object localObject = paramfh;
    if ((paramfh instanceof fi))
    {
      WindowInsets localWindowInsets = ((fi)paramfh).f();
      paramView = paramView.dispatchApplyWindowInsets(localWindowInsets);
      localObject = paramfh;
      if (paramView != localWindowInsets) {
        localObject = new fi(paramView);
      }
    }
    return (fh)localObject;
  }
  
  static void b(View paramView, int paramInt)
  {
    Rect localRect = a();
    ViewParent localViewParent = paramView.getParent();
    int i;
    if ((localViewParent instanceof View))
    {
      View localView = (View)localViewParent;
      localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
      if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
        i = 1;
      }
    }
    for (;;)
    {
      cs.b(paramView, paramInt);
      if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
        ((View)localViewParent).invalidate(localRect);
      }
      return;
      i = 0;
      continue;
      i = 0;
    }
  }
  
  public static float c(View paramView)
  {
    return paramView.getTranslationZ();
  }
  
  static ColorStateList d(View paramView)
  {
    return paramView.getBackgroundTintList();
  }
  
  static PorterDuff.Mode e(View paramView)
  {
    return paramView.getBackgroundTintMode();
  }
  
  public static boolean f(View paramView)
  {
    return paramView.isNestedScrollingEnabled();
  }
  
  public static void g(View paramView)
  {
    paramView.stopNestedScroll();
  }
  
  public static float h(View paramView)
  {
    return paramView.getZ();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */