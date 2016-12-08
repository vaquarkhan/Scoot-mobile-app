package com.a.a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;

public final class a
  extends ShapeDrawable
{
  private final Paint a;
  private final Paint b;
  private final String c;
  private final int d;
  private final RectShape e;
  private final int f;
  private final int g;
  private final int h;
  private final float i;
  private final int j;
  
  private a(c paramc)
  {
    super(c.a(paramc));
    this.e = c.a(paramc);
    this.f = c.b(paramc);
    this.g = c.c(paramc);
    this.i = paramc.b;
    if (c.d(paramc)) {}
    for (String str = c.e(paramc).toUpperCase();; str = c.e(paramc))
    {
      this.c = str;
      this.d = c.f(paramc);
      this.h = c.g(paramc);
      this.a = new Paint();
      this.a.setColor(paramc.a);
      this.a.setAntiAlias(true);
      this.a.setFakeBoldText(c.h(paramc));
      this.a.setStyle(Paint.Style.FILL);
      this.a.setTypeface(c.i(paramc));
      this.a.setTextAlign(Paint.Align.CENTER);
      this.a.setStrokeWidth(c.j(paramc));
      this.j = c.j(paramc);
      this.b = new Paint();
      this.b.setColor(a(this.d));
      this.b.setStyle(Paint.Style.STROKE);
      this.b.setStrokeWidth(this.j);
      getPaint().setColor(this.d);
      return;
    }
  }
  
  private int a(int paramInt)
  {
    return Color.rgb((int)(Color.red(paramInt) * 0.9F), (int)(Color.green(paramInt) * 0.9F), (int)(Color.blue(paramInt) * 0.9F));
  }
  
  public static f a()
  {
    return new c(null);
  }
  
  private void a(Canvas paramCanvas)
  {
    RectF localRectF = new RectF(getBounds());
    localRectF.inset(this.j / 2, this.j / 2);
    if ((this.e instanceof OvalShape))
    {
      paramCanvas.drawOval(localRectF, this.b);
      return;
    }
    if ((this.e instanceof RoundRectShape))
    {
      paramCanvas.drawRoundRect(localRectF, this.i, this.i, this.b);
      return;
    }
    paramCanvas.drawRect(localRectF, this.b);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Rect localRect = getBounds();
    if (this.j > 0) {
      a(paramCanvas);
    }
    int i1 = paramCanvas.save();
    paramCanvas.translate(localRect.left, localRect.top);
    int k;
    int m;
    if (this.g < 0)
    {
      k = localRect.width();
      if (this.f >= 0) {
        break label150;
      }
      m = localRect.height();
      label71:
      if (this.h >= 0) {
        break label158;
      }
    }
    label150:
    label158:
    for (int n = Math.min(k, m) / 2;; n = this.h)
    {
      this.a.setTextSize(n);
      paramCanvas.drawText(this.c, k / 2, m / 2 - (this.a.descent() + this.a.ascent()) / 2.0F, this.a);
      paramCanvas.restoreToCount(i1);
      return;
      k = this.g;
      break;
      m = this.f;
      break label71;
    }
  }
  
  public int getIntrinsicHeight()
  {
    return this.f;
  }
  
  public int getIntrinsicWidth()
  {
    return this.g;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */