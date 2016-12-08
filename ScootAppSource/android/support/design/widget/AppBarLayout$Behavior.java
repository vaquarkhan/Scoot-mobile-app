package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v4.view.cb;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;

public class AppBarLayout$Behavior
  extends as<AppBarLayout>
{
  private int a;
  private boolean b;
  private boolean c;
  private cf d;
  private int e = -1;
  private boolean f;
  private float g;
  private WeakReference<View> h;
  private e i;
  
  public AppBarLayout$Behavior() {}
  
  public AppBarLayout$Behavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private int a(AppBarLayout paramAppBarLayout, int paramInt)
  {
    int j = 0;
    int k = paramAppBarLayout.getChildCount();
    while (j < k)
    {
      View localView = paramAppBarLayout.getChildAt(j);
      if ((localView.getTop() <= -paramInt) && (localView.getBottom() >= -paramInt)) {
        return j;
      }
      j += 1;
    }
    return -1;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) == paramInt2;
  }
  
  private int b(AppBarLayout paramAppBarLayout, int paramInt)
  {
    int m = Math.abs(paramInt);
    int n = paramAppBarLayout.getChildCount();
    int k = 0;
    int j = paramInt;
    View localView;
    Interpolator localInterpolator;
    if (k < n)
    {
      localView = paramAppBarLayout.getChildAt(k);
      g localg = (g)localView.getLayoutParams();
      localInterpolator = localg.b();
      if ((m < localView.getTop()) || (m > localView.getBottom())) {
        break label224;
      }
      j = paramInt;
      if (localInterpolator != null)
      {
        n = localg.a();
        if ((n & 0x1) == 0) {
          break label233;
        }
        j = localView.getHeight();
        k = localg.topMargin;
        k = localg.bottomMargin + (j + k) + 0;
        j = k;
        if ((n & 0x2) == 0) {}
      }
    }
    label224:
    label233:
    for (j = k - cb.r(localView);; j = 0)
    {
      k = j;
      if (cb.x(localView)) {
        k = j - AppBarLayout.e(paramAppBarLayout);
      }
      j = paramInt;
      if (k > 0)
      {
        j = localView.getTop();
        float f1 = k;
        j = Math.round(localInterpolator.getInterpolation((m - j) / k) * f1);
        j = Integer.signum(paramInt) * (j + localView.getTop());
      }
      return j;
      k += 1;
      break;
    }
  }
  
  private void b(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt)
  {
    int j = a();
    if (j == paramInt)
    {
      if ((this.d != null) && (this.d.b())) {
        this.d.e();
      }
      return;
    }
    if (this.d == null)
    {
      this.d = cy.a();
      this.d.a(a.e);
      this.d.a(new d(this, paramCoordinatorLayout, paramAppBarLayout));
    }
    for (;;)
    {
      float f1 = Math.abs(j - paramInt) / paramCoordinatorLayout.getResources().getDisplayMetrics().density;
      this.d.a(Math.round(f1 * 1000.0F / 300.0F));
      this.d.a(j, paramInt);
      this.d.a();
      return;
      this.d.e();
    }
  }
  
  private void c(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
  {
    int i1 = a();
    int i2 = a(paramAppBarLayout, i1);
    View localView;
    int n;
    int m;
    int j;
    int k;
    if (i2 >= 0)
    {
      localView = paramAppBarLayout.getChildAt(i2);
      n = ((g)localView.getLayoutParams()).a();
      if ((n & 0x11) == 17)
      {
        m = -localView.getTop();
        j = -localView.getBottom();
        k = j;
        if (i2 == paramAppBarLayout.getChildCount() - 1) {
          k = j + AppBarLayout.e(paramAppBarLayout);
        }
        if (!a(n, 2)) {
          break label139;
        }
        k += cb.r(localView);
        j = m;
      }
    }
    for (;;)
    {
      if (i1 < (k + j) / 2) {}
      for (;;)
      {
        b(paramCoordinatorLayout, paramAppBarLayout, av.a(k, -paramAppBarLayout.getTotalScrollRange(), 0));
        return;
        label139:
        if (!a(n, 5)) {
          break label184;
        }
        n = cb.r(localView) + k;
        j = n;
        if (i1 < n) {
          break;
        }
        k = n;
        j = m;
        break;
        k = j;
      }
      label184:
      j = m;
    }
  }
  
  private void d(AppBarLayout paramAppBarLayout)
  {
    List localList = AppBarLayout.i(paramAppBarLayout);
    int k = localList.size();
    int j = 0;
    while (j < k)
    {
      h localh = (h)localList.get(j);
      if (localh != null) {
        localh.a(paramAppBarLayout, b());
      }
      j += 1;
    }
  }
  
  int a()
  {
    return b() + this.a;
  }
  
  int a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, int paramInt3)
  {
    int j = 0;
    int k = a();
    if ((paramInt2 != 0) && (k >= paramInt2) && (k <= paramInt3))
    {
      paramInt2 = av.a(paramInt1, paramInt2, paramInt3);
      paramInt1 = j;
      if (k != paramInt2) {
        if (!AppBarLayout.h(paramAppBarLayout)) {
          break label108;
        }
      }
      label108:
      for (paramInt1 = b(paramAppBarLayout, paramInt2);; paramInt1 = paramInt2)
      {
        boolean bool = a(paramInt1);
        this.a = (paramInt2 - paramInt1);
        if ((!bool) && (AppBarLayout.h(paramAppBarLayout))) {
          paramCoordinatorLayout.c(paramAppBarLayout);
        }
        d(paramAppBarLayout);
        paramInt1 = k - paramInt2;
        return paramInt1;
      }
    }
    this.a = 0;
    return 0;
  }
  
  void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
  {
    c(paramCoordinatorLayout, paramAppBarLayout);
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof AppBarLayout.Behavior.SavedState))
    {
      paramParcelable = (AppBarLayout.Behavior.SavedState)paramParcelable;
      super.a(paramCoordinatorLayout, paramAppBarLayout, paramParcelable.getSuperState());
      this.e = paramParcelable.a;
      this.g = paramParcelable.b;
      this.f = paramParcelable.c;
      return;
    }
    super.a(paramCoordinatorLayout, paramAppBarLayout, paramParcelable);
    this.e = -1;
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView)
  {
    if (!this.c) {
      c(paramCoordinatorLayout, paramAppBarLayout);
    }
    this.b = false;
    this.c = false;
    this.h = new WeakReference(paramView);
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt4 < 0)
    {
      b(paramCoordinatorLayout, paramAppBarLayout, paramInt4, -AppBarLayout.d(paramAppBarLayout), 0);
      this.b = true;
      return;
    }
    this.b = false;
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramInt2 != 0) && (!this.b))
    {
      if (paramInt2 >= 0) {
        break label50;
      }
      paramInt1 = -paramAppBarLayout.getTotalScrollRange();
    }
    for (int j = paramInt1 + AppBarLayout.b(paramAppBarLayout);; j = 0)
    {
      paramArrayOfInt[1] = b(paramCoordinatorLayout, paramAppBarLayout, paramInt2, paramInt1, j);
      return;
      label50:
      paramInt1 = -AppBarLayout.c(paramAppBarLayout);
    }
  }
  
  boolean a(AppBarLayout paramAppBarLayout)
  {
    if (this.i != null) {
      return this.i.a(paramAppBarLayout);
    }
    if (this.h != null)
    {
      paramAppBarLayout = (View)this.h.get();
      return (paramAppBarLayout != null) && (paramAppBarLayout.isShown()) && (!cb.b(paramAppBarLayout, -1));
    }
    return true;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt)
  {
    boolean bool = super.a(paramCoordinatorLayout, paramAppBarLayout, paramInt);
    int j = AppBarLayout.f(paramAppBarLayout);
    if (j != 0) {
      if ((j & 0x4) != 0)
      {
        paramInt = 1;
        if ((j & 0x2) == 0) {
          break label107;
        }
        j = -AppBarLayout.c(paramAppBarLayout);
        if (paramInt == 0) {
          break label95;
        }
        b(paramCoordinatorLayout, paramAppBarLayout, j);
      }
    }
    label95:
    label107:
    while (this.e < 0) {
      for (;;)
      {
        AppBarLayout.g(paramAppBarLayout);
        this.e = -1;
        a(av.a(b(), -paramAppBarLayout.getTotalScrollRange(), 0));
        d(paramAppBarLayout);
        return bool;
        paramInt = 0;
        continue;
        a_(paramCoordinatorLayout, paramAppBarLayout, j);
        continue;
        if ((j & 0x1) != 0) {
          if (paramInt != 0) {
            b(paramCoordinatorLayout, paramAppBarLayout, 0);
          } else {
            a_(paramCoordinatorLayout, paramAppBarLayout, 0);
          }
        }
      }
    }
    paramCoordinatorLayout = paramAppBarLayout.getChildAt(this.e);
    paramInt = -paramCoordinatorLayout.getBottom();
    if (this.f) {}
    for (paramInt = cb.r(paramCoordinatorLayout) + paramInt;; paramInt = Math.round(paramCoordinatorLayout.getHeight() * this.g) + paramInt)
    {
      a(paramInt);
      break;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (((u)paramAppBarLayout.getLayoutParams()).height == -2)
    {
      paramCoordinatorLayout.a(paramAppBarLayout, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(0, 0), paramInt4);
      return true;
    }
    return super.a(paramCoordinatorLayout, paramAppBarLayout, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool = false;
    if (!paramBoolean) {
      paramBoolean = a(paramCoordinatorLayout, paramAppBarLayout, -paramAppBarLayout.getTotalScrollRange(), 0, -paramFloat2);
    }
    for (;;)
    {
      this.c = paramBoolean;
      return paramBoolean;
      int j;
      if (paramFloat2 < 0.0F)
      {
        j = -paramAppBarLayout.getTotalScrollRange() + AppBarLayout.b(paramAppBarLayout);
        paramBoolean = bool;
        if (a() < j)
        {
          b(paramCoordinatorLayout, paramAppBarLayout, j);
          paramBoolean = true;
        }
      }
      else
      {
        j = -AppBarLayout.c(paramAppBarLayout);
        paramBoolean = bool;
        if (a() > j)
        {
          b(paramCoordinatorLayout, paramAppBarLayout, j);
          paramBoolean = true;
        }
      }
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) != 0) && (AppBarLayout.a(paramAppBarLayout)) && (paramCoordinatorLayout.getHeight() - paramView1.getHeight() <= paramAppBarLayout.getHeight())) {}
    for (boolean bool = true;; bool = false)
    {
      if ((bool) && (this.d != null)) {
        this.d.e();
      }
      this.h = null;
      return bool;
    }
  }
  
  int b(AppBarLayout paramAppBarLayout)
  {
    return -AppBarLayout.d(paramAppBarLayout);
  }
  
  public Parcelable b(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
  {
    boolean bool = false;
    Parcelable localParcelable = super.b(paramCoordinatorLayout, paramAppBarLayout);
    int k = b();
    int m = paramAppBarLayout.getChildCount();
    int j = 0;
    while (j < m)
    {
      paramCoordinatorLayout = paramAppBarLayout.getChildAt(j);
      int n = paramCoordinatorLayout.getBottom() + k;
      if ((paramCoordinatorLayout.getTop() + k <= 0) && (n >= 0))
      {
        paramAppBarLayout = new AppBarLayout.Behavior.SavedState(localParcelable);
        paramAppBarLayout.a = j;
        if (n == cb.r(paramCoordinatorLayout)) {
          bool = true;
        }
        paramAppBarLayout.c = bool;
        paramAppBarLayout.b = (n / paramCoordinatorLayout.getHeight());
        return paramAppBarLayout;
      }
      j += 1;
    }
    return localParcelable;
  }
  
  int c(AppBarLayout paramAppBarLayout)
  {
    return paramAppBarLayout.getTotalScrollRange();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\AppBarLayout$Behavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */