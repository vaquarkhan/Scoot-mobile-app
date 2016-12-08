package com.payu.custombrowser;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

public class DotsProgressBar
  extends View
{
  private float a;
  private float b;
  private Paint c = new Paint(1);
  private Paint d = new Paint(1);
  private Handler e = new Handler();
  private int f = 0;
  private int g;
  private int h;
  private int i = 10;
  private int j = 5;
  private int k = 1;
  private Runnable l = new aj(this);
  
  public DotsProgressBar(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public DotsProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public DotsProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    this.a = paramContext.getResources().getDimension(R.dimen.cb_circle_indicator_radius);
    this.b = paramContext.getResources().getDimension(R.dimen.cb_circle_indicator_outer_radius);
    this.c.setStyle(Paint.Style.FILL);
    this.c.setColor(paramContext.getResources().getColor(R.color.cb_payu_blue));
    this.d.setStyle(Paint.Style.FILL);
    this.d.setColor(855638016);
    a();
  }
  
  public void a()
  {
    this.f = -1;
    this.e.removeCallbacks(this.l);
    this.e.post(this.l);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    float f1 = (this.g - this.j * this.a * 2.0F - (this.j - 1) * this.i) / 2.0F;
    float f2 = this.h / 2;
    int m = 0;
    if (m < this.j)
    {
      if (m == this.f) {
        paramCanvas.drawCircle(f1, f2, this.b, this.c);
      }
      for (;;)
      {
        f1 += this.a * 2.0F + this.i;
        m += 1;
        break;
        paramCanvas.drawCircle(f1, f2, this.a, this.d);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.g = ((int)(this.a * 2.0F * this.j + this.i * this.j + this.i + (this.b - this.a)));
    this.h = ((int)this.a * 2 + getPaddingBottom() + getPaddingTop());
    setMeasuredDimension(this.g, this.h);
  }
  
  public void setDotsCount(int paramInt)
  {
    this.j = paramInt;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\DotsProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */