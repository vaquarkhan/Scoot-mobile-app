package com.digits.sdk.android;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

public class LogoImageView
  extends ImageView
{
  public LogoImageView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public LogoImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LogoImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  void a(Context paramContext)
  {
    paramContext = dz.a(paramContext.getTheme());
    if (paramContext != null)
    {
      setVisibility(0);
      setImageDrawable(paramContext);
      return;
    }
    setVisibility(8);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    setMeasuredDimension(paramInt1, getDrawable().getIntrinsicHeight() * paramInt1 / getDrawable().getIntrinsicWidth());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\LogoImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */