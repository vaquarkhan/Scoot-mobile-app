package com.mixpanel.android.surveys;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.mixpanel.android.R.layout;
import com.mixpanel.android.mpmetrics.bf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardCarouselLayout
  extends ViewGroup
{
  private static int a = 45;
  private static float b = 0.8F;
  private static float c = 0.5F;
  private static float d = 0.5F;
  private final List<View> e = new ArrayList(1);
  private f f;
  private f g;
  private e h = null;
  
  public CardCarouselLayout(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public CardCarouselLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public CardCarouselLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private Animation a()
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    Object localObject = new RotateAnimation(a, 0.0F, 1, c, 1, d);
    ((RotateAnimation)localObject).setDuration(198L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new ScaleAnimation(b, 1.0F, b, 1.0F, 1, c, 1, d);
    ((ScaleAnimation)localObject).setDuration(198L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new TranslateAnimation(2, 1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
    ((TranslateAnimation)localObject).setDuration(330L);
    localAnimationSet.addAnimation((Animation)localObject);
    return localAnimationSet;
  }
  
  private void a(Context paramContext)
  {
    Object localObject = LayoutInflater.from(paramContext);
    paramContext = ((LayoutInflater)localObject).inflate(R.layout.com_mixpanel_android_question_card, this, false);
    this.f = new f(this, paramContext);
    localObject = ((LayoutInflater)localObject).inflate(R.layout.com_mixpanel_android_question_card, this, false);
    this.g = new f(this, (View)localObject);
    addView(paramContext);
    addView((View)localObject);
  }
  
  private Animation b()
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    Object localObject = new RotateAnimation(0.0F, a, 1, c, 1, d);
    ((RotateAnimation)localObject).setDuration(198L);
    ((RotateAnimation)localObject).setStartOffset(132L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new ScaleAnimation(1.0F, b, 1.0F, b, 1, c, 1, d);
    ((ScaleAnimation)localObject).setDuration(198L);
    ((ScaleAnimation)localObject).setStartOffset(132L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new TranslateAnimation(2, -1.0F, 2, 0.3F, 2, 0.0F, 2, 0.0F);
    ((TranslateAnimation)localObject).setInterpolator(new AccelerateInterpolator());
    ((TranslateAnimation)localObject).setDuration(330L);
    localAnimationSet.addAnimation((Animation)localObject);
    return localAnimationSet;
  }
  
  private Animation c()
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    Object localObject = new RotateAnimation(-a, 0.0F, 1, c, 1, d);
    ((RotateAnimation)localObject).setDuration(198L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new ScaleAnimation(b, 1.0F, b, 1.0F, 1, c, 1, d);
    ((ScaleAnimation)localObject).setDuration(198L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new TranslateAnimation(2, -1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
    ((TranslateAnimation)localObject).setDuration(330L);
    localAnimationSet.addAnimation((Animation)localObject);
    return localAnimationSet;
  }
  
  private Animation d()
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    Object localObject = new RotateAnimation(0.0F, -a, 1, c, 1, d);
    ((RotateAnimation)localObject).setDuration(330L);
    ((RotateAnimation)localObject).setStartOffset(132L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new ScaleAnimation(1.0F, b, 1.0F, b, 1, c, 1, d);
    ((ScaleAnimation)localObject).setDuration(330L);
    ((ScaleAnimation)localObject).setStartOffset(132L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new TranslateAnimation(2, -1.0F, 2, -2.3F, 2, 0.0F, 2, 0.0F);
    ((TranslateAnimation)localObject).setInterpolator(new AccelerateInterpolator());
    ((TranslateAnimation)localObject).setDuration(330L);
    localAnimationSet.addAnimation((Animation)localObject);
    return localAnimationSet;
  }
  
  public void a(bf parambf, String paramString)
  {
    this.f.a(parambf, paramString);
    removeAllViews();
    addView(this.f.a());
    addView(this.g.a());
    invalidate();
  }
  
  public void a(bf parambf, String paramString, int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = this.g;
    this.g = this.f;
    this.f = ((f)localObject2);
    this.f.a(parambf, paramString);
    localObject2 = this.g.a();
    View localView = this.f.a();
    ((View)localObject2).setVisibility(0);
    localView.setVisibility(0);
    switch (b.a[(paramInt - 1)])
    {
    default: 
      paramString = null;
      parambf = (bf)localObject1;
    }
    for (;;)
    {
      paramString.setAnimationListener(new a(this, (View)localObject2));
      ((View)localObject2).startAnimation(paramString);
      localView.startAnimation(parambf);
      invalidate();
      return;
      paramString = d();
      parambf = a();
      continue;
      paramString = b();
      parambf = c();
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = this.f.a();
    if (localView.getVisibility() != 8)
    {
      paramInt1 = localView.getMeasuredWidth();
      localView.layout(0, 0, paramInt1, localView.getMeasuredHeight());
    }
    for (;;)
    {
      localView = this.g.a();
      if (localView.getVisibility() != 8) {
        localView.layout(paramInt1, 0, localView.getMeasuredWidth() + paramInt1, localView.getMeasuredHeight());
      }
      return;
      paramInt1 = 0;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = getChildCount();
    if ((View.MeasureSpec.getMode(paramInt1) != 1073741824) || (View.MeasureSpec.getMode(paramInt2) != 1073741824)) {}
    int j;
    int i1;
    int k;
    Object localObject2;
    for (int i = 1;; i = 0)
    {
      this.e.clear();
      j = 0;
      i1 = 0;
      int n;
      for (k = 0; j < i2; k = n)
      {
        localObject1 = getChildAt(j);
        int m = i1;
        n = k;
        if (((View)localObject1).getVisibility() != 8)
        {
          localObject2 = ((View)localObject1).getLayoutParams();
          ((View)localObject1).measure(getChildMeasureSpec(paramInt1, 0, ((ViewGroup.LayoutParams)localObject2).width), getChildMeasureSpec(paramInt2, 0, ((ViewGroup.LayoutParams)localObject2).height));
          i1 = Math.max(i1, ((View)localObject1).getMeasuredWidth());
          k = Math.max(k, ((View)localObject1).getMeasuredHeight());
          m = i1;
          n = k;
          if (i != 0) {
            if (((ViewGroup.LayoutParams)localObject2).width != -1)
            {
              m = i1;
              n = k;
              if (((ViewGroup.LayoutParams)localObject2).height != -1) {}
            }
            else
            {
              this.e.add(localObject1);
              n = k;
              m = i1;
            }
          }
        }
        j += 1;
        i1 = m;
      }
    }
    i = Math.max(k, getSuggestedMinimumHeight());
    setMeasuredDimension(resolveSize(Math.max(i1, getSuggestedMinimumWidth()), paramInt1), resolveSize(i, paramInt2));
    Object localObject1 = this.e.iterator();
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (View)((Iterator)localObject1).next();
      ViewGroup.LayoutParams localLayoutParams = ((View)localObject2).getLayoutParams();
      if (localLayoutParams.width == -1)
      {
        i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        label304:
        if (localLayoutParams.height != -1) {
          break label349;
        }
      }
      label349:
      for (j = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);; j = getChildMeasureSpec(paramInt2, 0, localLayoutParams.height))
      {
        ((View)localObject2).measure(i, j);
        break;
        i = getChildMeasureSpec(paramInt1, 0, localLayoutParams.width);
        break label304;
      }
    }
  }
  
  public void setOnQuestionAnsweredListener(e parame)
  {
    this.h = parame;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\surveys\CardCarouselLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */