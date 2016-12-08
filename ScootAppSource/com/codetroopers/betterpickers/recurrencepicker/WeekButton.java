package com.codetroopers.betterpickers.recurrencepicker;

import android.content.Context;
import android.support.v4.view.cb;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ToggleButton;

public class WeekButton
  extends ToggleButton
{
  private static int a;
  
  public WeekButton(Context paramContext)
  {
    super(paramContext);
  }
  
  public WeekButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public WeekButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public static void setSuggestedWidth(int paramInt)
  {
    a = paramInt;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = getMeasuredHeight();
    paramInt2 = getMeasuredWidth();
    int i = paramInt2;
    int j = paramInt1;
    if (paramInt1 > 0)
    {
      i = paramInt2;
      j = paramInt1;
      if (paramInt2 > 0)
      {
        if (paramInt2 >= paramInt1) {
          break label69;
        }
        i = paramInt2;
        j = paramInt1;
        if (View.MeasureSpec.getMode(cb.k(this)) != 1073741824)
        {
          j = paramInt2;
          i = paramInt2;
        }
      }
    }
    for (;;)
    {
      setMeasuredDimension(i, j);
      return;
      label69:
      i = paramInt2;
      j = paramInt1;
      if (paramInt1 < paramInt2)
      {
        i = paramInt2;
        j = paramInt1;
        if (View.MeasureSpec.getMode(cb.j(this)) != 1073741824)
        {
          i = paramInt1;
          j = paramInt1;
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\recurrencepicker\WeekButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */