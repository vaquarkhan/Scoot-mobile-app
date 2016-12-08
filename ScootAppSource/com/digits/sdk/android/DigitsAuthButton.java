package com.digits.sdk.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DigitsAuthButton
  extends Button
  implements View.OnClickListener
{
  volatile bf a;
  private View.OnClickListener b;
  private bb c;
  
  public DigitsAuthButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DigitsAuthButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842824);
  }
  
  public DigitsAuthButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
    this.c = new bb();
    super.setOnClickListener(this);
  }
  
  private void a()
  {
    Resources localResources = getResources();
    setCompoundDrawablePadding(localResources.getDimensionPixelSize(R.dimen.tw__login_btn_drawable_padding));
    setText(R.string.dgts__login_digits_text);
    setTextColor(localResources.getColor(R.color.tw__solid_white));
    setTextSize(0, localResources.getDimensionPixelSize(R.dimen.tw__login_btn_text_size));
    setTypeface(Typeface.DEFAULT_BOLD);
    setPadding(localResources.getDimensionPixelSize(R.dimen.tw__login_btn_right_padding), 0, localResources.getDimensionPixelSize(R.dimen.tw__login_btn_right_padding), 0);
    setBackgroundResource(R.drawable.dgts__digits_btn);
  }
  
  protected ao getDigits()
  {
    return ao.d();
  }
  
  protected bf getDigitsClient()
  {
    if (this.a == null) {}
    try
    {
      if (this.a == null) {
        this.a = getDigits().i();
      }
      return this.a;
    }
    finally {}
  }
  
  public void onClick(View paramView)
  {
    ba localba = this.c.a();
    getDigitsClient().a(localba);
    if (this.b != null) {
      this.b.onClick(paramView);
    }
  }
  
  public void setAuthTheme(int paramInt)
  {
    getDigits().a(paramInt);
  }
  
  public void setCallback(g paramg)
  {
    this.c.a(paramg);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.b = paramOnClickListener;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\DigitsAuthButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */