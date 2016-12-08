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
import java.text.DateFormatSymbols;

public final class a
  extends View
{
  private final Paint a = new Paint();
  private int b;
  private int c;
  private int d;
  private int e;
  private float f;
  private float g;
  private String h;
  private String i;
  private boolean j = false;
  private boolean k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  public int a(float paramFloat1, float paramFloat2)
  {
    if (!this.k) {}
    int i1;
    float f1;
    do
    {
      return -1;
      i1 = (int)((paramFloat2 - this.o) * (paramFloat2 - this.o));
      if ((int)Math.sqrt((paramFloat1 - this.m) * (paramFloat1 - this.m) + i1) <= this.l) {
        return 0;
      }
      paramFloat2 = this.n;
      f1 = this.n;
    } while ((int)Math.sqrt(i1 + (paramFloat1 - paramFloat2) * (paramFloat1 - f1)) > this.l);
    return 1;
  }
  
  public void a(Context paramContext, int paramInt)
  {
    if (this.j)
    {
      Log.e("AmPmCirclesView", "AmPmCirclesView may only be initialized once.");
      return;
    }
    paramContext = paramContext.getResources();
    this.c = paramContext.getColor(R.color.bpWhite);
    this.e = paramContext.getColor(R.color.bpBlue);
    this.d = paramContext.getColor(R.color.ampm_text_color);
    Typeface localTypeface = Typeface.create(paramContext.getString(R.string.sans_serif), 0);
    this.a.setTypeface(localTypeface);
    this.a.setAntiAlias(true);
    this.a.setTextAlign(Paint.Align.CENTER);
    this.f = Float.parseFloat(paramContext.getString(R.string.circle_radius_multiplier));
    this.g = Float.parseFloat(paramContext.getString(R.string.ampm_circle_radius_multiplier));
    paramContext = new DateFormatSymbols().getAmPmStrings();
    this.h = paramContext[0];
    this.i = paramContext[1];
    setAmOrPm(paramInt);
    this.q = -1;
    this.j = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    int i2 = 255;
    if ((getWidth() == 0) || (!this.j)) {
      return;
    }
    int i1;
    int i5;
    if (!this.k)
    {
      i1 = getWidth() / 2;
      i3 = getHeight() / 2;
      i4 = (int)(Math.min(i1, i3) * this.f);
      this.l = ((int)(i4 * this.g));
      i5 = this.l * 3 / 4;
      this.a.setTextSize(i5);
      this.o = (i3 - this.l / 2 + i4);
      this.m = (i1 - i4 + this.l);
      this.n = (i1 + i4 - this.l);
      this.k = true;
    }
    int i4 = this.c;
    int i3 = this.c;
    if (this.p == 0)
    {
      i4 = this.e;
      i1 = this.b;
    }
    for (;;)
    {
      int i6;
      if (this.q == 0)
      {
        i5 = this.e;
        i6 = this.b;
      }
      for (;;)
      {
        this.a.setColor(i5);
        this.a.setAlpha(i6);
        paramCanvas.drawCircle(this.m, this.o, this.l, this.a);
        this.a.setColor(i3);
        this.a.setAlpha(i2);
        paramCanvas.drawCircle(this.n, this.o, this.l, this.a);
        this.a.setColor(this.d);
        i1 = this.o - (int)(this.a.descent() + this.a.ascent()) / 2;
        paramCanvas.drawText(this.h, this.m, i1, this.a);
        paramCanvas.drawText(this.i, this.n, i1, this.a);
        return;
        if (this.p != 1) {
          break label402;
        }
        i3 = this.e;
        i2 = this.b;
        i1 = 255;
        break;
        i6 = i1;
        i5 = i4;
        if (this.q == 1)
        {
          i3 = this.e;
          i2 = this.b;
          i6 = i1;
          i5 = i4;
        }
      }
      label402:
      i1 = 255;
    }
  }
  
  public void setAmOrPm(int paramInt)
  {
    this.p = paramInt;
  }
  
  public void setAmOrPmPressed(int paramInt)
  {
    this.q = paramInt;
  }
  
  void setTheme(TypedArray paramTypedArray)
  {
    this.c = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainColor1, R.color.bpWhite);
    this.e = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpAccentColor, R.color.bpBlue);
    this.d = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainTextColor, R.color.ampm_text_color);
    this.b = paramTypedArray.getInt(R.styleable.BetterPickersDialog_bpSelectionAlpha, 100);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */