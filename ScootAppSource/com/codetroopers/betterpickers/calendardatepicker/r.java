package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

public final class r
  extends m
{
  public r(Context paramContext)
  {
    super(paramContext);
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean)
  {
    if (this.x == paramInt3) {
      paramCanvas.drawCircle(paramInt4, paramInt5 - d / 3, h, this.n);
    }
    if ((this.w) && (this.y == paramInt3)) {
      this.k.setColor(this.I);
    }
    for (;;)
    {
      paramCanvas.drawText(String.format("%d", new Object[] { Integer.valueOf(paramInt3) }), paramInt4, paramInt5, this.k);
      return;
      if (paramBoolean) {
        this.k.setColor(this.G);
      } else {
        this.k.setColor(this.H);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */