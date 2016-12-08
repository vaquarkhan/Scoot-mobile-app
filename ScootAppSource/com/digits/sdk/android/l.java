package com.digits.sdk.android;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

final class l
{
  private static int[][] b = { { 16842908, 16842910 }, { 16842919, 16842910 } };
  private final Resources a;
  
  public l(Resources paramResources)
  {
    this.a = paramResources;
  }
  
  private int c(int paramInt)
  {
    if (dz.a(paramInt)) {
      return dz.a(0.2D, -16777216, paramInt);
    }
    return dz.a(0.2D, -1, paramInt);
  }
  
  private int d(int paramInt)
  {
    if (dz.a(paramInt)) {
      return dz.a(0.6D, -16777216, paramInt);
    }
    return dz.a(0.6D, -1, paramInt);
  }
  
  int a(int paramInt)
  {
    if (dz.a(paramInt)) {
      return this.a.getColor(R.color.dgts__text_dark);
    }
    return this.a.getColor(R.color.dgts__text_light);
  }
  
  @TargetApi(21)
  void a(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramView.setStateListAnimator(null);
      paramView.setElevation(0.0F);
    }
  }
  
  @TargetApi(16)
  void a(View paramView, int paramInt)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    float f = TypedValue.applyDimension(1, 5.0F, this.a.getDisplayMetrics());
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setCornerRadius(f);
    localGradientDrawable.setColor(c(paramInt));
    int[][] arrayOfInt = b;
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      localStateListDrawable.addState(arrayOfInt[i], localGradientDrawable);
      i += 1;
    }
    localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setColor(paramInt);
    localGradientDrawable.setCornerRadius(f);
    localStateListDrawable.addState(StateSet.WILD_CARD, localGradientDrawable);
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramView.setBackground(localStateListDrawable);
      return;
    }
    paramView.setBackgroundDrawable(localStateListDrawable);
  }
  
  void a(TextView paramTextView, int paramInt)
  {
    paramInt = a(paramInt);
    int i = d(paramInt);
    int[] arrayOfInt = StateSet.WILD_CARD;
    paramTextView.setTextColor(new ColorStateList(new int[][] { { -16842910 }, arrayOfInt }, new int[] { i, paramInt }));
  }
  
  int b(int paramInt)
  {
    return paramInt;
  }
  
  @TargetApi(16)
  void b(View paramView, int paramInt)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    float f1 = TypedValue.applyDimension(1, 5.0F, this.a.getDisplayMetrics());
    float f2 = TypedValue.applyDimension(1, 2.0F, this.a.getDisplayMetrics());
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setCornerRadius(f1);
    localGradientDrawable.setStroke((int)f2, c(paramInt));
    int[][] arrayOfInt = b;
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      localStateListDrawable.addState(arrayOfInt[i], localGradientDrawable);
      i += 1;
    }
    localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setCornerRadius(f1);
    localGradientDrawable.setStroke((int)f2, d(paramInt));
    localStateListDrawable.addState(new int[] { -16842910 }, localGradientDrawable);
    localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setCornerRadius(f1);
    localGradientDrawable.setStroke((int)f2, paramInt);
    localStateListDrawable.addState(StateSet.WILD_CARD, localGradientDrawable);
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramView.setBackground(localStateListDrawable);
      return;
    }
    paramView.setBackgroundDrawable(localStateListDrawable);
  }
  
  void b(TextView paramTextView, int paramInt)
  {
    int i = c(paramInt);
    int j = d(paramInt);
    int[] arrayOfInt = StateSet.WILD_CARD;
    paramTextView.setTextColor(new ColorStateList(new int[][] { { 16842919, 16842910 }, { 16842908, 16842910 }, { -16842910 }, arrayOfInt }, new int[] { i, i, j, paramInt }));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */