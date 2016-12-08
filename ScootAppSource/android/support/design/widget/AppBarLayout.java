package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.R.style;
import android.support.design.R.styleable;
import android.support.v4.view.cb;
import android.support.v4.view.fh;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;

@s(a=AppBarLayout.Behavior.class)
public class AppBarLayout
  extends LinearLayout
{
  boolean a;
  private int b = -1;
  private int c = -1;
  private int d = -1;
  private float e;
  private int f = 0;
  private fh g;
  private final List<h> h;
  
  public AppBarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
    ce.a(paramContext);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.AppBarLayout, 0, R.style.Widget_Design_AppBarLayout);
    this.e = paramContext.getDimensionPixelSize(R.styleable.AppBarLayout_elevation, 0);
    setBackgroundDrawable(paramContext.getDrawable(R.styleable.AppBarLayout_android_background));
    if (paramContext.hasValue(R.styleable.AppBarLayout_expanded)) {
      setExpanded(paramContext.getBoolean(R.styleable.AppBarLayout_expanded, false));
    }
    paramContext.recycle();
    cy.a(this);
    this.h = new ArrayList();
    cb.j(this, this.e);
    cb.a(this, new c(this));
  }
  
  private fh a(fh paramfh)
  {
    fh localfh = null;
    if (cb.x(this)) {
      localfh = paramfh;
    }
    if (localfh != this.g)
    {
      this.g = localfh;
      b();
    }
    return paramfh;
  }
  
  private void b()
  {
    this.b = -1;
    this.c = -1;
    this.d = -1;
  }
  
  private boolean c()
  {
    return this.a;
  }
  
  private boolean d()
  {
    return getTotalScrollRange() != 0;
  }
  
  private void e()
  {
    this.f = 0;
  }
  
  private int getDownNestedPreScrollRange()
  {
    if (this.c != -1) {
      return this.c;
    }
    int j = getChildCount() - 1;
    int i = 0;
    View localView;
    int k;
    int m;
    if (j >= 0)
    {
      localView = getChildAt(j);
      g localg = (g)localView.getLayoutParams();
      k = localView.getMeasuredHeight();
      m = localg.a;
      if ((m & 0x5) == 5)
      {
        int n = localg.topMargin;
        i = localg.bottomMargin + n + i;
        if ((m & 0x8) != 0) {
          i += cb.r(localView);
        }
      }
    }
    for (;;)
    {
      j -= 1;
      break;
      if ((m & 0x2) != 0)
      {
        i += k - cb.r(localView);
      }
      else
      {
        i += k;
        continue;
        if (i > 0)
        {
          i = Math.max(0, i - getTopInset());
          this.c = i;
          return i;
        }
      }
    }
  }
  
  private int getDownNestedScrollRange()
  {
    if (this.d != -1) {
      return this.d;
    }
    int k = getChildCount();
    int j = 0;
    int i = 0;
    if (j < k)
    {
      View localView = getChildAt(j);
      g localg = (g)localView.getLayoutParams();
      int n = localView.getMeasuredHeight();
      int i1 = localg.topMargin;
      int i2 = localg.bottomMargin;
      int m = localg.a;
      if ((m & 0x1) != 0)
      {
        i += n + (i1 + i2);
        if ((m & 0x2) != 0) {
          i -= cb.r(localView) + getTopInset();
        }
      }
    }
    for (;;)
    {
      i = Math.max(0, i);
      this.d = i;
      return i;
      j += 1;
      break;
    }
  }
  
  private int getPendingAction()
  {
    return this.f;
  }
  
  private int getTopInset()
  {
    if (this.g != null) {
      return this.g.b();
    }
    return 0;
  }
  
  private int getUpNestedPreScrollRange()
  {
    return getTotalScrollRange();
  }
  
  protected g a()
  {
    return new g(-1, -2);
  }
  
  public g a(AttributeSet paramAttributeSet)
  {
    return new g(getContext(), paramAttributeSet);
  }
  
  protected g a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LinearLayout.LayoutParams)) {
      return new g((LinearLayout.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new g((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new g(paramLayoutParams);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    if (paramBoolean1)
    {
      i = 1;
      if (!paramBoolean2) {
        break label31;
      }
    }
    label31:
    for (int j = 4;; j = 0)
    {
      this.f = (j | i);
      requestLayout();
      return;
      i = 2;
      break;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof g;
  }
  
  final int getMinimumHeightForVisibleOverlappingContent()
  {
    int i = getTopInset();
    int j = cb.r(this);
    if (j != 0) {
      return i + j * 2;
    }
    j = getChildCount();
    if (j >= 1) {
      return i + cb.r(getChildAt(j - 1)) * 2;
    }
    return 0;
  }
  
  public float getTargetElevation()
  {
    return this.e;
  }
  
  public final int getTotalScrollRange()
  {
    if (this.b != -1) {
      return this.b;
    }
    int k = getChildCount();
    int j = 0;
    int i = 0;
    if (j < k)
    {
      View localView = getChildAt(j);
      g localg = (g)localView.getLayoutParams();
      int n = localView.getMeasuredHeight();
      int m = localg.a;
      if ((m & 0x1) != 0)
      {
        int i1 = localg.topMargin;
        i += localg.bottomMargin + (n + i1);
        if ((m & 0x2) != 0) {
          i -= cb.r(localView);
        }
      }
    }
    for (;;)
    {
      i = Math.max(0, i - getTopInset());
      this.b = i;
      return i;
      j += 1;
      break;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    b();
    this.a = false;
    paramInt2 = getChildCount();
    paramInt1 = 0;
    for (;;)
    {
      if (paramInt1 < paramInt2)
      {
        if (((g)getChildAt(paramInt1).getLayoutParams()).b() != null) {
          this.a = true;
        }
      }
      else {
        return;
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    b();
  }
  
  public void setExpanded(boolean paramBoolean)
  {
    a(paramBoolean, cb.F(this));
  }
  
  public void setOrientation(int paramInt)
  {
    if (paramInt != 1) {
      throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }
    super.setOrientation(paramInt);
  }
  
  public void setTargetElevation(float paramFloat)
  {
    this.e = paramFloat;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\AppBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */