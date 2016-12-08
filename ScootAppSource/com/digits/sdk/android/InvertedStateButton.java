package com.digits.sdk.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class InvertedStateButton
  extends StateButton
{
  public InvertedStateButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public InvertedStateButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public InvertedStateButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  void a(Context paramContext)
  {
    this.h = dz.a(getResources(), paramContext.getTheme());
    this.g = new l(getResources());
    this.g.b(this, this.h);
    this.g.b(this.a, this.h);
    a();
    b();
  }
  
  Drawable getProgressDrawable()
  {
    if (dz.a(this.h)) {
      return getResources().getDrawable(R.drawable.progress_light);
    }
    return getResources().getDrawable(R.drawable.progress_dark);
  }
  
  int getTextColor()
  {
    return this.g.b(this.h);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\InvertedStateButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */