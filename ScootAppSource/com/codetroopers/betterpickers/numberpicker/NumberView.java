package com.codetroopers.betterpickers.numberpicker;

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

public class NumberView
  extends LinearLayout
{
  private ZeroTopPaddingTextView a;
  private ZeroTopPaddingTextView b;
  private ZeroTopPaddingTextView c;
  private ZeroTopPaddingTextView d;
  private final Typeface e;
  private Typeface f;
  private ColorStateList g;
  
  public NumberView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NumberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = Typeface.createFromAsset(paramContext.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
    this.g = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
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
    if (this.d != null) {
      this.d.setTextColor(this.g);
    }
  }
  
  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = 0;
    ZeroTopPaddingTextView localZeroTopPaddingTextView = this.d;
    if (paramBoolean2)
    {
      i = 0;
      localZeroTopPaddingTextView.setVisibility(i);
      if (this.a != null)
      {
        if (!paramString1.equals("")) {
          break label142;
        }
        this.a.setText("-");
        this.a.setTypeface(this.e);
        this.a.setEnabled(false);
        this.a.a();
        this.a.setVisibility(0);
      }
      label83:
      if (this.b != null)
      {
        if (!paramString2.equals("")) {
          break label236;
        }
        this.b.setVisibility(8);
      }
      label108:
      if (this.c != null)
      {
        paramString1 = this.c;
        if (!paramBoolean1) {
          break label281;
        }
      }
    }
    label142:
    label236:
    label281:
    for (int i = j;; i = 8)
    {
      paramString1.setVisibility(i);
      return;
      i = 8;
      break;
      if (paramBoolean1)
      {
        this.a.setText(paramString1);
        this.a.setTypeface(this.f);
        this.a.setEnabled(true);
        this.a.b();
        this.a.setVisibility(0);
        break label83;
      }
      this.a.setText(paramString1);
      this.a.setTypeface(this.e);
      this.a.setEnabled(true);
      this.a.a();
      this.a.setVisibility(0);
      break label83;
      this.b.setText(paramString2);
      this.b.setTypeface(this.e);
      this.b.setEnabled(true);
      this.b.a();
      this.b.setVisibility(0);
      break label108;
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ZeroTopPaddingTextView)findViewById(R.id.number));
    this.b = ((ZeroTopPaddingTextView)findViewById(R.id.decimal));
    this.c = ((ZeroTopPaddingTextView)findViewById(R.id.decimal_separator));
    this.d = ((ZeroTopPaddingTextView)findViewById(R.id.minus_label));
    if (this.a != null) {
      this.f = this.a.getTypeface();
    }
    if (this.a != null)
    {
      this.a.setTypeface(this.e);
      this.a.a();
    }
    if (this.b != null)
    {
      this.b.setTypeface(this.e);
      this.b.a();
    }
    a();
  }
  
  public void setTheme(int paramInt)
  {
    if (paramInt != -1) {
      this.g = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment).getColorStateList(R.styleable.BetterPickersDialogFragment_bpTextColor);
    }
    a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\numberpicker\NumberView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */