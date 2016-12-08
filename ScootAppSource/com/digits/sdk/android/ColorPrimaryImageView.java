package com.digits.sdk.android;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ColorPrimaryImageView
  extends ImageView
{
  public ColorPrimaryImageView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public ColorPrimaryImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ColorPrimaryImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    setColorFilter(b(paramContext), PorterDuff.Mode.SRC_IN);
  }
  
  private int b(Context paramContext)
  {
    paramContext = paramContext.getTheme().obtainStyledAttributes(new int[] { 16842806 });
    int i = paramContext.getColor(0, getResources().getColor(R.color.dgts__default_logo_name));
    paramContext.recycle();
    return i;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ColorPrimaryImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */