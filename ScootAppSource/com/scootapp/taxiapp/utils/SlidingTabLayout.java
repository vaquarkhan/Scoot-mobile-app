package com.scootapp.taxiapp.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v4.b.c;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bt;
import android.support.v4.view.ea;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.sagar.taxiapp.ds;

public class SlidingTabLayout
  extends HorizontalScrollView
{
  private int a;
  private int b;
  private int c;
  private boolean d;
  private ViewPager e;
  private SparseArray<String> f = new SparseArray();
  private ea g;
  private final g h;
  
  public SlidingTabLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SlidingTabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingTabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setHorizontalScrollBarEnabled(false);
    setFillViewport(true);
    this.a = ((int)(24.0F * getResources().getDisplayMetrics().density));
    this.h = new g(paramContext);
    addView(this.h, -1, -2);
  }
  
  private void a()
  {
    bt localbt = this.e.getAdapter();
    e locale = new e(this, null);
    int i = 0;
    Object localObject2;
    Object localObject1;
    if (i < localbt.b())
    {
      if (this.b == 0) {
        break label227;
      }
      localObject2 = LayoutInflater.from(getContext()).inflate(this.b, this.h, false);
      localObject1 = (TextView)((View)localObject2).findViewById(this.c);
    }
    for (;;)
    {
      Object localObject3 = localObject2;
      if (localObject2 == null) {
        localObject3 = a(getContext());
      }
      if ((localObject1 == null) && (TextView.class.isInstance(localObject3))) {
        localObject1 = (TextView)localObject3;
      }
      for (;;)
      {
        if (this.d)
        {
          localObject2 = (LinearLayout.LayoutParams)((View)localObject3).getLayoutParams();
          ((LinearLayout.LayoutParams)localObject2).width = 0;
          ((LinearLayout.LayoutParams)localObject2).weight = 1.0F;
        }
        if (localObject1 != null)
        {
          ((TextView)localObject1).setText(localbt.c(i));
          ((TextView)localObject1).setTextColor(c.b(getContext(), 2130837938));
        }
        ((View)localObject3).setOnClickListener(locale);
        localObject1 = (String)this.f.get(i, null);
        if (localObject1 != null) {
          ((View)localObject3).setContentDescription((CharSequence)localObject1);
        }
        this.h.addView((View)localObject3);
        if (i == this.e.getCurrentItem()) {
          ((View)localObject3).setSelected(true);
        }
        i += 1;
        break;
        return;
      }
      label227:
      localObject1 = null;
      localObject2 = null;
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i = this.h.getChildCount();
    if ((i == 0) || (paramInt1 < 0) || (paramInt1 >= i)) {}
    View localView;
    do
    {
      return;
      localView = this.h.getChildAt(paramInt1);
    } while (localView == null);
    i = localView.getLeft() + paramInt2;
    if (paramInt1 <= 0)
    {
      paramInt1 = i;
      if (paramInt2 <= 0) {}
    }
    else
    {
      paramInt1 = i - this.a;
    }
    scrollTo(paramInt1, 0);
  }
  
  protected TextView a(Context paramContext)
  {
    TextView localTextView = new TextView(paramContext);
    localTextView.setGravity(17);
    localTextView.setTextSize(2, 15.0F);
    localTextView.setTypeface(ds.a(paramContext, "fonts/Roboto-Light.ttf"));
    localTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    paramContext = new TypedValue();
    getContext().getTheme().resolveAttribute(16843534, paramContext, true);
    localTextView.setBackgroundResource(paramContext.resourceId);
    localTextView.setAllCaps(true);
    int i = (int)(5.0F * getResources().getDisplayMetrics().density);
    localTextView.setPadding(i, i, i, i);
    return localTextView;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.e != null) {
      a(this.e.getCurrentItem(), 0);
    }
  }
  
  public void setCustomTabColorizer(f paramf)
  {
    this.h.a(paramf);
  }
  
  public void setDistributeEvenly(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public void setOnPageChangeListener(ea paramea)
  {
    this.g = paramea;
  }
  
  public void setSelectedIndicatorColors(int... paramVarArgs)
  {
    this.h.a(paramVarArgs);
  }
  
  public void setViewPager(ViewPager paramViewPager)
  {
    this.h.removeAllViews();
    this.e = paramViewPager;
    if (paramViewPager != null)
    {
      paramViewPager.a(new d(this, null));
      a();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\taxiapp\utils\SlidingTabLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */