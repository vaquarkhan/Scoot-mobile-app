package com.codetroopers.betterpickers.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.id;
import com.codetroopers.betterpickers.R.styleable;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;

public class TimerView
  extends LinearLayout
{
  private ZeroTopPaddingTextView a;
  private ZeroTopPaddingTextView b;
  private ZeroTopPaddingTextView c;
  private ZeroTopPaddingTextView d;
  private final Typeface e;
  private Typeface f;
  private ZeroTopPaddingTextView g;
  private ColorStateList h;
  
  public TimerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TimerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = Typeface.createFromAsset(paramContext.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
    this.h = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
  }
  
  private void a()
  {
    if (this.a != null) {
      this.a.setTextColor(this.h);
    }
    if (this.b != null) {
      this.b.setTextColor(this.h);
    }
    if (this.c != null) {
      this.c.setTextColor(this.h);
    }
    if (this.d != null) {
      this.d.setTextColor(this.h);
    }
    if (this.g != null) {
      this.g.setTextColor(this.h);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.c != null)
    {
      if (paramInt1 == -2) {
        this.c.setVisibility(4);
      }
    }
    else
    {
      if (this.a != null)
      {
        if (paramInt2 != -1) {
          break label239;
        }
        this.a.setText("-");
        this.a.setTypeface(this.e);
        this.a.setEnabled(false);
        this.a.a();
      }
      label68:
      if (this.d != null)
      {
        if (paramInt3 != -1) {
          break label291;
        }
        this.d.setText("-");
        this.d.setEnabled(false);
      }
    }
    for (;;)
    {
      if (this.b != null)
      {
        if (paramInt4 != -1) {
          break label325;
        }
        this.b.setText("-");
        this.b.setEnabled(false);
      }
      return;
      if (paramInt1 == -1)
      {
        this.c.setText("-");
        this.c.setTypeface(this.e);
        this.c.setEnabled(false);
        this.c.a();
        this.c.setVisibility(0);
        break;
      }
      this.c.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt1) }));
      this.c.setTypeface(this.f);
      this.c.setEnabled(true);
      this.c.b();
      this.c.setVisibility(0);
      break;
      label239:
      this.a.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt2) }));
      this.a.setTypeface(this.f);
      this.a.setEnabled(true);
      this.a.b();
      break label68;
      label291:
      this.d.setEnabled(true);
      this.d.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt3) }));
    }
    label325:
    this.b.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt4) }));
    this.b.setEnabled(true);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((ZeroTopPaddingTextView)findViewById(R.id.hours_tens));
    this.d = ((ZeroTopPaddingTextView)findViewById(R.id.minutes_tens));
    this.a = ((ZeroTopPaddingTextView)findViewById(R.id.hours_ones));
    this.b = ((ZeroTopPaddingTextView)findViewById(R.id.minutes_ones));
    this.g = ((ZeroTopPaddingTextView)findViewById(R.id.hours_seperator));
    if (this.a != null) {
      this.f = this.a.getTypeface();
    }
    if (this.d != null)
    {
      this.d.setTypeface(this.e);
      this.d.a();
    }
    if (this.b != null)
    {
      this.b.setTypeface(this.e);
      this.b.a();
    }
  }
  
  public void setTheme(int paramInt)
  {
    if (paramInt != -1) {
      this.h = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment).getColorStateList(R.styleable.BetterPickersDialogFragment_bpTextColor);
    }
    a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\timepicker\TimerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */