package com.codetroopers.betterpickers.radialtimepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.string;
import com.codetroopers.betterpickers.R.styleable;
import com.d.a.ai;
import com.d.a.o;
import com.d.a.s;
import com.d.c.a.a;

public final class i
  extends View
{
  private float[] A;
  private float B;
  private float C;
  private float D;
  private k E;
  s a;
  s b;
  private final Paint c = new Paint();
  private boolean d;
  private boolean e = false;
  private Typeface f;
  private Typeface g;
  private String[] h;
  private String[] i;
  private boolean j;
  private boolean k;
  private float l;
  private float m;
  private float n;
  private float o;
  private float p;
  private float q;
  private int r;
  private int s;
  private float t;
  private boolean u;
  private float v;
  private float w;
  private float[] x;
  private float[] y;
  private float[] z;
  
  public i(Context paramContext)
  {
    super(paramContext);
  }
  
  private void a()
  {
    ai localai1 = ai.a("animationRadiusMultiplier", new o[] { o.a(0.0F, 1.0F), o.a(0.2F, this.C), o.a(1.0F, this.D) });
    ai localai2 = ai.a("alpha", new o[] { o.a(0.0F, 1.0F), o.a(1.0F, 0.0F) });
    int i1;
    if (a.a)
    {
      localObject = a.a(this);
      this.a = s.a(localObject, new ai[] { localai1, localai2 }).a('Ǵ');
      this.a.a(this.E);
      i1 = (int)((1.0F + 0.25F) * 'Ǵ');
      float f1 = 0.25F * 'Ǵ' / i1;
      localai1 = ai.a("animationRadiusMultiplier", new o[] { o.a(0.0F, this.D), o.a(f1, this.D), o.a(1.0F - 0.2F * (1.0F - f1), this.C), o.a(1.0F, 1.0F) });
      localai2 = ai.a("alpha", new o[] { o.a(0.0F, 0.0F), o.a(f1, 0.0F), o.a(1.0F, 1.0F) });
      if (!a.a) {
        break label291;
      }
    }
    label291:
    for (Object localObject = a.a(this);; localObject = this)
    {
      this.b = s.a(localObject, new ai[] { localai1, localai2 }).a(i1);
      this.b.a(this.E);
      return;
      localObject = this;
      break;
    }
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    float f1 = (float)Math.sqrt(3.0D) * paramFloat1 / 2.0F;
    float f2 = paramFloat1 / 2.0F;
    this.c.setTextSize(paramFloat4);
    paramFloat3 -= (this.c.descent() + this.c.ascent()) / 2.0F;
    paramArrayOfFloat1[0] = (paramFloat3 - paramFloat1);
    paramArrayOfFloat2[0] = (paramFloat2 - paramFloat1);
    paramArrayOfFloat1[1] = (paramFloat3 - f1);
    paramArrayOfFloat2[1] = (paramFloat2 - f1);
    paramArrayOfFloat1[2] = (paramFloat3 - f2);
    paramArrayOfFloat2[2] = (paramFloat2 - f2);
    paramArrayOfFloat1[3] = paramFloat3;
    paramArrayOfFloat2[3] = paramFloat2;
    paramArrayOfFloat1[4] = (paramFloat3 + f2);
    paramArrayOfFloat2[4] = (f2 + paramFloat2);
    paramArrayOfFloat1[5] = (paramFloat3 + f1);
    paramArrayOfFloat2[5] = (f1 + paramFloat2);
    paramArrayOfFloat1[6] = (paramFloat3 + paramFloat1);
    paramArrayOfFloat2[6] = (paramFloat2 + paramFloat1);
  }
  
  private void a(Canvas paramCanvas, float paramFloat, Typeface paramTypeface, String[] paramArrayOfString, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    this.c.setTextSize(paramFloat);
    this.c.setTypeface(paramTypeface);
    paramCanvas.drawText(paramArrayOfString[0], paramArrayOfFloat1[3], paramArrayOfFloat2[0], this.c);
    paramCanvas.drawText(paramArrayOfString[1], paramArrayOfFloat1[4], paramArrayOfFloat2[1], this.c);
    paramCanvas.drawText(paramArrayOfString[2], paramArrayOfFloat1[5], paramArrayOfFloat2[2], this.c);
    paramCanvas.drawText(paramArrayOfString[3], paramArrayOfFloat1[6], paramArrayOfFloat2[3], this.c);
    paramCanvas.drawText(paramArrayOfString[4], paramArrayOfFloat1[5], paramArrayOfFloat2[4], this.c);
    paramCanvas.drawText(paramArrayOfString[5], paramArrayOfFloat1[4], paramArrayOfFloat2[5], this.c);
    paramCanvas.drawText(paramArrayOfString[6], paramArrayOfFloat1[3], paramArrayOfFloat2[6], this.c);
    paramCanvas.drawText(paramArrayOfString[7], paramArrayOfFloat1[2], paramArrayOfFloat2[5], this.c);
    paramCanvas.drawText(paramArrayOfString[8], paramArrayOfFloat1[1], paramArrayOfFloat2[4], this.c);
    paramCanvas.drawText(paramArrayOfString[9], paramArrayOfFloat1[0], paramArrayOfFloat2[3], this.c);
    paramCanvas.drawText(paramArrayOfString[10], paramArrayOfFloat1[1], paramArrayOfFloat2[2], this.c);
    paramCanvas.drawText(paramArrayOfString[11], paramArrayOfFloat1[2], paramArrayOfFloat2[1], this.c);
  }
  
  public void a(Resources paramResources, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i2 = -1;
    boolean bool = false;
    if (this.e)
    {
      Log.e("RadialTextsView", "This RadialTextsView may only be initialized once.");
      return;
    }
    int i1 = paramResources.getColor(R.color.numbers_text_color);
    this.c.setColor(i1);
    this.f = Typeface.create(paramResources.getString(R.string.radial_numbers_typeface), 0);
    this.g = Typeface.create(paramResources.getString(R.string.sans_serif), 0);
    this.c.setAntiAlias(true);
    this.c.setTextAlign(Paint.Align.CENTER);
    this.h = paramArrayOfString1;
    this.i = paramArrayOfString2;
    this.j = paramBoolean1;
    if (paramArrayOfString2 != null) {
      bool = true;
    }
    this.k = bool;
    if (paramBoolean1)
    {
      this.l = Float.parseFloat(paramResources.getString(R.string.circle_radius_multiplier_24HourMode));
      this.x = new float[7];
      this.y = new float[7];
      if (!this.k) {
        break label335;
      }
      this.n = Float.parseFloat(paramResources.getString(R.string.numbers_radius_multiplier_outer));
      this.p = Float.parseFloat(paramResources.getString(R.string.text_size_multiplier_outer));
      this.o = Float.parseFloat(paramResources.getString(R.string.numbers_radius_multiplier_inner));
      this.q = Float.parseFloat(paramResources.getString(R.string.text_size_multiplier_inner));
      this.z = new float[7];
      this.A = new float[7];
      label231:
      this.B = 1.0F;
      if (!paramBoolean2) {
        break label366;
      }
    }
    label335:
    label366:
    for (i1 = -1;; i1 = 1)
    {
      this.C = (i1 * 0.05F + 1.0F);
      i1 = i2;
      if (paramBoolean2) {
        i1 = 1;
      }
      this.D = (0.3F * i1 + 1.0F);
      this.E = new k(this, null);
      this.u = true;
      this.e = true;
      return;
      this.l = Float.parseFloat(paramResources.getString(R.string.circle_radius_multiplier));
      this.m = Float.parseFloat(paramResources.getString(R.string.ampm_circle_radius_multiplier));
      break;
      this.n = Float.parseFloat(paramResources.getString(R.string.numbers_radius_multiplier_normal));
      this.p = Float.parseFloat(paramResources.getString(R.string.text_size_multiplier_normal));
      break label231;
    }
  }
  
  public s getDisappearAnimator()
  {
    if ((!this.e) || (!this.d) || (this.a == null))
    {
      Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
      return null;
    }
    return this.a;
  }
  
  public s getReappearAnimator()
  {
    if ((!this.e) || (!this.d) || (this.b == null))
    {
      Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
      return null;
    }
    return this.b;
  }
  
  public boolean hasOverlappingRendering()
  {
    return false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if ((getWidth() == 0) || (!this.e)) {}
    do
    {
      return;
      float f1;
      float f2;
      if (!this.d)
      {
        this.r = (getWidth() / 2);
        this.s = (getHeight() / 2);
        this.t = (Math.min(this.r, this.s) * this.l);
        if (!this.j)
        {
          f1 = this.t;
          f2 = this.m;
          this.s = ((int)(this.s - f1 * f2 / 2.0F));
        }
        this.v = (this.t * this.p);
        if (this.k) {
          this.w = (this.t * this.q);
        }
        a();
        this.u = true;
        this.d = true;
      }
      if (this.u)
      {
        f1 = this.t;
        f2 = this.n;
        a(this.B * (f1 * f2), this.r, this.s, this.v, this.x, this.y);
        if (this.k)
        {
          f1 = this.t;
          f2 = this.o;
          a(this.B * (f1 * f2), this.r, this.s, this.w, this.z, this.A);
        }
        this.u = false;
      }
      a(paramCanvas, this.v, this.f, this.h, this.y, this.x);
    } while (!this.k);
    a(paramCanvas, this.w, this.g, this.i, this.A, this.z);
  }
  
  public void setAnimationRadiusMultiplier(float paramFloat)
  {
    this.B = paramFloat;
    this.u = true;
  }
  
  void setTheme(TypedArray paramTypedArray)
  {
    this.c.setColor(paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainTextColor, R.color.numbers_text_color));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */