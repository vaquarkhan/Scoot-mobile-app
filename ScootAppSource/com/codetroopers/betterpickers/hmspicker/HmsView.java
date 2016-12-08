package com.codetroopers.betterpickers.hmspicker;

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

public class HmsView
  extends LinearLayout
{
  private ZeroTopPaddingTextView a;
  private ZeroTopPaddingTextView b;
  private ZeroTopPaddingTextView c;
  private ZeroTopPaddingTextView d;
  private ZeroTopPaddingTextView e;
  private final Typeface f;
  private Typeface g;
  private ColorStateList h;
  
  public HmsView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public HmsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f = Typeface.createFromAsset(paramContext.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
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
    if (this.e != null) {
      this.e.setTextColor(this.h);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (this.a != null) {
      this.a.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt1) }));
    }
    if (this.c != null) {
      this.c.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt2) }));
    }
    if (this.b != null) {
      this.b.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt3) }));
    }
    if (this.e != null) {
      this.e.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt4) }));
    }
    if (this.d != null) {
      this.d.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt5) }));
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ZeroTopPaddingTextView)findViewById(R.id.hours_ones));
    this.c = ((ZeroTopPaddingTextView)findViewById(R.id.minutes_tens));
    this.b = ((ZeroTopPaddingTextView)findViewById(R.id.minutes_ones));
    this.e = ((ZeroTopPaddingTextView)findViewById(R.id.seconds_tens));
    this.d = ((ZeroTopPaddingTextView)findViewById(R.id.seconds_ones));
    if (this.a != null)
    {
      this.g = this.a.getTypeface();
      this.a.b();
    }
    if (this.c != null) {
      this.c.b();
    }
    if (this.b != null) {
      this.b.b();
    }
    if (this.e != null)
    {
      this.e.setTypeface(this.f);
      this.e.a();
    }
    if (this.d != null)
    {
      this.d.setTypeface(this.f);
      this.d.a();
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\hmspicker\HmsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */