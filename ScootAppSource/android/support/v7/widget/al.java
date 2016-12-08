package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.cb;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.View;

final class al
{
  private final View a;
  private final aq b;
  private gk c;
  private gk d;
  private gk e;
  
  al(View paramView, aq paramaq)
  {
    this.a = paramView;
    this.b = paramaq;
  }
  
  private boolean b(Drawable paramDrawable)
  {
    if (this.e == null) {
      this.e = new gk();
    }
    gk localgk = this.e;
    localgk.a();
    Object localObject = cb.B(this.a);
    if (localObject != null)
    {
      localgk.d = true;
      localgk.a = ((ColorStateList)localObject);
    }
    localObject = cb.C(this.a);
    if (localObject != null)
    {
      localgk.c = true;
      localgk.b = ((PorterDuff.Mode)localObject);
    }
    if ((localgk.d) || (localgk.c))
    {
      aq.a(paramDrawable, localgk, this.a.getDrawableState());
      return true;
    }
    return false;
  }
  
  ColorStateList a()
  {
    if (this.d != null) {
      return this.d.a;
    }
    return null;
  }
  
  void a(int paramInt)
  {
    if (this.b != null) {}
    for (ColorStateList localColorStateList = this.b.b(this.a.getContext(), paramInt);; localColorStateList = null)
    {
      b(localColorStateList);
      return;
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (this.d == null) {
      this.d = new gk();
    }
    this.d.a = paramColorStateList;
    this.d.d = true;
    c();
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    if (this.d == null) {
      this.d = new gk();
    }
    this.d.b = paramMode;
    this.d.c = true;
    c();
  }
  
  void a(Drawable paramDrawable)
  {
    b(null);
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = this.a.getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ViewBackgroundHelper, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(R.styleable.ViewBackgroundHelper_android_background))
      {
        ColorStateList localColorStateList = this.b.b(this.a.getContext(), paramAttributeSet.getResourceId(R.styleable.ViewBackgroundHelper_android_background, -1));
        if (localColorStateList != null) {
          b(localColorStateList);
        }
      }
      if (paramAttributeSet.hasValue(R.styleable.ViewBackgroundHelper_backgroundTint)) {
        cb.a(this.a, paramAttributeSet.getColorStateList(R.styleable.ViewBackgroundHelper_backgroundTint));
      }
      if (paramAttributeSet.hasValue(R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
        cb.a(this.a, cq.a(paramAttributeSet.getInt(R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
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
    if (this.d != null) {
      return this.d.b;
    }
    return null;
  }
  
  void b(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.c == null) {
        this.c = new gk();
      }
      this.c.a = paramColorStateList;
      this.c.d = true;
    }
    for (;;)
    {
      c();
      return;
      this.c = null;
    }
  }
  
  void c()
  {
    Drawable localDrawable = this.a.getBackground();
    if ((localDrawable == null) || ((Build.VERSION.SDK_INT == 21) && (b(localDrawable)))) {}
    do
    {
      return;
      if (this.d != null)
      {
        aq.a(localDrawable, this.d, this.a.getDrawableState());
        return;
      }
    } while (this.c == null);
    aq.a(localDrawable, this.c, this.a.getDrawableState());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */