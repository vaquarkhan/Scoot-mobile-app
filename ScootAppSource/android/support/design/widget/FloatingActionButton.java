package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.R.dimen;
import android.support.design.R.style;
import android.support.design.R.styleable;
import android.support.v7.widget.ax;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;

@s(a=FloatingActionButton.Behavior.class)
public class FloatingActionButton
  extends de
{
  private ColorStateList a;
  private PorterDuff.Mode b;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private final Rect h = new Rect();
  private ax i;
  private ao j;
  
  public FloatingActionButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ce.a(paramContext);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FloatingActionButton, paramInt, R.style.Widget_Design_FloatingActionButton);
    this.a = paramContext.getColorStateList(R.styleable.FloatingActionButton_backgroundTint);
    this.b = a(paramContext.getInt(R.styleable.FloatingActionButton_backgroundTintMode, -1), null);
    this.d = paramContext.getColor(R.styleable.FloatingActionButton_rippleColor, 0);
    this.e = paramContext.getInt(R.styleable.FloatingActionButton_fabSize, 0);
    this.c = paramContext.getDimensionPixelSize(R.styleable.FloatingActionButton_borderWidth, 0);
    float f1 = paramContext.getDimension(R.styleable.FloatingActionButton_elevation, 0.0F);
    float f2 = paramContext.getDimension(R.styleable.FloatingActionButton_pressedTranslationZ, 0.0F);
    this.g = paramContext.getBoolean(R.styleable.FloatingActionButton_useCompatPadding, false);
    paramContext.recycle();
    this.i = new ax(this, android.support.v7.widget.aq.a());
    this.i.a(paramAttributeSet, paramInt);
    paramInt = (int)getResources().getDimension(R.dimen.design_fab_image_size);
    this.f = ((getSizeDimension() - paramInt) / 2);
    getImpl().a(this.a, this.b, this.d, this.c);
    getImpl().c(f1);
    getImpl().d(f2);
    getImpl().g();
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    int k = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    switch (k)
    {
    case 0: 
    default: 
      return paramInt1;
    case -2147483648: 
      return Math.min(paramInt1, paramInt2);
    }
    return paramInt2;
  }
  
  static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    default: 
      return paramMode;
    case 3: 
      return PorterDuff.Mode.SRC_OVER;
    case 5: 
      return PorterDuff.Mode.SRC_IN;
    case 9: 
      return PorterDuff.Mode.SRC_ATOP;
    case 14: 
      return PorterDuff.Mode.MULTIPLY;
    }
    return PorterDuff.Mode.SCREEN;
  }
  
  private void a(ad paramad, boolean paramBoolean)
  {
    getImpl().b(c(paramad), paramBoolean);
  }
  
  private void b(ad paramad, boolean paramBoolean)
  {
    getImpl().a(c(paramad), paramBoolean);
  }
  
  private ao c()
  {
    int k = Build.VERSION.SDK_INT;
    if (k >= 21) {
      return new ar(this, new ae(this, null));
    }
    if (k >= 14) {
      return new al(this, new ae(this, null));
    }
    return new af(this, new ae(this, null));
  }
  
  private aq c(ad paramad)
  {
    if (paramad == null) {
      return null;
    }
    return new ab(this, paramad);
  }
  
  private ao getImpl()
  {
    if (this.j == null) {
      this.j = c();
    }
    return this.j;
  }
  
  public void a()
  {
    a(null);
  }
  
  public void a(ad paramad)
  {
    a(paramad, true);
  }
  
  public void b()
  {
    b(null);
  }
  
  public void b(ad paramad)
  {
    b(paramad, true);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    getImpl().a(getDrawableState());
  }
  
  public ColorStateList getBackgroundTintList()
  {
    return this.a;
  }
  
  public PorterDuff.Mode getBackgroundTintMode()
  {
    return this.b;
  }
  
  public float getCompatElevation()
  {
    return getImpl().a();
  }
  
  public Drawable getContentBackground()
  {
    return getImpl().f();
  }
  
  final int getSizeDimension()
  {
    switch (this.e)
    {
    default: 
      return getResources().getDimensionPixelSize(R.dimen.design_fab_size_normal);
    }
    return getResources().getDimensionPixelSize(R.dimen.design_fab_size_mini);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.g;
  }
  
  @TargetApi(11)
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    getImpl().b();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getImpl().h();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    getImpl().i();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = getSizeDimension();
    paramInt1 = Math.min(a(k, paramInt1), a(k, paramInt2));
    setMeasuredDimension(this.h.left + paramInt1 + this.h.right, paramInt1 + this.h.top + this.h.bottom);
  }
  
  public void setBackgroundColor(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundResource(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.a != paramColorStateList)
    {
      this.a = paramColorStateList;
      getImpl().a(paramColorStateList);
    }
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.b != paramMode)
    {
      this.b = paramMode;
      getImpl().a(paramMode);
    }
  }
  
  public void setCompatElevation(float paramFloat)
  {
    getImpl().c(paramFloat);
  }
  
  public void setImageResource(int paramInt)
  {
    this.i.a(paramInt);
  }
  
  public void setRippleColor(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      getImpl().a(paramInt);
    }
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.g != paramBoolean)
    {
      this.g = paramBoolean;
      getImpl().c();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\FloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */