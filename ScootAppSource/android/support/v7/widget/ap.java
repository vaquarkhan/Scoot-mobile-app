package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.c.a.a;
import android.support.v4.widget.g;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class ap
{
  private final CompoundButton a;
  private final aq b;
  private ColorStateList c = null;
  private PorterDuff.Mode d = null;
  private boolean e = false;
  private boolean f = false;
  private boolean g;
  
  ap(CompoundButton paramCompoundButton, aq paramaq)
  {
    this.a = paramCompoundButton;
    this.b = paramaq;
  }
  
  int a(int paramInt)
  {
    int i = paramInt;
    if (Build.VERSION.SDK_INT < 17)
    {
      Drawable localDrawable = g.a(this.a);
      i = paramInt;
      if (localDrawable != null) {
        i = paramInt + localDrawable.getIntrinsicWidth();
      }
    }
    return i;
  }
  
  ColorStateList a()
  {
    return this.c;
  }
  
  void a(ColorStateList paramColorStateList)
  {
    this.c = paramColorStateList;
    this.e = true;
    d();
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    this.d = paramMode;
    this.f = true;
    d();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = this.a.getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.CompoundButton, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(R.styleable.CompoundButton_android_button))
      {
        paramInt = paramAttributeSet.getResourceId(R.styleable.CompoundButton_android_button, 0);
        if (paramInt != 0) {
          this.a.setButtonDrawable(this.b.a(this.a.getContext(), paramInt));
        }
      }
      if (paramAttributeSet.hasValue(R.styleable.CompoundButton_buttonTint)) {
        g.a(this.a, paramAttributeSet.getColorStateList(R.styleable.CompoundButton_buttonTint));
      }
      if (paramAttributeSet.hasValue(R.styleable.CompoundButton_buttonTintMode)) {
        g.a(this.a, cq.a(paramAttributeSet.getInt(R.styleable.CompoundButton_buttonTintMode, -1), null));
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  PorterDuff.Mode b()
  {
    return this.d;
  }
  
  void c()
  {
    if (this.g)
    {
      this.g = false;
      return;
    }
    this.g = true;
    d();
  }
  
  void d()
  {
    Drawable localDrawable = g.a(this.a);
    if ((localDrawable != null) && ((this.e) || (this.f)))
    {
      localDrawable = a.f(localDrawable).mutate();
      if (this.e) {
        a.a(localDrawable, this.c);
      }
      if (this.f) {
        a.a(localDrawable, this.d);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(this.a.getDrawableState());
      }
      this.a.setButtonDrawable(localDrawable);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */