package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.v4.view.a.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

class cc
  implements co
{
  WeakHashMap<View, en> a = null;
  
  private boolean a(bu parambu, int paramInt)
  {
    boolean bool = true;
    int i = parambu.computeHorizontalScrollOffset();
    int j = parambu.computeHorizontalScrollRange() - parambu.computeHorizontalScrollExtent();
    if (j == 0) {
      bool = false;
    }
    do
    {
      do
      {
        return bool;
        if (paramInt >= 0) {
          break;
        }
      } while (i > 0);
      return false;
    } while (i < j - 1);
    return false;
  }
  
  private boolean b(bu parambu, int paramInt)
  {
    boolean bool = true;
    int i = parambu.computeVerticalScrollOffset();
    int j = parambu.computeVerticalScrollRange() - parambu.computeVerticalScrollExtent();
    if (j == 0) {
      bool = false;
    }
    do
    {
      do
      {
        return bool;
        if (paramInt >= 0) {
          break;
        }
      } while (i > 0);
      return false;
    } while (i < j - 1);
    return false;
  }
  
  public void A(View paramView) {}
  
  public boolean B(View paramView)
  {
    return false;
  }
  
  public boolean C(View paramView)
  {
    if ((paramView instanceof bo)) {
      return ((bo)paramView).isNestedScrollingEnabled();
    }
    return false;
  }
  
  public ColorStateList D(View paramView)
  {
    return cp.a(paramView);
  }
  
  public PorterDuff.Mode E(View paramView)
  {
    return cp.b(paramView);
  }
  
  public void F(View paramView)
  {
    if ((paramView instanceof bo)) {
      ((bo)paramView).stopNestedScroll();
    }
  }
  
  public boolean G(View paramView)
  {
    return cp.c(paramView);
  }
  
  public float H(View paramView)
  {
    return y(paramView) + x(paramView);
  }
  
  public boolean I(View paramView)
  {
    return cp.f(paramView);
  }
  
  public boolean J(View paramView)
  {
    return false;
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSize(paramInt1, paramInt2);
  }
  
  public int a(View paramView)
  {
    return 2;
  }
  
  long a()
  {
    return 10L;
  }
  
  public fh a(View paramView, fh paramfh)
  {
    return paramfh;
  }
  
  public void a(View paramView, float paramFloat) {}
  
  public void a(View paramView, int paramInt1, int paramInt2) {}
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, int paramInt, Paint paramPaint) {}
  
  public void a(View paramView, ColorStateList paramColorStateList)
  {
    cp.a(paramView, paramColorStateList);
  }
  
  public void a(View paramView, PorterDuff.Mode paramMode)
  {
    cp.a(paramView, paramMode);
  }
  
  public void a(View paramView, l paraml) {}
  
  public void a(View paramView, a parama) {}
  
  public void a(View paramView, bs parambs) {}
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent) {}
  
  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postDelayed(paramRunnable, a());
  }
  
  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postDelayed(paramRunnable, a() + paramLong);
  }
  
  public void a(View paramView, boolean paramBoolean) {}
  
  public void a(ViewGroup paramViewGroup, boolean paramBoolean) {}
  
  public boolean a(View paramView, int paramInt)
  {
    return ((paramView instanceof bu)) && (a((bu)paramView, paramInt));
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }
  
  public fh b(View paramView, fh paramfh)
  {
    return paramfh;
  }
  
  public void b(View paramView, float paramFloat) {}
  
  public void b(View paramView, boolean paramBoolean) {}
  
  public boolean b(View paramView)
  {
    return false;
  }
  
  public boolean b(View paramView, int paramInt)
  {
    return ((paramView instanceof bu)) && (b((bu)paramView, paramInt));
  }
  
  public void c(View paramView, float paramFloat) {}
  
  public void c(View paramView, int paramInt) {}
  
  public void c(View paramView, boolean paramBoolean) {}
  
  public boolean c(View paramView)
  {
    return false;
  }
  
  public void d(View paramView)
  {
    paramView.invalidate();
  }
  
  public void d(View paramView, float paramFloat) {}
  
  public void d(View paramView, int paramInt) {}
  
  public int e(View paramView)
  {
    return 0;
  }
  
  public void e(View paramView, float paramFloat) {}
  
  public void e(View paramView, int paramInt)
  {
    cp.b(paramView, paramInt);
  }
  
  public float f(View paramView)
  {
    return 1.0F;
  }
  
  public void f(View paramView, float paramFloat) {}
  
  public void f(View paramView, int paramInt)
  {
    cp.a(paramView, paramInt);
  }
  
  public int g(View paramView)
  {
    return 0;
  }
  
  public void g(View paramView, float paramFloat) {}
  
  public int h(View paramView)
  {
    return 0;
  }
  
  public void h(View paramView, float paramFloat) {}
  
  public ViewParent i(View paramView)
  {
    return paramView.getParent();
  }
  
  public void i(View paramView, float paramFloat) {}
  
  public int j(View paramView)
  {
    return paramView.getMeasuredWidth();
  }
  
  public void j(View paramView, float paramFloat) {}
  
  public int k(View paramView)
  {
    return paramView.getMeasuredHeight();
  }
  
  public int l(View paramView)
  {
    return 0;
  }
  
  public int m(View paramView)
  {
    return paramView.getPaddingLeft();
  }
  
  public int n(View paramView)
  {
    return paramView.getPaddingRight();
  }
  
  public boolean o(View paramView)
  {
    return true;
  }
  
  public float p(View paramView)
  {
    return 0.0F;
  }
  
  public float q(View paramView)
  {
    return 0.0F;
  }
  
  public float r(View paramView)
  {
    return 0.0F;
  }
  
  public int s(View paramView)
  {
    return cp.d(paramView);
  }
  
  public int t(View paramView)
  {
    return cp.e(paramView);
  }
  
  public en u(View paramView)
  {
    return new en(paramView);
  }
  
  public int v(View paramView)
  {
    return 0;
  }
  
  public void w(View paramView) {}
  
  public float x(View paramView)
  {
    return 0.0F;
  }
  
  public float y(View paramView)
  {
    return 0.0F;
  }
  
  public boolean z(View paramView)
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */