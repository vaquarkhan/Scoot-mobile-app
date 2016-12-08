package com.codetroopers.betterpickers.numberpicker;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class NumberPickerErrorTextView
  extends TextView
{
  private Runnable a = new c(this);
  private Handler b = new Handler();
  
  public NumberPickerErrorTextView(Context paramContext)
  {
    super(paramContext);
  }
  
  public NumberPickerErrorTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NumberPickerErrorTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a()
  {
    this.b.removeCallbacks(this.a);
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), 17432577);
    localAnimation.setAnimationListener(new d(this));
    startAnimation(localAnimation);
  }
  
  public void b()
  {
    this.b.removeCallbacks(this.a);
    setVisibility(4);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\numberpicker\NumberPickerErrorTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */