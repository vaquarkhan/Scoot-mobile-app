package com.scootapp.taxiapp.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.ScrollingViewBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

public class CustomScrollingViewBehavior
  extends AppBarLayout.ScrollingViewBehavior
{
  private AppBarLayout a;
  private boolean b = false;
  
  public CustomScrollingViewBehavior() {}
  
  public CustomScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private int a(AppBarLayout paramAppBarLayout)
  {
    return paramAppBarLayout.getTotalScrollRange() + paramAppBarLayout.getTop();
  }
  
  private void a(View paramView1, View paramView2)
  {
    if (this.b) {}
    int i;
    int j;
    do
    {
      return;
      i = paramView1.getTop();
      j = paramView2.getTop();
      this.b = true;
    } while (Build.VERSION.SDK_INT < 16);
    paramView1.postOnAnimation(new a(this, i, j, paramView1, paramView2));
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a != null)
    {
      int i = a(this.a);
      if (i != paramView.getPaddingBottom()) {
        paramView.setPadding(paramView.getPaddingLeft(), paramView.getPaddingTop(), paramView.getPaddingRight(), i);
      }
    }
    return super.a(paramCoordinatorLayout, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt)
  {
    if (this.a != null) {
      a(paramView1, this.a);
    }
    return super.a(paramCoordinatorLayout, paramView1, paramView2, paramView3, paramInt);
  }
  
  public boolean c(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    if (this.a == null) {
      this.a = ((AppBarLayout)paramView2);
    }
    boolean bool = super.c(paramCoordinatorLayout, paramView1, paramView2);
    int j = a(this.a);
    if (j != paramView1.getPaddingBottom()) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        paramView1.setPadding(paramView1.getPaddingLeft(), paramView1.getPaddingTop(), paramView1.getPaddingRight(), j);
        paramView1.requestLayout();
      }
      a(paramView1, paramView2);
      if ((i == 0) && (!bool)) {
        break;
      }
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\taxiapp\utils\CustomScrollingViewBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */