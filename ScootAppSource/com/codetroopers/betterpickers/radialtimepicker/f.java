package com.codetroopers.betterpickers.radialtimepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.string;
import com.codetroopers.betterpickers.R.styleable;
import com.d.a.ai;
import com.d.a.o;
import com.d.a.s;
import com.d.c.a.a;

public final class f
  extends View
{
  private final Paint a = new Paint();
  private boolean b = false;
  private boolean c;
  private float d;
  private float e;
  private float f;
  private float g;
  private float h;
  private float i;
  private float j;
  private boolean k;
  private boolean l;
  private int m;
  private int n;
  private int o;
  private int p;
  private float q;
  private float r;
  private int s;
  private int t;
  private h u;
  private int v;
  private double w;
  private boolean x;
  
  public f(Context paramContext)
  {
    super(paramContext);
  }
  
  public int a(float paramFloat1, float paramFloat2, boolean paramBoolean, Boolean[] paramArrayOfBoolean)
  {
    int i2 = 1;
    if (!this.c) {
      return -1;
    }
    double d1 = Math.sqrt((paramFloat2 - this.o) * (paramFloat2 - this.o) + (paramFloat1 - this.n) * (paramFloat1 - this.n));
    label103:
    label111:
    int i3;
    int i1;
    if (this.l) {
      if (paramBoolean) {
        if ((int)Math.abs(d1 - (int)(this.p * this.f)) <= (int)Math.abs(d1 - (int)(this.p * this.g)))
        {
          paramBoolean = true;
          paramArrayOfBoolean[0] = Boolean.valueOf(paramBoolean);
          i3 = (int)(Math.asin(Math.abs(paramFloat2 - this.o) / d1) * 180.0D / 3.141592653589793D);
          if (paramFloat1 <= this.n) {
            break label339;
          }
          i1 = 1;
          label152:
          if (paramFloat2 >= this.o) {
            break label345;
          }
        }
      }
    }
    for (;;)
    {
      if ((i1 == 0) || (i2 == 0)) {
        break label351;
      }
      return 90 - i3;
      paramBoolean = false;
      break label103;
      i1 = (int)(this.p * this.f);
      i3 = this.t;
      int i4 = (int)(this.p * this.g);
      int i5 = this.t;
      int i6 = (int)(this.p * ((this.g + this.f) / 2.0F));
      if ((d1 >= i1 - i3) && (d1 <= i6))
      {
        paramArrayOfBoolean[0] = Boolean.valueOf(true);
        break label111;
      }
      if ((d1 > i4 + i5) || (d1 < i6)) {
        break;
      }
      paramArrayOfBoolean[0] = Boolean.valueOf(false);
      break label111;
      if ((paramBoolean) || ((int)Math.abs(d1 - this.s) <= (int)(this.p * (1.0F - this.h)))) {
        break label111;
      }
      return -1;
      label339:
      i1 = 0;
      break label152;
      label345:
      i2 = 0;
    }
    label351:
    if ((i1 != 0) && (i2 == 0)) {
      return i3 + 90;
    }
    if ((i1 == 0) && (i2 == 0)) {
      return 270 - i3;
    }
    if ((i1 == 0) && (i2 != 0)) {
      return i3 + 270;
    }
    return i3;
  }
  
  public void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.v = paramInt;
    this.w = (paramInt * 3.141592653589793D / 180.0D);
    this.x = paramBoolean2;
    if (this.l)
    {
      if (paramBoolean1) {
        this.h = this.f;
      }
    }
    else {
      return;
    }
    this.h = this.g;
  }
  
  public void a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    int i2 = -1;
    if (this.b)
    {
      Log.e("RadialSelectorView", "This RadialSelectorView may only be initialized once.");
      return;
    }
    paramContext = paramContext.getResources();
    this.a.setAntiAlias(true);
    this.k = paramBoolean1;
    if (paramBoolean1)
    {
      this.d = Float.parseFloat(paramContext.getString(R.string.circle_radius_multiplier_24HourMode));
      this.l = paramBoolean2;
      if (!paramBoolean2) {
        break label214;
      }
      this.f = Float.parseFloat(paramContext.getString(R.string.numbers_radius_multiplier_inner));
      this.g = Float.parseFloat(paramContext.getString(R.string.numbers_radius_multiplier_outer));
      label92:
      this.i = Float.parseFloat(paramContext.getString(R.string.selection_radius_multiplier));
      this.j = 1.0F;
      if (!paramBoolean3) {
        break label231;
      }
    }
    label214:
    label231:
    for (int i1 = -1;; i1 = 1)
    {
      this.q = (i1 * 0.05F + 1.0F);
      i1 = i2;
      if (paramBoolean3) {
        i1 = 1;
      }
      this.r = (0.3F * i1 + 1.0F);
      this.u = new h(this, null);
      a(paramInt, paramBoolean4, false);
      this.b = true;
      return;
      this.d = Float.parseFloat(paramContext.getString(R.string.circle_radius_multiplier));
      this.e = Float.parseFloat(paramContext.getString(R.string.ampm_circle_radius_multiplier));
      break;
      this.h = Float.parseFloat(paramContext.getString(R.string.numbers_radius_multiplier_normal));
      break label92;
    }
  }
  
  public s getDisappearAnimator()
  {
    if ((!this.b) || (!this.c))
    {
      Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
      return null;
    }
    ai localai1 = ai.a("animationRadiusMultiplier", new o[] { o.a(0.0F, 1.0F), o.a(0.2F, this.q), o.a(1.0F, this.r) });
    ai localai2 = ai.a("alpha", new o[] { o.a(0.0F, 1.0F), o.a(1.0F, 0.0F) });
    if (a.a) {}
    for (Object localObject = a.a(this);; localObject = this)
    {
      localObject = s.a(localObject, new ai[] { localai1, localai2 }).a('Ǵ');
      ((s)localObject).a(this.u);
      return (s)localObject;
    }
  }
  
  public s getReappearAnimator()
  {
    if ((!this.b) || (!this.c))
    {
      Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
      return null;
    }
    int i1 = (int)((1.0F + 0.25F) * 'Ǵ');
    float f1 = 'Ǵ' * 0.25F / i1;
    ai localai1 = ai.a("animationRadiusMultiplier", new o[] { o.a(0.0F, this.r), o.a(f1, this.r), o.a(1.0F - 0.2F * (1.0F - f1), this.q), o.a(1.0F, 1.0F) });
    ai localai2 = ai.a("alpha", new o[] { o.a(0.0F, 0.0F), o.a(f1, 0.0F), o.a(1.0F, 1.0F) });
    if (a.a) {}
    for (Object localObject = a.a(this);; localObject = this)
    {
      localObject = s.a(localObject, new ai[] { localai1, localai2 }).a(i1);
      ((s)localObject).a(this.u);
      return (s)localObject;
    }
  }
  
  public boolean hasOverlappingRendering()
  {
    return false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    int i1 = 1;
    if ((getWidth() == 0) || (!this.b)) {
      return;
    }
    if (!this.c)
    {
      this.n = (getWidth() / 2);
      this.o = (getHeight() / 2);
      this.p = ((int)(Math.min(this.n, this.o) * this.d));
      if (!this.k)
      {
        i2 = (int)(this.p * this.e);
        this.o -= i2 / 2;
      }
      this.t = ((int)(this.p * this.i));
      this.c = true;
    }
    this.s = ((int)(this.p * this.h * this.j));
    int i2 = this.n;
    i2 = (int)(this.s * Math.sin(this.w)) + i2;
    int i3 = this.o - (int)(this.s * Math.cos(this.w));
    this.a.setAlpha(this.m);
    paramCanvas.drawCircle(i2, i3, this.t, this.a);
    int i4 = this.x;
    if (this.v % 30 != 0)
    {
      if ((i1 | i4) == 0) {
        break label314;
      }
      this.a.setAlpha(255);
      paramCanvas.drawCircle(i2, i3, this.t * 2 / 7, this.a);
      i1 = i3;
    }
    for (;;)
    {
      this.a.setAlpha(255);
      this.a.setStrokeWidth(1.0F);
      paramCanvas.drawLine(this.n, this.o, i2, i1, this.a);
      return;
      i1 = 0;
      break;
      label314:
      i1 = this.s - this.t;
      i2 = this.n;
      i3 = (int)(i1 * Math.sin(this.w));
      i1 = this.o - (int)(i1 * Math.cos(this.w));
      i2 += i3;
    }
  }
  
  public void setAnimationRadiusMultiplier(float paramFloat)
  {
    this.j = paramFloat;
  }
  
  void setTheme(TypedArray paramTypedArray)
  {
    this.a.setColor(paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpAccentColor, R.color.bpBlue));
    this.m = paramTypedArray.getInt(R.styleable.BetterPickersDialog_bpSelectionAlpha, 51);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */