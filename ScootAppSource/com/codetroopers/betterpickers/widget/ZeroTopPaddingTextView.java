package com.codetroopers.betterpickers.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.codetroopers.betterpickers.R.string;

public class ZeroTopPaddingTextView
  extends TextView
{
  private static final Typeface a = Typeface.create("san-serif", 1);
  private static final Typeface b = Typeface.create("sans-serif-condensed", 1);
  private int c = 0;
  private String d = "";
  private String e = "";
  
  public ZeroTopPaddingTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ZeroTopPaddingTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ZeroTopPaddingTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c();
    setIncludeFontPadding(false);
    a();
  }
  
  private void c()
  {
    this.d = getResources().getString(R.string.number_picker_seperator);
    this.e = getResources().getString(R.string.time_picker_time_seperator);
  }
  
  public void a()
  {
    float f2 = 0.328F;
    float f4 = 0.25F;
    float f3 = f4;
    float f1 = f2;
    if (getPaint().getTypeface() != null)
    {
      f3 = f4;
      f1 = f2;
      if (getPaint().getTypeface().equals(Typeface.DEFAULT_BOLD))
      {
        f3 = 0.208F;
        f1 = 0.208F;
      }
    }
    f4 = f3;
    f2 = f1;
    if (getTypeface() != null)
    {
      f4 = f3;
      f2 = f1;
      if (getTypeface().equals(a))
      {
        f4 = 0.208F;
        f2 = 0.208F;
      }
    }
    f1 = f4;
    f3 = f2;
    if (getTypeface() != null)
    {
      f1 = f4;
      f3 = f2;
      if (getTypeface().equals(b))
      {
        f1 = 0.208F;
        f3 = 0.208F;
      }
    }
    f2 = f1;
    if (Build.VERSION.SDK_INT < 14)
    {
      f2 = f1;
      if (getText() != null) {
        if (!getText().toString().equals(this.d))
        {
          f2 = f1;
          if (!getText().toString().equals(this.e)) {}
        }
        else
        {
          f2 = 0.233F;
        }
      }
    }
    setPadding(0, (int)(-f3 * getTextSize()), this.c, (int)(-f2 * getTextSize()));
  }
  
  public void b()
  {
    setPadding(0, (int)(-0.208F * getTextSize()), this.c, (int)(-0.208F * getTextSize()));
  }
  
  public void setPaddingRight(int paramInt)
  {
    this.c = paramInt;
    a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\widget\ZeroTopPaddingTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */