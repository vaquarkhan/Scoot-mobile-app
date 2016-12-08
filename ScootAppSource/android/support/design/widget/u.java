package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.R.styleable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;

public final class u
  extends ViewGroup.MarginLayoutParams
{
  r a;
  boolean b = false;
  public int c = 0;
  public int d = 0;
  public int e = -1;
  int f = -1;
  View g;
  View h;
  final Rect i = new Rect();
  Object j;
  private boolean k;
  private boolean l;
  private boolean m;
  
  public u(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  u(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CoordinatorLayout_LayoutParams);
    this.c = localTypedArray.getInteger(R.styleable.CoordinatorLayout_LayoutParams_android_layout_gravity, 0);
    this.f = localTypedArray.getResourceId(R.styleable.CoordinatorLayout_LayoutParams_layout_anchor, -1);
    this.d = localTypedArray.getInteger(R.styleable.CoordinatorLayout_LayoutParams_layout_anchorGravity, 0);
    this.e = localTypedArray.getInteger(R.styleable.CoordinatorLayout_LayoutParams_layout_keyline, -1);
    this.b = localTypedArray.hasValue(R.styleable.CoordinatorLayout_LayoutParams_layout_behavior);
    if (this.b) {
      this.a = CoordinatorLayout.a(paramContext, paramAttributeSet, localTypedArray.getString(R.styleable.CoordinatorLayout_LayoutParams_layout_behavior));
    }
    localTypedArray.recycle();
  }
  
  public u(u paramu)
  {
    super(paramu);
  }
  
  public u(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public u(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  private void a(View paramView, CoordinatorLayout paramCoordinatorLayout)
  {
    this.g = paramCoordinatorLayout.findViewById(this.f);
    if (this.g != null)
    {
      if (this.g == paramCoordinatorLayout)
      {
        if (paramCoordinatorLayout.isInEditMode())
        {
          this.h = null;
          this.g = null;
          return;
        }
        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
      }
      View localView = this.g;
      for (ViewParent localViewParent = this.g.getParent(); (localViewParent != paramCoordinatorLayout) && (localViewParent != null); localViewParent = localViewParent.getParent())
      {
        if (localViewParent == paramView)
        {
          if (paramCoordinatorLayout.isInEditMode())
          {
            this.h = null;
            this.g = null;
            return;
          }
          throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
        }
        if ((localViewParent instanceof View)) {
          localView = (View)localViewParent;
        }
      }
      this.h = localView;
      return;
    }
    if (paramCoordinatorLayout.isInEditMode())
    {
      this.h = null;
      this.g = null;
      return;
    }
    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + paramCoordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + paramView);
  }
  
  private boolean b(View paramView, CoordinatorLayout paramCoordinatorLayout)
  {
    if (this.g.getId() != this.f) {
      return false;
    }
    View localView = this.g;
    for (ViewParent localViewParent = this.g.getParent(); localViewParent != paramCoordinatorLayout; localViewParent = localViewParent.getParent())
    {
      if ((localViewParent == null) || (localViewParent == paramView))
      {
        this.h = null;
        this.g = null;
        return false;
      }
      if ((localViewParent instanceof View)) {
        localView = (View)localViewParent;
      }
    }
    this.h = localView;
    return true;
  }
  
  public int a()
  {
    return this.f;
  }
  
  void a(Rect paramRect)
  {
    this.i.set(paramRect);
  }
  
  public void a(r paramr)
  {
    if (this.a != paramr)
    {
      this.a = paramr;
      this.j = null;
      this.b = true;
    }
  }
  
  void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    if (this.k) {
      return true;
    }
    boolean bool2 = this.k;
    if (this.a != null) {}
    for (boolean bool1 = this.a.e(paramCoordinatorLayout, paramView);; bool1 = false)
    {
      bool1 |= bool2;
      this.k = bool1;
      return bool1;
    }
  }
  
  boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    return (paramView2 == this.h) || ((this.a != null) && (this.a.b(paramCoordinatorLayout, paramView1, paramView2)));
  }
  
  public r b()
  {
    return this.a;
  }
  
  View b(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    if (this.f == -1)
    {
      this.h = null;
      this.g = null;
      return null;
    }
    if ((this.g == null) || (!b(paramView, paramCoordinatorLayout))) {
      a(paramView, paramCoordinatorLayout);
    }
    return this.g;
  }
  
  void b(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  Rect c()
  {
    return this.i;
  }
  
  boolean d()
  {
    return (this.g == null) && (this.f != -1);
  }
  
  boolean e()
  {
    if (this.a == null) {
      this.k = false;
    }
    return this.k;
  }
  
  void f()
  {
    this.k = false;
  }
  
  void g()
  {
    this.l = false;
  }
  
  boolean h()
  {
    return this.l;
  }
  
  boolean i()
  {
    return this.m;
  }
  
  void j()
  {
    this.m = false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */