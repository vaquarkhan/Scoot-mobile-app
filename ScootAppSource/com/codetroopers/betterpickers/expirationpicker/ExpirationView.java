package com.codetroopers.betterpickers.expirationpicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.id;
import com.codetroopers.betterpickers.R.styleable;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import com.codetroopers.betterpickers.widget.b;

public class ExpirationView
  extends b
{
  private ZeroTopPaddingTextView a;
  private ZeroTopPaddingTextView b;
  private final Typeface c;
  private Typeface d;
  private UnderlinePageIndicatorPicker e;
  private ZeroTopPaddingTextView f;
  private ColorStateList g;
  
  public ExpirationView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ExpirationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.c = Typeface.createFromAsset(paramContext.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
    this.d = Typeface.createFromAsset(paramContext.getAssets(), "fonts/Roboto-Bold.ttf");
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
    if (this.f != null) {
      this.f.setTextColor(this.g);
    }
  }
  
  public View a(int paramInt)
  {
    int[] arrayOfInt = new int[2];
    int[] tmp5_4 = arrayOfInt;
    tmp5_4[0] = 0;
    int[] tmp9_5 = tmp5_4;
    tmp9_5[1] = 2;
    tmp9_5;
    if (paramInt > arrayOfInt.length) {
      return null;
    }
    return getChildAt(arrayOfInt[paramInt]);
  }
  
  public void a(String paramString, int paramInt)
  {
    if (this.a != null)
    {
      if (!paramString.equals("")) {
        break label76;
      }
      this.a.setText("--");
      this.a.setEnabled(false);
      this.a.a();
    }
    for (;;)
    {
      if (this.b != null)
      {
        if (paramInt > 0) {
          break;
        }
        this.b.setText("----");
        this.b.setEnabled(false);
        this.b.a();
      }
      return;
      label76:
      this.a.setText(paramString);
      this.a.setEnabled(true);
      this.a.a();
    }
    for (paramString = Integer.toString(paramInt); paramString.length() < 4; paramString = paramString + "-") {}
    this.b.setText(paramString);
    this.b.setEnabled(true);
    this.b.a();
  }
  
  public ZeroTopPaddingTextView getMonth()
  {
    return this.a;
  }
  
  public ZeroTopPaddingTextView getYear()
  {
    return this.b;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.e.setTitleView(this);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ZeroTopPaddingTextView)findViewById(R.id.month));
    this.b = ((ZeroTopPaddingTextView)findViewById(R.id.year_label));
    this.f = ((ZeroTopPaddingTextView)findViewById(R.id.expiration_seperator));
    if (this.a != null)
    {
      this.a.setTypeface(this.c);
      this.a.a();
    }
    if (this.b != null) {
      this.b.setTypeface(this.c);
    }
    if (this.f != null) {
      this.f.setTypeface(this.c);
    }
    a();
  }
  
  public void setOnClick(View.OnClickListener paramOnClickListener)
  {
    this.a.setOnClickListener(paramOnClickListener);
    this.b.setOnClickListener(paramOnClickListener);
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
    this.e = paramUnderlinePageIndicatorPicker;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\expirationpicker\ExpirationView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */