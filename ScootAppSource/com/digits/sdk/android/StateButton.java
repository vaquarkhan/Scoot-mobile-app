package com.digits.sdk.android;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StateButton
  extends RelativeLayout
{
  TextView a;
  ProgressBar b;
  ImageView c;
  CharSequence d;
  CharSequence e;
  CharSequence f;
  l g;
  int h;
  
  public StateButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public StateButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StateButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  void a()
  {
    this.c.setColorFilter(getTextColor(), PorterDuff.Mode.SRC_IN);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    Context localContext = getContext();
    this.f = localContext.getString(paramInt1);
    this.d = localContext.getString(paramInt2);
    this.e = localContext.getString(paramInt3);
  }
  
  void a(Context paramContext)
  {
    this.h = dz.a(getResources(), paramContext.getTheme());
    this.g = new l(getResources());
    this.g.a(this, this.h);
    this.g.a(this.a, this.h);
    a();
    b();
  }
  
  void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.StateButton);
    this.f = paramContext.getText(R.styleable.StateButton_startStateText);
    this.d = paramContext.getText(R.styleable.StateButton_progressStateText);
    this.e = paramContext.getText(R.styleable.StateButton_finishStateText);
    c();
    paramContext.recycle();
  }
  
  void b()
  {
    this.b.setIndeterminateDrawable(getProgressDrawable());
  }
  
  void c()
  {
    inflate(getContext(), R.layout.dgts__state_button, this);
    this.a = ((TextView)findViewById(R.id.dgts__state_button));
    this.b = ((ProgressBar)findViewById(R.id.dgts__state_progress));
    this.c = ((ImageView)findViewById(R.id.dgts__state_success));
    g();
  }
  
  public void d()
  {
    setClickable(false);
    this.a.setText(this.d);
    this.b.setVisibility(0);
    this.c.setVisibility(8);
  }
  
  public void e()
  {
    setClickable(false);
    this.a.setText(this.e);
    this.b.setVisibility(8);
    this.c.setVisibility(0);
  }
  
  public void f()
  {
    g();
  }
  
  public void g()
  {
    setClickable(true);
    this.a.setText(this.f);
    this.b.setVisibility(8);
    this.c.setVisibility(8);
  }
  
  Drawable getProgressDrawable()
  {
    if (dz.a(this.h)) {
      return getResources().getDrawable(R.drawable.progress_dark);
    }
    return getResources().getDrawable(R.drawable.progress_light);
  }
  
  int getTextColor()
  {
    return this.g.a(this.h);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
    this.b.setEnabled(paramBoolean);
    this.c.setEnabled(paramBoolean);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\StateButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */