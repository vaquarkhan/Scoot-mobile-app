package com.digits.sdk.android;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AccentImageView
  extends ImageView
{
  public AccentImageView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public AccentImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AccentImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    setColorFilter(dz.a(getResources(), paramContext.getTheme()), PorterDuff.Mode.SRC_IN);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\AccentImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */