package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.design.R.styleable;
import android.support.v4.f.h;
import android.support.v4.f.i;
import android.support.v4.view.cb;
import android.support.v4.view.v;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

final class o
{
  private static final boolean a;
  private static final Paint b;
  private boolean A;
  private Bitmap B;
  private Paint C;
  private float D;
  private float E;
  private float F;
  private float G;
  private boolean H;
  private final TextPaint I;
  private Interpolator J;
  private Interpolator K;
  private float L;
  private float M;
  private float N;
  private int O;
  private float P;
  private float Q;
  private float R;
  private int S;
  private final View c;
  private boolean d;
  private float e;
  private final Rect f;
  private final Rect g;
  private final RectF h;
  private int i = 16;
  private int j = 16;
  private float k = 15.0F;
  private float l = 15.0F;
  private int m;
  private int n;
  private float o;
  private float p;
  private float q;
  private float r;
  private float s;
  private float t;
  private Typeface u;
  private Typeface v;
  private Typeface w;
  private CharSequence x;
  private CharSequence y;
  private boolean z;
  
  static
  {
    if (Build.VERSION.SDK_INT < 18) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      b = null;
      if (b != null)
      {
        b.setAntiAlias(true);
        b.setColor(-65281);
      }
      return;
    }
  }
  
  public o(View paramView)
  {
    this.c = paramView;
    this.I = new TextPaint(129);
    this.g = new Rect();
    this.f = new Rect();
    this.h = new RectF();
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, Interpolator paramInterpolator)
  {
    float f1 = paramFloat3;
    if (paramInterpolator != null) {
      f1 = paramInterpolator.getInterpolation(paramFloat3);
    }
    return a.a(paramFloat1, paramFloat2, f1);
  }
  
  private static int a(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.alpha(paramInt1);
    float f3 = Color.alpha(paramInt2);
    float f4 = Color.red(paramInt1);
    float f5 = Color.red(paramInt2);
    float f6 = Color.green(paramInt1);
    float f7 = Color.green(paramInt2);
    float f8 = Color.blue(paramInt1);
    float f9 = Color.blue(paramInt2);
    return Color.argb((int)(f2 * f1 + f3 * paramFloat), (int)(f4 * f1 + f5 * paramFloat), (int)(f6 * f1 + f7 * paramFloat), (int)(f1 * f8 + f9 * paramFloat));
  }
  
  private static boolean a(float paramFloat1, float paramFloat2)
  {
    return Math.abs(paramFloat1 - paramFloat2) < 0.001F;
  }
  
  private static boolean a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (paramRect.left == paramInt1) && (paramRect.top == paramInt2) && (paramRect.right == paramInt3) && (paramRect.bottom == paramInt4);
  }
  
  private boolean b(CharSequence paramCharSequence)
  {
    int i1 = 1;
    if (cb.h(this.c) == 1) {
      if (i1 == 0) {
        break label41;
      }
    }
    label41:
    for (h localh = i.d;; localh = i.c)
    {
      return localh.a(paramCharSequence, 0, paramCharSequence.length());
      i1 = 0;
      break;
    }
  }
  
  private void c(float paramFloat)
  {
    d(paramFloat);
    this.s = a(this.q, this.r, paramFloat, this.J);
    this.t = a(this.o, this.p, paramFloat, this.J);
    e(a(this.k, this.l, paramFloat, this.K));
    if (this.n != this.m) {
      this.I.setColor(a(this.m, this.n, paramFloat));
    }
    for (;;)
    {
      this.I.setShadowLayer(a(this.P, this.L, paramFloat, null), a(this.Q, this.M, paramFloat, null), a(this.R, this.N, paramFloat, null), a(this.S, this.O, paramFloat));
      cb.d(this.c);
      return;
      this.I.setColor(this.n);
    }
  }
  
  private void d(float paramFloat)
  {
    this.h.left = a(this.f.left, this.g.left, paramFloat, this.J);
    this.h.top = a(this.o, this.p, paramFloat, this.J);
    this.h.right = a(this.f.right, this.g.right, paramFloat, this.J);
    this.h.bottom = a(this.f.bottom, this.g.bottom, paramFloat, this.J);
  }
  
  private void e(float paramFloat)
  {
    f(paramFloat);
    if ((a) && (this.F != 1.0F)) {}
    for (boolean bool = true;; bool = false)
    {
      this.A = bool;
      if (this.A) {
        j();
      }
      cb.d(this.c);
      return;
    }
  }
  
  private Typeface f(int paramInt)
  {
    TypedArray localTypedArray = this.c.getContext().obtainStyledAttributes(paramInt, new int[] { 16843692 });
    try
    {
      Object localObject1 = localTypedArray.getString(0);
      if (localObject1 != null)
      {
        localObject1 = Typeface.create((String)localObject1, 0);
        return (Typeface)localObject1;
      }
      return null;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  private void f(float paramFloat)
  {
    boolean bool = true;
    if (this.x == null) {
      return;
    }
    float f1;
    int i1;
    if (a(paramFloat, this.l))
    {
      f1 = this.g.width();
      paramFloat = this.l;
      this.F = 1.0F;
      if (this.w == this.u) {
        break label306;
      }
      this.w = this.u;
      i1 = 1;
    }
    for (;;)
    {
      int i2 = i1;
      label97:
      label161:
      float f2;
      if (f1 > 0.0F)
      {
        if ((this.G != paramFloat) || (this.H) || (i1 != 0))
        {
          i1 = 1;
          this.G = paramFloat;
          this.H = false;
          i2 = i1;
        }
      }
      else
      {
        if ((this.y != null) && (i2 == 0)) {
          break;
        }
        this.I.setTextSize(this.G);
        this.I.setTypeface(this.w);
        Object localObject = this.I;
        if (this.F == 1.0F) {
          break label294;
        }
        ((TextPaint)localObject).setLinearText(bool);
        localObject = TextUtils.ellipsize(this.x, this.I, f1, TextUtils.TruncateAt.END);
        if (TextUtils.equals((CharSequence)localObject, this.y)) {
          break;
        }
        this.y = ((CharSequence)localObject);
        this.z = b(this.y);
        return;
        f1 = this.f.width();
        f2 = this.k;
        if (this.w == this.v) {
          break label300;
        }
        this.w = this.v;
      }
      label294:
      label300:
      for (i1 = 1;; i1 = 0)
      {
        if (a(paramFloat, this.k))
        {
          this.F = 1.0F;
          paramFloat = f2;
          break;
        }
        this.F = (paramFloat / this.k);
        paramFloat = f2;
        break;
        i1 = 0;
        break label97;
        bool = false;
        break label161;
      }
      label306:
      i1 = 0;
    }
  }
  
  private void h()
  {
    c(this.e);
  }
  
  private void i()
  {
    int i2 = 1;
    float f2 = 0.0F;
    float f3 = this.G;
    f(this.l);
    float f1;
    int i1;
    if (this.y != null)
    {
      f1 = this.I.measureText(this.y, 0, this.y.length());
      int i3 = this.j;
      if (!this.z) {
        break label383;
      }
      i1 = 1;
      label63:
      i1 = v.a(i3, i1);
      switch (i1 & 0x70)
      {
      default: 
        this.p = ((this.I.descent() - this.I.ascent()) / 2.0F - this.I.descent() + this.g.centerY());
        label142:
        switch (i1 & 0x800007)
        {
        default: 
          this.r = this.g.left;
          label188:
          f(this.k);
          f1 = f2;
          if (this.y != null) {
            f1 = this.I.measureText(this.y, 0, this.y.length());
          }
          i3 = this.i;
          if (this.z)
          {
            i1 = i2;
            label244:
            i1 = v.a(i3, i1);
            switch (i1 & 0x70)
            {
            default: 
              this.o = ((this.I.descent() - this.I.ascent()) / 2.0F - this.I.descent() + this.f.centerY());
              label322:
              switch (i1 & 0x800007)
              {
              default: 
                this.q = this.f.left;
              }
              break;
            }
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      k();
      e(f3);
      return;
      f1 = 0.0F;
      break;
      label383:
      i1 = 0;
      break label63;
      this.p = this.g.bottom;
      break label142;
      this.p = (this.g.top - this.I.ascent());
      break label142;
      this.r = (this.g.centerX() - f1 / 2.0F);
      break label188;
      this.r = (this.g.right - f1);
      break label188;
      i1 = 0;
      break label244;
      this.o = this.f.bottom;
      break label322;
      this.o = (this.f.top - this.I.ascent());
      break label322;
      this.q = (this.f.centerX() - f1 / 2.0F);
      continue;
      this.q = (this.f.right - f1);
    }
  }
  
  private void j()
  {
    if ((this.B != null) || (this.f.isEmpty()) || (TextUtils.isEmpty(this.y))) {}
    do
    {
      int i1;
      int i2;
      do
      {
        return;
        c(0.0F);
        this.D = this.I.ascent();
        this.E = this.I.descent();
        i1 = Math.round(this.I.measureText(this.y, 0, this.y.length()));
        i2 = Math.round(this.E - this.D);
      } while ((i1 <= 0) || (i2 <= 0));
      this.B = Bitmap.createBitmap(i1, i2, Bitmap.Config.ARGB_8888);
      new Canvas(this.B).drawText(this.y, 0, this.y.length(), 0.0F, i2 - this.I.descent(), this.I);
    } while (this.C != null);
    this.C = new Paint(3);
  }
  
  private void k()
  {
    if (this.B != null)
    {
      this.B.recycle();
      this.B = null;
    }
  }
  
  void a()
  {
    if ((this.g.width() > 0) && (this.g.height() > 0) && (this.f.width() > 0) && (this.f.height() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      return;
    }
  }
  
  void a(float paramFloat)
  {
    if (this.k != paramFloat)
    {
      this.k = paramFloat;
      e();
    }
  }
  
  void a(int paramInt)
  {
    if (this.n != paramInt)
    {
      this.n = paramInt;
      e();
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.f, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.f.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.H = true;
      a();
    }
  }
  
  public void a(Canvas paramCanvas)
  {
    int i2 = paramCanvas.save();
    float f4;
    int i1;
    float f1;
    float f2;
    if ((this.y != null) && (this.d))
    {
      f4 = this.s;
      float f3 = this.t;
      if ((!this.A) || (this.B == null)) {
        break label138;
      }
      i1 = 1;
      if (i1 == 0) {
        break label144;
      }
      f1 = this.D * this.F;
      f2 = this.E;
      f2 = this.F;
      label74:
      f2 = f3;
      if (i1 != 0) {
        f2 = f3 + f1;
      }
      if (this.F != 1.0F) {
        paramCanvas.scale(this.F, this.F, f4, f2);
      }
      if (i1 == 0) {
        break label173;
      }
      paramCanvas.drawBitmap(this.B, f4, f2, this.C);
    }
    for (;;)
    {
      paramCanvas.restoreToCount(i2);
      return;
      label138:
      i1 = 0;
      break;
      label144:
      f1 = this.I.ascent() * this.F;
      this.I.descent();
      f2 = this.F;
      break label74;
      label173:
      paramCanvas.drawText(this.y, 0, this.y.length(), f4, f2, this.I);
    }
  }
  
  void a(Typeface paramTypeface)
  {
    this.v = paramTypeface;
    this.u = paramTypeface;
    e();
  }
  
  void a(Interpolator paramInterpolator)
  {
    this.K = paramInterpolator;
    e();
  }
  
  void a(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (!paramCharSequence.equals(this.x)))
    {
      this.x = paramCharSequence;
      this.y = null;
      k();
      e();
    }
  }
  
  Typeface b()
  {
    if (this.u != null) {
      return this.u;
    }
    return Typeface.DEFAULT;
  }
  
  void b(float paramFloat)
  {
    paramFloat = av.a(paramFloat, 0.0F, 1.0F);
    if (paramFloat != this.e)
    {
      this.e = paramFloat;
      h();
    }
  }
  
  void b(int paramInt)
  {
    if (this.m != paramInt)
    {
      this.m = paramInt;
      e();
    }
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.g, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.g.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.H = true;
      a();
    }
  }
  
  void b(Interpolator paramInterpolator)
  {
    this.J = paramInterpolator;
    e();
  }
  
  float c()
  {
    return this.e;
  }
  
  void c(int paramInt)
  {
    if (this.i != paramInt)
    {
      this.i = paramInt;
      e();
    }
  }
  
  float d()
  {
    return this.l;
  }
  
  void d(int paramInt)
  {
    if (this.j != paramInt)
    {
      this.j = paramInt;
      e();
    }
  }
  
  public void e()
  {
    if ((this.c.getHeight() > 0) && (this.c.getWidth() > 0))
    {
      i();
      h();
    }
  }
  
  void e(int paramInt)
  {
    TypedArray localTypedArray = this.c.getContext().obtainStyledAttributes(paramInt, R.styleable.TextAppearance);
    if (localTypedArray.hasValue(R.styleable.TextAppearance_android_textColor)) {
      this.n = localTypedArray.getColor(R.styleable.TextAppearance_android_textColor, this.n);
    }
    if (localTypedArray.hasValue(R.styleable.TextAppearance_android_textSize)) {
      this.l = localTypedArray.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, (int)this.l);
    }
    this.O = localTypedArray.getInt(R.styleable.TextAppearance_android_shadowColor, 0);
    this.M = localTypedArray.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0F);
    this.N = localTypedArray.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0F);
    this.L = localTypedArray.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0F);
    localTypedArray.recycle();
    if (Build.VERSION.SDK_INT >= 16) {
      this.u = f(paramInt);
    }
    e();
  }
  
  CharSequence f()
  {
    return this.x;
  }
  
  int g()
  {
    return this.n;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */