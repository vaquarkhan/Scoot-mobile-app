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

public final class b
  extends View
{
  private final Paint a = new Paint();
  private boolean b;
  private int c;
  private int d;
  private float e;
  private float f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private int k;
  
  public b(Context paramContext)
  {
    super(paramContext);
    paramContext = paramContext.getResources();
    this.c = paramContext.getColor(R.color.bpWhite);
    this.d = paramContext.getColor(R.color.numbers_text_color);
    this.a.setAntiAlias(true);
    this.g = false;
  }
  
  public void a(Context paramContext, boolean paramBoolean)
  {
    if (this.g)
    {
      Log.e("CircleView", "CircleView may only be initialized once.");
      return;
    }
    paramContext = paramContext.getResources();
    this.b = paramBoolean;
    if (paramBoolean) {
      this.e = Float.parseFloat(paramContext.getString(R.string.circle_radius_multiplier_24HourMode));
    }
    for (;;)
    {
      this.g = true;
      return;
      this.e = Float.parseFloat(paramContext.getString(R.string.circle_radius_multiplier));
      this.f = Float.parseFloat(paramContext.getString(R.string.ampm_circle_radius_multiplier));
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if ((getWidth() == 0) || (!this.g)) {
      return;
    }
    if (!this.h)
    {
      this.i = (getWidth() / 2);
      this.j = (getHeight() / 2);
      this.k = ((int)(Math.min(this.i, this.j) * this.e));
      if (!this.b)
      {
        int m = (int)(this.k * this.f);
        this.j -= m / 2;
      }
      this.h = true;
    }
    this.a.setColor(this.c);
    paramCanvas.drawCircle(this.i, this.j, this.k, this.a);
    this.a.setColor(this.d);
    paramCanvas.drawCircle(this.i, this.j, 2.0F, this.a);
  }
  
  void setTheme(TypedArray paramTypedArray)
  {
    this.c = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainColor1, R.color.bpWhite);
    this.d = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainColor2, R.color.numbers_text_color);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */