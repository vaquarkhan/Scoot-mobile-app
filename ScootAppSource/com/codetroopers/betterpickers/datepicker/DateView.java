package com.codetroopers.betterpickers.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.id;
import com.codetroopers.betterpickers.R.styleable;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import com.codetroopers.betterpickers.widget.b;

public class DateView
  extends b
{
  private ZeroTopPaddingTextView a;
  private ZeroTopPaddingTextView b;
  private ZeroTopPaddingTextView c;
  private final Typeface d;
  private Typeface e;
  private UnderlinePageIndicatorPicker f;
  private ColorStateList g;
  
  public DateView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.d = Typeface.createFromAsset(paramContext.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
    this.e = Typeface.createFromAsset(paramContext.getAssets(), "fonts/Roboto-Bold.ttf");
    this.g = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
    setWillNotDraw(false);
  }
  
  private void a()
  {
    if (this.a != null) {
      this.a.setTextColor(this.g);
    }
    if (this.b != null) {
      this.b.setTextColor(this.g);
    }
    if (this.c != null) {
      this.c.setTextColor(this.g);
    }
  }
  
  public View a(int paramInt)
  {
    return getChildAt(paramInt);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2)
  {
    if (this.a != null)
    {
      if (paramString.equals(""))
      {
        this.a.setText("-");
        this.a.setTypeface(this.d);
        this.a.setEnabled(false);
        this.a.a();
      }
    }
    else if (this.b != null)
    {
      if (paramInt1 > 0) {
        break label159;
      }
      this.b.setText("-");
      this.b.setEnabled(false);
      this.b.a();
    }
    for (;;)
    {
      if (this.c != null)
      {
        if (paramInt2 > 0) {
          break label188;
        }
        this.c.setText("----");
        this.c.setEnabled(false);
        this.c.a();
      }
      return;
      this.a.setText(paramString);
      this.a.setTypeface(this.e);
      this.a.setEnabled(true);
      this.a.b();
      break;
      label159:
      this.b.setText(Integer.toString(paramInt1));
      this.b.setEnabled(true);
      this.b.a();
    }
    label188:
    for (paramString = Integer.toString(paramInt2); paramString.length() < 4; paramString = "-" + paramString) {}
    this.c.setText(paramString);
    this.c.setEnabled(true);
    this.c.a();
  }
  
  public ZeroTopPaddingTextView getDate()
  {
    return this.b;
  }
  
  public ZeroTopPaddingTextView getMonth()
  {
    return this.a;
  }
  
  public ZeroTopPaddingTextView getYear()
  {
    return this.c;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.f.setTitleView(this);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ZeroTopPaddingTextView)findViewById(R.id.month));
    this.b = ((ZeroTopPaddingTextView)findViewById(R.id.date));
    this.c = ((ZeroTopPaddingTextView)findViewById(R.id.year_label));
    char[] arrayOfChar = DateFormat.getDateFormatOrder(getContext());
    removeAllViews();
    int i = 0;
    if (i < arrayOfChar.length)
    {
      switch (arrayOfChar[i])
      {
      }
      for (;;)
      {
        i += 1;
        break;
        addView(this.b);
        continue;
        addView(this.a);
        continue;
        addView(this.c);
      }
    }
    if ((this.a == null) || (this.b != null))
    {
      this.b.setTypeface(this.d);
      this.b.a();
    }
    if (this.a != null)
    {
      this.a.setTypeface(this.d);
      this.a.a();
    }
    a();
  }
  
  public void setOnClick(View.OnClickListener paramOnClickListener)
  {
    this.b.setOnClickListener(paramOnClickListener);
    this.a.setOnClickListener(paramOnClickListener);
    this.c.setOnClickListener(paramOnClickListener);
  }
  
  public void setTheme(int paramInt)
  {
    if (paramInt != -1) {
      this.g = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment).getColorStateList(R.styleable.BetterPickersDialogFragment_bpTitleColor);
    }
    a();
  }
  
  public void setUnderlinePage(UnderlinePageIndicatorPicker paramUnderlinePageIndicatorPicker)
  {
    this.f = paramUnderlinePageIndicatorPicker;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\datepicker\DateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */